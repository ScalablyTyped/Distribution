package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a custom link to be shared by the user.
  *
  * @since 7.1
  */
trait LinkSharePayload extends StObject {
  
  /**
    * A blob of data to associate with the shared link. All game sessions launched from the share will be able to
    * access this blob through {@link FBInstant.getEntryPointData()}.
    */
  var data: js.Object
  
  /**
    * A base64 encoded image to be shown for the link preview. The image is recommended to either be a square or of
    * the aspect ratio 1.91:1.
    */
  var image: js.UndefOr[String] = js.undefined
  
  /**
    * A text description for the link preview. Recommended to be less than 44 characters.
    */
  var text: js.UndefOr[String] = js.undefined
}
object LinkSharePayload {
  
  inline def apply(data: js.Object): LinkSharePayload = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkSharePayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkSharePayload] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
