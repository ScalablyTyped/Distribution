package typings.googleCloudSpanner.mod

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.buildSrcGaxMod.CallOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestConfig extends StObject {
  
  var client: String
  
  var gaxOpts: js.UndefOr[CallOptions] = js.undefined
  
  var headers: StringDictionary[String]
  
  var method: String
  
  var reqOpts: Any
}
object RequestConfig {
  
  inline def apply(client: String, headers: StringDictionary[String], method: String, reqOpts: Any): RequestConfig = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], reqOpts = reqOpts.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestConfig] (val x: Self) extends AnyVal {
    
    inline def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setGaxOpts(value: CallOptions): Self = StObject.set(x, "gaxOpts", value.asInstanceOf[js.Any])
    
    inline def setGaxOptsUndefined: Self = StObject.set(x, "gaxOpts", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setReqOpts(value: Any): Self = StObject.set(x, "reqOpts", value.asInstanceOf[js.Any])
  }
}
