package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Course work created by a teacher for students of the course.
  */
@js.native
trait Schema$CourseWork extends js.Object {
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
  var assignment: js.UndefOr[Schema$Assignment] = js.native
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
  var dueDate: js.UndefOr[Schema$Date] = js.native
  /**
    * Optional time of day, in UTC, that submissions for this course work are
    * due. This must be specified if `due_date` is specified.
    */
  var dueTime: js.UndefOr[Schema$TimeOfDay] = js.native
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
  var individualStudentsOptions: js.UndefOr[Schema$IndividualStudentsOptions] = js.native
  /**
    * Additional materials.  CourseWork must have no more than 20 material
    * items.
    */
  var materials: js.UndefOr[js.Array[Schema$Material]] = js.native
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
  var multipleChoiceQuestion: js.UndefOr[Schema$MultipleChoiceQuestion] = js.native
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

object Schema$CourseWork {
  @scala.inline
  def apply(
    alternateLink: String = null,
    assigneeMode: String = null,
    assignment: Schema$Assignment = null,
    associatedWithDeveloper: js.UndefOr[Boolean] = js.undefined,
    courseId: String = null,
    creationTime: String = null,
    creatorUserId: String = null,
    description: String = null,
    dueDate: Schema$Date = null,
    dueTime: Schema$TimeOfDay = null,
    id: String = null,
    individualStudentsOptions: Schema$IndividualStudentsOptions = null,
    materials: js.Array[Schema$Material] = null,
    maxPoints: Int | Double = null,
    multipleChoiceQuestion: Schema$MultipleChoiceQuestion = null,
    scheduledTime: String = null,
    state: String = null,
    submissionModificationMode: String = null,
    title: String = null,
    topicId: String = null,
    updateTime: String = null,
    workType: String = null
  ): Schema$CourseWork = {
    val __obj = js.Dynamic.literal()
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink.asInstanceOf[js.Any])
    if (assigneeMode != null) __obj.updateDynamic("assigneeMode")(assigneeMode.asInstanceOf[js.Any])
    if (assignment != null) __obj.updateDynamic("assignment")(assignment.asInstanceOf[js.Any])
    if (!js.isUndefined(associatedWithDeveloper)) __obj.updateDynamic("associatedWithDeveloper")(associatedWithDeveloper.asInstanceOf[js.Any])
    if (courseId != null) __obj.updateDynamic("courseId")(courseId.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (creatorUserId != null) __obj.updateDynamic("creatorUserId")(creatorUserId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dueDate != null) __obj.updateDynamic("dueDate")(dueDate.asInstanceOf[js.Any])
    if (dueTime != null) __obj.updateDynamic("dueTime")(dueTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (individualStudentsOptions != null) __obj.updateDynamic("individualStudentsOptions")(individualStudentsOptions.asInstanceOf[js.Any])
    if (materials != null) __obj.updateDynamic("materials")(materials.asInstanceOf[js.Any])
    if (maxPoints != null) __obj.updateDynamic("maxPoints")(maxPoints.asInstanceOf[js.Any])
    if (multipleChoiceQuestion != null) __obj.updateDynamic("multipleChoiceQuestion")(multipleChoiceQuestion.asInstanceOf[js.Any])
    if (scheduledTime != null) __obj.updateDynamic("scheduledTime")(scheduledTime.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (submissionModificationMode != null) __obj.updateDynamic("submissionModificationMode")(submissionModificationMode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (topicId != null) __obj.updateDynamic("topicId")(topicId.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (workType != null) __obj.updateDynamic("workType")(workType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CourseWork]
  }
}

