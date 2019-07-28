package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ClassroomNs.CollectionNs.CoursesNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ClassroomNs.SchemaNs.Announcement
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ClassroomNs.SchemaNs.ListAnnouncementsResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ClassroomNs.SchemaNs.ModifyAnnouncementAssigneesRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnouncementsCollection extends js.Object {
  // Creates an announcement.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
  // requested course, create announcements in the requested course, share a
  // Drive attachment, or for access errors.
  // * `INVALID_ARGUMENT` if the request is malformed.
  // * `NOT_FOUND` if the requested course does not exist.
  // * `FAILED_PRECONDITION` for the following request error:
  //     * AttachmentNotVisible
  def create(resource: Announcement, courseId: String): Announcement = js.native
  // Returns an announcement.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
  // requested course or announcement, or for access errors.
  // * `INVALID_ARGUMENT` if the request is malformed.
  // * `NOT_FOUND` if the requested course or announcement does not exist.
  def get(courseId: String, id: String): Announcement = js.native
  // Returns a list of announcements that the requester is permitted to view.
  // Course students may only view `PUBLISHED` announcements. Course teachers
  // and domain administrators may view all announcements.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to access
  // the requested course or for access errors.
  // * `INVALID_ARGUMENT` if the request is malformed.
  // * `NOT_FOUND` if the requested course does not exist.
  def list(courseId: String): ListAnnouncementsResponse = js.native
  // Returns a list of announcements that the requester is permitted to view.
  // Course students may only view `PUBLISHED` announcements. Course teachers
  // and domain administrators may view all announcements.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to access
  // the requested course or for access errors.
  // * `INVALID_ARGUMENT` if the request is malformed.
  // * `NOT_FOUND` if the requested course does not exist.
  def list(courseId: String, optionalArgs: js.Object): ListAnnouncementsResponse = js.native
  // Modifies assignee mode and options of an announcement.
  // Only a teacher of the course that contains the announcement may
  // call this method.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
  // requested course or course work or for access errors.
  // * `INVALID_ARGUMENT` if the request is malformed.
  // * `NOT_FOUND` if the requested course or course work does not exist.
  def modifyAssignees(resource: ModifyAnnouncementAssigneesRequest, courseId: String, id: String): Announcement = js.native
  // Updates one or more fields of an announcement.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting developer project did not create
  // the corresponding announcement or for access errors.
  // * `INVALID_ARGUMENT` if the request is malformed.
  // * `FAILED_PRECONDITION` if the requested announcement has already been
  // deleted.
  // * `NOT_FOUND` if the requested course or announcement does not exist
  def patch(resource: Announcement, courseId: String, id: String): Announcement = js.native
  // Updates one or more fields of an announcement.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting developer project did not create
  // the corresponding announcement or for access errors.
  // * `INVALID_ARGUMENT` if the request is malformed.
  // * `FAILED_PRECONDITION` if the requested announcement has already been
  // deleted.
  // * `NOT_FOUND` if the requested course or announcement does not exist
  def patch(resource: Announcement, courseId: String, id: String, optionalArgs: js.Object): Announcement = js.native
  // Deletes an announcement.
  // This request must be made by the Developer Console project of the
  // [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
  // create the corresponding announcement item.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting developer project did not create
  // the corresponding announcement, if the requesting user is not permitted
  // to delete the requested course or for access errors.
  // * `FAILED_PRECONDITION` if the requested announcement has already been
  // deleted.
  // * `NOT_FOUND` if no course exists with the requested ID.
  def remove(courseId: String, id: String): Unit = js.native
}

