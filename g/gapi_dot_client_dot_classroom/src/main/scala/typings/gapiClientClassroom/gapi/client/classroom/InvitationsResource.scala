package typings.gapiClientClassroom.gapi.client.classroom

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientClassroom.AnonAccesstokenAltBearertokenCallbackCourseIdFieldsKey
import typings.gapiClientClassroom.AnonAccesstokenAltBearertokenCallbackFields
import typings.gapiClientClassroom.AnonAccesstokenAltBearertokenCallbackFieldsId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvitationsResource extends js.Object {
  /**
    * Accepts an invitation, removing it and adding the invited user to the
    * teachers or students (as appropriate) of the specified course. Only the
    * invited user may accept an invitation.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to accept the
    * requested invitation or for access errors.
    * &#42; `FAILED_PRECONDITION` for the following request errors:
    * &#42; CourseMemberLimitReached
    * &#42; CourseNotModifiable
    * &#42; CourseTeacherLimitReached
    * &#42; UserGroupsMembershipLimitReached
    * &#42; `NOT_FOUND` if no invitation exists with the requested ID.
    */
  def accept(request: AnonAccesstokenAltBearertokenCallbackFieldsId): Request_[js.Object]
  /**
    * Creates an invitation. Only one invitation for a user and course may exist
    * at a time. Delete and re-create an invitation to make changes.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to create
    * invitations for this course or for access errors.
    * &#42; `NOT_FOUND` if the course or the user does not exist.
    * &#42; `FAILED_PRECONDITION` if the requested user's account is disabled or if
    * the user already has this role or a role with greater permissions.
    * &#42; `ALREADY_EXISTS` if an invitation for the specified user and course
    * already exists.
    */
  def create(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[Invitation]
  /**
    * Deletes an invitation.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to delete the
    * requested invitation or for access errors.
    * &#42; `NOT_FOUND` if no invitation exists with the requested ID.
    */
  def delete(request: AnonAccesstokenAltBearertokenCallbackFieldsId): Request_[js.Object]
  /**
    * Returns an invitation.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to view the
    * requested invitation or for access errors.
    * &#42; `NOT_FOUND` if no invitation exists with the requested ID.
    */
  def get(request: AnonAccesstokenAltBearertokenCallbackFieldsId): Request_[Invitation]
  /**
    * Returns a list of invitations that the requesting user is permitted to
    * view, restricted to those that match the list request.
    *
    * &#42;Note:&#42; At least one of `user_id` or `course_id` must be supplied. Both
    * fields can be supplied.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` for access errors.
    */
  def list(request: AnonAccesstokenAltBearertokenCallbackCourseIdFieldsKey): Request_[ListInvitationsResponse]
}

object InvitationsResource {
  @scala.inline
  def apply(
    accept: AnonAccesstokenAltBearertokenCallbackFieldsId => Request_[js.Object],
    create: AnonAccesstokenAltBearertokenCallbackFields => Request_[Invitation],
    delete: AnonAccesstokenAltBearertokenCallbackFieldsId => Request_[js.Object],
    get: AnonAccesstokenAltBearertokenCallbackFieldsId => Request_[Invitation],
    list: AnonAccesstokenAltBearertokenCallbackCourseIdFieldsKey => Request_[ListInvitationsResponse]
  ): InvitationsResource = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[InvitationsResource]
  }
}

