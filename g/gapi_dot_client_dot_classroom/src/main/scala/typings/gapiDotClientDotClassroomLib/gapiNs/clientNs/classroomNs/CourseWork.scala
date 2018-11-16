package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CourseWork extends js.Object {
  /**
               * Absolute link to this course work in the Classroom web UI.
               * This is only populated if `state` is `PUBLISHED`.
               *
               * Read-only.
               */
  var alternateLink: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Assignee mode of the coursework.
               * If unspecified, the default value is `ALL_STUDENTS`.
               */
  var assigneeMode: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Assignment details.
               * This is populated only when `work_type` is `ASSIGNMENT`.
               *
               * Read-only.
               */
  var assignment: js.UndefOr[Assignment] = js.undefined
  /**
               * Whether this course work item is associated with the Developer Console
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
               * Timestamp when this course work was created.
               *
               * Read-only.
               */
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Identifier for the user that created the coursework.
               *
               * Read-only.
               */
  var creatorUserId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Optional description of this course work.
               * If set, the description must be a valid UTF-8 string containing no more
               * than 30,000 characters.
               */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Optional date, in UTC, that submissions for this this course work are due.
               * This must be specified if `due_time` is specified.
               */
  var dueDate: js.UndefOr[Date] = js.undefined
  /**
               * Optional time of day, in UTC, that submissions for this this course work
               * are due.
               * This must be specified if `due_date` is specified.
               */
  var dueTime: js.UndefOr[TimeOfDay] = js.undefined
  /**
               * Classroom-assigned identifier of this course work, unique per course.
               *
               * Read-only.
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Identifiers of students with access to the coursework.
               * This field is set only if `assigneeMode` is `INDIVIDUAL_STUDENTS`.
               * If the `assigneeMode` is `INDIVIDUAL_STUDENTS`, then only students
               * specified in this field will be assigned the coursework.
               */
  var individualStudentsOptions: js.UndefOr[IndividualStudentsOptions] = js.undefined
  /**
               * Additional materials.
               *
               * CourseWork must have no more than 20 material items.
               */
  var materials: js.UndefOr[js.Array[Material]] = js.undefined
  /**
               * Maximum grade for this course work.
               * If zero or unspecified, this assignment is considered ungraded.
               * This must be a non-negative integer value.
               */
  var maxPoints: js.UndefOr[scala.Double] = js.undefined
  /**
               * Multiple choice question details.
               * For read operations, this field is populated only when `work_type` is
               * `MULTIPLE_CHOICE_QUESTION`.
               * For write operations, this field must be specified when creating course
               * work with a `work_type` of `MULTIPLE_CHOICE_QUESTION`, and it must not be
               * set otherwise.
               */
  var multipleChoiceQuestion: js.UndefOr[MultipleChoiceQuestion] = js.undefined
  /** Optional timestamp when this course work is scheduled to be published. */
  var scheduledTime: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Status of this course work.
               * If unspecified, the default state is `DRAFT`.
               */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Setting to determine when students are allowed to modify submissions.
               * If unspecified, the default value is `MODIFIABLE_UNTIL_TURNED_IN`.
               */
  var submissionModificationMode: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Title of this course work.
               * The title must be a valid UTF-8 string containing between 1 and 3000
               * characters.
               */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Timestamp of the most recent change to this course work.
               *
               * Read-only.
               */
  var updateTime: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Type of this course work.
               *
               * The type is set when the course work is created and cannot be changed.
               */
  var workType: js.UndefOr[java.lang.String] = js.undefined
}

