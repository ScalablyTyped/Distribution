package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

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
  var alternateLink: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Assignee mode of the announcement.
    * If unspecified, the default value is `ALL_STUDENTS`.
    */
  var assigneeMode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifier of the course.
    *
    * Read-only.
    */
  var courseId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Timestamp when this announcement was created.
    *
    * Read-only.
    */
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifier for the user that created the announcement.
    *
    * Read-only.
    */
  var creatorUserId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Classroom-assigned identifier of this announcement, unique per course.
    *
    * Read-only.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifiers of students with access to the announcement.
    * This field is set only if `assigneeMode` is `INDIVIDUAL_STUDENTS`.
    * If the `assigneeMode` is `INDIVIDUAL_STUDENTS`, then only students specified in this
    * field will be able to see the announcement.
    */
  var individualStudentsOptions: js.UndefOr[IndividualStudentsOptions] = js.undefined
  /**
    * Additional materials.
    *
    * Announcements must have no more than 20 material items.
    */
  var materials: js.UndefOr[js.Array[Material]] = js.undefined
  /** Optional timestamp when this announcement is scheduled to be published. */
  var scheduledTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Status of this announcement.
    * If unspecified, the default state is `DRAFT`.
    */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Description of this announcement.
    * The text must be a valid UTF-8 string containing no more
    * than 30,000 characters.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Timestamp of the most recent change to this announcement.
    *
    * Read-only.
    */
  var updateTime: js.UndefOr[java.lang.String] = js.undefined
}

