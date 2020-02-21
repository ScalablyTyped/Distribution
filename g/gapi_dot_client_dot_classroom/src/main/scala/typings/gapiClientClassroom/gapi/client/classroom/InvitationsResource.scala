package typings.gapiClientClassroom.gapi.client.classroom

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientClassroom.AnonAccesstokenAltCallbackCourseIdFieldsKeyOauthtokenPageSize
import typings.gapiClientClassroom.AnonAccesstokenAltCallbackFieldsId
import typings.gapiClientClassroom.AnonAccesstokenAltCallbackFieldsKey
import typings.gapiClientClassroom.AnonAccesstokenAltCallbackFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  def accept(request: AnonAccesstokenAltCallbackFieldsId): Request_[js.Object] = js.native
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
  def create(request: AnonAccesstokenAltCallbackFieldsKeyOauthtoken): Request_[Invitation] = js.native
  def create(request: AnonAccesstokenAltCallbackFieldsKey, body: Invitation): Request_[Invitation] = js.native
  /**
    * Deletes an invitation.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to delete the
    * requested invitation or for access errors.
    * &#42; `NOT_FOUND` if no invitation exists with the requested ID.
    */
  def delete(request: AnonAccesstokenAltCallbackFieldsId): Request_[js.Object] = js.native
  /**
    * Returns an invitation.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to view the
    * requested invitation or for access errors.
    * &#42; `NOT_FOUND` if no invitation exists with the requested ID.
    */
  def get(request: AnonAccesstokenAltCallbackFieldsId): Request_[Invitation] = js.native
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
  def list(request: AnonAccesstokenAltCallbackCourseIdFieldsKeyOauthtokenPageSize): Request_[ListInvitationsResponse] = js.native
}

