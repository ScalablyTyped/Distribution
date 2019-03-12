package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuardianInvitationsResource extends js.Object {
  /**
    * Creates a guardian invitation, and sends an email to the guardian asking
    * them to confirm that they are the student's guardian.
    *
    * Once the guardian accepts the invitation, their `state` will change to
    * `COMPLETED` and they will start receiving guardian notifications. A
    * `Guardian` resource will also be created to represent the active guardian.
    *
    * The request object must have the `student_id` and
    * `invited_email_address` fields set. Failing to set these fields, or
    * setting any other fields in the request, will result in an error.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the current user does not have permission to
    * manage guardians, if the guardian in question has already rejected
    * too many requests for that student, if guardians are not enabled for the
    * domain in question, or for other access errors.
    * &#42; `RESOURCE_EXHAUSTED` if the student or guardian has exceeded the guardian
    * link limit.
    * &#42; `INVALID_ARGUMENT` if the guardian email address is not valid (for
    * example, if it is too long), or if the format of the student ID provided
    * cannot be recognized (it is not an email address, nor a `user_id` from
    * this API). This error will also be returned if read-only fields are set,
    * or if the `state` field is set to to a value other than `PENDING`.
    * &#42; `NOT_FOUND` if the student ID provided is a valid student ID, but
    * Classroom has no record of that student.
    * &#42; `ALREADY_EXISTS` if there is already a pending guardian invitation for
    * the student and `invited_email_address` provided, or if the provided
    * `invited_email_address` matches the Google account of an existing
    * `Guardian` for this user.
    */
  def create(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[GuardianInvitation]
  /**
    * Returns a specific guardian invitation.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to view
    * guardian invitations for the student identified by the `student_id`, if
    * guardians are not enabled for the domain in question, or for other
    * access errors.
    * &#42; `INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot
    * be recognized (it is not an email address, nor a `student_id` from the
    * API, nor the literal string `me`).
    * &#42; `NOT_FOUND` if Classroom cannot find any record of the given student or
    * `invitation_id`. May also be returned if the student exists, but the
    * requesting user does not have access to see that student.
    */
  def get(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsInvitationId): gapiDotClientLib.gapiNs.clientNs.Request[GuardianInvitation]
  /**
    * Returns a list of guardian invitations that the requesting user is
    * permitted to view, filtered by the parameters provided.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if a `student_id` is specified, and the requesting
    * user is not permitted to view guardian invitations for that student, if
    * `"-"` is specified as the `student_id` and the user is not a domain
    * administrator, if guardians are not enabled for the domain in question,
    * or for other access errors.
    * &#42; `INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot
    * be recognized (it is not an email address, nor a `student_id` from the
    * API, nor the literal string `me`). May also be returned if an invalid
    * `page_token` or `state` is provided.
    * &#42; `NOT_FOUND` if a `student_id` is specified, and its format can be
    * recognized, but Classroom has no record of that student.
    */
  def list(
    request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsInvitedEmailAddress
  ): gapiDotClientLib.gapiNs.clientNs.Request[ListGuardianInvitationsResponse]
  /**
    * Modifies a guardian invitation.
    *
    * Currently, the only valid modification is to change the `state` from
    * `PENDING` to `COMPLETE`. This has the effect of withdrawing the invitation.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the current user does not have permission to
    * manage guardians, if guardians are not enabled for the domain in question
    * or for other access errors.
    * &#42; `FAILED_PRECONDITION` if the guardian link is not in the `PENDING` state.
    * &#42; `INVALID_ARGUMENT` if the format of the student ID provided
    * cannot be recognized (it is not an email address, nor a `user_id` from
    * this API), or if the passed `GuardianInvitation` has a `state` other than
    * `COMPLETE`, or if it modifies fields other than `state`.
    * &#42; `NOT_FOUND` if the student ID provided is a valid student ID, but
    * Classroom has no record of that student, or if the `id` field does not
    * refer to a guardian invitation known to Classroom.
    */
  def patch(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsInvitationIdKey): gapiDotClientLib.gapiNs.clientNs.Request[GuardianInvitation]
}

object GuardianInvitationsResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[GuardianInvitation],
    get: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsInvitationId => gapiDotClientLib.gapiNs.clientNs.Request[GuardianInvitation],
    list: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsInvitedEmailAddress => gapiDotClientLib.gapiNs.clientNs.Request[ListGuardianInvitationsResponse],
    patch: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsInvitationIdKey => gapiDotClientLib.gapiNs.clientNs.Request[GuardianInvitation]
  ): GuardianInvitationsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[GuardianInvitationsResource]
  }
}

