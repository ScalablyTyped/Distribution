package typings.googleapis.classroomV1Mod.classroomV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Courses$Coursework$Studentsubmissions")
@js.native
open class ResourceCoursesCourseworkStudentsubmissions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaStudentSubmission] = js.native
  def get(callback: BodyResponseCallback[SchemaStudentSubmission]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStudentSubmission] = js.native
  def get(params: ParamsResourceCoursesCourseworkStudentsubmissionsGet): GaxiosPromise[SchemaStudentSubmission] = js.native
  def get(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsGet,
    callback: BodyResponseCallback[SchemaStudentSubmission]
  ): Unit = js.native
  def get(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsGet,
    options: BodyResponseCallback[Readable | SchemaStudentSubmission],
    callback: BodyResponseCallback[Readable | SchemaStudentSubmission]
  ): Unit = js.native
  def get(params: ParamsResourceCoursesCourseworkStudentsubmissionsGet, options: MethodOptions): GaxiosPromise[SchemaStudentSubmission] = js.native
  def get(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStudentSubmission]
  ): Unit = js.native
  /**
    * Returns a student submission. * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course, course work, or student submission or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course, course work, or student submission does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/classroom.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const classroom = google.classroom('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/classroom.coursework.me',
    *       'https://www.googleapis.com/auth/classroom.coursework.me.readonly',
    *       'https://www.googleapis.com/auth/classroom.coursework.students',
    *       'https://www.googleapis.com/auth/classroom.coursework.students.readonly',
    *       'https://www.googleapis.com/auth/classroom.student-submissions.me.readonly',
    *       'https://www.googleapis.com/auth/classroom.student-submissions.students.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.courseWork.studentSubmissions.get({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Identifier of the course work.
    *     courseWorkId: 'placeholder-value',
    *     // Identifier of the student submission.
    *     id: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateLink": "my_alternateLink",
    *   //   "assignedGrade": {},
    *   //   "assignmentSubmission": {},
    *   //   "associatedWithDeveloper": false,
    *   //   "courseId": "my_courseId",
    *   //   "courseWorkId": "my_courseWorkId",
    *   //   "courseWorkType": "my_courseWorkType",
    *   //   "creationTime": "my_creationTime",
    *   //   "draftGrade": {},
    *   //   "id": "my_id",
    *   //   "late": false,
    *   //   "multipleChoiceSubmission": {},
    *   //   "shortAnswerSubmission": {},
    *   //   "state": "my_state",
    *   //   "submissionHistory": [],
    *   //   "updateTime": "my_updateTime",
    *   //   "userId": "my_userId"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourceCoursesCourseworkStudentsubmissionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListStudentSubmissionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListStudentSubmissionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListStudentSubmissionsResponse] = js.native
  def list(params: ParamsResourceCoursesCourseworkStudentsubmissionsList): GaxiosPromise[SchemaListStudentSubmissionsResponse] = js.native
  def list(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsList,
    callback: BodyResponseCallback[SchemaListStudentSubmissionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsList,
    options: BodyResponseCallback[Readable | SchemaListStudentSubmissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListStudentSubmissionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCoursesCourseworkStudentsubmissionsList, options: MethodOptions): GaxiosPromise[SchemaListStudentSubmissionsResponse] = js.native
  def list(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListStudentSubmissionsResponse]
  ): Unit = js.native
  /**
    * Returns a list of student submissions that the requester is permitted to view, factoring in the OAuth scopes of the request. `-` may be specified as the `course_work_id` to include student submissions for multiple course work items. Course students may only view their own work. Course teachers and domain administrators may view all student submissions. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work, or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/classroom.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const classroom = google.classroom('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/classroom.coursework.me',
    *       'https://www.googleapis.com/auth/classroom.coursework.me.readonly',
    *       'https://www.googleapis.com/auth/classroom.coursework.students',
    *       'https://www.googleapis.com/auth/classroom.coursework.students.readonly',
    *       'https://www.googleapis.com/auth/classroom.student-submissions.me.readonly',
    *       'https://www.googleapis.com/auth/classroom.student-submissions.students.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.courseWork.studentSubmissions.list({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Identifier of the student work to request. This may be set to the string literal `"-"` to request student work for all course work in the specified course.
    *     courseWorkId: 'placeholder-value',
    *     // Requested lateness value. If specified, returned student submissions are restricted by the requested value. If unspecified, submissions are returned regardless of `late` value.
    *     late: 'placeholder-value',
    *     // Maximum number of items to return. Zero or unspecified indicates that the server may assign a maximum. The server may return fewer than the specified number of results.
    *     pageSize: 'placeholder-value',
    *     // nextPageToken value returned from a previous list call, indicating that the subsequent page of results should be returned. The list request must be otherwise identical to the one that resulted in this token.
    *     pageToken: 'placeholder-value',
    *     // Requested submission states. If specified, returned student submissions match one of the specified submission states.
    *     states: 'placeholder-value',
    *     // Optional argument to restrict returned student work to those owned by the student with the specified identifier. The identifier can be one of the following: * the numeric identifier for the user * the email address of the user * the string literal `"me"`, indicating the requesting user
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "studentSubmissions": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceCoursesCourseworkStudentsubmissionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def modifyAttachments(): GaxiosPromise[SchemaStudentSubmission] = js.native
  def modifyAttachments(callback: BodyResponseCallback[SchemaStudentSubmission]): Unit = js.native
  def modifyAttachments(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStudentSubmission] = js.native
  def modifyAttachments(params: ParamsResourceCoursesCourseworkStudentsubmissionsModifyattachments): GaxiosPromise[SchemaStudentSubmission] = js.native
  def modifyAttachments(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsModifyattachments,
    callback: BodyResponseCallback[SchemaStudentSubmission]
  ): Unit = js.native
  def modifyAttachments(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsModifyattachments,
    options: BodyResponseCallback[Readable | SchemaStudentSubmission],
    callback: BodyResponseCallback[Readable | SchemaStudentSubmission]
  ): Unit = js.native
  def modifyAttachments(params: ParamsResourceCoursesCourseworkStudentsubmissionsModifyattachments, options: MethodOptions): GaxiosPromise[SchemaStudentSubmission] = js.native
  def modifyAttachments(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsModifyattachments,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStudentSubmission]
  ): Unit = js.native
  /**
    * Modifies attachments of student submission. Attachments may only be added to student submissions belonging to course work objects with a `workType` of `ASSIGNMENT`. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding course work item. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work, if the user is not permitted to modify attachments on the requested student submission, or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course, course work, or student submission does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/classroom.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const classroom = google.classroom('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/classroom.coursework.me',
    *       'https://www.googleapis.com/auth/classroom.coursework.students',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await classroom.courses.courseWork.studentSubmissions.modifyAttachments({
    *       // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *       courseId: 'placeholder-value',
    *       // Identifier of the course work.
    *       courseWorkId: 'placeholder-value',
    *       // Identifier of the student submission.
    *       id: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "addAttachments": []
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateLink": "my_alternateLink",
    *   //   "assignedGrade": {},
    *   //   "assignmentSubmission": {},
    *   //   "associatedWithDeveloper": false,
    *   //   "courseId": "my_courseId",
    *   //   "courseWorkId": "my_courseWorkId",
    *   //   "courseWorkType": "my_courseWorkType",
    *   //   "creationTime": "my_creationTime",
    *   //   "draftGrade": {},
    *   //   "id": "my_id",
    *   //   "late": false,
    *   //   "multipleChoiceSubmission": {},
    *   //   "shortAnswerSubmission": {},
    *   //   "state": "my_state",
    *   //   "submissionHistory": [],
    *   //   "updateTime": "my_updateTime",
    *   //   "userId": "my_userId"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def modifyAttachments(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsModifyattachments,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def modifyAttachments(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsModifyattachments,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaStudentSubmission] = js.native
  def patch(callback: BodyResponseCallback[SchemaStudentSubmission]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStudentSubmission] = js.native
  def patch(params: ParamsResourceCoursesCourseworkStudentsubmissionsPatch): GaxiosPromise[SchemaStudentSubmission] = js.native
  def patch(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsPatch,
    callback: BodyResponseCallback[SchemaStudentSubmission]
  ): Unit = js.native
  def patch(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsPatch,
    options: BodyResponseCallback[Readable | SchemaStudentSubmission],
    callback: BodyResponseCallback[Readable | SchemaStudentSubmission]
  ): Unit = js.native
  def patch(params: ParamsResourceCoursesCourseworkStudentsubmissionsPatch, options: MethodOptions): GaxiosPromise[SchemaStudentSubmission] = js.native
  def patch(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStudentSubmission]
  ): Unit = js.native
  /**
    * Updates one or more fields of a student submission. See google.classroom.v1.StudentSubmission for details of which fields may be updated and who may change them. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding course work item. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting developer project did not create the corresponding course work, if the user is not permitted to make the requested modification to the student submission, or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course, course work, or student submission does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/classroom.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const classroom = google.classroom('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/classroom.coursework.me',
    *       'https://www.googleapis.com/auth/classroom.coursework.students',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.courseWork.studentSubmissions.patch({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Identifier of the course work.
    *     courseWorkId: 'placeholder-value',
    *     // Identifier of the student submission.
    *     id: 'placeholder-value',
    *     // Mask that identifies which fields on the student submission to update. This field is required to do an update. The update fails if invalid fields are specified. The following fields may be specified by teachers: * `draft_grade` * `assigned_grade`
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alternateLink": "my_alternateLink",
    *       //   "assignedGrade": {},
    *       //   "assignmentSubmission": {},
    *       //   "associatedWithDeveloper": false,
    *       //   "courseId": "my_courseId",
    *       //   "courseWorkId": "my_courseWorkId",
    *       //   "courseWorkType": "my_courseWorkType",
    *       //   "creationTime": "my_creationTime",
    *       //   "draftGrade": {},
    *       //   "id": "my_id",
    *       //   "late": false,
    *       //   "multipleChoiceSubmission": {},
    *       //   "shortAnswerSubmission": {},
    *       //   "state": "my_state",
    *       //   "submissionHistory": [],
    *       //   "updateTime": "my_updateTime",
    *       //   "userId": "my_userId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateLink": "my_alternateLink",
    *   //   "assignedGrade": {},
    *   //   "assignmentSubmission": {},
    *   //   "associatedWithDeveloper": false,
    *   //   "courseId": "my_courseId",
    *   //   "courseWorkId": "my_courseWorkId",
    *   //   "courseWorkType": "my_courseWorkType",
    *   //   "creationTime": "my_creationTime",
    *   //   "draftGrade": {},
    *   //   "id": "my_id",
    *   //   "late": false,
    *   //   "multipleChoiceSubmission": {},
    *   //   "shortAnswerSubmission": {},
    *   //   "state": "my_state",
    *   //   "submissionHistory": [],
    *   //   "updateTime": "my_updateTime",
    *   //   "userId": "my_userId"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def patch(params: ParamsResourceCoursesCourseworkStudentsubmissionsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def reclaim(): GaxiosPromise[SchemaEmpty] = js.native
  def reclaim(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def reclaim(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def reclaim(params: ParamsResourceCoursesCourseworkStudentsubmissionsReclaim): GaxiosPromise[SchemaEmpty] = js.native
  def reclaim(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsReclaim,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def reclaim(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsReclaim,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def reclaim(params: ParamsResourceCoursesCourseworkStudentsubmissionsReclaim, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def reclaim(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsReclaim,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Reclaims a student submission on behalf of the student that owns it. Reclaiming a student submission transfers ownership of attached Drive files to the student and updates the submission state. Only the student that owns the requested student submission may call this method, and only for a student submission that has been turned in. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding course work item. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work, unsubmit the requested student submission, or for access errors. * `FAILED_PRECONDITION` if the student submission has not been turned in. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course, course work, or student submission does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/classroom.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const classroom = google.classroom('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/classroom.coursework.me'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.courseWork.studentSubmissions.reclaim({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Identifier of the course work.
    *     courseWorkId: 'placeholder-value',
    *     // Identifier of the student submission.
    *     id: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def reclaim(params: ParamsResourceCoursesCourseworkStudentsubmissionsReclaim, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def reclaim(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsReclaim,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def `return`(): GaxiosPromise[SchemaEmpty] = js.native
  def `return`(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def `return`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def `return`(params: ParamsResourceCoursesCourseworkStudentsubmissionsReturn): GaxiosPromise[SchemaEmpty] = js.native
  def `return`(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsReturn,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def `return`(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsReturn,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def `return`(params: ParamsResourceCoursesCourseworkStudentsubmissionsReturn, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def `return`(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsReturn,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Returns a student submission. Returning a student submission transfers ownership of attached Drive files to the student and may also update the submission state. Unlike the Classroom application, returning a student submission does not set assignedGrade to the draftGrade value. Only a teacher of the course that contains the requested student submission may call this method. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding course work item. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work, return the requested student submission, or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course, course work, or student submission does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/classroom.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const classroom = google.classroom('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/classroom.coursework.students'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.courseWork.studentSubmissions.return({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Identifier of the course work.
    *     courseWorkId: 'placeholder-value',
    *     // Identifier of the student submission.
    *     id: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def `return`(params: ParamsResourceCoursesCourseworkStudentsubmissionsReturn, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def `return`(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsReturn,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def turnIn(): GaxiosPromise[SchemaEmpty] = js.native
  def turnIn(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def turnIn(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def turnIn(params: ParamsResourceCoursesCourseworkStudentsubmissionsTurnin): GaxiosPromise[SchemaEmpty] = js.native
  def turnIn(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsTurnin,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def turnIn(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsTurnin,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def turnIn(params: ParamsResourceCoursesCourseworkStudentsubmissionsTurnin, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def turnIn(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsTurnin,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Turns in a student submission. Turning in a student submission transfers ownership of attached Drive files to the teacher and may also update the submission state. This may only be called by the student that owns the specified student submission. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding course work item. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work, turn in the requested student submission, or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course, course work, or student submission does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/classroom.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const classroom = google.classroom('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/classroom.coursework.me'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.courseWork.studentSubmissions.turnIn({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Identifier of the course work.
    *     courseWorkId: 'placeholder-value',
    *     // Identifier of the student submission.
    *     id: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def turnIn(params: ParamsResourceCoursesCourseworkStudentsubmissionsTurnin, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def turnIn(
    params: ParamsResourceCoursesCourseworkStudentsubmissionsTurnin,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
