package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureScreenshotResponse extends StObject {
  
  /**
    * Base64-encoded image data. (Encoded as a base64 string when passed over JSON)
    */
  var data: String
}
object CaptureScreenshotResponse {
  
  inline def apply(data: String): CaptureScreenshotResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureScreenshotResponse]
  }
  
  extension [Self <: CaptureScreenshotResponse](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
