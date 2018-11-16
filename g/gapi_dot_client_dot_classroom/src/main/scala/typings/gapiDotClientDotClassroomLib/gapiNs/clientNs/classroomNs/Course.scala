package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Course extends js.Object {
  /**
               * Absolute link to this course in the Classroom web UI.
               *
               * Read-only.
               */
  var alternateLink: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The Calendar ID for a calendar that all course members can see, to which
               * Classroom adds events for course work and announcements in the course.
               *
               * Read-only.
               */
  var calendarId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The email address of a Google group containing all members of the course.
               * This group does not accept email and can only be used for permissions.
               *
               * Read-only.
               */
  var courseGroupEmail: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Sets of materials that appear on the "about" page of this course.
               *
               * Read-only.
               */
  var courseMaterialSets: js.UndefOr[js.Array[CourseMaterialSet]] = js.undefined
  /**
               * State of the course.
               * If unspecified, the default state is `PROVISIONED`.
               */
  var courseState: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Creation time of the course.
               * Specifying this field in a course update mask results in an error.
               *
               * Read-only.
               */
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Optional description.
               * For example, "We'll be learning about the structure of living
               * creatures from a combination of textbooks, guest lectures, and lab work.
               * Expect to be excited!"
               * If set, this field must be a valid UTF-8 string and no longer than 30,000
               * characters.
               */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Optional heading for the description.
               * For example, "Welcome to 10th Grade Biology."
               * If set, this field must be a valid UTF-8 string and no longer than 3600
               * characters.
               */
  var descriptionHeading: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Enrollment code to use when joining this course.
               * Specifying this field in a course update mask results in an error.
               *
               * Read-only.
               */
  var enrollmentCode: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Whether or not guardian notifications are enabled for this course.
               *
               * Read-only.
               */
  var guardiansEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Identifier for this course assigned by Classroom.
               *
               * When
               * creating a course,
               * you may optionally set this identifier to an
               * alias string in the
               * request to create a corresponding alias. The `id` is still assigned by
               * Classroom and cannot be updated after the course is created.
               *
               * Specifying this field in a course update mask results in an error.
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Name of the course.
               * For example, "10th Grade Biology".
               * The name is required. It must be between 1 and 750 characters and a valid
               * UTF-8 string.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The identifier of the owner of a course.
               *
               * When specified as a parameter of a
               * create course request, this
               * field is required.
               * The identifier can be one of the following:
               *
               * &#42; the numeric identifier for the user
               * &#42; the email address of the user
               * &#42; the string literal `"me"`, indicating the requesting user
               *
               * This must be set in a create request. Admins can also specify this field
               * in a patch course request to
               * transfer ownership. In other contexts, it is read-only.
               */
  var ownerId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Optional room location.
               * For example, "301".
               * If set, this field must be a valid UTF-8 string and no longer than 650
               * characters.
               */
  var room: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Section of the course.
               * For example, "Period 2".
               * If set, this field must be a valid UTF-8 string and no longer than 2800
               * characters.
               */
  var section: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Information about a Drive Folder that is shared with all teachers of the
               * course.
               *
               * This field will only be set for teachers of the course and domain administrators.
               *
               * Read-only.
               */
  var teacherFolder: js.UndefOr[DriveFolder] = js.undefined
  /**
               * The email address of a Google group containing all teachers of the course.
               * This group does not accept email and can only be used for permissions.
               *
               * Read-only.
               */
  var teacherGroupEmail: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Time of the most recent update to this course.
               * Specifying this field in a course update mask results in an error.
               *
               * Read-only.
               */
  var updateTime: js.UndefOr[java.lang.String] = js.undefined
}

