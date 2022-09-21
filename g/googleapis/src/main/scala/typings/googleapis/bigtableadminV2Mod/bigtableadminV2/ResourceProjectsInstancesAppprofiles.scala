package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/bigtableadmin/v2", "bigtableadmin_v2.Resource$Projects$Instances$Appprofiles")
@js.native
open class ResourceProjectsInstancesAppprofiles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaAppProfile] = js.native
  def create(callback: BodyResponseCallback[SchemaAppProfile]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAppProfile] = js.native
  def create(params: ParamsResourceProjectsInstancesAppprofilesCreate): GaxiosPromise[SchemaAppProfile] = js.native
  def create(
    params: ParamsResourceProjectsInstancesAppprofilesCreate,
    callback: BodyResponseCallback[SchemaAppProfile]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsInstancesAppprofilesCreate,
    options: BodyResponseCallback[Readable | SchemaAppProfile],
    callback: BodyResponseCallback[Readable | SchemaAppProfile]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsInstancesAppprofilesCreate, options: MethodOptions): GaxiosPromise[SchemaAppProfile] = js.native
  def create(
    params: ParamsResourceProjectsInstancesAppprofilesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAppProfile]
  ): Unit = js.native
  /**
    * Creates an app profile within an instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigtableadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigtableadmin = google.bigtableadmin('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigtable.admin',
    *       'https://www.googleapis.com/auth/bigtable.admin.cluster',
    *       'https://www.googleapis.com/auth/bigtable.admin.instance',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin.cluster',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigtableadmin.projects.instances.appProfiles.create({
    *     // Required. The ID to be used when referring to the new app profile within its instance, e.g., just `myprofile` rather than `projects/myproject/instances/myinstance/appProfiles/myprofile`.
    *     appProfileId: 'placeholder-value',
    *     // If true, ignore safety checks when creating the app profile.
    *     ignoreWarnings: 'placeholder-value',
    *     // Required. The unique name of the instance in which to create the new app profile. Values are of the form `projects/{project\}/instances/{instance\}`.
    *     parent: 'projects/my-project/instances/my-instance',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "multiClusterRoutingUseAny": {},
    *       //   "name": "my_name",
    *       //   "singleClusterRouting": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "multiClusterRoutingUseAny": {},
    *   //   "name": "my_name",
    *   //   "singleClusterRouting": {}
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
  def create(params: ParamsResourceProjectsInstancesAppprofilesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsInstancesAppprofilesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsInstancesAppprofilesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsInstancesAppprofilesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsInstancesAppprofilesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsInstancesAppprofilesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsInstancesAppprofilesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an app profile from an instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigtableadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigtableadmin = google.bigtableadmin('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigtable.admin',
    *       'https://www.googleapis.com/auth/bigtable.admin.cluster',
    *       'https://www.googleapis.com/auth/bigtable.admin.instance',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin.cluster',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigtableadmin.projects.instances.appProfiles.delete({
    *     // Required. If true, ignore safety checks when deleting the app profile.
    *     ignoreWarnings: 'placeholder-value',
    *     // Required. The unique name of the app profile to be deleted. Values are of the form `projects/{project\}/instances/{instance\}/appProfiles/{app_profile\}`.
    *     name: 'projects/my-project/instances/my-instance/appProfiles/my-appProfile',
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
  def delete(params: ParamsResourceProjectsInstancesAppprofilesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsInstancesAppprofilesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaAppProfile] = js.native
  def get(callback: BodyResponseCallback[SchemaAppProfile]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAppProfile] = js.native
  def get(params: ParamsResourceProjectsInstancesAppprofilesGet): GaxiosPromise[SchemaAppProfile] = js.native
  def get(
    params: ParamsResourceProjectsInstancesAppprofilesGet,
    callback: BodyResponseCallback[SchemaAppProfile]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsInstancesAppprofilesGet,
    options: BodyResponseCallback[Readable | SchemaAppProfile],
    callback: BodyResponseCallback[Readable | SchemaAppProfile]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsInstancesAppprofilesGet, options: MethodOptions): GaxiosPromise[SchemaAppProfile] = js.native
  def get(
    params: ParamsResourceProjectsInstancesAppprofilesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAppProfile]
  ): Unit = js.native
  /**
    * Gets information about an app profile.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigtableadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigtableadmin = google.bigtableadmin('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigtable.admin',
    *       'https://www.googleapis.com/auth/bigtable.admin.cluster',
    *       'https://www.googleapis.com/auth/bigtable.admin.instance',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin.cluster',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigtableadmin.projects.instances.appProfiles.get({
    *     // Required. The unique name of the requested app profile. Values are of the form `projects/{project\}/instances/{instance\}/appProfiles/{app_profile\}`.
    *     name: 'projects/my-project/instances/my-instance/appProfiles/my-appProfile',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "multiClusterRoutingUseAny": {},
    *   //   "name": "my_name",
    *   //   "singleClusterRouting": {}
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
  def get(params: ParamsResourceProjectsInstancesAppprofilesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsInstancesAppprofilesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAppProfilesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAppProfilesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAppProfilesResponse] = js.native
  def list(params: ParamsResourceProjectsInstancesAppprofilesList): GaxiosPromise[SchemaListAppProfilesResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstancesAppprofilesList,
    callback: BodyResponseCallback[SchemaListAppProfilesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsInstancesAppprofilesList,
    options: BodyResponseCallback[Readable | SchemaListAppProfilesResponse],
    callback: BodyResponseCallback[Readable | SchemaListAppProfilesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsInstancesAppprofilesList, options: MethodOptions): GaxiosPromise[SchemaListAppProfilesResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstancesAppprofilesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAppProfilesResponse]
  ): Unit = js.native
  /**
    * Lists information about app profiles in an instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigtableadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigtableadmin = google.bigtableadmin('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigtable.admin',
    *       'https://www.googleapis.com/auth/bigtable.admin.cluster',
    *       'https://www.googleapis.com/auth/bigtable.admin.instance',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin.cluster',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigtableadmin.projects.instances.appProfiles.list({
    *     // Maximum number of results per page. A page_size of zero lets the server choose the number of items to return. A page_size which is strictly positive will return at most that many items. A negative page_size will cause an error. Following the first request, subsequent paginated calls are not required to pass a page_size. If a page_size is set in subsequent calls, it must match the page_size given in the first request.
    *     pageSize: 'placeholder-value',
    *     // The value of `next_page_token` returned by a previous call.
    *     pageToken: 'placeholder-value',
    *     // Required. The unique name of the instance for which a list of app profiles is requested. Values are of the form `projects/{project\}/instances/{instance\}`. Use `{instance\} = '-'` to list AppProfiles for all Instances in a project, e.g., `projects/myproject/instances/-`.
    *     parent: 'projects/my-project/instances/my-instance',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appProfiles": [],
    *   //   "failedLocations": [],
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
  def list(params: ParamsResourceProjectsInstancesAppprofilesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsInstancesAppprofilesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsInstancesAppprofilesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsInstancesAppprofilesPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsInstancesAppprofilesPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsInstancesAppprofilesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsInstancesAppprofilesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates an app profile within an instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigtableadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigtableadmin = google.bigtableadmin('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigtable.admin',
    *       'https://www.googleapis.com/auth/bigtable.admin.cluster',
    *       'https://www.googleapis.com/auth/bigtable.admin.instance',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin.cluster',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigtableadmin.projects.instances.appProfiles.patch({
    *     // If true, ignore safety checks when updating the app profile.
    *     ignoreWarnings: 'placeholder-value',
    *     // The unique name of the app profile. Values are of the form `projects/{project\}/instances/{instance\}/appProfiles/_a-zA-Z0-9*`.
    *     name: 'projects/my-project/instances/my-instance/appProfiles/my-appProfile',
    *     // Required. The subset of app profile fields which should be replaced. If unset, all fields will be replaced.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "multiClusterRoutingUseAny": {},
    *       //   "name": "my_name",
    *       //   "singleClusterRouting": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def patch(params: ParamsResourceProjectsInstancesAppprofilesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsInstancesAppprofilesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
