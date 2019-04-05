package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.CollectionNs.UserProfilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GuardiansCollection extends js.Object {
  // Returns a specific guardian.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if no user that matches the provided `student_id`
  //   is visible to the requesting user, if the requesting user is not
  //   permitted to view guardian information for the student identified by the
  //   `student_id`, if guardians are not enabled for the domain in question,
  //   or for other access errors.
  // * `INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot
  //   be recognized (it is not an email address, nor a `student_id` from the
  //   API, nor the literal string `me`).
  // * `NOT_FOUND` if the requesting user is permitted to view guardians for
  //   the requested `student_id`, but no `Guardian` record exists for that
  //   student that matches the provided `guardian_id`.
  def get(studentId: java.lang.String, guardianId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs.Guardian = js.native
  // Returns a list of guardians that the requesting user is permitted to
  // view, restricted to those that match the request.
  // To list guardians for any student that the requesting user may view
  // guardians for, use the literal character `-` for the student ID.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if a `student_id` is specified, and the requesting
  //   user is not permitted to view guardian information for that student, if
  //   `"-"` is specified as the `student_id` and the user is not a domain
  //   administrator, if guardians are not enabled for the domain in question,
  //   if the `invited_email_address` filter is set by a user who is not a
  //   domain administrator, or for other access errors.
  // * `INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot
  //   be recognized (it is not an email address, nor a `student_id` from the
  //   API, nor the literal string `me`). May also be returned if an invalid
  //   `page_token` is provided.
  // * `NOT_FOUND` if a `student_id` is specified, and its format can be
  //   recognized, but Classroom has no record of that student.
  def list(studentId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs.ListGuardiansResponse = js.native
  // Returns a list of guardians that the requesting user is permitted to
  // view, restricted to those that match the request.
  // To list guardians for any student that the requesting user may view
  // guardians for, use the literal character `-` for the student ID.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if a `student_id` is specified, and the requesting
  //   user is not permitted to view guardian information for that student, if
  //   `"-"` is specified as the `student_id` and the user is not a domain
  //   administrator, if guardians are not enabled for the domain in question,
  //   if the `invited_email_address` filter is set by a user who is not a
  //   domain administrator, or for other access errors.
  // * `INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot
  //   be recognized (it is not an email address, nor a `student_id` from the
  //   API, nor the literal string `me`). May also be returned if an invalid
  //   `page_token` is provided.
  // * `NOT_FOUND` if a `student_id` is specified, and its format can be
  //   recognized, but Classroom has no record of that student.
  def list(studentId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs.ListGuardiansResponse = js.native
  // Deletes a guardian.
  // The guardian will no longer receive guardian notifications and the guardian
  // will no longer be accessible via the API.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if no user that matches the provided `student_id`
  //   is visible to the requesting user, if the requesting user is not
  //   permitted to manage guardians for the student identified by the
  //   `student_id`, if guardians are not enabled for the domain in question,
  //   or for other access errors.
  // * `INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot
  //   be recognized (it is not an email address, nor a `student_id` from the
  //   API).
  // * `NOT_FOUND` if the requesting user is permitted to modify guardians for
  //   the requested `student_id`, but no `Guardian` record exists for that
  //   student with the provided `guardian_id`.
  def remove(studentId: java.lang.String, guardianId: java.lang.String): scala.Unit = js.native
}

