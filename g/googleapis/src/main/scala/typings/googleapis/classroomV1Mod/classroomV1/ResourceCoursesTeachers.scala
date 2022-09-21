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

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Courses$Teachers")
@js.native
open class ResourceCoursesTeachers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaTeacher] = js.native
  def create(callback: BodyResponseCallback[SchemaTeacher]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTeacher] = js.native
  def create(params: ParamsResourceCoursesTeachersCreate): GaxiosPromise[SchemaTeacher] = js.native
  def create(params: ParamsResourceCoursesTeachersCreate, callback: BodyResponseCallback[SchemaTeacher]): Unit = js.native
  def create(
    params: ParamsResourceCoursesTeachersCreate,
    options: BodyResponseCallback[Readable | SchemaTeacher],
    callback: BodyResponseCallback[Readable | SchemaTeacher]
  ): Unit = js.native
  def create(params: ParamsResourceCoursesTeachersCreate, options: MethodOptions): GaxiosPromise[SchemaTeacher] = js.native
  def create(
    params: ParamsResourceCoursesTeachersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTeacher]
  ): Unit = js.native
  /**
    * Creates a teacher of a course. Domain administrators are permitted to [directly add](https://developers.google.com/classroom/guides/manage-users) users within their domain as teachers to courses within their domain. Non-admin users should send an Invitation instead. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to create teachers in this course or for access errors. * `NOT_FOUND` if the requested course ID does not exist. * `FAILED_PRECONDITION` if the requested user's account is disabled, for the following request errors: * CourseMemberLimitReached * CourseNotModifiable * CourseTeacherLimitReached * UserGroupsMembershipLimitReached * InactiveCourseOwner * `ALREADY_EXISTS` if the user is already a teacher or student in the course.
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
    *       'https://www.googleapis.com/auth/classroom.profile.emails',
    *       'https://www.googleapis.com/auth/classroom.profile.photos',
    *       'https://www.googleapis.com/auth/classroom.rosters',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.teachers.create({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "courseId": "my_courseId",
    *       //   "profile": {},
    *       //   "userId": "my_userId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "courseId": "my_courseId",
    *   //   "profile": {},
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
  def create(params: ParamsResourceCoursesTeachersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceCoursesTeachersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCoursesTeachersDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCoursesTeachersDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceCoursesTeachersDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceCoursesTeachersDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceCoursesTeachersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Removes the specified teacher from the specified course. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to delete teachers of this course or for access errors. * `NOT_FOUND` if no teacher of this course has the requested ID or if the course does not exist. * `FAILED_PRECONDITION` if the requested ID belongs to the primary teacher of this course. * `FAILED_PRECONDITION` if the requested ID belongs to the owner of the course Drive folder. * `FAILED_PRECONDITION` if the course no longer has an active owner.
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
    *     scopes: ['https://www.googleapis.com/auth/classroom.rosters'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.teachers.delete({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Identifier of the teacher to delete. The identifier can be one of the following: * the numeric identifier for the user * the email address of the user * the string literal `"me"`, indicating the requesting user
    *     userId: 'placeholder-value',
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
  def delete(params: ParamsResourceCoursesTeachersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceCoursesTeachersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaTeacher] = js.native
  def get(callback: BodyResponseCallback[SchemaTeacher]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTeacher] = js.native
  def get(params: ParamsResourceCoursesTeachersGet): GaxiosPromise[SchemaTeacher] = js.native
  def get(params: ParamsResourceCoursesTeachersGet, callback: BodyResponseCallback[SchemaTeacher]): Unit = js.native
  def get(
    params: ParamsResourceCoursesTeachersGet,
    options: BodyResponseCallback[Readable | SchemaTeacher],
    callback: BodyResponseCallback[Readable | SchemaTeacher]
  ): Unit = js.native
  def get(params: ParamsResourceCoursesTeachersGet, options: MethodOptions): GaxiosPromise[SchemaTeacher] = js.native
  def get(
    params: ParamsResourceCoursesTeachersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTeacher]
  ): Unit = js.native
  /**
    * Returns a teacher of a course. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to view teachers of this course or for access errors. * `NOT_FOUND` if no teacher of this course has the requested ID or if the course does not exist.
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
    *       'https://www.googleapis.com/auth/classroom.profile.emails',
    *       'https://www.googleapis.com/auth/classroom.profile.photos',
    *       'https://www.googleapis.com/auth/classroom.rosters',
    *       'https://www.googleapis.com/auth/classroom.rosters.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.teachers.get({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Identifier of the teacher to return. The identifier can be one of the following: * the numeric identifier for the user * the email address of the user * the string literal `"me"`, indicating the requesting user
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "courseId": "my_courseId",
    *   //   "profile": {},
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
  def get(params: ParamsResourceCoursesTeachersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCoursesTeachersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListTeachersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTeachersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTeachersResponse] = js.native
  def list(params: ParamsResourceCoursesTeachersList): GaxiosPromise[SchemaListTeachersResponse] = js.native
  def list(
    params: ParamsResourceCoursesTeachersList,
    callback: BodyResponseCallback[SchemaListTeachersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCoursesTeachersList,
    options: BodyResponseCallback[Readable | SchemaListTeachersResponse],
    callback: BodyResponseCallback[Readable | SchemaListTeachersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCoursesTeachersList, options: MethodOptions): GaxiosPromise[SchemaListTeachersResponse] = js.native
  def list(
    params: ParamsResourceCoursesTeachersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTeachersResponse]
  ): Unit = js.native
  /**
    * Returns a list of teachers of this course that the requester is permitted to view. This method returns the following error codes: * `NOT_FOUND` if the course does not exist. * `PERMISSION_DENIED` for access errors.
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
    *       'https://www.googleapis.com/auth/classroom.profile.emails',
    *       'https://www.googleapis.com/auth/classroom.profile.photos',
    *       'https://www.googleapis.com/auth/classroom.rosters',
    *       'https://www.googleapis.com/auth/classroom.rosters.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.courses.teachers.list({
    *     // Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    *     courseId: 'placeholder-value',
    *     // Maximum number of items to return. The default is 30 if unspecified or `0`. The server may return fewer than the specified number of results.
    *     pageSize: 'placeholder-value',
    *     // nextPageToken value returned from a previous list call, indicating that the subsequent page of results should be returned. The list request must be otherwise identical to the one that resulted in this token.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "teachers": []
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
  def list(params: ParamsResourceCoursesTeachersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCoursesTeachersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
