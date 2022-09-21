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

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Courses$Topics")
@js.native
open class ResourceCoursesTopics protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaTopic] = js.native
  def create(callback: BodyResponseCallback[SchemaTopic]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTopic] = js.native
  def create(params: ParamsResourceCoursesTopicsCreate): GaxiosPromise[SchemaTopic] = js.native
  def create(params: ParamsResourceCoursesTopicsCreate, callback: BodyResponseCallback[SchemaTopic]): Unit = js.native
  def create(
    params: ParamsResourceCoursesTopicsCreate,
    options: BodyResponseCallback[Readable | SchemaTopic],
    callback: BodyResponseCallback[Readable | SchemaTopic]
  ): Unit = js.native
  def create(params: ParamsResourceCoursesTopicsCreate, options: MethodOptions): GaxiosPromise[SchemaTopic] = js.native
  def create(
    params: ParamsResourceCoursesTopicsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTopic]
  ): Unit = js.native
  /**
    * Creates a topic. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course, create a topic in the requested course, or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course does not exist.
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
    *     scopes: ['https://www.googleapis.com/auth/classroom.topics'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.topics.create({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "courseId": "my_courseId",
    *       //   "name": "my_name",
    *       //   "topicId": "my_topicId",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "courseId": "my_courseId",
    *   //   "name": "my_name",
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
  def create(params: ParamsResourceCoursesTopicsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceCoursesTopicsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCoursesTopicsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCoursesTopicsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceCoursesTopicsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceCoursesTopicsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceCoursesTopicsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a topic. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not allowed to delete the requested topic or for access errors. * `FAILED_PRECONDITION` if the requested topic has already been deleted. * `NOT_FOUND` if no course or topic exists with the requested ID.
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
    *     scopes: ['https://www.googleapis.com/auth/classroom.topics'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.topics.delete({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Identifier of the topic to delete.
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
  def delete(params: ParamsResourceCoursesTopicsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceCoursesTopicsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaTopic] = js.native
  def get(callback: BodyResponseCallback[SchemaTopic]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTopic] = js.native
  def get(params: ParamsResourceCoursesTopicsGet): GaxiosPromise[SchemaTopic] = js.native
  def get(params: ParamsResourceCoursesTopicsGet, callback: BodyResponseCallback[SchemaTopic]): Unit = js.native
  def get(
    params: ParamsResourceCoursesTopicsGet,
    options: BodyResponseCallback[Readable | SchemaTopic],
    callback: BodyResponseCallback[Readable | SchemaTopic]
  ): Unit = js.native
  def get(params: ParamsResourceCoursesTopicsGet, options: MethodOptions): GaxiosPromise[SchemaTopic] = js.native
  def get(
    params: ParamsResourceCoursesTopicsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTopic]
  ): Unit = js.native
  /**
    * Returns a topic. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or topic, or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course or topic does not exist.
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
    *       'https://www.googleapis.com/auth/classroom.topics',
    *       'https://www.googleapis.com/auth/classroom.topics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.topics.get({
    *     // Identifier of the course.
    *     courseId: 'placeholder-value',
    *     // Identifier of the topic.
    *     id: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "courseId": "my_courseId",
    *   //   "name": "my_name",
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
  def get(params: ParamsResourceCoursesTopicsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCoursesTopicsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListTopicResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTopicResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTopicResponse] = js.native
  def list(params: ParamsResourceCoursesTopicsList): GaxiosPromise[SchemaListTopicResponse] = js.native
  def list(params: ParamsResourceCoursesTopicsList, callback: BodyResponseCallback[SchemaListTopicResponse]): Unit = js.native
  def list(
    params: ParamsResourceCoursesTopicsList,
    options: BodyResponseCallback[Readable | SchemaListTopicResponse],
    callback: BodyResponseCallback[Readable | SchemaListTopicResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCoursesTopicsList, options: MethodOptions): GaxiosPromise[SchemaListTopicResponse] = js.native
  def list(
    params: ParamsResourceCoursesTopicsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTopicResponse]
  ): Unit = js.native
  /**
    * Returns the list of topics that the requester is permitted to view. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course does not exist.
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
    *       'https://www.googleapis.com/auth/classroom.topics',
    *       'https://www.googleapis.com/auth/classroom.topics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.topics.list({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Maximum number of items to return. Zero or unspecified indicates that the server may assign a maximum. The server may return fewer than the specified number of results.
    *     pageSize: 'placeholder-value',
    *     // nextPageToken value returned from a previous list call, indicating that the subsequent page of results should be returned. The list request must be otherwise identical to the one that resulted in this token.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "topic": []
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
  def list(params: ParamsResourceCoursesTopicsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCoursesTopicsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaTopic] = js.native
  def patch(callback: BodyResponseCallback[SchemaTopic]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTopic] = js.native
  def patch(params: ParamsResourceCoursesTopicsPatch): GaxiosPromise[SchemaTopic] = js.native
  def patch(params: ParamsResourceCoursesTopicsPatch, callback: BodyResponseCallback[SchemaTopic]): Unit = js.native
  def patch(
    params: ParamsResourceCoursesTopicsPatch,
    options: BodyResponseCallback[Readable | SchemaTopic],
    callback: BodyResponseCallback[Readable | SchemaTopic]
  ): Unit = js.native
  def patch(params: ParamsResourceCoursesTopicsPatch, options: MethodOptions): GaxiosPromise[SchemaTopic] = js.native
  def patch(
    params: ParamsResourceCoursesTopicsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTopic]
  ): Unit = js.native
  /**
    * Updates one or more fields of a topic. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting developer project did not create the corresponding topic or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course or topic does not exist
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
    *     scopes: ['https://www.googleapis.com/auth/classroom.topics'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.topics.patch({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Identifier of the topic.
    *     id: 'placeholder-value',
    *     // Mask that identifies which fields on the topic to update. This field is required to do an update. The update fails if invalid fields are specified. If a field supports empty values, it can be cleared by specifying it in the update mask and not in the Topic object. If a field that does not support empty values is included in the update mask and not set in the Topic object, an `INVALID_ARGUMENT` error is returned. The following fields may be specified: * `name`
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "courseId": "my_courseId",
    *       //   "name": "my_name",
    *       //   "topicId": "my_topicId",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "courseId": "my_courseId",
    *   //   "name": "my_name",
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
  def patch(params: ParamsResourceCoursesTopicsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceCoursesTopicsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
