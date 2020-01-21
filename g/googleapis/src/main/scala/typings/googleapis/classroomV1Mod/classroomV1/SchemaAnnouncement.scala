package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Announcement created by a teacher for students of the course
  */
@js.native
trait SchemaAnnouncement extends js.Object {
  /**
    * Absolute link to this announcement in the Classroom web UI. This is only
    * populated if `state` is `PUBLISHED`.  Read-only.
    */
  var alternateLink: js.UndefOr[String] = js.native
  /**
    * Assignee mode of the announcement. If unspecified, the default value is
    * `ALL_STUDENTS`.
    */
  var assigneeMode: js.UndefOr[String] = js.native
  /**
    * Identifier of the course.  Read-only.
    */
  var courseId: js.UndefOr[String] = js.native
  /**
    * Timestamp when this announcement was created.  Read-only.
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * Identifier for the user that created the announcement.  Read-only.
    */
  var creatorUserId: js.UndefOr[String] = js.native
  /**
    * Classroom-assigned identifier of this announcement, unique per course.
    * Read-only.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifiers of students with access to the announcement. This field is
    * set only if `assigneeMode` is `INDIVIDUAL_STUDENTS`. If the
    * `assigneeMode` is `INDIVIDUAL_STUDENTS`, then only students specified in
    * this field will be able to see the announcement.
    */
  var individualStudentsOptions: js.UndefOr[SchemaIndividualStudentsOptions] = js.native
  /**
    * Additional materials.  Announcements must have no more than 20 material
    * items.
    */
  var materials: js.UndefOr[js.Array[SchemaMaterial]] = js.native
  /**
    * Optional timestamp when this announcement is scheduled to be published.
    */
  var scheduledTime: js.UndefOr[String] = js.native
  /**
    * Status of this announcement. If unspecified, the default state is
    * `DRAFT`.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Description of this announcement. The text must be a valid UTF-8 string
    * containing no more than 30,000 characters.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Timestamp of the most recent change to this announcement.  Read-only.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaAnnouncement {
  @scala.inline
  def apply(
    alternateLink: String = null,
    assigneeMode: String = null,
    courseId: String = null,
    creationTime: String = null,
    creatorUserId: String = null,
    id: String = null,
    individualStudentsOptions: SchemaIndividualStudentsOptions = null,
    materials: js.Array[SchemaMaterial] = null,
    scheduledTime: String = null,
    state: String = null,
    text: String = null,
    updateTime: String = null
  ): SchemaAnnouncement = {
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
    __obj.asInstanceOf[SchemaAnnouncement]
  }
}

