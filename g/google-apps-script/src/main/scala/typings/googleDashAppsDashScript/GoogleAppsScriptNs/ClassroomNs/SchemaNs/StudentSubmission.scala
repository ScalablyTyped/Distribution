package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ClassroomNs.SchemaNs

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
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink)
    if (assignedGrade != null) __obj.updateDynamic("assignedGrade")(assignedGrade.asInstanceOf[js.Any])
    if (assignmentSubmission != null) __obj.updateDynamic("assignmentSubmission")(assignmentSubmission)
    if (!js.isUndefined(associatedWithDeveloper)) __obj.updateDynamic("associatedWithDeveloper")(associatedWithDeveloper)
    if (courseId != null) __obj.updateDynamic("courseId")(courseId)
    if (courseWorkId != null) __obj.updateDynamic("courseWorkId")(courseWorkId)
    if (courseWorkType != null) __obj.updateDynamic("courseWorkType")(courseWorkType)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (draftGrade != null) __obj.updateDynamic("draftGrade")(draftGrade.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(late)) __obj.updateDynamic("late")(late)
    if (multipleChoiceSubmission != null) __obj.updateDynamic("multipleChoiceSubmission")(multipleChoiceSubmission)
    if (shortAnswerSubmission != null) __obj.updateDynamic("shortAnswerSubmission")(shortAnswerSubmission)
    if (state != null) __obj.updateDynamic("state")(state)
    if (submissionHistory != null) __obj.updateDynamic("submissionHistory")(submissionHistory)
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[StudentSubmission]
  }
}

