package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StudentSubmission extends js.Object {
  /**
    * Absolute link to the submission in the Classroom web UI.
    *
    * Read-only.
    */
  var alternateLink: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional grade. If unset, no grade was set.
    * This value must be non-negative. Decimal (i.e. non-integer) values are
    * allowed, but will be rounded to two decimal places.
    *
    * This may be modified only by course teachers.
    */
  var assignedGrade: js.UndefOr[scala.Double] = js.undefined
  /**
    * Submission content when course_work_type is ASSIGNMENT.
    *
    * Students can modify this content using
    * google.classroom.Work.ModifyAttachments.
    */
  var assignmentSubmission: js.UndefOr[AssignmentSubmission] = js.undefined
  /**
    * Whether this student submission is associated with the Developer Console
    * project making the request.
    *
    * See google.classroom.Work.CreateCourseWork for more
    * details.
    *
    * Read-only.
    */
  var associatedWithDeveloper: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Identifier of the course.
    *
    * Read-only.
    */
  var courseId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifier for the course work this corresponds to.
    *
    * Read-only.
    */
  var courseWorkId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Type of course work this submission is for.
    *
    * Read-only.
    */
  var courseWorkType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Creation time of this submission.
    * This may be unset if the student has not accessed this item.
    *
    * Read-only.
    */
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional pending grade. If unset, no grade was set.
    * This value must be non-negative. Decimal (i.e. non-integer) values are
    * allowed, but will be rounded to two decimal places.
    *
    * This is only visible to and modifiable by course teachers.
    */
  var draftGrade: js.UndefOr[scala.Double] = js.undefined
  /**
    * Classroom-assigned Identifier for the student submission.
    * This is unique among submissions for the relevant course work.
    *
    * Read-only.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether this submission is late.
    *
    * Read-only.
    */
  var late: js.UndefOr[scala.Boolean] = js.undefined
  /** Submission content when course_work_type is MULTIPLE_CHOICE_QUESTION. */
  var multipleChoiceSubmission: js.UndefOr[MultipleChoiceSubmission] = js.undefined
  /** Submission content when course_work_type is SHORT_ANSWER_QUESTION. */
  var shortAnswerSubmission: js.UndefOr[ShortAnswerSubmission] = js.undefined
  /**
    * State of this submission.
    *
    * Read-only.
    */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The history of the submission (includes state and grade histories).
    *
    * Read-only.
    */
  var submissionHistory: js.UndefOr[js.Array[SubmissionHistory]] = js.undefined
  /**
    * Last update time of this submission.
    * This may be unset if the student has not accessed this item.
    *
    * Read-only.
    */
  var updateTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifier for the student that owns this submission.
    *
    * Read-only.
    */
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

object StudentSubmission {
  @scala.inline
  def apply(
    alternateLink: java.lang.String = null,
    assignedGrade: scala.Int | scala.Double = null,
    assignmentSubmission: AssignmentSubmission = null,
    associatedWithDeveloper: js.UndefOr[scala.Boolean] = js.undefined,
    courseId: java.lang.String = null,
    courseWorkId: java.lang.String = null,
    courseWorkType: java.lang.String = null,
    creationTime: java.lang.String = null,
    draftGrade: scala.Int | scala.Double = null,
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

