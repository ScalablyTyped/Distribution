package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Student submission for course work.  StudentSubmission items are generated
  * when a CourseWork item is created.  StudentSubmissions that have never been
  * accessed (i.e. with `state` = NEW) may not have a creation time or update
  * time.
  */
@js.native
trait SchemaStudentSubmission extends js.Object {
  /**
    * Absolute link to the submission in the Classroom web UI.  Read-only.
    */
  var alternateLink: js.UndefOr[String] = js.native
  /**
    * Optional grade. If unset, no grade was set. This value must be
    * non-negative. Decimal (i.e. non-integer) values are allowed, but will be
    * rounded to two decimal places.  This may be modified only by course
    * teachers.
    */
  var assignedGrade: js.UndefOr[Double] = js.native
  /**
    * Submission content when course_work_type is ASSIGNMENT.  Students can
    * modify this content using google.classroom.Work.ModifyAttachments.
    */
  var assignmentSubmission: js.UndefOr[SchemaAssignmentSubmission] = js.native
  /**
    * Whether this student submission is associated with the Developer Console
    * project making the request.  See google.classroom.Work.CreateCourseWork
    * for more details.  Read-only.
    */
  var associatedWithDeveloper: js.UndefOr[Boolean] = js.native
  /**
    * Identifier of the course.  Read-only.
    */
  var courseId: js.UndefOr[String] = js.native
  /**
    * Identifier for the course work this corresponds to.  Read-only.
    */
  var courseWorkId: js.UndefOr[String] = js.native
  /**
    * Type of course work this submission is for.  Read-only.
    */
  var courseWorkType: js.UndefOr[String] = js.native
  /**
    * Creation time of this submission. This may be unset if the student has
    * not accessed this item.  Read-only.
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * Optional pending grade. If unset, no grade was set. This value must be
    * non-negative. Decimal (i.e. non-integer) values are allowed, but will be
    * rounded to two decimal places.  This is only visible to and modifiable by
    * course teachers.
    */
  var draftGrade: js.UndefOr[Double] = js.native
  /**
    * Classroom-assigned Identifier for the student submission. This is unique
    * among submissions for the relevant course work.  Read-only.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Whether this submission is late.  Read-only.
    */
  var late: js.UndefOr[Boolean] = js.native
  /**
    * Submission content when course_work_type is MULTIPLE_CHOICE_QUESTION.
    */
  var multipleChoiceSubmission: js.UndefOr[SchemaMultipleChoiceSubmission] = js.native
  /**
    * Submission content when course_work_type is SHORT_ANSWER_QUESTION.
    */
  var shortAnswerSubmission: js.UndefOr[SchemaShortAnswerSubmission] = js.native
  /**
    * State of this submission.  Read-only.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The history of the submission (includes state and grade histories).
    * Read-only.
    */
  var submissionHistory: js.UndefOr[js.Array[SchemaSubmissionHistory]] = js.native
  /**
    * Last update time of this submission. This may be unset if the student has
    * not accessed this item.  Read-only.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Identifier for the student that owns this submission.  Read-only.
    */
  var userId: js.UndefOr[String] = js.native
}

object SchemaStudentSubmission {
  @scala.inline
  def apply(
    alternateLink: String = null,
    assignedGrade: js.UndefOr[Double] = js.undefined,
    assignmentSubmission: SchemaAssignmentSubmission = null,
    associatedWithDeveloper: js.UndefOr[Boolean] = js.undefined,
    courseId: String = null,
    courseWorkId: String = null,
    courseWorkType: String = null,
    creationTime: String = null,
    draftGrade: js.UndefOr[Double] = js.undefined,
    id: String = null,
    late: js.UndefOr[Boolean] = js.undefined,
    multipleChoiceSubmission: SchemaMultipleChoiceSubmission = null,
    shortAnswerSubmission: SchemaShortAnswerSubmission = null,
    state: String = null,
    submissionHistory: js.Array[SchemaSubmissionHistory] = null,
    updateTime: String = null,
    userId: String = null
  ): SchemaStudentSubmission = {
    val __obj = js.Dynamic.literal()
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink.asInstanceOf[js.Any])
    if (!js.isUndefined(assignedGrade)) __obj.updateDynamic("assignedGrade")(assignedGrade.get.asInstanceOf[js.Any])
    if (assignmentSubmission != null) __obj.updateDynamic("assignmentSubmission")(assignmentSubmission.asInstanceOf[js.Any])
    if (!js.isUndefined(associatedWithDeveloper)) __obj.updateDynamic("associatedWithDeveloper")(associatedWithDeveloper.get.asInstanceOf[js.Any])
    if (courseId != null) __obj.updateDynamic("courseId")(courseId.asInstanceOf[js.Any])
    if (courseWorkId != null) __obj.updateDynamic("courseWorkId")(courseWorkId.asInstanceOf[js.Any])
    if (courseWorkType != null) __obj.updateDynamic("courseWorkType")(courseWorkType.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (!js.isUndefined(draftGrade)) __obj.updateDynamic("draftGrade")(draftGrade.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(late)) __obj.updateDynamic("late")(late.get.asInstanceOf[js.Any])
    if (multipleChoiceSubmission != null) __obj.updateDynamic("multipleChoiceSubmission")(multipleChoiceSubmission.asInstanceOf[js.Any])
    if (shortAnswerSubmission != null) __obj.updateDynamic("shortAnswerSubmission")(shortAnswerSubmission.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (submissionHistory != null) __obj.updateDynamic("submissionHistory")(submissionHistory.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStudentSubmission]
  }
}

