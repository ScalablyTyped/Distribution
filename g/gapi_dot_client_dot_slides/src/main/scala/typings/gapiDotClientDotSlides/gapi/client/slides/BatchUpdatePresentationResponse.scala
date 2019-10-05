package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdatePresentationResponse extends js.Object {
  /** The presentation the updates were applied to. */
  var presentationId: js.UndefOr[String] = js.undefined
  /**
    * The reply of the updates.  This maps 1:1 with the updates, although
    * replies to some requests may be empty.
    */
  var replies: js.UndefOr[js.Array[Response]] = js.undefined
}

object BatchUpdatePresentationResponse {
  @scala.inline
  def apply(presentationId: String = null, replies: js.Array[Response] = null): BatchUpdatePresentationResponse = {
    val __obj = js.Dynamic.literal()
    if (presentationId != null) __obj.updateDynamic("presentationId")(presentationId)
    if (replies != null) __obj.updateDynamic("replies")(replies)
    __obj.asInstanceOf[BatchUpdatePresentationResponse]
  }
}

