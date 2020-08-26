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
  def apply(): SchemaStudentSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStudentSubmission]
  }
  @scala.inline
  implicit class SchemaStudentSubmissionOps[Self <: SchemaStudentSubmission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlternateLink(value: String): Self = this.set("alternateLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternateLink: Self = this.set("alternateLink", js.undefined)
    @scala.inline
    def setAssignedGrade(value: Double): Self = this.set("assignedGrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignedGrade: Self = this.set("assignedGrade", js.undefined)
    @scala.inline
    def setAssignmentSubmission(value: SchemaAssignmentSubmission): Self = this.set("assignmentSubmission", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignmentSubmission: Self = this.set("assignmentSubmission", js.undefined)
    @scala.inline
    def setAssociatedWithDeveloper(value: Boolean): Self = this.set("associatedWithDeveloper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociatedWithDeveloper: Self = this.set("associatedWithDeveloper", js.undefined)
    @scala.inline
    def setCourseId(value: String): Self = this.set("courseId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCourseId: Self = this.set("courseId", js.undefined)
    @scala.inline
    def setCourseWorkId(value: String): Self = this.set("courseWorkId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCourseWorkId: Self = this.set("courseWorkId", js.undefined)
    @scala.inline
    def setCourseWorkType(value: String): Self = this.set("courseWorkType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCourseWorkType: Self = this.set("courseWorkType", js.undefined)
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setDraftGrade(value: Double): Self = this.set("draftGrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraftGrade: Self = this.set("draftGrade", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLate(value: Boolean): Self = this.set("late", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLate: Self = this.set("late", js.undefined)
    @scala.inline
    def setMultipleChoiceSubmission(value: SchemaMultipleChoiceSubmission): Self = this.set("multipleChoiceSubmission", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipleChoiceSubmission: Self = this.set("multipleChoiceSubmission", js.undefined)
    @scala.inline
    def setShortAnswerSubmission(value: SchemaShortAnswerSubmission): Self = this.set("shortAnswerSubmission", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortAnswerSubmission: Self = this.set("shortAnswerSubmission", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setSubmissionHistoryVarargs(value: SchemaSubmissionHistory*): Self = this.set("submissionHistory", js.Array(value :_*))
    @scala.inline
    def setSubmissionHistory(value: js.Array[SchemaSubmissionHistory]): Self = this.set("submissionHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmissionHistory: Self = this.set("submissionHistory", js.undefined)
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
  
}

