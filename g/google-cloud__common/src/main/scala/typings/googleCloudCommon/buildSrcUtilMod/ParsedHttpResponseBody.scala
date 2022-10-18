package typings.googleCloudCommon.buildSrcUtilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedHttpResponseBody extends StObject {
  
  var body: ResponseBody
  
  var err: js.UndefOr[js.Error] = js.undefined
}
object ParsedHttpResponseBody {
  
  inline def apply(body: ResponseBody): ParsedHttpResponseBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedHttpResponseBody]
  }
  
  extension [Self <: ParsedHttpResponseBody](x: Self) {
    
    inline def setBody(value: ResponseBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
  }
}
