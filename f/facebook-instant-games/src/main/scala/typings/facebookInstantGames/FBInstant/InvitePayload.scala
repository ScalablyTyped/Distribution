package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents content to be shared in invites sent by the user.
  */
trait InvitePayload extends StObject {
  
  /**
    * A blob of data to attach to the share. All game sessions launched from the share will be able to access this blob through FBInstant.getEntryPointData().
    */
  var data: js.UndefOr[Any] = js.undefined
  
  /**
    * A base64 encoded image to be shared.
    */
  var image: String
  
  /**
    *  A text message, or an object with the default text as the value of 'default' and another object mapping locale keys to translations as the value of 'localizations'.
    */
  var text: String | LocalizableContent
}
object InvitePayload {
  
  inline def apply(image: String, text: String | LocalizableContent): InvitePayload = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvitePayload]
  }
  
  extension [Self <: InvitePayload](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setText(value: String | LocalizableContent): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
