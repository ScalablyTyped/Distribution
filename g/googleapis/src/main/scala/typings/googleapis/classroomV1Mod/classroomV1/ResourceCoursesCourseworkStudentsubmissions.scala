package typings.googleapis.classroomV1Mod.classroomV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Courses$Coursework$Studentsubmissions")
@js.native
class ResourceCoursesCourseworkStudentsubmissions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * classroom.courses.courseWork.studentSubmissions.get
    * @desc Returns a student submission.  * `PERMISSION_DENIED` if the
    * requesting user is not permitted to access the requested course, course
    * work, or student submission or for access errors. * `INVALID_ARGUMENT` if
    * the request is malformed. * `NOT_FOUND` if the requested course, course
    * work, or student submission does not exist.
    * @alias classroom.courses.courseWork.studentSubmissions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string} params.courseWorkId Identifier of the course work.
    * @param {string} params.id Identifier of the student submission.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaStudentSubmission] = js.native
  def get(callback: BodyResponseCallback[SchemaStudentSubmission]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaStudentSubmission] = js.native
  def get(params: ParamsResourceCoursesCourseworkStudentsubmissionsGet): GaxiosPromise[SchemaStudentSubmission] = js.native
  def get(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsGet,
    callback: BodyResponseCallback[SchemaStudentSubmission]
  ): Unit = js.native
  def get(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsGet,
    options: BodyResponseCallback[SchemaStudentSubmission],
    callback: BodyResponseCallback[SchemaStudentSubmission]
  ): Unit = js.native
  def get(params: ParamsResourceCoursesCourseworkStudentsubmissionsGet, options: MethodOptions): GaxiosPromise[SchemaStudentSubmission] = js.native
  def get(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStudentSubmission]
  ): Unit = js.native
  
  /**
    * classroom.courses.courseWork.studentSubmissions.list
    * @desc Returns a list of student submissions that the requester is
    * permitted to view, factoring in the OAuth scopes of the request. `-` may
    * be specified as the `course_work_id` to include student submissions for
    * multiple course work items.  Course students may only view their own
    * work. Course teachers and domain administrators may view all student
    * submissions.  This method returns the following error codes:  *
    * `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or course work, or for access errors. *
    * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the
    * requested course does not exist.
    * @alias classroom.courses.courseWork.studentSubmissions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string} params.courseWorkId Identifier of the student work to request. This may be set to the string literal `"-"` to request student work for all course work in the specified course.
    * @param {string=} params.late Requested lateness value. If specified, returned student submissions are restricted by the requested value. If unspecified, submissions are returned regardless of `late` value.
    * @param {integer=} params.pageSize Maximum number of items to return. Zero or unspecified indicates that the server may assign a maximum.  The server may return fewer than the specified number of results.
    * @param {string=} params.pageToken nextPageToken value returned from a previous list call, indicating that the subsequent page of results should be returned.  The list request must be otherwise identical to the one that resulted in this token.
    * @param {string=} params.states Requested submission states. If specified, returned student submissions match one of the specified submission states.
    * @param {string=} params.userId Optional argument to restrict returned student work to those owned by the student with the specified identifier. The identifier can be one of the following:  * the numeric identifier for the user * the email address of the user * the string literal `"me"`, indicating the requesting user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListStudentSubmissionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListStudentSubmissionsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListStudentSubmissionsResponse] = js.native
  def list(params: ParamsResourceCoursesCourseworkStudentsubmissionsList): GaxiosPromise[SchemaListStudentSubmissionsResponse] = js.native
  def list(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsList,
    callback: BodyResponseCallback[SchemaListStudentSubmissionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsList,
    options: BodyResponseCallback[SchemaListStudentSubmissionsResponse],
    callback: BodyResponseCallback[SchemaListStudentSubmissionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCoursesCourseworkStudentsubmissionsList, options: MethodOptions): GaxiosPromise[SchemaListStudentSubmissionsResponse] = js.native
  def list(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListStudentSubmissionsResponse]
  ): Unit = js.native
  
  /**
    * classroom.courses.courseWork.studentSubmissions.modifyAttachments
    * @desc Modifies attachments of student submission.  Attachments may only
    * be added to student submissions belonging to course work objects with a
    * `workType` of `ASSIGNMENT`.  This request must be made by the Developer
    * Console project of the [OAuth client
    * ID](https://support.google.com/cloud/answer/6158849) used to create the
    * corresponding course work item.  This method returns the following error
    * codes:  * `PERMISSION_DENIED` if the requesting user is not permitted to
    * access the requested course or course work, if the user is not permitted
    * to modify attachments on the requested student submission, or for access
    * errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND`
    * if the requested course, course work, or student submission does not
    * exist.
    * @alias classroom.courses.courseWork.studentSubmissions.modifyAttachments
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string} params.courseWorkId Identifier of the course work.
    * @param {string} params.id Identifier of the student submission.
    * @param {().ModifyAttachmentsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def modifyAttachments(): GaxiosPromise[SchemaStudentSubmission] = js.native
  def modifyAttachments(callback: BodyResponseCallback[SchemaStudentSubmission]): Unit = js.native
  def modifyAttachments(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaStudentSubmission] = js.native
  def modifyAttachments(params: ParamsResourceCoursesCourseworkStudentsubmissionsModifyattachments): GaxiosPromise[SchemaStudentSubmission] = js.native
  def modifyAttachments(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsModifyattachments,
    callback: BodyResponseCallback[SchemaStudentSubmission]
  ): Unit = js.native
  def modifyAttachments(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsModifyattachments,
    options: BodyResponseCallback[SchemaStudentSubmission],
    callback: BodyResponseCallback[SchemaStudentSubmission]
  ): Unit = js.native
  def modifyAttachments(params: ParamsResourceCoursesCourseworkStudentsubmissionsModifyattachments, options: MethodOptions): GaxiosPromise[SchemaStudentSubmission] = js.native
  def modifyAttachments(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsModifyattachments,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStudentSubmission]
  ): Unit = js.native
  
  /**
    * classroom.courses.courseWork.studentSubmissions.patch
    * @desc Updates one or more fields of a student submission.  See
    * google.classroom.v1.StudentSubmission for details of which fields may be
    * updated and who may change them.  This request must be made by the
    * Developer Console project of the [OAuth client
    * ID](https://support.google.com/cloud/answer/6158849) used to create the
    * corresponding course work item.  This method returns the following error
    * codes:  * `PERMISSION_DENIED` if the requesting developer project did not
    * create the corresponding course work, if the user is not permitted to
    * make the requested modification to the student submission, or for access
    * errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND`
    * if the requested course, course work, or student submission does not
    * exist.
    * @alias classroom.courses.courseWork.studentSubmissions.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string} params.courseWorkId Identifier of the course work.
    * @param {string} params.id Identifier of the student submission.
    * @param {string=} params.updateMask Mask that identifies which fields on the student submission to update. This field is required to do an update. The update fails if invalid fields are specified.  The following fields may be specified by teachers:  * `draft_grade` * `assigned_grade`
    * @param {().StudentSubmission} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaStudentSubmission] = js.native
  def patch(callback: BodyResponseCallback[SchemaStudentSubmission]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaStudentSubmission] = js.native
  def patch(params: ParamsResourceCoursesCourseworkStudentsubmissionsPatch): GaxiosPromise[SchemaStudentSubmission] = js.native
  def patch(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsPatch,
    callback: BodyResponseCallback[SchemaStudentSubmission]
  ): Unit = js.native
  def patch(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsPatch,
    options: BodyResponseCallback[SchemaStudentSubmission],
    callback: BodyResponseCallback[SchemaStudentSubmission]
  ): Unit = js.native
  def patch(params: ParamsResourceCoursesCourseworkStudentsubmissionsPatch, options: MethodOptions): GaxiosPromise[SchemaStudentSubmission] = js.native
  def patch(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStudentSubmission]
  ): Unit = js.native
  
  /**
    * classroom.courses.courseWork.studentSubmissions.reclaim
    * @desc Reclaims a student submission on behalf of the student that owns
    * it.  Reclaiming a student submission transfers ownership of attached
    * Drive files to the student and updates the submission state.  Only the
    * student that owns the requested student submission may call this method,
    * and only for a student submission that has been turned in.  This request
    * must be made by the Developer Console project of the [OAuth client
    * ID](https://support.google.com/cloud/answer/6158849) used to create the
    * corresponding course work item.  This method returns the following error
    * codes:  * `PERMISSION_DENIED` if the requesting user is not permitted to
    * access the requested course or course work, unsubmit the requested
    * student submission, or for access errors. * `FAILED_PRECONDITION` if the
    * student submission has not been turned in. * `INVALID_ARGUMENT` if the
    * request is malformed. * `NOT_FOUND` if the requested course, course work,
    * or student submission does not exist.
    * @alias classroom.courses.courseWork.studentSubmissions.reclaim
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string} params.courseWorkId Identifier of the course work.
    * @param {string} params.id Identifier of the student submission.
    * @param {().ReclaimStudentSubmissionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reclaim(): GaxiosPromise[SchemaEmpty] = js.native
  def reclaim(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def reclaim(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def reclaim(params: ParamsResourceCoursesCourseworkStudentsubmissionsReclaim): GaxiosPromise[SchemaEmpty] = js.native
  def reclaim(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsReclaim,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def reclaim(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsReclaim,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def reclaim(params: ParamsResourceCoursesCourseworkStudentsubmissionsReclaim, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def reclaim(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsReclaim,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * classroom.courses.courseWork.studentSubmissions.return
    * @desc Returns a student submission.  Returning a student submission
    * transfers ownership of attached Drive files to the student and may also
    * update the submission state. Unlike the Classroom application, returning
    * a student submission does not set assignedGrade to the draftGrade value.
    * Only a teacher of the course that contains the requested student
    * submission may call this method.  This request must be made by the
    * Developer Console project of the [OAuth client
    * ID](https://support.google.com/cloud/answer/6158849) used to create the
    * corresponding course work item.  This method returns the following error
    * codes:  * `PERMISSION_DENIED` if the requesting user is not permitted to
    * access the requested course or course work, return the requested student
    * submission, or for access errors. * `INVALID_ARGUMENT` if the request is
    * malformed. * `NOT_FOUND` if the requested course, course work, or student
    * submission does not exist.
    * @alias classroom.courses.courseWork.studentSubmissions.return
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string} params.courseWorkId Identifier of the course work.
    * @param {string} params.id Identifier of the student submission.
    * @param {().ReturnStudentSubmissionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def `return`(): GaxiosPromise[SchemaEmpty] = js.native
  def `return`(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def `return`(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def `return`(params: ParamsResourceCoursesCourseworkStudentsubmissionsReturn): GaxiosPromise[SchemaEmpty] = js.native
  def `return`(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsReturn,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def `return`(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsReturn,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def `return`(params: ParamsResourceCoursesCourseworkStudentsubmissionsReturn, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def `return`(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsReturn,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * classroom.courses.courseWork.studentSubmissions.turnIn
    * @desc Turns in a student submission.  Turning in a student submission
    * transfers ownership of attached Drive files to the teacher and may also
    * update the submission state.  This may only be called by the student that
    * owns the specified student submission.  This request must be made by the
    * Developer Console project of the [OAuth client
    * ID](https://support.google.com/cloud/answer/6158849) used to create the
    * corresponding course work item.  This method returns the following error
    * codes:  * `PERMISSION_DENIED` if the requesting user is not permitted to
    * access the requested course or course work, turn in the requested student
    * submission, or for access errors. * `INVALID_ARGUMENT` if the request is
    * malformed. * `NOT_FOUND` if the requested course, course work, or student
    * submission does not exist.
    * @alias classroom.courses.courseWork.studentSubmissions.turnIn
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string} params.courseWorkId Identifier of the course work.
    * @param {string} params.id Identifier of the student submission.
    * @param {().TurnInStudentSubmissionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def turnIn(): GaxiosPromise[SchemaEmpty] = js.native
  def turnIn(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def turnIn(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def turnIn(params: ParamsResourceCoursesCourseworkStudentsubmissionsTurnin): GaxiosPromise[SchemaEmpty] = js.native
  def turnIn(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsTurnin,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def turnIn(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsTurnin,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def turnIn(params: ParamsResourceCoursesCourseworkStudentsubmissionsTurnin, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def turnIn(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsTurnin,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
}
