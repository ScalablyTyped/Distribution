package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdatePresentationResponse extends js.Object {
  var presentationId: js.UndefOr[String] = js.undefined
  var replies: js.UndefOr[js.Array[Response]] = js.undefined
  var writeControl: js.UndefOr[WriteControl] = js.undefined
}

object BatchUpdatePresentationResponse {
  @scala.inline
  def apply(
    presentationId: String = null,
    replies: js.Array[Response] = null,
    writeControl: WriteControl = null
  ): BatchUpdatePresentationResponse = {
    val __obj = js.Dynamic.literal()
    if (presentationId != null) __obj.updateDynamic("presentationId")(presentationId.asInstanceOf[js.Any])
    if (replies != null) __obj.updateDynamic("replies")(replies.asInstanceOf[js.Any])
    if (writeControl != null) __obj.updateDynamic("writeControl")(writeControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdatePresentationResponse]
  }
}

