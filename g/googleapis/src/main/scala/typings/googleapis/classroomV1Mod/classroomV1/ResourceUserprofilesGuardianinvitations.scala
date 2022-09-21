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

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Userprofiles$Guardianinvitations")
@js.native
open class ResourceUserprofilesGuardianinvitations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGuardianInvitation] = js.native
  def create(callback: BodyResponseCallback[SchemaGuardianInvitation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGuardianInvitation] = js.native
  def create(params: ParamsResourceUserprofilesGuardianinvitationsCreate): GaxiosPromise[SchemaGuardianInvitation] = js.native
  def create(
    params: ParamsResourceUserprofilesGuardianinvitationsCreate,
    callback: BodyResponseCallback[SchemaGuardianInvitation]
  ): Unit = js.native
  def create(
    params: ParamsResourceUserprofilesGuardianinvitationsCreate,
    options: BodyResponseCallback[Readable | SchemaGuardianInvitation],
    callback: BodyResponseCallback[Readable | SchemaGuardianInvitation]
  ): Unit = js.native
  def create(params: ParamsResourceUserprofilesGuardianinvitationsCreate, options: MethodOptions): GaxiosPromise[SchemaGuardianInvitation] = js.native
  def create(
    params: ParamsResourceUserprofilesGuardianinvitationsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGuardianInvitation]
  ): Unit = js.native
  /**
    * Creates a guardian invitation, and sends an email to the guardian asking them to confirm that they are the student's guardian. Once the guardian accepts the invitation, their `state` will change to `COMPLETED` and they will start receiving guardian notifications. A `Guardian` resource will also be created to represent the active guardian. The request object must have the `student_id` and `invited_email_address` fields set. Failing to set these fields, or setting any other fields in the request, will result in an error. This method returns the following error codes: * `PERMISSION_DENIED` if the current user does not have permission to manage guardians, if the guardian in question has already rejected too many requests for that student, if guardians are not enabled for the domain in question, or for other access errors. * `RESOURCE_EXHAUSTED` if the student or guardian has exceeded the guardian link limit. * `INVALID_ARGUMENT` if the guardian email address is not valid (for example, if it is too long), or if the format of the student ID provided cannot be recognized (it is not an email address, nor a `user_id` from this API). This error will also be returned if read-only fields are set, or if the `state` field is set to to a value other than `PENDING`. * `NOT_FOUND` if the student ID provided is a valid student ID, but Classroom has no record of that student. * `ALREADY_EXISTS` if there is already a pending guardian invitation for the student and `invited_email_address` provided, or if the provided `invited_email_address` matches the Google account of an existing `Guardian` for this user.
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
    *       'https://www.googleapis.com/auth/classroom.guardianlinks.students',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.userProfiles.guardianInvitations.create({
    *     // ID of the student (in standard format)
    *     studentId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "creationTime": "my_creationTime",
    *       //   "invitationId": "my_invitationId",
    *       //   "invitedEmailAddress": "my_invitedEmailAddress",
    *       //   "state": "my_state",
    *       //   "studentId": "my_studentId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creationTime": "my_creationTime",
    *   //   "invitationId": "my_invitationId",
    *   //   "invitedEmailAddress": "my_invitedEmailAddress",
    *   //   "state": "my_state",
    *   //   "studentId": "my_studentId"
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
  def create(params: ParamsResourceUserprofilesGuardianinvitationsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceUserprofilesGuardianinvitationsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGuardianInvitation] = js.native
  def get(callback: BodyResponseCallback[SchemaGuardianInvitation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGuardianInvitation] = js.native
  def get(params: ParamsResourceUserprofilesGuardianinvitationsGet): GaxiosPromise[SchemaGuardianInvitation] = js.native
  def get(
    params: ParamsResourceUserprofilesGuardianinvitationsGet,
    callback: BodyResponseCallback[SchemaGuardianInvitation]
  ): Unit = js.native
  def get(
    params: ParamsResourceUserprofilesGuardianinvitationsGet,
    options: BodyResponseCallback[Readable | SchemaGuardianInvitation],
    callback: BodyResponseCallback[Readable | SchemaGuardianInvitation]
  ): Unit = js.native
  def get(params: ParamsResourceUserprofilesGuardianinvitationsGet, options: MethodOptions): GaxiosPromise[SchemaGuardianInvitation] = js.native
  def get(
    params: ParamsResourceUserprofilesGuardianinvitationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGuardianInvitation]
  ): Unit = js.native
  /**
    * Returns a specific guardian invitation. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to view guardian invitations for the student identified by the `student_id`, if guardians are not enabled for the domain in question, or for other access errors. * `INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot be recognized (it is not an email address, nor a `student_id` from the API, nor the literal string `me`). * `NOT_FOUND` if Classroom cannot find any record of the given student or `invitation_id`. May also be returned if the student exists, but the requesting user does not have access to see that student.
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
    *       'https://www.googleapis.com/auth/classroom.guardianlinks.students',
    *       'https://www.googleapis.com/auth/classroom.guardianlinks.students.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.userProfiles.guardianInvitations.get({
    *     // The `id` field of the `GuardianInvitation` being requested.
    *     invitationId: 'placeholder-value',
    *     // The ID of the student whose guardian invitation is being requested.
    *     studentId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creationTime": "my_creationTime",
    *   //   "invitationId": "my_invitationId",
    *   //   "invitedEmailAddress": "my_invitedEmailAddress",
    *   //   "state": "my_state",
    *   //   "studentId": "my_studentId"
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
  def get(params: ParamsResourceUserprofilesGuardianinvitationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceUserprofilesGuardianinvitationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListGuardianInvitationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListGuardianInvitationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListGuardianInvitationsResponse] = js.native
  def list(params: ParamsResourceUserprofilesGuardianinvitationsList): GaxiosPromise[SchemaListGuardianInvitationsResponse] = js.native
  def list(
    params: ParamsResourceUserprofilesGuardianinvitationsList,
    callback: BodyResponseCallback[SchemaListGuardianInvitationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUserprofilesGuardianinvitationsList,
    options: BodyResponseCallback[Readable | SchemaListGuardianInvitationsResponse],
    callback: BodyResponseCallback[Readable | SchemaListGuardianInvitationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUserprofilesGuardianinvitationsList, options: MethodOptions): GaxiosPromise[SchemaListGuardianInvitationsResponse] = js.native
  def list(
    params: ParamsResourceUserprofilesGuardianinvitationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListGuardianInvitationsResponse]
  ): Unit = js.native
  /**
    * Returns a list of guardian invitations that the requesting user is permitted to view, filtered by the parameters provided. This method returns the following error codes: * `PERMISSION_DENIED` if a `student_id` is specified, and the requesting user is not permitted to view guardian invitations for that student, if `"-"` is specified as the `student_id` and the user is not a domain administrator, if guardians are not enabled for the domain in question, or for other access errors. * `INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot be recognized (it is not an email address, nor a `student_id` from the API, nor the literal string `me`). May also be returned if an invalid `page_token` or `state` is provided. * `NOT_FOUND` if a `student_id` is specified, and its format can be recognized, but Classroom has no record of that student.
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
    *       'https://www.googleapis.com/auth/classroom.guardianlinks.students',
    *       'https://www.googleapis.com/auth/classroom.guardianlinks.students.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.userProfiles.guardianInvitations.list({
    *     // If specified, only results with the specified `invited_email_address` are returned.
    *     invitedEmailAddress: 'placeholder-value',
    *     // Maximum number of items to return. Zero or unspecified indicates that the server may assign a maximum. The server may return fewer than the specified number of results.
    *     pageSize: 'placeholder-value',
    *     // nextPageToken value returned from a previous list call, indicating that the subsequent page of results should be returned. The list request must be otherwise identical to the one that resulted in this token.
    *     pageToken: 'placeholder-value',
    *     // If specified, only results with the specified `state` values are returned. Otherwise, results with a `state` of `PENDING` are returned.
    *     states: 'placeholder-value',
    *     // The ID of the student whose guardian invitations are to be returned. The identifier can be one of the following: * the numeric identifier for the user * the email address of the user * the string literal `"me"`, indicating the requesting user * the string literal `"-"`, indicating that results should be returned for all students that the requesting user is permitted to view guardian invitations.
    *     studentId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "guardianInvitations": [],
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
  def list(params: ParamsResourceUserprofilesGuardianinvitationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceUserprofilesGuardianinvitationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGuardianInvitation] = js.native
  def patch(callback: BodyResponseCallback[SchemaGuardianInvitation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGuardianInvitation] = js.native
  def patch(params: ParamsResourceUserprofilesGuardianinvitationsPatch): GaxiosPromise[SchemaGuardianInvitation] = js.native
  def patch(
    params: ParamsResourceUserprofilesGuardianinvitationsPatch,
    callback: BodyResponseCallback[SchemaGuardianInvitation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceUserprofilesGuardianinvitationsPatch,
    options: BodyResponseCallback[Readable | SchemaGuardianInvitation],
    callback: BodyResponseCallback[Readable | SchemaGuardianInvitation]
  ): Unit = js.native
  def patch(params: ParamsResourceUserprofilesGuardianinvitationsPatch, options: MethodOptions): GaxiosPromise[SchemaGuardianInvitation] = js.native
  def patch(
    params: ParamsResourceUserprofilesGuardianinvitationsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGuardianInvitation]
  ): Unit = js.native
  /**
    * Modifies a guardian invitation. Currently, the only valid modification is to change the `state` from `PENDING` to `COMPLETE`. This has the effect of withdrawing the invitation. This method returns the following error codes: * `PERMISSION_DENIED` if the current user does not have permission to manage guardians, if guardians are not enabled for the domain in question or for other access errors. * `FAILED_PRECONDITION` if the guardian link is not in the `PENDING` state. * `INVALID_ARGUMENT` if the format of the student ID provided cannot be recognized (it is not an email address, nor a `user_id` from this API), or if the passed `GuardianInvitation` has a `state` other than `COMPLETE`, or if it modifies fields other than `state`. * `NOT_FOUND` if the student ID provided is a valid student ID, but Classroom has no record of that student, or if the `id` field does not refer to a guardian invitation known to Classroom.
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
    *       'https://www.googleapis.com/auth/classroom.guardianlinks.students',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await classroom.userProfiles.guardianInvitations.patch({
    *     // The `id` field of the `GuardianInvitation` to be modified.
    *     invitationId: 'placeholder-value',
    *     // The ID of the student whose guardian invitation is to be modified.
    *     studentId: 'placeholder-value',
    *     // Mask that identifies which fields on the course to update. This field is required to do an update. The update fails if invalid fields are specified. The following fields are valid: * `state` When set in a query parameter, this field should be specified as `updateMask=,,...`
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "creationTime": "my_creationTime",
    *       //   "invitationId": "my_invitationId",
    *       //   "invitedEmailAddress": "my_invitedEmailAddress",
    *       //   "state": "my_state",
    *       //   "studentId": "my_studentId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creationTime": "my_creationTime",
    *   //   "invitationId": "my_invitationId",
    *   //   "invitedEmailAddress": "my_invitedEmailAddress",
    *   //   "state": "my_state",
    *   //   "studentId": "my_studentId"
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
  def patch(params: ParamsResourceUserprofilesGuardianinvitationsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceUserprofilesGuardianinvitationsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
