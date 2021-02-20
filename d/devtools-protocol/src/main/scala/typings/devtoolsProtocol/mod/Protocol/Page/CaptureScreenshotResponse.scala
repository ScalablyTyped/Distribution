package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptureScreenshotResponse extends StObject {
  
  /**
    * Base64-encoded image data.
    */
  var data: String = js.native
}
object CaptureScreenshotResponse {
  
  @scala.inline
  def apply(data: String): CaptureScreenshotResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureScreenshotResponse]
  }
  
  @scala.inline
  implicit class CaptureScreenshotResponseMutableBuilder[Self <: CaptureScreenshotResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
