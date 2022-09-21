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

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Courses$Coursework")
@js.native
open class ResourceCoursesCoursework protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaCourseWork] = js.native
  def create(callback: BodyResponseCallback[SchemaCourseWork]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCourseWork] = js.native
  def create(params: ParamsResourceCoursesCourseworkCreate): GaxiosPromise[SchemaCourseWork] = js.native
  def create(params: ParamsResourceCoursesCourseworkCreate, callback: BodyResponseCallback[SchemaCourseWork]): Unit = js.native
  def create(
    params: ParamsResourceCoursesCourseworkCreate,
    options: BodyResponseCallback[Readable | SchemaCourseWork],
    callback: BodyResponseCallback[Readable | SchemaCourseWork]
  ): Unit = js.native
  def create(params: ParamsResourceCoursesCourseworkCreate, options: MethodOptions): GaxiosPromise[SchemaCourseWork] = js.native
  def create(
    params: ParamsResourceCoursesCourseworkCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCourseWork]
  ): Unit = js.native
  /**
    * Creates course work. The resulting course work (and corresponding student submissions) are associated with the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to make the request. Classroom API requests to modify course work and student submissions must be made with an OAuth client ID from the associated Developer Console project. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course, create course work in the requested course, share a Drive attachment, or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course does not exist. * `FAILED_PRECONDITION` for the following request error: * AttachmentNotVisible
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
    *   const res = await classroom.courses.courseWork.create({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alternateLink": "my_alternateLink",
    *       //   "assigneeMode": "my_assigneeMode",
    *       //   "assignment": {},
    *       //   "associatedWithDeveloper": false,
    *       //   "courseId": "my_courseId",
    *       //   "creationTime": "my_creationTime",
    *       //   "creatorUserId": "my_creatorUserId",
    *       //   "description": "my_description",
    *       //   "dueDate": {},
    *       //   "dueTime": {},
    *       //   "gradeCategory": {},
    *       //   "id": "my_id",
    *       //   "individualStudentsOptions": {},
    *       //   "materials": [],
    *       //   "maxPoints": {},
    *       //   "multipleChoiceQuestion": {},
    *       //   "scheduledTime": "my_scheduledTime",
    *       //   "state": "my_state",
    *       //   "submissionModificationMode": "my_submissionModificationMode",
    *       //   "title": "my_title",
    *       //   "topicId": "my_topicId",
    *       //   "updateTime": "my_updateTime",
    *       //   "workType": "my_workType"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateLink": "my_alternateLink",
    *   //   "assigneeMode": "my_assigneeMode",
    *   //   "assignment": {},
    *   //   "associatedWithDeveloper": false,
    *   //   "courseId": "my_courseId",
    *   //   "creationTime": "my_creationTime",
    *   //   "creatorUserId": "my_creatorUserId",
    *   //   "description": "my_description",
    *   //   "dueDate": {},
    *   //   "dueTime": {},
    *   //   "gradeCategory": {},
    *   //   "id": "my_id",
    *   //   "individualStudentsOptions": {},
    *   //   "materials": [],
    *   //   "maxPoints": {},
    *   //   "multipleChoiceQuestion": {},
    *   //   "scheduledTime": "my_scheduledTime",
    *   //   "state": "my_state",
    *   //   "submissionModificationMode": "my_submissionModificationMode",
    *   //   "title": "my_title",
    *   //   "topicId": "my_topicId",
    *   //   "updateTime": "my_updateTime",
    *   //   "workType": "my_workType"
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
  def create(params: ParamsResourceCoursesCourseworkCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceCoursesCourseworkCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCoursesCourseworkDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCoursesCourseworkDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceCoursesCourseworkDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceCoursesCourseworkDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceCoursesCourseworkDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a course work. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding course work item. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting developer project did not create the corresponding course work, if the requesting user is not permitted to delete the requested course or for access errors. * `FAILED_PRECONDITION` if the requested course work has already been deleted. * `NOT_FOUND` if no course exists with the requested ID.
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
    *   const res = await classroom.courses.courseWork.delete({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Identifier of the course work to delete. This identifier is a Classroom-assigned identifier.
    *     id: 'placeholder-value',
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
  def delete(params: ParamsResourceCoursesCourseworkDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceCoursesCourseworkDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCourseWork] = js.native
  def get(callback: BodyResponseCallback[SchemaCourseWork]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCourseWork] = js.native
  def get(params: ParamsResourceCoursesCourseworkGet): GaxiosPromise[SchemaCourseWork] = js.native
  def get(params: ParamsResourceCoursesCourseworkGet, callback: BodyResponseCallback[SchemaCourseWork]): Unit = js.native
  def get(
    params: ParamsResourceCoursesCourseworkGet,
    options: BodyResponseCallback[Readable | SchemaCourseWork],
    callback: BodyResponseCallback[Readable | SchemaCourseWork]
  ): Unit = js.native
  def get(params: ParamsResourceCoursesCourseworkGet, options: MethodOptions): GaxiosPromise[SchemaCourseWork] = js.native
  def get(
    params: ParamsResourceCoursesCourseworkGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCourseWork]
  ): Unit = js.native
  /**
    * Returns course work. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work, or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course or course work does not exist.
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.courseWork.get({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Identifier of the course work.
    *     id: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateLink": "my_alternateLink",
    *   //   "assigneeMode": "my_assigneeMode",
    *   //   "assignment": {},
    *   //   "associatedWithDeveloper": false,
    *   //   "courseId": "my_courseId",
    *   //   "creationTime": "my_creationTime",
    *   //   "creatorUserId": "my_creatorUserId",
    *   //   "description": "my_description",
    *   //   "dueDate": {},
    *   //   "dueTime": {},
    *   //   "gradeCategory": {},
    *   //   "id": "my_id",
    *   //   "individualStudentsOptions": {},
    *   //   "materials": [],
    *   //   "maxPoints": {},
    *   //   "multipleChoiceQuestion": {},
    *   //   "scheduledTime": "my_scheduledTime",
    *   //   "state": "my_state",
    *   //   "submissionModificationMode": "my_submissionModificationMode",
    *   //   "title": "my_title",
    *   //   "topicId": "my_topicId",
    *   //   "updateTime": "my_updateTime",
    *   //   "workType": "my_workType"
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
  def get(params: ParamsResourceCoursesCourseworkGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCoursesCourseworkGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCourseWorkResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCourseWorkResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCourseWorkResponse] = js.native
  def list(params: ParamsResourceCoursesCourseworkList): GaxiosPromise[SchemaListCourseWorkResponse] = js.native
  def list(
    params: ParamsResourceCoursesCourseworkList,
    callback: BodyResponseCallback[SchemaListCourseWorkResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCoursesCourseworkList,
    options: BodyResponseCallback[Readable | SchemaListCourseWorkResponse],
    callback: BodyResponseCallback[Readable | SchemaListCourseWorkResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCoursesCourseworkList, options: MethodOptions): GaxiosPromise[SchemaListCourseWorkResponse] = js.native
  def list(
    params: ParamsResourceCoursesCourseworkList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCourseWorkResponse]
  ): Unit = js.native
  /**
    * Returns a list of course work that the requester is permitted to view. Course students may only view `PUBLISHED` course work. Course teachers and domain administrators may view all course work. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course does not exist.
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.courseWork.list({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Restriction on the work status to return. Only courseWork that matches is returned. If unspecified, items with a work status of `PUBLISHED` is returned.
    *     courseWorkStates: 'placeholder-value',
    *     // Optional sort ordering for results. A comma-separated list of fields with an optional sort direction keyword. Supported fields are `updateTime` and `dueDate`. Supported direction keywords are `asc` and `desc`. If not specified, `updateTime desc` is the default behavior. Examples: `dueDate asc,updateTime desc`, `updateTime,dueDate desc`
    *     orderBy: 'placeholder-value',
    *     // Maximum number of items to return. Zero or unspecified indicates that the server may assign a maximum. The server may return fewer than the specified number of results.
    *     pageSize: 'placeholder-value',
    *     // nextPageToken value returned from a previous list call, indicating that the subsequent page of results should be returned. The list request must be otherwise identical to the one that resulted in this token.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "courseWork": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceCoursesCourseworkList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCoursesCourseworkList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def modifyAssignees(): GaxiosPromise[SchemaCourseWork] = js.native
  def modifyAssignees(callback: BodyResponseCallback[SchemaCourseWork]): Unit = js.native
  def modifyAssignees(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCourseWork] = js.native
  def modifyAssignees(params: ParamsResourceCoursesCourseworkModifyassignees): GaxiosPromise[SchemaCourseWork] = js.native
  def modifyAssignees(
    params: ParamsResourceCoursesCourseworkModifyassignees,
    callback: BodyResponseCallback[SchemaCourseWork]
  ): Unit = js.native
  def modifyAssignees(
    params: ParamsResourceCoursesCourseworkModifyassignees,
    options: BodyResponseCallback[Readable | SchemaCourseWork],
    callback: BodyResponseCallback[Readable | SchemaCourseWork]
  ): Unit = js.native
  def modifyAssignees(params: ParamsResourceCoursesCourseworkModifyassignees, options: MethodOptions): GaxiosPromise[SchemaCourseWork] = js.native
  def modifyAssignees(
    params: ParamsResourceCoursesCourseworkModifyassignees,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCourseWork]
  ): Unit = js.native
  /**
    * Modifies assignee mode and options of a coursework. Only a teacher of the course that contains the coursework may call this method. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course or course work does not exist.
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
    *   const res = await classroom.courses.courseWork.modifyAssignees({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Identifier of the coursework.
    *     id: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "assigneeMode": "my_assigneeMode",
    *       //   "modifyIndividualStudentsOptions": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateLink": "my_alternateLink",
    *   //   "assigneeMode": "my_assigneeMode",
    *   //   "assignment": {},
    *   //   "associatedWithDeveloper": false,
    *   //   "courseId": "my_courseId",
    *   //   "creationTime": "my_creationTime",
    *   //   "creatorUserId": "my_creatorUserId",
    *   //   "description": "my_description",
    *   //   "dueDate": {},
    *   //   "dueTime": {},
    *   //   "gradeCategory": {},
    *   //   "id": "my_id",
    *   //   "individualStudentsOptions": {},
    *   //   "materials": [],
    *   //   "maxPoints": {},
    *   //   "multipleChoiceQuestion": {},
    *   //   "scheduledTime": "my_scheduledTime",
    *   //   "state": "my_state",
    *   //   "submissionModificationMode": "my_submissionModificationMode",
    *   //   "title": "my_title",
    *   //   "topicId": "my_topicId",
    *   //   "updateTime": "my_updateTime",
    *   //   "workType": "my_workType"
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
  def modifyAssignees(params: ParamsResourceCoursesCourseworkModifyassignees, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def modifyAssignees(
    params: ParamsResourceCoursesCourseworkModifyassignees,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCourseWork] = js.native
  def patch(callback: BodyResponseCallback[SchemaCourseWork]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCourseWork] = js.native
  def patch(params: ParamsResourceCoursesCourseworkPatch): GaxiosPromise[SchemaCourseWork] = js.native
  def patch(params: ParamsResourceCoursesCourseworkPatch, callback: BodyResponseCallback[SchemaCourseWork]): Unit = js.native
  def patch(
    params: ParamsResourceCoursesCourseworkPatch,
    options: BodyResponseCallback[Readable | SchemaCourseWork],
    callback: BodyResponseCallback[Readable | SchemaCourseWork]
  ): Unit = js.native
  def patch(params: ParamsResourceCoursesCourseworkPatch, options: MethodOptions): GaxiosPromise[SchemaCourseWork] = js.native
  def patch(
    params: ParamsResourceCoursesCourseworkPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCourseWork]
  ): Unit = js.native
  /**
    * Updates one or more fields of a course work. See google.classroom.v1.CourseWork for details of which fields may be updated and who may change them. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding course work item. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting developer project did not create the corresponding course work, if the user is not permitted to make the requested modification to the student submission, or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `FAILED_PRECONDITION` if the requested course work has already been deleted. * `NOT_FOUND` if the requested course, course work, or student submission does not exist.
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
    *   const res = await classroom.courses.courseWork.patch({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Identifier of the course work.
    *     id: 'placeholder-value',
    *     // Mask that identifies which fields on the course work to update. This field is required to do an update. The update fails if invalid fields are specified. If a field supports empty values, it can be cleared by specifying it in the update mask and not in the CourseWork object. If a field that does not support empty values is included in the update mask and not set in the CourseWork object, an `INVALID_ARGUMENT` error is returned. The following fields may be specified by teachers: * `title` * `description` * `state` * `due_date` * `due_time` * `max_points` * `scheduled_time` * `submission_modification_mode` * `topic_id`
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alternateLink": "my_alternateLink",
    *       //   "assigneeMode": "my_assigneeMode",
    *       //   "assignment": {},
    *       //   "associatedWithDeveloper": false,
    *       //   "courseId": "my_courseId",
    *       //   "creationTime": "my_creationTime",
    *       //   "creatorUserId": "my_creatorUserId",
    *       //   "description": "my_description",
    *       //   "dueDate": {},
    *       //   "dueTime": {},
    *       //   "gradeCategory": {},
    *       //   "id": "my_id",
    *       //   "individualStudentsOptions": {},
    *       //   "materials": [],
    *       //   "maxPoints": {},
    *       //   "multipleChoiceQuestion": {},
    *       //   "scheduledTime": "my_scheduledTime",
    *       //   "state": "my_state",
    *       //   "submissionModificationMode": "my_submissionModificationMode",
    *       //   "title": "my_title",
    *       //   "topicId": "my_topicId",
    *       //   "updateTime": "my_updateTime",
    *       //   "workType": "my_workType"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateLink": "my_alternateLink",
    *   //   "assigneeMode": "my_assigneeMode",
    *   //   "assignment": {},
    *   //   "associatedWithDeveloper": false,
    *   //   "courseId": "my_courseId",
    *   //   "creationTime": "my_creationTime",
    *   //   "creatorUserId": "my_creatorUserId",
    *   //   "description": "my_description",
    *   //   "dueDate": {},
    *   //   "dueTime": {},
    *   //   "gradeCategory": {},
    *   //   "id": "my_id",
    *   //   "individualStudentsOptions": {},
    *   //   "materials": [],
    *   //   "maxPoints": {},
    *   //   "multipleChoiceQuestion": {},
    *   //   "scheduledTime": "my_scheduledTime",
    *   //   "state": "my_state",
    *   //   "submissionModificationMode": "my_submissionModificationMode",
    *   //   "title": "my_title",
    *   //   "topicId": "my_topicId",
    *   //   "updateTime": "my_updateTime",
    *   //   "workType": "my_workType"
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
  def patch(params: ParamsResourceCoursesCourseworkPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceCoursesCourseworkPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var studentSubmissions: ResourceCoursesCourseworkStudentsubmissions = js.native
}
