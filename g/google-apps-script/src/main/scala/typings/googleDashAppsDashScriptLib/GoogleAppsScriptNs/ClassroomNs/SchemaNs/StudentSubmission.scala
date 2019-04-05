package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StudentSubmission extends js.Object {
  var alternateLink: js.UndefOr[java.lang.String] = js.undefined
  var assignedGrade: js.UndefOr[stdLib.Number] = js.undefined
  var assignmentSubmission: js.UndefOr[AssignmentSubmission] = js.undefined
  var associatedWithDeveloper: js.UndefOr[scala.Boolean] = js.undefined
  var courseId: js.UndefOr[java.lang.String] = js.undefined
  var courseWorkId: js.UndefOr[java.lang.String] = js.undefined
  var courseWorkType: js.UndefOr[java.lang.String] = js.undefined
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  var draftGrade: js.UndefOr[stdLib.Number] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var late: js.UndefOr[scala.Boolean] = js.undefined
  var multipleChoiceSubmission: js.UndefOr[MultipleChoiceSubmission] = js.undefined
  var shortAnswerSubmission: js.UndefOr[ShortAnswerSubmission] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
  var submissionHistory: js.UndefOr[js.Array[SubmissionHistory]] = js.undefined
  var updateTime: js.UndefOr[java.lang.String] = js.undefined
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

object StudentSubmission {
  @scala.inline
  def apply(
    alternateLink: java.lang.String = null,
    assignedGrade: stdLib.Number = null,
    assignmentSubmission: AssignmentSubmission = null,
    associatedWithDeveloper: js.UndefOr[scala.Boolean] = js.undefined,
    courseId: java.lang.String = null,
    courseWorkId: java.lang.String = null,
    courseWorkType: java.lang.String = null,
    creationTime: java.lang.String = null,
    draftGrade: stdLib.Number = null,
    id: java.lang.String = null,
    late: js.UndefOr[scala.Boolean] = js.undefined,
    multipleChoiceSubmission: MultipleChoiceSubmission = null,
    shortAnswerSubmission: ShortAnswerSubmission = null,
    state: java.lang.String = null,
    submissionHistory: js.Array[SubmissionHistory] = null,
    updateTime: java.lang.String = null,
    userId: java.lang.String = null
  ): StudentSubmission = {
    val __obj = js.Dynamic.literal()
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink)
    if (assignedGrade != null) __obj.updateDynamic("assignedGrade")(assignedGrade)
    if (assignmentSubmission != null) __obj.updateDynamic("assignmentSubmission")(assignmentSubmission)
    if (!js.isUndefined(associatedWithDeveloper)) __obj.updateDynamic("associatedWithDeveloper")(associatedWithDeveloper)
    if (courseId != null) __obj.updateDynamic("courseId")(courseId)
    if (courseWorkId != null) __obj.updateDynamic("courseWorkId")(courseWorkId)
    if (courseWorkType != null) __obj.updateDynamic("courseWorkType")(courseWorkType)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (draftGrade != null) __obj.updateDynamic("draftGrade")(draftGrade)
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

