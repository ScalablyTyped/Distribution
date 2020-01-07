package typings.googleapis.buildSrcApisAlertcenterV1beta1Mod.alertcenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for an alert feedback listing request.
  */
@js.native
trait Schema$ListAlertFeedbackResponse extends js.Object {
  /**
    * The list of alert feedback. Feedback entries for each alert are ordered
    * by creation time descending.
    */
  var feedback: js.UndefOr[js.Array[Schema$AlertFeedback]] = js.native
}

object Schema$ListAlertFeedbackResponse {
  @scala.inline
  def apply(feedback: js.Array[Schema$AlertFeedback] = null): Schema$ListAlertFeedbackResponse = {
    val __obj = js.Dynamic.literal()
    if (feedback != null) __obj.updateDynamic("feedback")(feedback.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListAlertFeedbackResponse]
  }
}

