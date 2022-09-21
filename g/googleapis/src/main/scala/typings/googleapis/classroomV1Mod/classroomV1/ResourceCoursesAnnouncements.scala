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

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Courses$Announcements")
@js.native
open class ResourceCoursesAnnouncements protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaAnnouncement] = js.native
  def create(callback: BodyResponseCallback[SchemaAnnouncement]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnnouncement] = js.native
  def create(params: ParamsResourceCoursesAnnouncementsCreate): GaxiosPromise[SchemaAnnouncement] = js.native
  def create(
    params: ParamsResourceCoursesAnnouncementsCreate,
    callback: BodyResponseCallback[SchemaAnnouncement]
  ): Unit = js.native
  def create(
    params: ParamsResourceCoursesAnnouncementsCreate,
    options: BodyResponseCallback[Readable | SchemaAnnouncement],
    callback: BodyResponseCallback[Readable | SchemaAnnouncement]
  ): Unit = js.native
  def create(params: ParamsResourceCoursesAnnouncementsCreate, options: MethodOptions): GaxiosPromise[SchemaAnnouncement] = js.native
  def create(
    params: ParamsResourceCoursesAnnouncementsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnnouncement]
  ): Unit = js.native
  /**
    * Creates an announcement. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course, create announcements in the requested course, share a Drive attachment, or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course does not exist. * `FAILED_PRECONDITION` for the following request error: * AttachmentNotVisible
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
    *     scopes: ['https://www.googleapis.com/auth/classroom.announcements'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.announcements.create({
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
    *       //   "id": "my_id",
    *       //   "individualStudentsOptions": {},
    *       //   "materials": [],
    *       //   "scheduledTime": "my_scheduledTime",
    *       //   "state": "my_state",
    *       //   "text": "my_text",
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
    *   //   "id": "my_id",
    *   //   "individualStudentsOptions": {},
    *   //   "materials": [],
    *   //   "scheduledTime": "my_scheduledTime",
    *   //   "state": "my_state",
    *   //   "text": "my_text",
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
  def create(params: ParamsResourceCoursesAnnouncementsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceCoursesAnnouncementsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCoursesAnnouncementsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCoursesAnnouncementsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceCoursesAnnouncementsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceCoursesAnnouncementsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceCoursesAnnouncementsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an announcement. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding announcement item. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting developer project did not create the corresponding announcement, if the requesting user is not permitted to delete the requested course or for access errors. * `FAILED_PRECONDITION` if the requested announcement has already been deleted. * `NOT_FOUND` if no course exists with the requested ID.
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
    *     scopes: ['https://www.googleapis.com/auth/classroom.announcements'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.announcements.delete({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Identifier of the announcement to delete. This identifier is a Classroom-assigned identifier.
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
  def delete(params: ParamsResourceCoursesAnnouncementsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceCoursesAnnouncementsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaAnnouncement] = js.native
  def get(callback: BodyResponseCallback[SchemaAnnouncement]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnnouncement] = js.native
  def get(params: ParamsResourceCoursesAnnouncementsGet): GaxiosPromise[SchemaAnnouncement] = js.native
  def get(params: ParamsResourceCoursesAnnouncementsGet, callback: BodyResponseCallback[SchemaAnnouncement]): Unit = js.native
  def get(
    params: ParamsResourceCoursesAnnouncementsGet,
    options: BodyResponseCallback[Readable | SchemaAnnouncement],
    callback: BodyResponseCallback[Readable | SchemaAnnouncement]
  ): Unit = js.native
  def get(params: ParamsResourceCoursesAnnouncementsGet, options: MethodOptions): GaxiosPromise[SchemaAnnouncement] = js.native
  def get(
    params: ParamsResourceCoursesAnnouncementsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnnouncement]
  ): Unit = js.native
  /**
    * Returns an announcement. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or announcement, or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course or announcement does not exist.
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
    *       'https://www.googleapis.com/auth/classroom.announcements',
    *       'https://www.googleapis.com/auth/classroom.announcements.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.announcements.get({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Identifier of the announcement.
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
    *   //   "id": "my_id",
    *   //   "individualStudentsOptions": {},
    *   //   "materials": [],
    *   //   "scheduledTime": "my_scheduledTime",
    *   //   "state": "my_state",
    *   //   "text": "my_text",
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
  def get(params: ParamsResourceCoursesAnnouncementsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCoursesAnnouncementsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAnnouncementsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAnnouncementsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAnnouncementsResponse] = js.native
  def list(params: ParamsResourceCoursesAnnouncementsList): GaxiosPromise[SchemaListAnnouncementsResponse] = js.native
  def list(
    params: ParamsResourceCoursesAnnouncementsList,
    callback: BodyResponseCallback[SchemaListAnnouncementsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCoursesAnnouncementsList,
    options: BodyResponseCallback[Readable | SchemaListAnnouncementsResponse],
    callback: BodyResponseCallback[Readable | SchemaListAnnouncementsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCoursesAnnouncementsList, options: MethodOptions): GaxiosPromise[SchemaListAnnouncementsResponse] = js.native
  def list(
    params: ParamsResourceCoursesAnnouncementsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAnnouncementsResponse]
  ): Unit = js.native
  /**
    * Returns a list of announcements that the requester is permitted to view. Course students may only view `PUBLISHED` announcements. Course teachers and domain administrators may view all announcements. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course does not exist.
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
    *       'https://www.googleapis.com/auth/classroom.announcements',
    *       'https://www.googleapis.com/auth/classroom.announcements.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.announcements.list({
    *     // Restriction on the `state` of announcements returned. If this argument is left unspecified, the default value is `PUBLISHED`.
    *     announcementStates: 'placeholder-value',
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
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
    *   //   "announcements": [],
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
  def list(params: ParamsResourceCoursesAnnouncementsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCoursesAnnouncementsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def modifyAssignees(): GaxiosPromise[SchemaAnnouncement] = js.native
  def modifyAssignees(callback: BodyResponseCallback[SchemaAnnouncement]): Unit = js.native
  def modifyAssignees(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnnouncement] = js.native
  def modifyAssignees(params: ParamsResourceCoursesAnnouncementsModifyassignees): GaxiosPromise[SchemaAnnouncement] = js.native
  def modifyAssignees(
    params: ParamsResourceCoursesAnnouncementsModifyassignees,
    callback: BodyResponseCallback[SchemaAnnouncement]
  ): Unit = js.native
  def modifyAssignees(
    params: ParamsResourceCoursesAnnouncementsModifyassignees,
    options: BodyResponseCallback[Readable | SchemaAnnouncement],
    callback: BodyResponseCallback[Readable | SchemaAnnouncement]
  ): Unit = js.native
  def modifyAssignees(params: ParamsResourceCoursesAnnouncementsModifyassignees, options: MethodOptions): GaxiosPromise[SchemaAnnouncement] = js.native
  def modifyAssignees(
    params: ParamsResourceCoursesAnnouncementsModifyassignees,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnnouncement]
  ): Unit = js.native
  /**
    * Modifies assignee mode and options of an announcement. Only a teacher of the course that contains the announcement may call this method. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course or course work does not exist.
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
    *     scopes: ['https://www.googleapis.com/auth/classroom.announcements'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.announcements.modifyAssignees({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Identifier of the announcement.
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
    *   //   "courseId": "my_courseId",
    *   //   "creationTime": "my_creationTime",
    *   //   "creatorUserId": "my_creatorUserId",
    *   //   "id": "my_id",
    *   //   "individualStudentsOptions": {},
    *   //   "materials": [],
    *   //   "scheduledTime": "my_scheduledTime",
    *   //   "state": "my_state",
    *   //   "text": "my_text",
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
  def modifyAssignees(params: ParamsResourceCoursesAnnouncementsModifyassignees, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def modifyAssignees(
    params: ParamsResourceCoursesAnnouncementsModifyassignees,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaAnnouncement] = js.native
  def patch(callback: BodyResponseCallback[SchemaAnnouncement]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnnouncement] = js.native
  def patch(params: ParamsResourceCoursesAnnouncementsPatch): GaxiosPromise[SchemaAnnouncement] = js.native
  def patch(
    params: ParamsResourceCoursesAnnouncementsPatch,
    callback: BodyResponseCallback[SchemaAnnouncement]
  ): Unit = js.native
  def patch(
    params: ParamsResourceCoursesAnnouncementsPatch,
    options: BodyResponseCallback[Readable | SchemaAnnouncement],
    callback: BodyResponseCallback[Readable | SchemaAnnouncement]
  ): Unit = js.native
  def patch(params: ParamsResourceCoursesAnnouncementsPatch, options: MethodOptions): GaxiosPromise[SchemaAnnouncement] = js.native
  def patch(
    params: ParamsResourceCoursesAnnouncementsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnnouncement]
  ): Unit = js.native
  /**
    * Updates one or more fields of an announcement. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting developer project did not create the corresponding announcement or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `FAILED_PRECONDITION` if the requested announcement has already been deleted. * `NOT_FOUND` if the requested course or announcement does not exist
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
    *     scopes: ['https://www.googleapis.com/auth/classroom.announcements'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.announcements.patch({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Identifier of the announcement.
    *     id: 'placeholder-value',
    *     // Mask that identifies which fields on the announcement to update. This field is required to do an update. The update fails if invalid fields are specified. If a field supports empty values, it can be cleared by specifying it in the update mask and not in the Announcement object. If a field that does not support empty values is included in the update mask and not set in the Announcement object, an `INVALID_ARGUMENT` error is returned. The following fields may be specified by teachers: * `text` * `state` * `scheduled_time`
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
    *       //   "id": "my_id",
    *       //   "individualStudentsOptions": {},
    *       //   "materials": [],
    *       //   "scheduledTime": "my_scheduledTime",
    *       //   "state": "my_state",
    *       //   "text": "my_text",
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
    *   //   "id": "my_id",
    *   //   "individualStudentsOptions": {},
    *   //   "materials": [],
    *   //   "scheduledTime": "my_scheduledTime",
    *   //   "state": "my_state",
    *   //   "text": "my_text",
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
  def patch(params: ParamsResourceCoursesAnnouncementsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceCoursesAnnouncementsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
