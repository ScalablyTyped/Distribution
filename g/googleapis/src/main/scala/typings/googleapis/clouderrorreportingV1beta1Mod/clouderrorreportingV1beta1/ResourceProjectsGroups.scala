package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/clouderrorreporting/v1beta1", "clouderrorreporting_v1beta1.Resource$Projects$Groups")
@js.native
open class ResourceProjectsGroups protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaErrorGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaErrorGroup]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaErrorGroup] = js.native
  def get(params: ParamsResourceProjectsGroupsGet): GaxiosPromise[SchemaErrorGroup] = js.native
  def get(params: ParamsResourceProjectsGroupsGet, callback: BodyResponseCallback[SchemaErrorGroup]): Unit = js.native
  def get(
    params: ParamsResourceProjectsGroupsGet,
    options: BodyResponseCallback[Readable | SchemaErrorGroup],
    callback: BodyResponseCallback[Readable | SchemaErrorGroup]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsGroupsGet, options: MethodOptions): GaxiosPromise[SchemaErrorGroup] = js.native
  def get(
    params: ParamsResourceProjectsGroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaErrorGroup]
  ): Unit = js.native
  /**
    * Get the specified group.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/clouderrorreporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const clouderrorreporting = google.clouderrorreporting('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await clouderrorreporting.projects.groups.get({
    *     // Required. The group resource name. Written as `projects/{projectID\}/groups/{group_name\}`. Call groupStats.list to return a list of groups belonging to this project. Example: `projects/my-project-123/groups/my-group`
    *     groupName: 'projects/my-project/groups/my-group',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "groupId": "my_groupId",
    *   //   "name": "my_name",
    *   //   "resolutionStatus": "my_resolutionStatus",
    *   //   "trackingIssues": []
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
  def get(params: ParamsResourceProjectsGroupsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsGroupsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaErrorGroup] = js.native
  def update(callback: BodyResponseCallback[SchemaErrorGroup]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaErrorGroup] = js.native
  def update(params: ParamsResourceProjectsGroupsUpdate): GaxiosPromise[SchemaErrorGroup] = js.native
  def update(params: ParamsResourceProjectsGroupsUpdate, callback: BodyResponseCallback[SchemaErrorGroup]): Unit = js.native
  def update(
    params: ParamsResourceProjectsGroupsUpdate,
    options: BodyResponseCallback[Readable | SchemaErrorGroup],
    callback: BodyResponseCallback[Readable | SchemaErrorGroup]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsGroupsUpdate, options: MethodOptions): GaxiosPromise[SchemaErrorGroup] = js.native
  def update(
    params: ParamsResourceProjectsGroupsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaErrorGroup]
  ): Unit = js.native
  /**
    * Replace the data for the specified group. Fails if the group does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/clouderrorreporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const clouderrorreporting = google.clouderrorreporting('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await clouderrorreporting.projects.groups.update({
    *     // The group resource name. Example: projects/my-project-123/groups/CNSgkpnppqKCUw
    *     name: 'projects/my-project/groups/my-group',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "groupId": "my_groupId",
    *       //   "name": "my_name",
    *       //   "resolutionStatus": "my_resolutionStatus",
    *       //   "trackingIssues": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "groupId": "my_groupId",
    *   //   "name": "my_name",
    *   //   "resolutionStatus": "my_resolutionStatus",
    *   //   "trackingIssues": []
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
  def update(params: ParamsResourceProjectsGroupsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceProjectsGroupsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
