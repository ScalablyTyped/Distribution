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
  var data: js.UndefOr[js.Any] = js.undefined
  
  /**
    * A base64 encoded image to be shared.
    */
  var image: String
  
  /**
    * Indicates the intent of the share.
    */
  var intent: Intent
  
  /**
    * A text message to be shared.
    */
  var text: String
}
object SharePayload {
  
  @scala.inline
  def apply(image: String, intent: Intent, text: String): SharePayload = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharePayload]
  }
  
  @scala.inline
  implicit class SharePayloadMutableBuilder[Self <: SharePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntent(value: Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
