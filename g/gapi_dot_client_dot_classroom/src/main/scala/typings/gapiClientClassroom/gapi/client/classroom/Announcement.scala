package typings.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Announcement extends js.Object {
  /**
    * Absolute link to this announcement in the Classroom web UI.
    * This is only populated if `state` is `PUBLISHED`.
    *
    * Read-only.
    */
  var alternateLink: js.UndefOr[String] = js.undefined
  /**
    * Assignee mode of the announcement.
    * If unspecified, the default value is `ALL_STUDENTS`.
    */
  var assigneeMode: js.UndefOr[String] = js.undefined
  /**
    * Identifier of the course.
    *
    * Read-only.
    */
  var courseId: js.UndefOr[String] = js.undefined
  /**
    * Timestamp when this announcement was created.
    *
    * Read-only.
    */
  var creationTime: js.UndefOr[String] = js.undefined
  /**
    * Identifier for the user that created the announcement.
    *
    * Read-only.
    */
  var creatorUserId: js.UndefOr[String] = js.undefined
  /**
    * Classroom-assigned identifier of this announcement, unique per course.
    *
    * Read-only.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Identifiers of students with access to the announcement.
    * This field is set only if `assigneeMode` is `INDIVIDUAL_STUDENTS`.
    * If the `assigneeMode` is `INDIVIDUAL_STUDENTS`, then only students
    * specified in this field will be able to see the announcement.
    */
  var individualStudentsOptions: js.UndefOr[IndividualStudentsOptions] = js.undefined
  /**
    * Additional materials.
    *
    * Announcements must have no more than 20 material items.
    */
  var materials: js.UndefOr[js.Array[Material]] = js.undefined
  /** Optional timestamp when this announcement is scheduled to be published. */
  var scheduledTime: js.UndefOr[String] = js.undefined
  /**
    * Status of this announcement.
    * If unspecified, the default state is `DRAFT`.
    */
  var state: js.UndefOr[String] = js.undefined
  /**
    * Description of this announcement.
    * The text must be a valid UTF-8 string containing no more
    * than 30,000 characters.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * Timestamp of the most recent change to this announcement.
    *
    * Read-only.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}

object Announcement {
  @scala.inline
  def apply(
    alternateLink: String = null,
    assigneeMode: String = null,
    courseId: String = null,
    creationTime: String = null,
    creatorUserId: String = null,
    id: String = null,
    individualStudentsOptions: IndividualStudentsOptions = null,
    materials: js.Array[Material] = null,
    scheduledTime: String = null,
    state: String = null,
    text: String = null,
    updateTime: String = null
  ): Announcement = {
    val __obj = js.Dynamic.literal()
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink.asInstanceOf[js.Any])
    if (assigneeMode != null) __obj.updateDynamic("assigneeMode")(assigneeMode.asInstanceOf[js.Any])
    if (courseId != null) __obj.updateDynamic("courseId")(courseId.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (creatorUserId != null) __obj.updateDynamic("creatorUserId")(creatorUserId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (individualStudentsOptions != null) __obj.updateDynamic("individualStudentsOptions")(individualStudentsOptions.asInstanceOf[js.Any])
    if (materials != null) __obj.updateDynamic("materials")(materials.asInstanceOf[js.Any])
    if (scheduledTime != null) __obj.updateDynamic("scheduledTime")(scheduledTime.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Announcement]
  }
}

