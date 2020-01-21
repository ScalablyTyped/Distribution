package typings.gapiClientClassroom.gapi.client.classroom

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientClassroom.AnonAccesstoken
import typings.gapiClientClassroom.AnonAccesstokenAltAnnouncementStates
import typings.gapiClientClassroom.AnonAccesstokenAltBearertoken
import typings.gapiClientClassroom.AnonAccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnouncementsResource extends js.Object {
  /**
    * Creates an announcement.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course, create announcements in the requested course, share a
    * Drive attachment, or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course does not exist.
    * &#42; `FAILED_PRECONDITION` for the following request error:
    * &#42; AttachmentNotVisible
    */
  def create(request: AnonAccesstoken): Request_[Announcement]
  /**
    * Deletes an announcement.
    *
    * This request must be made by the Developer Console project of the
    * [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
    * create the corresponding announcement item.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting developer project did not create
    * the corresponding announcement, if the requesting user is not permitted
    * to delete the requested course or for access errors.
    * &#42; `FAILED_PRECONDITION` if the requested announcement has already been
    * deleted.
    * &#42; `NOT_FOUND` if no course exists with the requested ID.
    */
  def delete(request: AnonAccesstokenAltBearertoken): Request_[js.Object]
  /**
    * Returns an announcement.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or announcement, or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course or announcement does not exist.
    */
  def get(request: AnonAccesstokenAltBearertoken): Request_[Announcement]
  /**
    * Returns a list of announcements that the requester is permitted to view.
    *
    * Course students may only view `PUBLISHED` announcements. Course teachers
    * and domain administrators may view all announcements.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access
    * the requested course or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course does not exist.
    */
  def list(request: AnonAccesstokenAltAnnouncementStates): Request_[ListAnnouncementsResponse]
  /**
    * Modifies assignee mode and options of an announcement.
    *
    * Only a teacher of the course that contains the announcement may
    * call this method.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or course work or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course or course work does not exist.
    */
  def modifyAssignees(request: AnonAccesstokenAltBearertoken): Request_[Announcement]
  /**
    * Updates one or more fields of an announcement.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting developer project did not create
    * the corresponding announcement or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `FAILED_PRECONDITION` if the requested announcement has already been
    * deleted.
    * &#42; `NOT_FOUND` if the requested course or announcement does not exist
    */
  def patch(request: AnonAccesstokenAltBearertokenCallback): Request_[Announcement]
}

object AnnouncementsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[Announcement],
    delete: AnonAccesstokenAltBearertoken => Request_[js.Object],
    get: AnonAccesstokenAltBearertoken => Request_[Announcement],
    list: AnonAccesstokenAltAnnouncementStates => Request_[ListAnnouncementsResponse],
    modifyAssignees: AnonAccesstokenAltBearertoken => Request_[Announcement],
    patch: AnonAccesstokenAltBearertokenCallback => Request_[Announcement]
  ): AnnouncementsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), modifyAssignees = js.Any.fromFunction1(modifyAssignees), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[AnnouncementsResource]
  }
}

