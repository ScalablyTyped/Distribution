package typings.facebookDashInstantDashGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents content to be shared by the user.
  */
trait SharePayload extends js.Object {
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
  def apply(image: String, intent: Intent, text: String, data: js.Any = null): SharePayload = {
    val __obj = js.Dynamic.literal(image = image, intent = intent, text = text)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[SharePayload]
  }
}

