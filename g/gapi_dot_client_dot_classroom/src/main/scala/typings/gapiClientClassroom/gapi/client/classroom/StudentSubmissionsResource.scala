package typings.gapiClientClassroom.gapi.client.classroom

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientClassroom.AnonCourseWorkId
import typings.gapiClientClassroom.AnonLate
import typings.gapiClientClassroom.AnonPrettyPrint
import typings.gapiClientClassroom.AnonQuotaUser
import typings.gapiClientClassroom.AnonResource
import typings.gapiClientClassroom.AnonUpdateMask
import typings.gapiClientClassroom.AnonUploadType
import typings.gapiClientClassroom.AnonUploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StudentSubmissionsResource extends js.Object {
  /**
    * Returns a student submission.
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course, course work, or student submission or for
    * access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course, course work, or student submission
    * does not exist.
    */
  def get(request: AnonCourseWorkId): Request_[StudentSubmission] = js.native
  /**
    * Returns a list of student submissions that the requester is permitted to
    * view, factoring in the OAuth scopes of the request.
    * `-` may be specified as the `course_work_id` to include student
    * submissions for multiple course work items.
    *
    * Course students may only view their own work. Course teachers
    * and domain administrators may view all student submissions.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or course work, or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course does not exist.
    */
  def list(request: AnonLate): Request_[ListStudentSubmissionsResponse] = js.native
  def modifyAttachments(request: AnonCourseWorkId, body: ModifyAttachmentsRequest): Request_[StudentSubmission] = js.native
  /**
    * Modifies attachments of student submission.
    *
    * Attachments may only be added to student submissions belonging to course
    * work objects with a `workType` of `ASSIGNMENT`.
    *
    * This request must be made by the Developer Console project of the
    * [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
    * create the corresponding course work item.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or course work, if the user is not permitted to modify
    * attachments on the requested student submission, or for
    * access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course, course work, or student submission
    * does not exist.
    */
  def modifyAttachments(request: AnonPrettyPrint): Request_[StudentSubmission] = js.native
  /**
    * Updates one or more fields of a student submission.
    *
    * See google.classroom.v1.StudentSubmission for details
    * of which fields may be updated and who may change them.
    *
    * This request must be made by the Developer Console project of the
    * [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
    * create the corresponding course work item.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting developer project did not create
    * the corresponding course work, if the user is not permitted to make the
    * requested modification to the student submission, or for
    * access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course, course work, or student submission
    * does not exist.
    */
  def patch(request: AnonQuotaUser): Request_[StudentSubmission] = js.native
  def patch(request: AnonUpdateMask, body: StudentSubmission): Request_[StudentSubmission] = js.native
  def reclaim(request: AnonCourseWorkId, body: ReclaimStudentSubmissionRequest): Request_[js.Object] = js.native
  /**
    * Reclaims a student submission on behalf of the student that owns it.
    *
    * Reclaiming a student submission transfers ownership of attached Drive
    * files to the student and updates the submission state.
    *
    * Only the student that owns the requested student submission may call this
    * method, and only for a student submission that has been turned in.
    *
    * This request must be made by the Developer Console project of the
    * [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
    * create the corresponding course work item.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or course work, unsubmit the requested student submission,
    * or for access errors.
    * &#42; `FAILED_PRECONDITION` if the student submission has not been turned in.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course, course work, or student submission
    * does not exist.
    */
  def reclaim(request: AnonResource): Request_[js.Object] = js.native
  def `return`(request: AnonCourseWorkId, body: ReturnStudentSubmissionRequest): Request_[js.Object] = js.native
  /**
    * Returns a student submission.
    *
    * Returning a student submission transfers ownership of attached Drive
    * files to the student and may also update the submission state.
    * Unlike the Classroom application, returning a student submission does not
    * set assignedGrade to the draftGrade value.
    *
    * Only a teacher of the course that contains the requested student submission
    * may call this method.
    *
    * This request must be made by the Developer Console project of the
    * [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
    * create the corresponding course work item.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or course work, return the requested student submission,
    * or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course, course work, or student submission
    * does not exist.
    */
  def `return`(request: AnonUploadType): Request_[js.Object] = js.native
  def turnIn(request: AnonCourseWorkId, body: TurnInStudentSubmissionRequest): Request_[js.Object] = js.native
  /**
    * Turns in a student submission.
    *
    * Turning in a student submission transfers ownership of attached Drive
    * files to the teacher and may also update the submission state.
    *
    * This may only be called by the student that owns the specified student
    * submission.
    *
    * This request must be made by the Developer Console project of the
    * [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
    * create the corresponding course work item.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or course work, turn in the requested student submission,
    * or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course, course work, or student submission
    * does not exist.
    */
  def turnIn(request: AnonUploadprotocol): Request_[js.Object] = js.native
}

