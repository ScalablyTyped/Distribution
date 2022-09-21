package typings.googleapis.cloudassetV1Mod.cloudassetV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudasset/v1", "cloudasset_v1.Resource$Effectiveiampolicies")
@js.native
open class ResourceEffectiveiampolicies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchGet(): GaxiosPromise[SchemaBatchGetEffectiveIamPoliciesResponse] = js.native
  def batchGet(callback: BodyResponseCallback[SchemaBatchGetEffectiveIamPoliciesResponse]): Unit = js.native
  def batchGet(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchGetEffectiveIamPoliciesResponse] = js.native
  def batchGet(params: ParamsResourceEffectiveiampoliciesBatchget): GaxiosPromise[SchemaBatchGetEffectiveIamPoliciesResponse] = js.native
  def batchGet(
    params: ParamsResourceEffectiveiampoliciesBatchget,
    callback: BodyResponseCallback[SchemaBatchGetEffectiveIamPoliciesResponse]
  ): Unit = js.native
  def batchGet(
    params: ParamsResourceEffectiveiampoliciesBatchget,
    options: BodyResponseCallback[Readable | SchemaBatchGetEffectiveIamPoliciesResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchGetEffectiveIamPoliciesResponse]
  ): Unit = js.native
  def batchGet(params: ParamsResourceEffectiveiampoliciesBatchget, options: MethodOptions): GaxiosPromise[SchemaBatchGetEffectiveIamPoliciesResponse] = js.native
  def batchGet(
    params: ParamsResourceEffectiveiampoliciesBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchGetEffectiveIamPoliciesResponse]
  ): Unit = js.native
  /**
    * Gets effective IAM policies for a batch of resources.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudasset.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudasset = google.cloudasset('v1');
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
    *   const res = await cloudasset.effectiveIamPolicies.batchGet({
    *     // Required. The names refer to the [full_resource_names] (https://cloud.google.com/asset-inventory/docs/resource-name-format) of [searchable asset types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types). A maximum of 20 resources' effective policies can be retrieved in a batch.
    *     names: 'placeholder-value',
    *     // Required. Only IAM policies on or below the scope will be returned. This can only be an organization number (such as "organizations/123"), a folder number (such as "folders/123"), a project ID (such as "projects/my-project-id"), or a project number (such as "projects/12345"). To know how to get organization id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id). To know how to get folder or project id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
    *     scope: '[^/]+/[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "policyResults": []
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
  def batchGet(params: ParamsResourceEffectiveiampoliciesBatchget, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchGet(
    params: ParamsResourceEffectiveiampoliciesBatchget,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
