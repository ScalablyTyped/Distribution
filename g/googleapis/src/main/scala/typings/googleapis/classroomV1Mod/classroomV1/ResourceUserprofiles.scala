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

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Userprofiles")
@js.native
open class ResourceUserprofiles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaUserProfile] = js.native
  def get(callback: BodyResponseCallback[SchemaUserProfile]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserProfile] = js.native
  def get(params: ParamsResourceUserprofilesGet): GaxiosPromise[SchemaUserProfile] = js.native
  def get(params: ParamsResourceUserprofilesGet, callback: BodyResponseCallback[SchemaUserProfile]): Unit = js.native
  def get(
    params: ParamsResourceUserprofilesGet,
    options: BodyResponseCallback[Readable | SchemaUserProfile],
    callback: BodyResponseCallback[Readable | SchemaUserProfile]
  ): Unit = js.native
  def get(params: ParamsResourceUserprofilesGet, options: MethodOptions): GaxiosPromise[SchemaUserProfile] = js.native
  def get(
    params: ParamsResourceUserprofilesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserProfile]
  ): Unit = js.native
  /**
    * Returns a user profile. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access this user profile, if no profile exists with the requested ID, or for access errors.
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
    *   const res = await classroom.userProfiles.get({
    *     // Identifier of the profile to return. The identifier can be one of the following: * the numeric identifier for the user * the email address of the user * the string literal `"me"`, indicating the requesting user
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "emailAddress": "my_emailAddress",
    *   //   "id": "my_id",
    *   //   "name": {},
    *   //   "permissions": [],
    *   //   "photoUrl": "my_photoUrl",
    *   //   "verifiedTeacher": false
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
  def get(params: ParamsResourceUserprofilesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceUserprofilesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var guardianInvitations: ResourceUserprofilesGuardianinvitations = js.native
  
  var guardians: ResourceUserprofilesGuardians = js.native
}
