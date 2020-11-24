package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Course work created by a teacher for students of the course.
  */
@js.native
trait SchemaCourseWork extends js.Object {
  
  /**
    * Absolute link to this course work in the Classroom web UI. This is only
    * populated if `state` is `PUBLISHED`.  Read-only.
    */
  var alternateLink: js.UndefOr[String] = js.native
  
  /**
    * Assignee mode of the coursework. If unspecified, the default value is
    * `ALL_STUDENTS`.
    */
  var assigneeMode: js.UndefOr[String] = js.native
  
  /**
    * Assignment details. This is populated only when `work_type` is
    * `ASSIGNMENT`.  Read-only.
    */
  var assignment: js.UndefOr[SchemaAssignment] = js.native
  
  /**
    * Whether this course work item is associated with the Developer Console
    * project making the request.  See google.classroom.Work.CreateCourseWork
    * for more details.  Read-only.
    */
  var associatedWithDeveloper: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifier of the course.  Read-only.
    */
  var courseId: js.UndefOr[String] = js.native
  
  /**
    * Timestamp when this course work was created.  Read-only.
    */
  var creationTime: js.UndefOr[String] = js.native
  
  /**
    * Identifier for the user that created the coursework.  Read-only.
    */
  var creatorUserId: js.UndefOr[String] = js.native
  
  /**
    * Optional description of this course work. If set, the description must be
    * a valid UTF-8 string containing no more than 30,000 characters.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Optional date, in UTC, that submissions for this course work are due.
    * This must be specified if `due_time` is specified.
    */
  var dueDate: js.UndefOr[SchemaDate] = js.native
  
  /**
    * Optional time of day, in UTC, that submissions for this course work are
    * due. This must be specified if `due_date` is specified.
    */
  var dueTime: js.UndefOr[SchemaTimeOfDay] = js.native
  
  /**
    * Classroom-assigned identifier of this course work, unique per course.
    * Read-only.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifiers of students with access to the coursework. This field is set
    * only if `assigneeMode` is `INDIVIDUAL_STUDENTS`. If the `assigneeMode` is
    * `INDIVIDUAL_STUDENTS`, then only students specified in this field will be
    * assigned the coursework.
    */
  var individualStudentsOptions: js.UndefOr[SchemaIndividualStudentsOptions] = js.native
  
  /**
    * Additional materials.  CourseWork must have no more than 20 material
    * items.
    */
  var materials: js.UndefOr[js.Array[SchemaMaterial]] = js.native
  
  /**
    * Maximum grade for this course work. If zero or unspecified, this
    * assignment is considered ungraded. This must be a non-negative integer
    * value.
    */
  var maxPoints: js.UndefOr[Double] = js.native
  
  /**
    * Multiple choice question details. For read operations, this field is
    * populated only when `work_type` is `MULTIPLE_CHOICE_QUESTION`. For write
    * operations, this field must be specified when creating course work with a
    * `work_type` of `MULTIPLE_CHOICE_QUESTION`, and it must not be set
    * otherwise.
    */
  var multipleChoiceQuestion: js.UndefOr[SchemaMultipleChoiceQuestion] = js.native
  
  /**
    * Optional timestamp when this course work is scheduled to be published.
    */
  var scheduledTime: js.UndefOr[String] = js.native
  
  /**
    * Status of this course work. If unspecified, the default state is `DRAFT`.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Setting to determine when students are allowed to modify submissions. If
    * unspecified, the default value is `MODIFIABLE_UNTIL_TURNED_IN`.
    */
  var submissionModificationMode: js.UndefOr[String] = js.native
  
  /**
    * Title of this course work. The title must be a valid UTF-8 string
    * containing between 1 and 3000 characters.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Identifier for the topic that this coursework is associated with. Must
    * match an existing topic in the course.
    */
  var topicId: js.UndefOr[String] = js.native
  
  /**
    * Timestamp of the most recent change to this course work.  Read-only.
    */
  var updateTime: js.UndefOr[String] = js.native
  
  /**
    * Type of this course work.  The type is set when the course work is
    * created and cannot be changed.
    */
  var workType: js.UndefOr[String] = js.native
}
object SchemaCourseWork {
  
  @scala.inline
  def apply(): SchemaCourseWork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCourseWork]
  }
  
  @scala.inline
  implicit class SchemaCourseWorkOps[Self <: SchemaCourseWork] (val x: Self) extends AnyVal {
    
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
    def setAssigneeMode(value: String): Self = this.set("assigneeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssigneeMode: Self = this.set("assigneeMode", js.undefined)
    
    @scala.inline
    def setAssignment(value: SchemaAssignment): Self = this.set("assignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignment: Self = this.set("assignment", js.undefined)
    
    @scala.inline
    def setAssociatedWithDeveloper(value: Boolean): Self = this.set("associatedWithDeveloper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedWithDeveloper: Self = this.set("associatedWithDeveloper", js.undefined)
    
    @scala.inline
    def setCourseId(value: String): Self = this.set("courseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCourseId: Self = this.set("courseId", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setCreatorUserId(value: String): Self = this.set("creatorUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatorUserId: Self = this.set("creatorUserId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDueDate(value: SchemaDate): Self = this.set("dueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDueDate: Self = this.set("dueDate", js.undefined)
    
    @scala.inline
    def setDueTime(value: SchemaTimeOfDay): Self = this.set("dueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDueTime: Self = this.set("dueTime", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIndividualStudentsOptions(value: SchemaIndividualStudentsOptions): Self = this.set("individualStudentsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndividualStudentsOptions: Self = this.set("individualStudentsOptions", js.undefined)
    
    @scala.inline
    def setMaterialsVarargs(value: SchemaMaterial*): Self = this.set("materials", js.Array(value :_*))
    
    @scala.inline
    def setMaterials(value: js.Array[SchemaMaterial]): Self = this.set("materials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaterials: Self = this.set("materials", js.undefined)
    
    @scala.inline
    def setMaxPoints(value: Double): Self = this.set("maxPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPoints: Self = this.set("maxPoints", js.undefined)
    
    @scala.inline
    def setMultipleChoiceQuestion(value: SchemaMultipleChoiceQuestion): Self = this.set("multipleChoiceQuestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleChoiceQuestion: Self = this.set("multipleChoiceQuestion", js.undefined)
    
    @scala.inline
    def setScheduledTime(value: String): Self = this.set("scheduledTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledTime: Self = this.set("scheduledTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setSubmissionModificationMode(value: String): Self = this.set("submissionModificationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmissionModificationMode: Self = this.set("submissionModificationMode", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTopicId(value: String): Self = this.set("topicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicId: Self = this.set("topicId", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    
    @scala.inline
    def setWorkType(value: String): Self = this.set("workType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkType: Self = this.set("workType", js.undefined)
  }
}
