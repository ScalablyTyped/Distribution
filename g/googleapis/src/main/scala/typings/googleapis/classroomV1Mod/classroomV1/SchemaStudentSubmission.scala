package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStudentSubmission extends StObject {
  
  /**
    * Absolute link to the submission in the Classroom web UI. Read-only.
    */
  var alternateLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional grade. If unset, no grade was set. This value must be non-negative. Decimal (that is, non-integer) values are allowed, but are rounded to two decimal places. This may be modified only by course teachers.
    */
  var assignedGrade: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Submission content when course_work_type is ASSIGNMENT. Students can modify this content using ModifyAttachments.
    */
  var assignmentSubmission: js.UndefOr[SchemaAssignmentSubmission] = js.undefined
  
  /**
    * Whether this student submission is associated with the Developer Console project making the request. See CreateCourseWork for more details. Read-only.
    */
  var associatedWithDeveloper: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Identifier of the course. Read-only.
    */
  var courseId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifier for the course work this corresponds to. Read-only.
    */
  var courseWorkId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of course work this submission is for. Read-only.
    */
  var courseWorkType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Creation time of this submission. This may be unset if the student has not accessed this item. Read-only.
    */
  var creationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional pending grade. If unset, no grade was set. This value must be non-negative. Decimal (that is, non-integer) values are allowed, but are rounded to two decimal places. This is only visible to and modifiable by course teachers.
    */
  var draftGrade: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Classroom-assigned Identifier for the student submission. This is unique among submissions for the relevant course work. Read-only.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this submission is late. Read-only.
    */
  var late: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Submission content when course_work_type is MULTIPLE_CHOICE_QUESTION.
    */
  var multipleChoiceSubmission: js.UndefOr[SchemaMultipleChoiceSubmission] = js.undefined
  
  /**
    * Submission content when course_work_type is SHORT_ANSWER_QUESTION.
    */
  var shortAnswerSubmission: js.UndefOr[SchemaShortAnswerSubmission] = js.undefined
  
  /**
    * State of this submission. Read-only.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The history of the submission (includes state and grade histories). Read-only.
    */
  var submissionHistory: js.UndefOr[js.Array[SchemaSubmissionHistory]] = js.undefined
  
  /**
    * Last update time of this submission. This may be unset if the student has not accessed this item. Read-only.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifier for the student that owns this submission. Read-only.
    */
  var userId: js.UndefOr[String | Null] = js.undefined
}
object SchemaStudentSubmission {
  
  inline def apply(): SchemaStudentSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStudentSubmission]
  }
  
  extension [Self <: SchemaStudentSubmission](x: Self) {
    
    inline def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
    
    inline def setAlternateLinkNull: Self = StObject.set(x, "alternateLink", null)
    
    inline def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
    
    inline def setAssignedGrade(value: Double): Self = StObject.set(x, "assignedGrade", value.asInstanceOf[js.Any])
    
    inline def setAssignedGradeNull: Self = StObject.set(x, "assignedGrade", null)
    
    inline def setAssignedGradeUndefined: Self = StObject.set(x, "assignedGrade", js.undefined)
    
    inline def setAssignmentSubmission(value: SchemaAssignmentSubmission): Self = StObject.set(x, "assignmentSubmission", value.asInstanceOf[js.Any])
    
    inline def setAssignmentSubmissionUndefined: Self = StObject.set(x, "assignmentSubmission", js.undefined)
    
    inline def setAssociatedWithDeveloper(value: Boolean): Self = StObject.set(x, "associatedWithDeveloper", value.asInstanceOf[js.Any])
    
    inline def setAssociatedWithDeveloperNull: Self = StObject.set(x, "associatedWithDeveloper", null)
    
    inline def setAssociatedWithDeveloperUndefined: Self = StObject.set(x, "associatedWithDeveloper", js.undefined)
    
    inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    inline def setCourseIdNull: Self = StObject.set(x, "courseId", null)
    
    inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
    
    inline def setCourseWorkId(value: String): Self = StObject.set(x, "courseWorkId", value.asInstanceOf[js.Any])
    
    inline def setCourseWorkIdNull: Self = StObject.set(x, "courseWorkId", null)
    
    inline def setCourseWorkIdUndefined: Self = StObject.set(x, "courseWorkId", js.undefined)
    
    inline def setCourseWorkType(value: String): Self = StObject.set(x, "courseWorkType", value.asInstanceOf[js.Any])
    
    inline def setCourseWorkTypeNull: Self = StObject.set(x, "courseWorkType", null)
    
    inline def setCourseWorkTypeUndefined: Self = StObject.set(x, "courseWorkType", js.undefined)
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeNull: Self = StObject.set(x, "creationTime", null)
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDraftGrade(value: Double): Self = StObject.set(x, "draftGrade", value.asInstanceOf[js.Any])
    
    inline def setDraftGradeNull: Self = StObject.set(x, "draftGrade", null)
    
    inline def setDraftGradeUndefined: Self = StObject.set(x, "draftGrade", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLate(value: Boolean): Self = StObject.set(x, "late", value.asInstanceOf[js.Any])
    
    inline def setLateNull: Self = StObject.set(x, "late", null)
    
    inline def setLateUndefined: Self = StObject.set(x, "late", js.undefined)
    
    inline def setMultipleChoiceSubmission(value: SchemaMultipleChoiceSubmission): Self = StObject.set(x, "multipleChoiceSubmission", value.asInstanceOf[js.Any])
    
    inline def setMultipleChoiceSubmissionUndefined: Self = StObject.set(x, "multipleChoiceSubmission", js.undefined)
    
    inline def setShortAnswerSubmission(value: SchemaShortAnswerSubmission): Self = StObject.set(x, "shortAnswerSubmission", value.asInstanceOf[js.Any])
    
    inline def setShortAnswerSubmissionUndefined: Self = StObject.set(x, "shortAnswerSubmission", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSubmissionHistory(value: js.Array[SchemaSubmissionHistory]): Self = StObject.set(x, "submissionHistory", value.asInstanceOf[js.Any])
    
    inline def setSubmissionHistoryUndefined: Self = StObject.set(x, "submissionHistory", js.undefined)
    
    inline def setSubmissionHistoryVarargs(value: SchemaSubmissionHistory*): Self = StObject.set(x, "submissionHistory", js.Array(value*))
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
