package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FBInstant.shareAsync")
@js.native
object shareAsync extends js.Object {
  /**
    * This invokes a dialog to let the user share specified content, either as a message in Messenger or as a post on the user's timeline.
    * A blob of data can be attached to the share which every game session launched from the share will be able to access from FBInstant.getEntryPointData().
    * This data must be less than or equal to 1000 characters when stringified. The user may choose to cancel the share action and close the dialog, and the
    * returned promise will resolve when the dialog is closed regardless if the user actually shared the content or not.
    *
    * @param payload Specify what to share. See example for details.
    * @returns A promise that resolves when the share is completed or cancelled.
    * @throws INVALID_PARAM
    * @throws NETWORK_FAILURE
    * @throws PENDING_REQUEST
    * @throws CLIENT_UNSUPPORTED_OPERATION
    * @throws INVALID_OPERATION
    */
  def apply(payload: SharePayload): js.Promise[Unit] = js.native
}

