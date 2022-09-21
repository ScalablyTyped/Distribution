package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudresourcemanager/v1", "cloudresourcemanager_v1.Resource$Folders")
@js.native
open class ResourceFolders protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def clearOrgPolicy(): GaxiosPromise[SchemaEmpty] = js.native
  def clearOrgPolicy(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def clearOrgPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def clearOrgPolicy(params: ParamsResourceFoldersClearorgpolicy): GaxiosPromise[SchemaEmpty] = js.native
  def clearOrgPolicy(params: ParamsResourceFoldersClearorgpolicy, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def clearOrgPolicy(
    params: ParamsResourceFoldersClearorgpolicy,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def clearOrgPolicy(params: ParamsResourceFoldersClearorgpolicy, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def clearOrgPolicy(
    params: ParamsResourceFoldersClearorgpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Clears a `Policy` from a resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudresourcemanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudresourcemanager = google.cloudresourcemanager('v1');
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
    *   const res = await cloudresourcemanager.folders.clearOrgPolicy({
    *     // Name of the resource for the `Policy` to clear.
    *     resource: 'folders/my-folder',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "constraint": "my_constraint",
    *       //   "etag": "my_etag"
    *       // }
    *     },
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
  def clearOrgPolicy(params: ParamsResourceFoldersClearorgpolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def clearOrgPolicy(
    params: ParamsResourceFoldersClearorgpolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def getEffectiveOrgPolicy(): GaxiosPromise[SchemaOrgPolicy] = js.native
  def getEffectiveOrgPolicy(callback: BodyResponseCallback[SchemaOrgPolicy]): Unit = js.native
  def getEffectiveOrgPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrgPolicy] = js.native
  def getEffectiveOrgPolicy(params: ParamsResourceFoldersGeteffectiveorgpolicy): GaxiosPromise[SchemaOrgPolicy] = js.native
  def getEffectiveOrgPolicy(
    params: ParamsResourceFoldersGeteffectiveorgpolicy,
    callback: BodyResponseCallback[SchemaOrgPolicy]
  ): Unit = js.native
  def getEffectiveOrgPolicy(
    params: ParamsResourceFoldersGeteffectiveorgpolicy,
    options: BodyResponseCallback[Readable | SchemaOrgPolicy],
    callback: BodyResponseCallback[Readable | SchemaOrgPolicy]
  ): Unit = js.native
  def getEffectiveOrgPolicy(params: ParamsResourceFoldersGeteffectiveorgpolicy, options: MethodOptions): GaxiosPromise[SchemaOrgPolicy] = js.native
  def getEffectiveOrgPolicy(
    params: ParamsResourceFoldersGeteffectiveorgpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrgPolicy]
  ): Unit = js.native
  /**
    * Gets the effective `Policy` on a resource. This is the result of merging `Policies` in the resource hierarchy. The returned `Policy` will not have an `etag`set because it is a computed `Policy` across multiple resources. Subtrees of Resource Manager resource hierarchy with 'under:' prefix will not be expanded.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudresourcemanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudresourcemanager = google.cloudresourcemanager('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
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
    *   const res = await cloudresourcemanager.folders.getEffectiveOrgPolicy({
    *     // The name of the resource to start computing the effective `Policy`.
    *     resource: 'folders/my-folder',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "constraint": "my_constraint"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "booleanPolicy": {},
    *   //   "constraint": "my_constraint",
    *   //   "etag": "my_etag",
    *   //   "listPolicy": {},
    *   //   "restoreDefault": {},
    *   //   "updateTime": "my_updateTime",
    *   //   "version": 0
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
  def getEffectiveOrgPolicy(params: ParamsResourceFoldersGeteffectiveorgpolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getEffectiveOrgPolicy(
    params: ParamsResourceFoldersGeteffectiveorgpolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getOrgPolicy(): GaxiosPromise[SchemaOrgPolicy] = js.native
  def getOrgPolicy(callback: BodyResponseCallback[SchemaOrgPolicy]): Unit = js.native
  def getOrgPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrgPolicy] = js.native
  def getOrgPolicy(params: ParamsResourceFoldersGetorgpolicy): GaxiosPromise[SchemaOrgPolicy] = js.native
  def getOrgPolicy(params: ParamsResourceFoldersGetorgpolicy, callback: BodyResponseCallback[SchemaOrgPolicy]): Unit = js.native
  def getOrgPolicy(
    params: ParamsResourceFoldersGetorgpolicy,
    options: BodyResponseCallback[Readable | SchemaOrgPolicy],
    callback: BodyResponseCallback[Readable | SchemaOrgPolicy]
  ): Unit = js.native
  def getOrgPolicy(params: ParamsResourceFoldersGetorgpolicy, options: MethodOptions): GaxiosPromise[SchemaOrgPolicy] = js.native
  def getOrgPolicy(
    params: ParamsResourceFoldersGetorgpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrgPolicy]
  ): Unit = js.native
  /**
    * Gets a `Policy` on a resource. If no `Policy` is set on the resource, a `Policy` is returned with default values including `POLICY_TYPE_NOT_SET` for the `policy_type oneof`. The `etag` value can be used with `SetOrgPolicy()` to create or update a `Policy` during read-modify-write.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudresourcemanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudresourcemanager = google.cloudresourcemanager('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
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
    *   const res = await cloudresourcemanager.folders.getOrgPolicy({
    *     // Name of the resource the `Policy` is set on.
    *     resource: 'folders/my-folder',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "constraint": "my_constraint"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "booleanPolicy": {},
    *   //   "constraint": "my_constraint",
    *   //   "etag": "my_etag",
    *   //   "listPolicy": {},
    *   //   "restoreDefault": {},
    *   //   "updateTime": "my_updateTime",
    *   //   "version": 0
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
  def getOrgPolicy(params: ParamsResourceFoldersGetorgpolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getOrgPolicy(
    params: ParamsResourceFoldersGetorgpolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listAvailableOrgPolicyConstraints(): GaxiosPromise[SchemaListAvailableOrgPolicyConstraintsResponse] = js.native
  def listAvailableOrgPolicyConstraints(callback: BodyResponseCallback[SchemaListAvailableOrgPolicyConstraintsResponse]): Unit = js.native
  def listAvailableOrgPolicyConstraints(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAvailableOrgPolicyConstraintsResponse] = js.native
  def listAvailableOrgPolicyConstraints(params: ParamsResourceFoldersListavailableorgpolicyconstraints): GaxiosPromise[SchemaListAvailableOrgPolicyConstraintsResponse] = js.native
  def listAvailableOrgPolicyConstraints(
    params: ParamsResourceFoldersListavailableorgpolicyconstraints,
    callback: BodyResponseCallback[SchemaListAvailableOrgPolicyConstraintsResponse]
  ): Unit = js.native
  def listAvailableOrgPolicyConstraints(
    params: ParamsResourceFoldersListavailableorgpolicyconstraints,
    options: BodyResponseCallback[Readable | SchemaListAvailableOrgPolicyConstraintsResponse],
    callback: BodyResponseCallback[Readable | SchemaListAvailableOrgPolicyConstraintsResponse]
  ): Unit = js.native
  def listAvailableOrgPolicyConstraints(params: ParamsResourceFoldersListavailableorgpolicyconstraints, options: MethodOptions): GaxiosPromise[SchemaListAvailableOrgPolicyConstraintsResponse] = js.native
  def listAvailableOrgPolicyConstraints(
    params: ParamsResourceFoldersListavailableorgpolicyconstraints,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAvailableOrgPolicyConstraintsResponse]
  ): Unit = js.native
  /**
    * Lists `Constraints` that could be applied on the specified resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudresourcemanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudresourcemanager = google.cloudresourcemanager('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
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
    *   const res =
    *     await cloudresourcemanager.folders.listAvailableOrgPolicyConstraints({
    *       // Name of the resource to list `Constraints` for.
    *       resource: 'folders/my-folder',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "pageSize": 0,
    *         //   "pageToken": "my_pageToken"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "constraints": [],
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
  def listAvailableOrgPolicyConstraints(params: ParamsResourceFoldersListavailableorgpolicyconstraints, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listAvailableOrgPolicyConstraints(
    params: ParamsResourceFoldersListavailableorgpolicyconstraints,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listOrgPolicies(): GaxiosPromise[SchemaListOrgPoliciesResponse] = js.native
  def listOrgPolicies(callback: BodyResponseCallback[SchemaListOrgPoliciesResponse]): Unit = js.native
  def listOrgPolicies(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListOrgPoliciesResponse] = js.native
  def listOrgPolicies(params: ParamsResourceFoldersListorgpolicies): GaxiosPromise[SchemaListOrgPoliciesResponse] = js.native
  def listOrgPolicies(
    params: ParamsResourceFoldersListorgpolicies,
    callback: BodyResponseCallback[SchemaListOrgPoliciesResponse]
  ): Unit = js.native
  def listOrgPolicies(
    params: ParamsResourceFoldersListorgpolicies,
    options: BodyResponseCallback[Readable | SchemaListOrgPoliciesResponse],
    callback: BodyResponseCallback[Readable | SchemaListOrgPoliciesResponse]
  ): Unit = js.native
  def listOrgPolicies(params: ParamsResourceFoldersListorgpolicies, options: MethodOptions): GaxiosPromise[SchemaListOrgPoliciesResponse] = js.native
  def listOrgPolicies(
    params: ParamsResourceFoldersListorgpolicies,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListOrgPoliciesResponse]
  ): Unit = js.native
  /**
    * Lists all the `Policies` set for a particular resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudresourcemanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudresourcemanager = google.cloudresourcemanager('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
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
    *   const res = await cloudresourcemanager.folders.listOrgPolicies({
    *     // Name of the resource to list Policies for.
    *     resource: 'folders/my-folder',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "policies": []
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
  def listOrgPolicies(params: ParamsResourceFoldersListorgpolicies, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listOrgPolicies(
    params: ParamsResourceFoldersListorgpolicies,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setOrgPolicy(): GaxiosPromise[SchemaOrgPolicy] = js.native
  def setOrgPolicy(callback: BodyResponseCallback[SchemaOrgPolicy]): Unit = js.native
  def setOrgPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrgPolicy] = js.native
  def setOrgPolicy(params: ParamsResourceFoldersSetorgpolicy): GaxiosPromise[SchemaOrgPolicy] = js.native
  def setOrgPolicy(params: ParamsResourceFoldersSetorgpolicy, callback: BodyResponseCallback[SchemaOrgPolicy]): Unit = js.native
  def setOrgPolicy(
    params: ParamsResourceFoldersSetorgpolicy,
    options: BodyResponseCallback[Readable | SchemaOrgPolicy],
    callback: BodyResponseCallback[Readable | SchemaOrgPolicy]
  ): Unit = js.native
  def setOrgPolicy(params: ParamsResourceFoldersSetorgpolicy, options: MethodOptions): GaxiosPromise[SchemaOrgPolicy] = js.native
  def setOrgPolicy(
    params: ParamsResourceFoldersSetorgpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrgPolicy]
  ): Unit = js.native
  /**
    * Updates the specified `Policy` on the resource. Creates a new `Policy` for that `Constraint` on the resource if one does not exist. Not supplying an `etag` on the request `Policy` results in an unconditional write of the `Policy`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudresourcemanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudresourcemanager = google.cloudresourcemanager('v1');
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
    *   const res = await cloudresourcemanager.folders.setOrgPolicy({
    *     // Resource name of the resource to attach the `Policy`.
    *     resource: 'folders/my-folder',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "policy": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "booleanPolicy": {},
    *   //   "constraint": "my_constraint",
    *   //   "etag": "my_etag",
    *   //   "listPolicy": {},
    *   //   "restoreDefault": {},
    *   //   "updateTime": "my_updateTime",
    *   //   "version": 0
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
  def setOrgPolicy(params: ParamsResourceFoldersSetorgpolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setOrgPolicy(
    params: ParamsResourceFoldersSetorgpolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
