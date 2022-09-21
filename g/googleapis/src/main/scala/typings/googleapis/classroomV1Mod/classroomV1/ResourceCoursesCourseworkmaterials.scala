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

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Courses$Courseworkmaterials")
@js.native
open class ResourceCoursesCourseworkmaterials protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaCourseWorkMaterial] = js.native
  def create(callback: BodyResponseCallback[SchemaCourseWorkMaterial]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCourseWorkMaterial] = js.native
  def create(params: ParamsResourceCoursesCourseworkmaterialsCreate): GaxiosPromise[SchemaCourseWorkMaterial] = js.native
  def create(
    params: ParamsResourceCoursesCourseworkmaterialsCreate,
    callback: BodyResponseCallback[SchemaCourseWorkMaterial]
  ): Unit = js.native
  def create(
    params: ParamsResourceCoursesCourseworkmaterialsCreate,
    options: BodyResponseCallback[Readable | SchemaCourseWorkMaterial],
    callback: BodyResponseCallback[Readable | SchemaCourseWorkMaterial]
  ): Unit = js.native
  def create(params: ParamsResourceCoursesCourseworkmaterialsCreate, options: MethodOptions): GaxiosPromise[SchemaCourseWorkMaterial] = js.native
  def create(
    params: ParamsResourceCoursesCourseworkmaterialsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCourseWorkMaterial]
  ): Unit = js.native
  /**
    * Creates a course work material. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course, create course work material in the requested course, share a Drive attachment, or for access errors. * `INVALID_ARGUMENT` if the request is malformed or if more than 20 * materials are provided. * `NOT_FOUND` if the requested course does not exist. * `FAILED_PRECONDITION` for the following request error: * AttachmentNotVisible
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
    *     scopes: ['https://www.googleapis.com/auth/classroom.courseworkmaterials'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.courseWorkMaterials.create({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alternateLink": "my_alternateLink",
    *       //   "assigneeMode": "my_assigneeMode",
    *       //   "courseId": "my_courseId",
    *       //   "creationTime": "my_creationTime",
    *       //   "creatorUserId": "my_creatorUserId",
    *       //   "description": "my_description",
    *       //   "id": "my_id",
    *       //   "individualStudentsOptions": {},
    *       //   "materials": [],
    *       //   "scheduledTime": "my_scheduledTime",
    *       //   "state": "my_state",
    *       //   "title": "my_title",
    *       //   "topicId": "my_topicId",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateLink": "my_alternateLink",
    *   //   "assigneeMode": "my_assigneeMode",
    *   //   "courseId": "my_courseId",
    *   //   "creationTime": "my_creationTime",
    *   //   "creatorUserId": "my_creatorUserId",
    *   //   "description": "my_description",
    *   //   "id": "my_id",
    *   //   "individualStudentsOptions": {},
    *   //   "materials": [],
    *   //   "scheduledTime": "my_scheduledTime",
    *   //   "state": "my_state",
    *   //   "title": "my_title",
    *   //   "topicId": "my_topicId",
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
  def create(params: ParamsResourceCoursesCourseworkmaterialsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceCoursesCourseworkmaterialsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCoursesCourseworkmaterialsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceCoursesCourseworkmaterialsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceCoursesCourseworkmaterialsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceCoursesCourseworkmaterialsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceCoursesCourseworkmaterialsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a course work material. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding course work material item. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting developer project did not create the corresponding course work material, if the requesting user is not permitted to delete the requested course or for access errors. * `FAILED_PRECONDITION` if the requested course work material has already been deleted. * `NOT_FOUND` if no course exists with the requested ID.
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
    *     scopes: ['https://www.googleapis.com/auth/classroom.courseworkmaterials'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.courseWorkMaterials.delete({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Identifier of the course work material to delete. This identifier is a Classroom-assigned identifier.
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
  def delete(params: ParamsResourceCoursesCourseworkmaterialsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceCoursesCourseworkmaterialsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCourseWorkMaterial] = js.native
  def get(callback: BodyResponseCallback[SchemaCourseWorkMaterial]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCourseWorkMaterial] = js.native
  def get(params: ParamsResourceCoursesCourseworkmaterialsGet): GaxiosPromise[SchemaCourseWorkMaterial] = js.native
  def get(
    params: ParamsResourceCoursesCourseworkmaterialsGet,
    callback: BodyResponseCallback[SchemaCourseWorkMaterial]
  ): Unit = js.native
  def get(
    params: ParamsResourceCoursesCourseworkmaterialsGet,
    options: BodyResponseCallback[Readable | SchemaCourseWorkMaterial],
    callback: BodyResponseCallback[Readable | SchemaCourseWorkMaterial]
  ): Unit = js.native
  def get(params: ParamsResourceCoursesCourseworkmaterialsGet, options: MethodOptions): GaxiosPromise[SchemaCourseWorkMaterial] = js.native
  def get(
    params: ParamsResourceCoursesCourseworkmaterialsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCourseWorkMaterial]
  ): Unit = js.native
  /**
    * Returns a course work material. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work material, or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course or course work material does not exist.
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
    *       'https://www.googleapis.com/auth/classroom.courseworkmaterials',
    *       'https://www.googleapis.com/auth/classroom.courseworkmaterials.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.courseWorkMaterials.get({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Identifier of the course work material.
    *     id: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateLink": "my_alternateLink",
    *   //   "assigneeMode": "my_assigneeMode",
    *   //   "courseId": "my_courseId",
    *   //   "creationTime": "my_creationTime",
    *   //   "creatorUserId": "my_creatorUserId",
    *   //   "description": "my_description",
    *   //   "id": "my_id",
    *   //   "individualStudentsOptions": {},
    *   //   "materials": [],
    *   //   "scheduledTime": "my_scheduledTime",
    *   //   "state": "my_state",
    *   //   "title": "my_title",
    *   //   "topicId": "my_topicId",
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
  def get(params: ParamsResourceCoursesCourseworkmaterialsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCoursesCourseworkmaterialsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCourseWorkMaterialResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCourseWorkMaterialResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCourseWorkMaterialResponse] = js.native
  def list(params: ParamsResourceCoursesCourseworkmaterialsList): GaxiosPromise[SchemaListCourseWorkMaterialResponse] = js.native
  def list(
    params: ParamsResourceCoursesCourseworkmaterialsList,
    callback: BodyResponseCallback[SchemaListCourseWorkMaterialResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCoursesCourseworkmaterialsList,
    options: BodyResponseCallback[Readable | SchemaListCourseWorkMaterialResponse],
    callback: BodyResponseCallback[Readable | SchemaListCourseWorkMaterialResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCoursesCourseworkmaterialsList, options: MethodOptions): GaxiosPromise[SchemaListCourseWorkMaterialResponse] = js.native
  def list(
    params: ParamsResourceCoursesCourseworkmaterialsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCourseWorkMaterialResponse]
  ): Unit = js.native
  /**
    * Returns a list of course work material that the requester is permitted to view. Course students may only view `PUBLISHED` course work material. Course teachers and domain administrators may view all course work material. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course does not exist.
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
    *       'https://www.googleapis.com/auth/classroom.courseworkmaterials',
    *       'https://www.googleapis.com/auth/classroom.courseworkmaterials.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.courseWorkMaterials.list({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Restriction on the work status to return. Only course work material that matches is returned. If unspecified, items with a work status of `PUBLISHED` is returned.
    *     courseWorkMaterialStates: 'placeholder-value',
    *     // Optional filtering for course work material with at least one Drive material whose ID matches the provided string. If `material_link` is also specified, course work material must have materials matching both filters.
    *     materialDriveId: 'placeholder-value',
    *     // Optional filtering for course work material with at least one link material whose URL partially matches the provided string.
    *     materialLink: 'placeholder-value',
    *     // Optional sort ordering for results. A comma-separated list of fields with an optional sort direction keyword. Supported field is `updateTime`. Supported direction keywords are `asc` and `desc`. If not specified, `updateTime desc` is the default behavior. Examples: `updateTime asc`, `updateTime`
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
    *   //   "courseWorkMaterial": [],
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
  def list(params: ParamsResourceCoursesCourseworkmaterialsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCoursesCourseworkmaterialsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCourseWorkMaterial] = js.native
  def patch(callback: BodyResponseCallback[SchemaCourseWorkMaterial]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCourseWorkMaterial] = js.native
  def patch(params: ParamsResourceCoursesCourseworkmaterialsPatch): GaxiosPromise[SchemaCourseWorkMaterial] = js.native
  def patch(
    params: ParamsResourceCoursesCourseworkmaterialsPatch,
    callback: BodyResponseCallback[SchemaCourseWorkMaterial]
  ): Unit = js.native
  def patch(
    params: ParamsResourceCoursesCourseworkmaterialsPatch,
    options: BodyResponseCallback[Readable | SchemaCourseWorkMaterial],
    callback: BodyResponseCallback[Readable | SchemaCourseWorkMaterial]
  ): Unit = js.native
  def patch(params: ParamsResourceCoursesCourseworkmaterialsPatch, options: MethodOptions): GaxiosPromise[SchemaCourseWorkMaterial] = js.native
  def patch(
    params: ParamsResourceCoursesCourseworkmaterialsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCourseWorkMaterial]
  ): Unit = js.native
  /**
    * Updates one or more fields of a course work material. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting developer project for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `FAILED_PRECONDITION` if the requested course work material has already been deleted. * `NOT_FOUND` if the requested course or course work material does not exist
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
    *     scopes: ['https://www.googleapis.com/auth/classroom.courseworkmaterials'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.courseWorkMaterials.patch({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Identifier of the course work material.
    *     id: 'placeholder-value',
    *     // Mask that identifies which fields on the course work material to update. This field is required to do an update. The update fails if invalid fields are specified. If a field supports empty values, it can be cleared by specifying it in the update mask and not in the course work material object. If a field that does not support empty values is included in the update mask and not set in the course work material object, an `INVALID_ARGUMENT` error is returned. The following fields may be specified by teachers: * `title` * `description` * `state` * `scheduled_time` * `topic_id`
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alternateLink": "my_alternateLink",
    *       //   "assigneeMode": "my_assigneeMode",
    *       //   "courseId": "my_courseId",
    *       //   "creationTime": "my_creationTime",
    *       //   "creatorUserId": "my_creatorUserId",
    *       //   "description": "my_description",
    *       //   "id": "my_id",
    *       //   "individualStudentsOptions": {},
    *       //   "materials": [],
    *       //   "scheduledTime": "my_scheduledTime",
    *       //   "state": "my_state",
    *       //   "title": "my_title",
    *       //   "topicId": "my_topicId",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateLink": "my_alternateLink",
    *   //   "assigneeMode": "my_assigneeMode",
    *   //   "courseId": "my_courseId",
    *   //   "creationTime": "my_creationTime",
    *   //   "creatorUserId": "my_creatorUserId",
    *   //   "description": "my_description",
    *   //   "id": "my_id",
    *   //   "individualStudentsOptions": {},
    *   //   "materials": [],
    *   //   "scheduledTime": "my_scheduledTime",
    *   //   "state": "my_state",
    *   //   "title": "my_title",
    *   //   "topicId": "my_topicId",
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
  def patch(params: ParamsResourceCoursesCourseworkmaterialsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceCoursesCourseworkmaterialsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
