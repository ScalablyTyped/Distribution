package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents content to be shared by the user.
  */
@js.native
trait SharePayload extends js.Object {
  
  /**
    * A blob of data to attach to the share. All game sessions launched from the share will be able to access this blob through FBInstant.getEntryPointData().
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * A base64 encoded image to be shared.
    */
  var image: String = js.native
  
  /**
    * Indicates the intent of the share.
    */
  var intent: Intent = js.native
  
  /**
    * A text message to be shared.
    */
  var text: String = js.native
}
object SharePayload {
  
  @scala.inline
  def apply(image: String, intent: Intent, text: String): SharePayload = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharePayload]
  }
  
  @scala.inline
  implicit class SharePayloadOps[Self <: SharePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntent(value: Intent): Self = this.set("intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
}
