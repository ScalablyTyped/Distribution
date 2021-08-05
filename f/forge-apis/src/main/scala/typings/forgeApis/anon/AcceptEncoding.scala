package typings.forgeApis.anon

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptEncoding extends StObject {
  
  var acceptEncoding: js.UndefOr[String] = js.undefined
  
  var ifModifiedSince: js.UndefOr[Date] = js.undefined
}
object AcceptEncoding {
  
  inline def apply(): AcceptEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptEncoding]
  }
  
  extension [Self <: AcceptEncoding](x: Self) {
    
    inline def setAcceptEncoding(value: String): Self = StObject.set(x, "acceptEncoding", value.asInstanceOf[js.Any])
    
    inline def setAcceptEncodingUndefined: Self = StObject.set(x, "acceptEncoding", js.undefined)
    
    inline def setIfModifiedSince(value: Date): Self = StObject.set(x, "ifModifiedSince", value.asInstanceOf[js.Any])
    
    inline def setIfModifiedSinceUndefined: Self = StObject.set(x, "ifModifiedSince", js.undefined)
  }
}
