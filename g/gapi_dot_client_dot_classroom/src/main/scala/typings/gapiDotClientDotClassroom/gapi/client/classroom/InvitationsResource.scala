package typings.gapiDotClientDotClassroom.gapi.client.classroom

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotClassroom.Anon_AccesstokenAltBearertokenCallbackCourseIdFieldsKey
import typings.gapiDotClientDotClassroom.Anon_AccesstokenAltBearertokenCallbackFields
import typings.gapiDotClientDotClassroom.Anon_AccesstokenAltBearertokenCallbackFieldsId
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
  def accept(request: Anon_AccesstokenAltBearertokenCallbackFieldsId): Request[js.Object]
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
  def create(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[Invitation]
  /**
    * Deletes an invitation.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to delete the
    * requested invitation or for access errors.
    * &#42; `NOT_FOUND` if no invitation exists with the requested ID.
    */
  def delete(request: Anon_AccesstokenAltBearertokenCallbackFieldsId): Request[js.Object]
  /**
    * Returns an invitation.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to view the
    * requested invitation or for access errors.
    * &#42; `NOT_FOUND` if no invitation exists with the requested ID.
    */
  def get(request: Anon_AccesstokenAltBearertokenCallbackFieldsId): Request[Invitation]
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
  def list(request: Anon_AccesstokenAltBearertokenCallbackCourseIdFieldsKey): Request[ListInvitationsResponse]
}

object InvitationsResource {
  @scala.inline
  def apply(
    accept: Anon_AccesstokenAltBearertokenCallbackFieldsId => Request[js.Object],
    create: Anon_AccesstokenAltBearertokenCallbackFields => Request[Invitation],
    delete: Anon_AccesstokenAltBearertokenCallbackFieldsId => Request[js.Object],
    get: Anon_AccesstokenAltBearertokenCallbackFieldsId => Request[Invitation],
    list: Anon_AccesstokenAltBearertokenCallbackCourseIdFieldsKey => Request[ListInvitationsResponse]
  ): InvitationsResource = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[InvitationsResource]
  }
}

