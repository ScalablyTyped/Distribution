package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents screenshot content provided by the game that later on can be shared by the user.
  *
  * @since 7.1
  */
trait ScreenshotPayload extends StObject {
  
  /**
    * A blob of data to attach to the screenshot. If the user ended up sharing this screenshot, all game sessions
    * launched from the share will be able to access this blob through {@link FBInstant.getEntryPointData()}.
    */
  var data: js.UndefOr[js.Object] = js.undefined
  
  /**
    * A base64 encoded image that is the screenshot.
    */
  var image: String
  
  /**
    * A text message to describes the screenshot.
    */
  var text: String
}
object ScreenshotPayload {
  
  inline def apply(image: String, text: String): ScreenshotPayload = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScreenshotPayload] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
