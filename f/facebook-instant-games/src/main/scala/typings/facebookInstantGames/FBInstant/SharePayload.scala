package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents content to be shared by the user.
  */
trait SharePayload extends StObject {
  
  /**
    * A blob of data to attach to the share. All game sessions launched from the share will be able to access this blob through FBInstant.getEntryPointData().
    */
  var data: js.UndefOr[Any] = js.undefined
  
  /**
    * A base64 encoded image to be shared.
    */
  var image: String
  
  /**
    * Indicates the intent of the share.
    */
  var intent: Intent
  
  /**
    * Optional content for the gif or video.
    */
  var media: js.UndefOr[MediaParams] = js.undefined
  
  /**
    * A flag indicating whether to switch the user into the new context created on sharing
    */
  var switchContext: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A text message to be shared.
    */
  var text: String
}
object SharePayload {
  
  inline def apply(image: String, intent: Intent, text: String): SharePayload = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharePayload]
  }
  
  extension [Self <: SharePayload](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setIntent(value: Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: MediaParams): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setSwitchContext(value: Boolean): Self = StObject.set(x, "switchContext", value.asInstanceOf[js.Any])
    
    inline def setSwitchContextUndefined: Self = StObject.set(x, "switchContext", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
