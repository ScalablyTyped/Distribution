package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Course work created by a teacher for students of the course.
  */
trait SchemaCourseWork extends StObject {
  
  /**
    * Absolute link to this course work in the Classroom web UI. This is only
    * populated if `state` is `PUBLISHED`.  Read-only.
    */
  var alternateLink: js.UndefOr[String] = js.undefined
  
  /**
    * Assignee mode of the coursework. If unspecified, the default value is
    * `ALL_STUDENTS`.
    */
  var assigneeMode: js.UndefOr[String] = js.undefined
  
  /**
    * Assignment details. This is populated only when `work_type` is
    * `ASSIGNMENT`.  Read-only.
    */
  var assignment: js.UndefOr[SchemaAssignment] = js.undefined
  
  /**
    * Whether this course work item is associated with the Developer Console
    * project making the request.  See google.classroom.Work.CreateCourseWork
    * for more details.  Read-only.
    */
  var associatedWithDeveloper: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifier of the course.  Read-only.
    */
  var courseId: js.UndefOr[String] = js.undefined
  
  /**
    * Timestamp when this course work was created.  Read-only.
    */
  var creationTime: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier for the user that created the coursework.  Read-only.
    */
  var creatorUserId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional description of this course work. If set, the description must be
    * a valid UTF-8 string containing no more than 30,000 characters.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Optional date, in UTC, that submissions for this course work are due.
    * This must be specified if `due_time` is specified.
    */
  var dueDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * Optional time of day, in UTC, that submissions for this course work are
    * due. This must be specified if `due_date` is specified.
    */
  var dueTime: js.UndefOr[SchemaTimeOfDay] = js.undefined
  
  /**
    * Classroom-assigned identifier of this course work, unique per course.
    * Read-only.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifiers of students with access to the coursework. This field is set
    * only if `assigneeMode` is `INDIVIDUAL_STUDENTS`. If the `assigneeMode` is
    * `INDIVIDUAL_STUDENTS`, then only students specified in this field will be
    * assigned the coursework.
    */
  var individualStudentsOptions: js.UndefOr[SchemaIndividualStudentsOptions] = js.undefined
  
  /**
    * Additional materials.  CourseWork must have no more than 20 material
    * items.
    */
  var materials: js.UndefOr[js.Array[SchemaMaterial]] = js.undefined
  
  /**
    * Maximum grade for this course work. If zero or unspecified, this
    * assignment is considered ungraded. This must be a non-negative integer
    * value.
    */
  var maxPoints: js.UndefOr[Double] = js.undefined
  
  /**
    * Multiple choice question details. For read operations, this field is
    * populated only when `work_type` is `MULTIPLE_CHOICE_QUESTION`. For write
    * operations, this field must be specified when creating course work with a
    * `work_type` of `MULTIPLE_CHOICE_QUESTION`, and it must not be set
    * otherwise.
    */
  var multipleChoiceQuestion: js.UndefOr[SchemaMultipleChoiceQuestion] = js.undefined
  
  /**
    * Optional timestamp when this course work is scheduled to be published.
    */
  var scheduledTime: js.UndefOr[String] = js.undefined
  
  /**
    * Status of this course work. If unspecified, the default state is `DRAFT`.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Setting to determine when students are allowed to modify submissions. If
    * unspecified, the default value is `MODIFIABLE_UNTIL_TURNED_IN`.
    */
  var submissionModificationMode: js.UndefOr[String] = js.undefined
  
  /**
    * Title of this course work. The title must be a valid UTF-8 string
    * containing between 1 and 3000 characters.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier for the topic that this coursework is associated with. Must
    * match an existing topic in the course.
    */
  var topicId: js.UndefOr[String] = js.undefined
  
  /**
    * Timestamp of the most recent change to this course work.  Read-only.
    */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Type of this course work.  The type is set when the course work is
    * created and cannot be changed.
    */
  var workType: js.UndefOr[String] = js.undefined
}
object SchemaCourseWork {
  
  @scala.inline
  def apply(): SchemaCourseWork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCourseWork]
  }
  
  @scala.inline
  implicit class SchemaCourseWorkMutableBuilder[Self <: SchemaCourseWork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
    
    @scala.inline
    def setAssigneeMode(value: String): Self = StObject.set(x, "assigneeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssigneeModeUndefined: Self = StObject.set(x, "assigneeMode", js.undefined)
    
    @scala.inline
    def setAssignment(value: SchemaAssignment): Self = StObject.set(x, "assignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentUndefined: Self = StObject.set(x, "assignment", js.undefined)
    
    @scala.inline
    def setAssociatedWithDeveloper(value: Boolean): Self = StObject.set(x, "associatedWithDeveloper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedWithDeveloperUndefined: Self = StObject.set(x, "associatedWithDeveloper", js.undefined)
    
    @scala.inline
    def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setCreatorUserId(value: String): Self = StObject.set(x, "creatorUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorUserIdUndefined: Self = StObject.set(x, "creatorUserId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDueDate(value: SchemaDate): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDueDateUndefined: Self = StObject.set(x, "dueDate", js.undefined)
    
    @scala.inline
    def setDueTime(value: SchemaTimeOfDay): Self = StObject.set(x, "dueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDueTimeUndefined: Self = StObject.set(x, "dueTime", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIndividualStudentsOptions(value: SchemaIndividualStudentsOptions): Self = StObject.set(x, "individualStudentsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndividualStudentsOptionsUndefined: Self = StObject.set(x, "individualStudentsOptions", js.undefined)
    
    @scala.inline
    def setMaterials(value: js.Array[SchemaMaterial]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
    
    @scala.inline
    def setMaterialsVarargs(value: SchemaMaterial*): Self = StObject.set(x, "materials", js.Array(value :_*))
    
    @scala.inline
    def setMaxPoints(value: Double): Self = StObject.set(x, "maxPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPointsUndefined: Self = StObject.set(x, "maxPoints", js.undefined)
    
    @scala.inline
    def setMultipleChoiceQuestion(value: SchemaMultipleChoiceQuestion): Self = StObject.set(x, "multipleChoiceQuestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleChoiceQuestionUndefined: Self = StObject.set(x, "multipleChoiceQuestion", js.undefined)
    
    @scala.inline
    def setScheduledTime(value: String): Self = StObject.set(x, "scheduledTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledTimeUndefined: Self = StObject.set(x, "scheduledTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setSubmissionModificationMode(value: String): Self = StObject.set(x, "submissionModificationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmissionModificationModeUndefined: Self = StObject.set(x, "submissionModificationMode", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTopicId(value: String): Self = StObject.set(x, "topicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicIdUndefined: Self = StObject.set(x, "topicId", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    @scala.inline
    def setWorkType(value: String): Self = StObject.set(x, "workType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkTypeUndefined: Self = StObject.set(x, "workType", js.undefined)
  }
}
