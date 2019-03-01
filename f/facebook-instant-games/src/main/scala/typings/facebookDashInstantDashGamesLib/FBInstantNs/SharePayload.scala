package typings
package facebookDashInstantDashGamesLib.FBInstantNs

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
  var image: java.lang.String
  /**
    * Indicates the intent of the share.
    */
  var intent: Intent
  /**
    * A text message to be shared.
    */
  var text: java.lang.String
}

object SharePayload {
  @scala.inline
  def apply(image: java.lang.String, intent: Intent, text: java.lang.String, data: js.Any = null): SharePayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("intent")(intent)
    __obj.updateDynamic("text")(text)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[SharePayload]
  }
}

