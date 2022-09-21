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

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Courses")
@js.native
open class ResourceCourses protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var aliases: ResourceCoursesAliases = js.native
  
  var announcements: ResourceCoursesAnnouncements = js.native
  
  var context: APIRequestContext = js.native
  
  var courseWork: ResourceCoursesCoursework = js.native
  
  var courseWorkMaterials: ResourceCoursesCourseworkmaterials = js.native
  
  def create(): GaxiosPromise[SchemaCourse] = js.native
  def create(callback: BodyResponseCallback[SchemaCourse]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCourse] = js.native
  def create(params: ParamsResourceCoursesCreate): GaxiosPromise[SchemaCourse] = js.native
  def create(params: ParamsResourceCoursesCreate, callback: BodyResponseCallback[SchemaCourse]): Unit = js.native
  def create(
    params: ParamsResourceCoursesCreate,
    options: BodyResponseCallback[Readable | SchemaCourse],
    callback: BodyResponseCallback[Readable | SchemaCourse]
  ): Unit = js.native
  def create(params: ParamsResourceCoursesCreate, options: MethodOptions): GaxiosPromise[SchemaCourse] = js.native
  def create(
    params: ParamsResourceCoursesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCourse]
  ): Unit = js.native
  /**
    * Creates a course. The user specified in `ownerId` is the owner of the created course and added as a teacher. A non-admin requesting user can only create a course with themselves as the owner. Domain admins can create courses owned by any user within their domain. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to create courses or for access errors. * `NOT_FOUND` if the primary teacher is not a valid user. * `FAILED_PRECONDITION` if the course owner's account is disabled or for the following request errors: * UserGroupsMembershipLimitReached * `ALREADY_EXISTS` if an alias was specified in the `id` and already exists.
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
    *     scopes: ['https://www.googleapis.com/auth/classroom.courses'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.create({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alternateLink": "my_alternateLink",
    *       //   "calendarId": "my_calendarId",
    *       //   "courseGroupEmail": "my_courseGroupEmail",
    *       //   "courseMaterialSets": [],
    *       //   "courseState": "my_courseState",
    *       //   "creationTime": "my_creationTime",
    *       //   "description": "my_description",
    *       //   "descriptionHeading": "my_descriptionHeading",
    *       //   "enrollmentCode": "my_enrollmentCode",
    *       //   "gradebookSettings": {},
    *       //   "guardiansEnabled": false,
    *       //   "id": "my_id",
    *       //   "name": "my_name",
    *       //   "ownerId": "my_ownerId",
    *       //   "room": "my_room",
    *       //   "section": "my_section",
    *       //   "teacherFolder": {},
    *       //   "teacherGroupEmail": "my_teacherGroupEmail",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateLink": "my_alternateLink",
    *   //   "calendarId": "my_calendarId",
    *   //   "courseGroupEmail": "my_courseGroupEmail",
    *   //   "courseMaterialSets": [],
    *   //   "courseState": "my_courseState",
    *   //   "creationTime": "my_creationTime",
    *   //   "description": "my_description",
    *   //   "descriptionHeading": "my_descriptionHeading",
    *   //   "enrollmentCode": "my_enrollmentCode",
    *   //   "gradebookSettings": {},
    *   //   "guardiansEnabled": false,
    *   //   "id": "my_id",
    *   //   "name": "my_name",
    *   //   "ownerId": "my_ownerId",
    *   //   "room": "my_room",
    *   //   "section": "my_section",
    *   //   "teacherFolder": {},
    *   //   "teacherGroupEmail": "my_teacherGroupEmail",
    *   //   "updateTime": "my_updateTime"
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
  def create(params: ParamsResourceCoursesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceCoursesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCoursesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCoursesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceCoursesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceCoursesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceCoursesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a course. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to delete the requested course or for access errors. * `NOT_FOUND` if no course exists with the requested ID.
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
    *     scopes: ['https://www.googleapis.com/auth/classroom.courses'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.delete({
    *     // Identifier of the course to delete. This identifier can be either the Classroom-assigned identifier or an alias.
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
  def delete(params: ParamsResourceCoursesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceCoursesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCourse] = js.native
  def get(callback: BodyResponseCallback[SchemaCourse]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCourse] = js.native
  def get(params: ParamsResourceCoursesGet): GaxiosPromise[SchemaCourse] = js.native
  def get(params: ParamsResourceCoursesGet, callback: BodyResponseCallback[SchemaCourse]): Unit = js.native
  def get(
    params: ParamsResourceCoursesGet,
    options: BodyResponseCallback[Readable | SchemaCourse],
    callback: BodyResponseCallback[Readable | SchemaCourse]
  ): Unit = js.native
  def get(params: ParamsResourceCoursesGet, options: MethodOptions): GaxiosPromise[SchemaCourse] = js.native
  def get(
    params: ParamsResourceCoursesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCourse]
  ): Unit = js.native
  /**
    * Returns a course. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or for access errors. * `NOT_FOUND` if no course exists with the requested ID.
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
    *       'https://www.googleapis.com/auth/classroom.courses',
    *       'https://www.googleapis.com/auth/classroom.courses.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.get({
    *     // Identifier of the course to return. This identifier can be either the Classroom-assigned identifier or an alias.
    *     id: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateLink": "my_alternateLink",
    *   //   "calendarId": "my_calendarId",
    *   //   "courseGroupEmail": "my_courseGroupEmail",
    *   //   "courseMaterialSets": [],
    *   //   "courseState": "my_courseState",
    *   //   "creationTime": "my_creationTime",
    *   //   "description": "my_description",
    *   //   "descriptionHeading": "my_descriptionHeading",
    *   //   "enrollmentCode": "my_enrollmentCode",
    *   //   "gradebookSettings": {},
    *   //   "guardiansEnabled": false,
    *   //   "id": "my_id",
    *   //   "name": "my_name",
    *   //   "ownerId": "my_ownerId",
    *   //   "room": "my_room",
    *   //   "section": "my_section",
    *   //   "teacherFolder": {},
    *   //   "teacherGroupEmail": "my_teacherGroupEmail",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceCoursesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCoursesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCoursesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCoursesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCoursesResponse] = js.native
  def list(params: ParamsResourceCoursesList): GaxiosPromise[SchemaListCoursesResponse] = js.native
  def list(params: ParamsResourceCoursesList, callback: BodyResponseCallback[SchemaListCoursesResponse]): Unit = js.native
  def list(
    params: ParamsResourceCoursesList,
    options: BodyResponseCallback[Readable | SchemaListCoursesResponse],
    callback: BodyResponseCallback[Readable | SchemaListCoursesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCoursesList, options: MethodOptions): GaxiosPromise[SchemaListCoursesResponse] = js.native
  def list(
    params: ParamsResourceCoursesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCoursesResponse]
  ): Unit = js.native
  /**
    * Returns a list of courses that the requesting user is permitted to view, restricted to those that match the request. Returned courses are ordered by creation time, with the most recently created coming first. This method returns the following error codes: * `PERMISSION_DENIED` for access errors. * `INVALID_ARGUMENT` if the query argument is malformed. * `NOT_FOUND` if any users specified in the query arguments do not exist.
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
    *       'https://www.googleapis.com/auth/classroom.courses',
    *       'https://www.googleapis.com/auth/classroom.courses.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.list({
    *     // Restricts returned courses to those in one of the specified states The default value is ACTIVE, ARCHIVED, PROVISIONED, DECLINED.
    *     courseStates: 'placeholder-value',
    *     // Maximum number of items to return. Zero or unspecified indicates that the server may assign a maximum. The server may return fewer than the specified number of results.
    *     pageSize: 'placeholder-value',
    *     // nextPageToken value returned from a previous list call, indicating that the subsequent page of results should be returned. The list request must be otherwise identical to the one that resulted in this token.
    *     pageToken: 'placeholder-value',
    *     // Restricts returned courses to those having a student with the specified identifier. The identifier can be one of the following: * the numeric identifier for the user * the email address of the user * the string literal `"me"`, indicating the requesting user
    *     studentId: 'placeholder-value',
    *     // Restricts returned courses to those having a teacher with the specified identifier. The identifier can be one of the following: * the numeric identifier for the user * the email address of the user * the string literal `"me"`, indicating the requesting user
    *     teacherId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "courses": [],
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
  def list(params: ParamsResourceCoursesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCoursesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCourse] = js.native
  def patch(callback: BodyResponseCallback[SchemaCourse]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCourse] = js.native
  def patch(params: ParamsResourceCoursesPatch): GaxiosPromise[SchemaCourse] = js.native
  def patch(params: ParamsResourceCoursesPatch, callback: BodyResponseCallback[SchemaCourse]): Unit = js.native
  def patch(
    params: ParamsResourceCoursesPatch,
    options: BodyResponseCallback[Readable | SchemaCourse],
    callback: BodyResponseCallback[Readable | SchemaCourse]
  ): Unit = js.native
  def patch(params: ParamsResourceCoursesPatch, options: MethodOptions): GaxiosPromise[SchemaCourse] = js.native
  def patch(
    params: ParamsResourceCoursesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCourse]
  ): Unit = js.native
  /**
    * Updates one or more fields in a course. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to modify the requested course or for access errors. * `NOT_FOUND` if no course exists with the requested ID. * `INVALID_ARGUMENT` if invalid fields are specified in the update mask or if no update mask is supplied. * `FAILED_PRECONDITION` for the following request errors: * CourseNotModifiable * InactiveCourseOwner
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
    *     scopes: ['https://www.googleapis.com/auth/classroom.courses'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.patch({
    *     // Identifier of the course to update. This identifier can be either the Classroom-assigned identifier or an alias.
    *     id: 'placeholder-value',
    *     // Mask that identifies which fields on the course to update. This field is required to do an update. The update will fail if invalid fields are specified. The following fields are valid: * `name` * `section` * `descriptionHeading` * `description` * `room` * `courseState` * `ownerId` Note: patches to ownerId are treated as being effective immediately, but in practice it may take some time for the ownership transfer of all affected resources to complete. When set in a query parameter, this field should be specified as `updateMask=,,...`
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alternateLink": "my_alternateLink",
    *       //   "calendarId": "my_calendarId",
    *       //   "courseGroupEmail": "my_courseGroupEmail",
    *       //   "courseMaterialSets": [],
    *       //   "courseState": "my_courseState",
    *       //   "creationTime": "my_creationTime",
    *       //   "description": "my_description",
    *       //   "descriptionHeading": "my_descriptionHeading",
    *       //   "enrollmentCode": "my_enrollmentCode",
    *       //   "gradebookSettings": {},
    *       //   "guardiansEnabled": false,
    *       //   "id": "my_id",
    *       //   "name": "my_name",
    *       //   "ownerId": "my_ownerId",
    *       //   "room": "my_room",
    *       //   "section": "my_section",
    *       //   "teacherFolder": {},
    *       //   "teacherGroupEmail": "my_teacherGroupEmail",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateLink": "my_alternateLink",
    *   //   "calendarId": "my_calendarId",
    *   //   "courseGroupEmail": "my_courseGroupEmail",
    *   //   "courseMaterialSets": [],
    *   //   "courseState": "my_courseState",
    *   //   "creationTime": "my_creationTime",
    *   //   "description": "my_description",
    *   //   "descriptionHeading": "my_descriptionHeading",
    *   //   "enrollmentCode": "my_enrollmentCode",
    *   //   "gradebookSettings": {},
    *   //   "guardiansEnabled": false,
    *   //   "id": "my_id",
    *   //   "name": "my_name",
    *   //   "ownerId": "my_ownerId",
    *   //   "room": "my_room",
    *   //   "section": "my_section",
    *   //   "teacherFolder": {},
    *   //   "teacherGroupEmail": "my_teacherGroupEmail",
    *   //   "updateTime": "my_updateTime"
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
  def patch(params: ParamsResourceCoursesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceCoursesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var students: ResourceCoursesStudents = js.native
  
  var teachers: ResourceCoursesTeachers = js.native
  
  var topics: ResourceCoursesTopics = js.native
  
  def update(): GaxiosPromise[SchemaCourse] = js.native
  def update(callback: BodyResponseCallback[SchemaCourse]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCourse] = js.native
  def update(params: ParamsResourceCoursesUpdate): GaxiosPromise[SchemaCourse] = js.native
  def update(params: ParamsResourceCoursesUpdate, callback: BodyResponseCallback[SchemaCourse]): Unit = js.native
  def update(
    params: ParamsResourceCoursesUpdate,
    options: BodyResponseCallback[Readable | SchemaCourse],
    callback: BodyResponseCallback[Readable | SchemaCourse]
  ): Unit = js.native
  def update(params: ParamsResourceCoursesUpdate, options: MethodOptions): GaxiosPromise[SchemaCourse] = js.native
  def update(
    params: ParamsResourceCoursesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCourse]
  ): Unit = js.native
  /**
    * Updates a course. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to modify the requested course or for access errors. * `NOT_FOUND` if no course exists with the requested ID. * `FAILED_PRECONDITION` for the following request errors: * CourseNotModifiable
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
    *     scopes: ['https://www.googleapis.com/auth/classroom.courses'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.update({
    *     // Identifier of the course to update. This identifier can be either the Classroom-assigned identifier or an alias.
    *     id: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alternateLink": "my_alternateLink",
    *       //   "calendarId": "my_calendarId",
    *       //   "courseGroupEmail": "my_courseGroupEmail",
    *       //   "courseMaterialSets": [],
    *       //   "courseState": "my_courseState",
    *       //   "creationTime": "my_creationTime",
    *       //   "description": "my_description",
    *       //   "descriptionHeading": "my_descriptionHeading",
    *       //   "enrollmentCode": "my_enrollmentCode",
    *       //   "gradebookSettings": {},
    *       //   "guardiansEnabled": false,
    *       //   "id": "my_id",
    *       //   "name": "my_name",
    *       //   "ownerId": "my_ownerId",
    *       //   "room": "my_room",
    *       //   "section": "my_section",
    *       //   "teacherFolder": {},
    *       //   "teacherGroupEmail": "my_teacherGroupEmail",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateLink": "my_alternateLink",
    *   //   "calendarId": "my_calendarId",
    *   //   "courseGroupEmail": "my_courseGroupEmail",
    *   //   "courseMaterialSets": [],
    *   //   "courseState": "my_courseState",
    *   //   "creationTime": "my_creationTime",
    *   //   "description": "my_description",
    *   //   "descriptionHeading": "my_descriptionHeading",
    *   //   "enrollmentCode": "my_enrollmentCode",
    *   //   "gradebookSettings": {},
    *   //   "guardiansEnabled": false,
    *   //   "id": "my_id",
    *   //   "name": "my_name",
    *   //   "ownerId": "my_ownerId",
    *   //   "room": "my_room",
    *   //   "section": "my_section",
    *   //   "teacherFolder": {},
    *   //   "teacherGroupEmail": "my_teacherGroupEmail",
    *   //   "updateTime": "my_updateTime"
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
  def update(params: ParamsResourceCoursesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceCoursesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
