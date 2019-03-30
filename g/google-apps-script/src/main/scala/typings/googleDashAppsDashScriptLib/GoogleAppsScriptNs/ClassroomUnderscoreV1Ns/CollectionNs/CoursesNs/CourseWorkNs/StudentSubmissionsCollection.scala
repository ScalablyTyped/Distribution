package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.CollectionNs.CoursesNs.CourseWorkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StudentSubmissionsCollection extends js.Object {
  // Returns a student submission.
  // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
  // requested course, course work, or student submission or for
  // access errors.
  // * `INVALID_ARGUMENT` if the request is malformed.
  // * `NOT_FOUND` if the requested course, course work, or student submission
  // does not exist.
  def get(courseId: java.lang.String, courseWorkId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs.StudentSubmission = js.native
  // Returns a list of student submissions that the requester is permitted to
  // view, factoring in the OAuth scopes of the request.
  // `-` may be specified as the `course_work_id` to include student
  // submissions for multiple course work items.
  // Course students may only view their own work. Course teachers
  // and domain administrators may view all student submissions.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
  // requested course or course work, or for access errors.
  // * `INVALID_ARGUMENT` if the request is malformed.
  // * `NOT_FOUND` if the requested course does not exist.
  def list(courseId: java.lang.String, courseWorkId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs.ListStudentSubmissionsResponse = js.native
  // Returns a list of student submissions that the requester is permitted to
  // view, factoring in the OAuth scopes of the request.
  // `-` may be specified as the `course_work_id` to include student
  // submissions for multiple course work items.
  // Course students may only view their own work. Course teachers
  // and domain administrators may view all student submissions.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
  // requested course or course work, or for access errors.
  // * `INVALID_ARGUMENT` if the request is malformed.
  // * `NOT_FOUND` if the requested course does not exist.
  def list(courseId: java.lang.String, courseWorkId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs.ListStudentSubmissionsResponse = js.native
  // Modifies attachments of student submission.
  // Attachments may only be added to student submissions belonging to course
  // work objects with a `workType` of `ASSIGNMENT`.
  // This request must be made by the Developer Console project of the
  // [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
  // create the corresponding course work item.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
  // requested course or course work, if the user is not permitted to modify
  // attachments on the requested student submission, or for
  // access errors.
  // * `INVALID_ARGUMENT` if the request is malformed.
  // * `NOT_FOUND` if the requested course, course work, or student submission
  // does not exist.
  def modifyAttachments(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs.ModifyAttachmentsRequest,
    courseId: java.lang.String,
    courseWorkId: java.lang.String,
    id: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs.StudentSubmission = js.native
  // Updates one or more fields of a student submission.
  // See google.StudentSubmission for details
  // of which fields may be updated and who may change them.
  // This request must be made by the Developer Console project of the
  // [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
  // create the corresponding course work item.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting developer project did not create
  // the corresponding course work, if the user is not permitted to make the
  // requested modification to the student submission, or for
  // access errors.
  // * `INVALID_ARGUMENT` if the request is malformed.
  // * `NOT_FOUND` if the requested course, course work, or student submission
  // does not exist.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs.StudentSubmission,
    courseId: java.lang.String,
    courseWorkId: java.lang.String,
    id: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs.StudentSubmission = js.native
  // Updates one or more fields of a student submission.
  // See google.StudentSubmission for details
  // of which fields may be updated and who may change them.
  // This request must be made by the Developer Console project of the
  // [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
  // create the corresponding course work item.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting developer project did not create
  // the corresponding course work, if the user is not permitted to make the
  // requested modification to the student submission, or for
  // access errors.
  // * `INVALID_ARGUMENT` if the request is malformed.
  // * `NOT_FOUND` if the requested course, course work, or student submission
  // does not exist.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs.StudentSubmission,
    courseId: java.lang.String,
    courseWorkId: java.lang.String,
    id: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs.StudentSubmission = js.native
  // Reclaims a student submission on behalf of the student that owns it.
  // Reclaiming a student submission transfers ownership of attached Drive
  // files to the student and updates the submission state.
  // Only the student that owns the requested student submission may call this
  // method, and only for a student submission that has been turned in.
  // This request must be made by the Developer Console project of the
  // [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
  // create the corresponding course work item.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
  // requested course or course work, unsubmit the requested student submission,
  // or for access errors.
  // * `FAILED_PRECONDITION` if the student submission has not been turned in.
  // * `INVALID_ARGUMENT` if the request is malformed.
  // * `NOT_FOUND` if the requested course, course work, or student submission
  // does not exist.
  def reclaim(resource: js.Any, courseId: java.lang.String, courseWorkId: java.lang.String, id: java.lang.String): scala.Unit = js.native
  // Returns a student submission.
  // Returning a student submission transfers ownership of attached Drive
  // files to the student and may also update the submission state.
  // Unlike the Classroom application, returning a student submission does not
  // set assignedGrade to the draftGrade value.
  // Only a teacher of the course that contains the requested student submission
  // may call this method.
  // This request must be made by the Developer Console project of the
  // [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
  // create the corresponding course work item.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
  // requested course or course work, return the requested student submission,
  // or for access errors.
  // * `INVALID_ARGUMENT` if the request is malformed.
  // * `NOT_FOUND` if the requested course, course work, or student submission
  // does not exist.
  def `return`(resource: js.Any, courseId: java.lang.String, courseWorkId: java.lang.String, id: java.lang.String): scala.Unit = js.native
  // Turns in a student submission.
  // Turning in a student submission transfers ownership of attached Drive
  // files to the teacher and may also update the submission state.
  // This may only be called by the student that owns the specified student
  // submission.
  // This request must be made by the Developer Console project of the
  // [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
  // create the corresponding course work item.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
  // requested course or course work, turn in the requested student submission,
  // or for access errors.
  // * `INVALID_ARGUMENT` if the request is malformed.
  // * `NOT_FOUND` if the requested course, course work, or student submission
  // does not exist.
  def turnIn(resource: js.Any, courseId: java.lang.String, courseWorkId: java.lang.String, id: java.lang.String): scala.Unit = js.native
}

