package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Student submission for course work.  StudentSubmission items are generated
  * when a CourseWork item is created.  StudentSubmissions that have never been
  * accessed (i.e. with `state` = NEW) may not have a creation time or update
  * time.
  */
@js.native
trait SchemaStudentSubmission extends StObject {
  
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
  implicit class SchemaStudentSubmissionMutableBuilder[Self <: SchemaStudentSubmission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
    
    @scala.inline
    def setAssignedGrade(value: Double): Self = StObject.set(x, "assignedGrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedGradeUndefined: Self = StObject.set(x, "assignedGrade", js.undefined)
    
    @scala.inline
    def setAssignmentSubmission(value: SchemaAssignmentSubmission): Self = StObject.set(x, "assignmentSubmission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentSubmissionUndefined: Self = StObject.set(x, "assignmentSubmission", js.undefined)
    
    @scala.inline
    def setAssociatedWithDeveloper(value: Boolean): Self = StObject.set(x, "associatedWithDeveloper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedWithDeveloperUndefined: Self = StObject.set(x, "associatedWithDeveloper", js.undefined)
    
    @scala.inline
    def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
    
    @scala.inline
    def setCourseWorkId(value: String): Self = StObject.set(x, "courseWorkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseWorkIdUndefined: Self = StObject.set(x, "courseWorkId", js.undefined)
    
    @scala.inline
    def setCourseWorkType(value: String): Self = StObject.set(x, "courseWorkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseWorkTypeUndefined: Self = StObject.set(x, "courseWorkType", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDraftGrade(value: Double): Self = StObject.set(x, "draftGrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraftGradeUndefined: Self = StObject.set(x, "draftGrade", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLate(value: Boolean): Self = StObject.set(x, "late", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLateUndefined: Self = StObject.set(x, "late", js.undefined)
    
    @scala.inline
    def setMultipleChoiceSubmission(value: SchemaMultipleChoiceSubmission): Self = StObject.set(x, "multipleChoiceSubmission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleChoiceSubmissionUndefined: Self = StObject.set(x, "multipleChoiceSubmission", js.undefined)
    
    @scala.inline
    def setShortAnswerSubmission(value: SchemaShortAnswerSubmission): Self = StObject.set(x, "shortAnswerSubmission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortAnswerSubmissionUndefined: Self = StObject.set(x, "shortAnswerSubmission", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setSubmissionHistory(value: js.Array[SchemaSubmissionHistory]): Self = StObject.set(x, "submissionHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmissionHistoryUndefined: Self = StObject.set(x, "submissionHistory", js.undefined)
    
    @scala.inline
    def setSubmissionHistoryVarargs(value: SchemaSubmissionHistory*): Self = StObject.set(x, "submissionHistory", js.Array(value :_*))
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
