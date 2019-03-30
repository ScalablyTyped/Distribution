package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvitationsCollection extends js.Object {
  // Accepts an invitation, removing it and adding the invited user to the
  // teachers or students (as appropriate) of the specified course. Only the
  // invited user may accept an invitation.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to accept the
  // requested invitation or for access errors.
  // * `FAILED_PRECONDITION` for the following request errors:
  //     * CourseMemberLimitReached
  //     * CourseNotModifiable
  //     * CourseTeacherLimitReached
  //     * UserGroupsMembershipLimitReached
  // * `NOT_FOUND` if no invitation exists with the requested ID.
  def accept(id: java.lang.String): scala.Unit = js.native
  // Creates an invitation. Only one invitation for a user and course may exist
  // at a time. Delete and re-create an invitation to make changes.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to create
  // invitations for this course or for access errors.
  // * `NOT_FOUND` if the course or the user does not exist.
  // * `FAILED_PRECONDITION` if the requested user's account is disabled or if
  // the user already has this role or a role with greater permissions.
  // * `ALREADY_EXISTS` if an invitation for the specified user and course
  // already exists.
  def create(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs.Invitation
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs.Invitation = js.native
  // Returns an invitation.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to view the
  // requested invitation or for access errors.
  // * `NOT_FOUND` if no invitation exists with the requested ID.
  def get(id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs.Invitation = js.native
  // Returns a list of invitations that the requesting user is permitted to
  // view, restricted to those that match the list request.
  // *Note:* At least one of `user_id` or `course_id` must be supplied. Both
  // fields can be supplied.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` for access errors.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs.ListInvitationsResponse = js.native
  // Returns a list of invitations that the requesting user is permitted to
  // view, restricted to those that match the list request.
  // *Note:* At least one of `user_id` or `course_id` must be supplied. Both
  // fields can be supplied.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` for access errors.
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs.ListInvitationsResponse = js.native
  // Deletes an invitation.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to delete the
  // requested invitation or for access errors.
  // * `NOT_FOUND` if no invitation exists with the requested ID.
  def remove(id: java.lang.String): scala.Unit = js.native
}

