package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StudentSubmission extends js.Object {
  var alternateLink: js.UndefOr[String] = js.undefined
  var assignedGrade: js.UndefOr[Double] = js.undefined
  var assignmentSubmission: js.UndefOr[AssignmentSubmission] = js.undefined
  var associatedWithDeveloper: js.UndefOr[Boolean] = js.undefined
  var courseId: js.UndefOr[String] = js.undefined
  var courseWorkId: js.UndefOr[String] = js.undefined
  var courseWorkType: js.UndefOr[String] = js.undefined
  var creationTime: js.UndefOr[String] = js.undefined
  var draftGrade: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var late: js.UndefOr[Boolean] = js.undefined
  var multipleChoiceSubmission: js.UndefOr[MultipleChoiceSubmission] = js.undefined
  var shortAnswerSubmission: js.UndefOr[ShortAnswerSubmission] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var submissionHistory: js.UndefOr[js.Array[SubmissionHistory]] = js.undefined
  var updateTime: js.UndefOr[String] = js.undefined
  var userId: js.UndefOr[String] = js.undefined
}

object StudentSubmission {
  @scala.inline
  def apply(
    alternateLink: String = null,
    assignedGrade: Int | Double = null,
    assignmentSubmission: AssignmentSubmission = null,
    associatedWithDeveloper: js.UndefOr[Boolean] = js.undefined,
    courseId: String = null,
    courseWorkId: String = null,
    courseWorkType: String = null,
    creationTime: String = null,
    draftGrade: Int | Double = null,
    id: String = null,
    late: js.UndefOr[Boolean] = js.undefined,
    multipleChoiceSubmission: MultipleChoiceSubmission = null,
    shortAnswerSubmission: ShortAnswerSubmission = null,
    state: String = null,
    submissionHistory: js.Array[SubmissionHistory] = null,
    updateTime: String = null,
    userId: String = null
  ): StudentSubmission = {
    val __obj = js.Dynamic.literal()
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink.asInstanceOf[js.Any])
    if (assignedGrade != null) __obj.updateDynamic("assignedGrade")(assignedGrade.asInstanceOf[js.Any])
    if (assignmentSubmission != null) __obj.updateDynamic("assignmentSubmission")(assignmentSubmission.asInstanceOf[js.Any])
    if (!js.isUndefined(associatedWithDeveloper)) __obj.updateDynamic("associatedWithDeveloper")(associatedWithDeveloper.asInstanceOf[js.Any])
    if (courseId != null) __obj.updateDynamic("courseId")(courseId.asInstanceOf[js.Any])
    if (courseWorkId != null) __obj.updateDynamic("courseWorkId")(courseWorkId.asInstanceOf[js.Any])
    if (courseWorkType != null) __obj.updateDynamic("courseWorkType")(courseWorkType.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (draftGrade != null) __obj.updateDynamic("draftGrade")(draftGrade.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(late)) __obj.updateDynamic("late")(late.asInstanceOf[js.Any])
    if (multipleChoiceSubmission != null) __obj.updateDynamic("multipleChoiceSubmission")(multipleChoiceSubmission.asInstanceOf[js.Any])
    if (shortAnswerSubmission != null) __obj.updateDynamic("shortAnswerSubmission")(shortAnswerSubmission.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (submissionHistory != null) __obj.updateDynamic("submissionHistory")(submissionHistory.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StudentSubmission]
  }
}

