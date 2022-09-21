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

@JSImport("googleapis/build/src/apis/cloudasset/v1", "cloudasset_v1.Resource$V1")
@js.native
open class ResourceV1 protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def analyzeIamPolicy(): GaxiosPromise[SchemaAnalyzeIamPolicyResponse] = js.native
  def analyzeIamPolicy(callback: BodyResponseCallback[SchemaAnalyzeIamPolicyResponse]): Unit = js.native
  def analyzeIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnalyzeIamPolicyResponse] = js.native
  def analyzeIamPolicy(params: ParamsResourceV1Analyzeiampolicy): GaxiosPromise[SchemaAnalyzeIamPolicyResponse] = js.native
  def analyzeIamPolicy(
    params: ParamsResourceV1Analyzeiampolicy,
    callback: BodyResponseCallback[SchemaAnalyzeIamPolicyResponse]
  ): Unit = js.native
  def analyzeIamPolicy(
    params: ParamsResourceV1Analyzeiampolicy,
    options: BodyResponseCallback[Readable | SchemaAnalyzeIamPolicyResponse],
    callback: BodyResponseCallback[Readable | SchemaAnalyzeIamPolicyResponse]
  ): Unit = js.native
  def analyzeIamPolicy(params: ParamsResourceV1Analyzeiampolicy, options: MethodOptions): GaxiosPromise[SchemaAnalyzeIamPolicyResponse] = js.native
  def analyzeIamPolicy(
    params: ParamsResourceV1Analyzeiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnalyzeIamPolicyResponse]
  ): Unit = js.native
  /**
    * Analyzes IAM policies to answer which identities have what accesses on which resources.
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
    *   const res = await cloudasset.analyzeIamPolicy({
    *     // Optional. The permissions to appear in result.
    *     'analysisQuery.accessSelector.permissions': 'placeholder-value',
    *     // Optional. The roles to appear in result.
    *     'analysisQuery.accessSelector.roles': 'placeholder-value',
    *     // The hypothetical access timestamp to evaluate IAM conditions. Note that this value must not be earlier than the current time; otherwise, an INVALID_ARGUMENT error will be returned.
    *     'analysisQuery.conditionContext.accessTime': 'placeholder-value',
    *     // Required. The identity appear in the form of principals in [IAM policy binding](https://cloud.google.com/iam/reference/rest/v1/Binding). The examples of supported forms are: "user:mike@example.com", "group:admins@example.com", "domain:google.com", "serviceAccount:my-project-id@appspot.gserviceaccount.com". Notice that wildcard characters (such as * and ?) are not supported. You must give a specific identity.
    *     'analysisQuery.identitySelector.identity': 'placeholder-value',
    *     // Optional. If true, the response will include access analysis from identities to resources via service account impersonation. This is a very expensive operation, because many derived queries will be executed. We highly recommend you use AssetService.AnalyzeIamPolicyLongrunning rpc instead. For example, if the request analyzes for which resources user A has permission P, and there's an IAM policy states user A has iam.serviceAccounts.getAccessToken permission to a service account SA, and there's another IAM policy states service account SA has permission P to a GCP folder F, then user A potentially has access to the GCP folder F. And those advanced analysis results will be included in AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Another example, if the request analyzes for who has permission P to a GCP folder F, and there's an IAM policy states user A has iam.serviceAccounts.actAs permission to a service account SA, and there's another IAM policy states service account SA has permission P to the GCP folder F, then user A potentially has access to the GCP folder F. And those advanced analysis results will be included in AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Only the following permissions are considered in this analysis: * `iam.serviceAccounts.actAs` * `iam.serviceAccounts.signBlob` * `iam.serviceAccounts.signJwt` * `iam.serviceAccounts.getAccessToken` * `iam.serviceAccounts.getOpenIdToken` * `iam.serviceAccounts.implicitDelegation` Default is false.
    *     'analysisQuery.options.analyzeServiceAccountImpersonation':
    *       'placeholder-value',
    *     // Optional. If true, the identities section of the result will expand any Google groups appearing in an IAM policy binding. If IamPolicyAnalysisQuery.identity_selector is specified, the identity in the result will be determined by the selector, and this flag is not allowed to set. If true, the default max expansion per group is 1000 for AssetService.AnalyzeIamPolicy][]. Default is false.
    *     'analysisQuery.options.expandGroups': 'placeholder-value',
    *     // Optional. If true and IamPolicyAnalysisQuery.resource_selector is not specified, the resource section of the result will expand any resource attached to an IAM policy to include resources lower in the resource hierarchy. For example, if the request analyzes for which resources user A has permission P, and the results include an IAM policy with P on a GCP folder, the results will also include resources in that folder with permission P. If true and IamPolicyAnalysisQuery.resource_selector is specified, the resource section of the result will expand the specified resource to include resources lower in the resource hierarchy. Only project or lower resources are supported. Folder and organization resource cannot be used together with this option. For example, if the request analyzes for which users have permission P on a GCP project with this option enabled, the results will include all users who have permission P on that project or any lower resource. If true, the default max expansion per resource is 1000 for AssetService.AnalyzeIamPolicy][] and 100000 for AssetService.AnalyzeIamPolicyLongrunning][]. Default is false.
    *     'analysisQuery.options.expandResources': 'placeholder-value',
    *     // Optional. If true, the access section of result will expand any roles appearing in IAM policy bindings to include their permissions. If IamPolicyAnalysisQuery.access_selector is specified, the access section of the result will be determined by the selector, and this flag is not allowed to set. Default is false.
    *     'analysisQuery.options.expandRoles': 'placeholder-value',
    *     // Optional. If true, the result will output the relevant membership relationships between groups and other groups, and between groups and principals. Default is false.
    *     'analysisQuery.options.outputGroupEdges': 'placeholder-value',
    *     // Optional. If true, the result will output the relevant parent/child relationships between resources. Default is false.
    *     'analysisQuery.options.outputResourceEdges': 'placeholder-value',
    *     // Required. The [full resource name] (https://cloud.google.com/asset-inventory/docs/resource-name-format) of a resource of [supported resource types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#analyzable_asset_types).
    *     'analysisQuery.resourceSelector.fullResourceName': 'placeholder-value',
    *     // Optional. Amount of time executable has to complete. See JSON representation of [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json). If this field is set with a value less than the RPC deadline, and the execution of your query hasn't finished in the specified execution timeout, you will get a response with partial result. Otherwise, your query's execution will continue until the RPC deadline. If it's not finished until then, you will get a DEADLINE_EXCEEDED error. Default is empty.
    *     executionTimeout: 'placeholder-value',
    *     // Optional. The name of a saved query, which must be in the format of: * projects/project_number/savedQueries/saved_query_id * folders/folder_number/savedQueries/saved_query_id * organizations/organization_number/savedQueries/saved_query_id If both `analysis_query` and `saved_analysis_query` are provided, they will be merged together with the `saved_analysis_query` as base and the `analysis_query` as overrides. For more details of the merge behavior, please refer to the [MergeFrom](https://developers.google.com/protocol-buffers/docs/reference/cpp/google.protobuf.message#Message.MergeFrom.details) page. Note that you cannot override primitive fields with default value, such as 0 or empty string, etc., because we use proto3, which doesn't support field presence yet.
    *     savedAnalysisQuery: 'placeholder-value',
    *     // Required. The relative name of the root asset. Only resources and IAM policies within the scope will be analyzed. This can only be an organization number (such as "organizations/123"), a folder number (such as "folders/123"), a project ID (such as "projects/my-project-id"), or a project number (such as "projects/12345"). To know how to get organization id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id). To know how to get folder or project id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
    *     scope: '[^/]+/[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "fullyExplored": false,
    *   //   "mainAnalysis": {},
    *   //   "serviceAccountImpersonationAnalysis": []
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
  def analyzeIamPolicy(params: ParamsResourceV1Analyzeiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def analyzeIamPolicy(
    params: ParamsResourceV1Analyzeiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def analyzeIamPolicyLongrunning(): GaxiosPromise[SchemaOperation] = js.native
  def analyzeIamPolicyLongrunning(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def analyzeIamPolicyLongrunning(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def analyzeIamPolicyLongrunning(params: ParamsResourceV1Analyzeiampolicylongrunning): GaxiosPromise[SchemaOperation] = js.native
  def analyzeIamPolicyLongrunning(
    params: ParamsResourceV1Analyzeiampolicylongrunning,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def analyzeIamPolicyLongrunning(
    params: ParamsResourceV1Analyzeiampolicylongrunning,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def analyzeIamPolicyLongrunning(params: ParamsResourceV1Analyzeiampolicylongrunning, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def analyzeIamPolicyLongrunning(
    params: ParamsResourceV1Analyzeiampolicylongrunning,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Analyzes IAM policies asynchronously to answer which identities have what accesses on which resources, and writes the analysis results to a Google Cloud Storage or a BigQuery destination. For Cloud Storage destination, the output format is the JSON format that represents a AnalyzeIamPolicyResponse. This method implements the google.longrunning.Operation, which allows you to track the operation status. We recommend intervals of at least 2 seconds with exponential backoff retry to poll the operation result. The metadata contains the metadata for the long-running operation.
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
    *   const res = await cloudasset.analyzeIamPolicyLongrunning({
    *     // Required. The relative name of the root asset. Only resources and IAM policies within the scope will be analyzed. This can only be an organization number (such as "organizations/123"), a folder number (such as "folders/123"), a project ID (such as "projects/my-project-id"), or a project number (such as "projects/12345"). To know how to get organization id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id). To know how to get folder or project id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
    *     scope: '[^/]+/[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "analysisQuery": {},
    *       //   "outputConfig": {},
    *       //   "savedAnalysisQuery": "my_savedAnalysisQuery"
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
  def analyzeIamPolicyLongrunning(params: ParamsResourceV1Analyzeiampolicylongrunning, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def analyzeIamPolicyLongrunning(
    params: ParamsResourceV1Analyzeiampolicylongrunning,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def analyzeMove(): GaxiosPromise[SchemaAnalyzeMoveResponse] = js.native
  def analyzeMove(callback: BodyResponseCallback[SchemaAnalyzeMoveResponse]): Unit = js.native
  def analyzeMove(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnalyzeMoveResponse] = js.native
  def analyzeMove(params: ParamsResourceV1Analyzemove): GaxiosPromise[SchemaAnalyzeMoveResponse] = js.native
  def analyzeMove(params: ParamsResourceV1Analyzemove, callback: BodyResponseCallback[SchemaAnalyzeMoveResponse]): Unit = js.native
  def analyzeMove(
    params: ParamsResourceV1Analyzemove,
    options: BodyResponseCallback[Readable | SchemaAnalyzeMoveResponse],
    callback: BodyResponseCallback[Readable | SchemaAnalyzeMoveResponse]
  ): Unit = js.native
  def analyzeMove(params: ParamsResourceV1Analyzemove, options: MethodOptions): GaxiosPromise[SchemaAnalyzeMoveResponse] = js.native
  def analyzeMove(
    params: ParamsResourceV1Analyzemove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnalyzeMoveResponse]
  ): Unit = js.native
  /**
    * Analyze moving a resource to a specified destination without kicking off the actual move. The analysis is best effort depending on the user's permissions of viewing different hierarchical policies and configurations. The policies and configuration are subject to change before the actual resource migration takes place.
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
    *   const res = await cloudasset.analyzeMove({
    *     // Required. Name of the GCP Folder or Organization to reparent the target resource. The analysis will be performed against hypothetically moving the resource to this specified desitination parent. This can only be a Folder number (such as "folders/123") or an Organization number (such as "organizations/123").
    *     destinationParent: 'placeholder-value',
    *     // Required. Name of the resource to perform the analysis against. Only GCP Project are supported as of today. Hence, this can only be Project ID (such as "projects/my-project-id") or a Project Number (such as "projects/12345").
    *     resource: '[^/]+/[^/]+',
    *     // Analysis view indicating what information should be included in the analysis response. If unspecified, the default view is FULL.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "moveAnalysis": []
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
  def analyzeMove(params: ParamsResourceV1Analyzemove, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def analyzeMove(
    params: ParamsResourceV1Analyzemove,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchGetAssetsHistory(): GaxiosPromise[SchemaBatchGetAssetsHistoryResponse] = js.native
  def batchGetAssetsHistory(callback: BodyResponseCallback[SchemaBatchGetAssetsHistoryResponse]): Unit = js.native
  def batchGetAssetsHistory(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchGetAssetsHistoryResponse] = js.native
  def batchGetAssetsHistory(params: ParamsResourceV1Batchgetassetshistory): GaxiosPromise[SchemaBatchGetAssetsHistoryResponse] = js.native
  def batchGetAssetsHistory(
    params: ParamsResourceV1Batchgetassetshistory,
    callback: BodyResponseCallback[SchemaBatchGetAssetsHistoryResponse]
  ): Unit = js.native
  def batchGetAssetsHistory(
    params: ParamsResourceV1Batchgetassetshistory,
    options: BodyResponseCallback[Readable | SchemaBatchGetAssetsHistoryResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchGetAssetsHistoryResponse]
  ): Unit = js.native
  def batchGetAssetsHistory(params: ParamsResourceV1Batchgetassetshistory, options: MethodOptions): GaxiosPromise[SchemaBatchGetAssetsHistoryResponse] = js.native
  def batchGetAssetsHistory(
    params: ParamsResourceV1Batchgetassetshistory,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchGetAssetsHistoryResponse]
  ): Unit = js.native
  /**
    * Batch gets the update history of assets that overlap a time window. For IAM_POLICY content, this API outputs history when the asset and its attached IAM POLICY both exist. This can create gaps in the output history. Otherwise, this API outputs history with asset in both non-delete or deleted status. If a specified asset does not exist, this API returns an INVALID_ARGUMENT error.
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
    *   const res = await cloudasset.batchGetAssetsHistory({
    *     // A list of the full names of the assets. See: https://cloud.google.com/asset-inventory/docs/resource-name-format Example: `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. The request becomes a no-op if the asset name list is empty, and the max size of the asset name list is 100 in one request.
    *     assetNames: 'placeholder-value',
    *     // Optional. The content type.
    *     contentType: 'placeholder-value',
    *     // Required. The relative name of the root asset. It can only be an organization number (such as "organizations/123"), a project ID (such as "projects/my-project-id")", or a project number (such as "projects/12345").
    *     parent: '[^/]+/[^/]+',
    *     // End time of the time window (inclusive). If not specified, the current timestamp is used instead.
    *     'readTimeWindow.endTime': 'placeholder-value',
    *     // Start time of the time window (exclusive).
    *     'readTimeWindow.startTime': 'placeholder-value',
    *     // Optional. A list of relationship types to output, for example: `INSTANCE_TO_INSTANCEGROUP`. This field should only be specified if content_type=RELATIONSHIP. * If specified: it outputs specified relationships' history on the [asset_names]. It returns an error if any of the [relationship_types] doesn't belong to the supported relationship types of the [asset_names] or if any of the [asset_names]'s types doesn't belong to the source types of the [relationship_types]. * Otherwise: it outputs the supported relationships' history on the [asset_names] or returns an error if any of the [asset_names]'s types has no relationship support. See [Introduction to Cloud Asset Inventory](https://cloud.google.com/asset-inventory/docs/overview) for all supported asset types and relationship types.
    *     relationshipTypes: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assets": []
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
  def batchGetAssetsHistory(params: ParamsResourceV1Batchgetassetshistory, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchGetAssetsHistory(
    params: ParamsResourceV1Batchgetassetshistory,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def exportAssets(): GaxiosPromise[SchemaOperation] = js.native
  def exportAssets(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def exportAssets(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def exportAssets(params: ParamsResourceV1Exportassets): GaxiosPromise[SchemaOperation] = js.native
  def exportAssets(params: ParamsResourceV1Exportassets, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def exportAssets(
    params: ParamsResourceV1Exportassets,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def exportAssets(params: ParamsResourceV1Exportassets, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def exportAssets(
    params: ParamsResourceV1Exportassets,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Exports assets with time and resource types to a given Cloud Storage location/BigQuery table. For Cloud Storage location destinations, the output format is newline-delimited JSON. Each line represents a google.cloud.asset.v1.Asset in the JSON format; for BigQuery table destinations, the output table stores the fields in asset Protobuf as columns. This API implements the google.longrunning.Operation API, which allows you to keep track of the export. We recommend intervals of at least 2 seconds with exponential retry to poll the export operation result. For regular-size resource parent, the export operation usually finishes within 5 minutes.
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
    *   const res = await cloudasset.exportAssets({
    *     // Required. The relative name of the root asset. This can only be an organization number (such as "organizations/123"), a project ID (such as "projects/my-project-id"), or a project number (such as "projects/12345"), or a folder number (such as "folders/123").
    *     parent: '[^/]+/[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "assetTypes": [],
    *       //   "contentType": "my_contentType",
    *       //   "outputConfig": {},
    *       //   "readTime": "my_readTime",
    *       //   "relationshipTypes": []
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
  def exportAssets(params: ParamsResourceV1Exportassets, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def exportAssets(
    params: ParamsResourceV1Exportassets,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def searchAllIamPolicies(): GaxiosPromise[SchemaSearchAllIamPoliciesResponse] = js.native
  def searchAllIamPolicies(callback: BodyResponseCallback[SchemaSearchAllIamPoliciesResponse]): Unit = js.native
  def searchAllIamPolicies(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchAllIamPoliciesResponse] = js.native
  def searchAllIamPolicies(params: ParamsResourceV1Searchalliampolicies): GaxiosPromise[SchemaSearchAllIamPoliciesResponse] = js.native
  def searchAllIamPolicies(
    params: ParamsResourceV1Searchalliampolicies,
    callback: BodyResponseCallback[SchemaSearchAllIamPoliciesResponse]
  ): Unit = js.native
  def searchAllIamPolicies(
    params: ParamsResourceV1Searchalliampolicies,
    options: BodyResponseCallback[Readable | SchemaSearchAllIamPoliciesResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchAllIamPoliciesResponse]
  ): Unit = js.native
  def searchAllIamPolicies(params: ParamsResourceV1Searchalliampolicies, options: MethodOptions): GaxiosPromise[SchemaSearchAllIamPoliciesResponse] = js.native
  def searchAllIamPolicies(
    params: ParamsResourceV1Searchalliampolicies,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchAllIamPoliciesResponse]
  ): Unit = js.native
  /**
    * Searches all IAM policies within the specified scope, such as a project, folder, or organization. The caller must be granted the `cloudasset.assets.searchAllIamPolicies` permission on the desired scope, otherwise the request will be rejected.
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
    *   const res = await cloudasset.searchAllIamPolicies({
    *     // Optional. A list of asset types that the IAM policies are attached to. If empty, it will search the IAM policies that are attached to all the [searchable asset types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types). Regular expressions are also supported. For example: * "compute.googleapis.com.*" snapshots IAM policies attached to asset type starts with "compute.googleapis.com". * ".*Instance" snapshots IAM policies attached to asset type ends with "Instance". * ".*Instance.*" snapshots IAM policies attached to asset type contains "Instance". See [RE2](https://github.com/google/re2/wiki/Syntax) for all supported regular expression syntax. If the regular expression does not match any supported asset type, an INVALID_ARGUMENT error will be returned.
    *     assetTypes: 'placeholder-value',
    *     // Optional. A comma-separated list of fields specifying the sorting order of the results. The default order is ascending. Add " DESC" after the field name to indicate descending order. Redundant space characters are ignored. Example: "assetType DESC, resource". Only singular primitive fields in the response are sortable: * resource * assetType * project All the other fields such as repeated fields (e.g., `folders`) and non-primitive fields (e.g., `policy`) are not supported.
    *     orderBy: 'placeholder-value',
    *     // Optional. The page size for search result pagination. Page size is capped at 500 even if a larger value is given. If set to zero, server will pick an appropriate default. Returned results may be fewer than requested. When this happens, there could be more results as long as `next_page_token` is returned.
    *     pageSize: 'placeholder-value',
    *     // Optional. If present, retrieve the next batch of results from the preceding call to this method. `page_token` must be the value of `next_page_token` from the previous response. The values of all other method parameters must be identical to those in the previous call.
    *     pageToken: 'placeholder-value',
    *     // Optional. The query statement. See [how to construct a query](https://cloud.google.com/asset-inventory/docs/searching-iam-policies#how_to_construct_a_query) for more information. If not specified or empty, it will search all the IAM policies within the specified `scope`. Note that the query string is compared against each Cloud IAM policy binding, including its principals, roles, and Cloud IAM conditions. The returned Cloud IAM policies will only contain the bindings that match your query. To learn more about the IAM policy structure, see the [IAM policy documentation](https://cloud.google.com/iam/help/allow-policies/structure). Examples: * `policy:amy@gmail.com` to find IAM policy bindings that specify user "amy@gmail.com". * `policy:roles/compute.admin` to find IAM policy bindings that specify the Compute Admin role. * `policy:comp*` to find IAM policy bindings that contain "comp" as a prefix of any word in the binding. * `policy.role.permissions:storage.buckets.update` to find IAM policy bindings that specify a role containing "storage.buckets.update" permission. Note that if callers don't have `iam.roles.get` access to a role's included permissions, policy bindings that specify this role will be dropped from the search results. * `policy.role.permissions:upd*` to find IAM policy bindings that specify a role containing "upd" as a prefix of any word in the role permission. Note that if callers don't have `iam.roles.get` access to a role's included permissions, policy bindings that specify this role will be dropped from the search results. * `resource:organizations/123456` to find IAM policy bindings that are set on "organizations/123456". * `resource=//cloudresourcemanager.googleapis.com/projects/myproject` to find IAM policy bindings that are set on the project named "myproject". * `Important` to find IAM policy bindings that contain "Important" as a word in any of the searchable fields (except for the included permissions). * `resource:(instance1 OR instance2) policy:amy` to find IAM policy bindings that are set on resources "instance1" or "instance2" and also specify user "amy". * `roles:roles/compute.admin` to find IAM policy bindings that specify the Compute Admin role. * `memberTypes:user` to find IAM policy bindings that contain the principal type "user".
    *     query: 'placeholder-value',
    *     // Required. A scope can be a project, a folder, or an organization. The search is limited to the IAM policies within the `scope`. The caller must be granted the [`cloudasset.assets.searchAllIamPolicies`](https://cloud.google.com/asset-inventory/docs/access-control#required_permissions) permission on the desired scope. The allowed values are: * projects/{PROJECT_ID\} (e.g., "projects/foo-bar") * projects/{PROJECT_NUMBER\} (e.g., "projects/12345678") * folders/{FOLDER_NUMBER\} (e.g., "folders/1234567") * organizations/{ORGANIZATION_NUMBER\} (e.g., "organizations/123456")
    *     scope: '[^/]+/[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "results": []
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
  def searchAllIamPolicies(params: ParamsResourceV1Searchalliampolicies, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def searchAllIamPolicies(
    params: ParamsResourceV1Searchalliampolicies,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def searchAllResources(): GaxiosPromise[SchemaSearchAllResourcesResponse] = js.native
  def searchAllResources(callback: BodyResponseCallback[SchemaSearchAllResourcesResponse]): Unit = js.native
  def searchAllResources(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchAllResourcesResponse] = js.native
  def searchAllResources(params: ParamsResourceV1Searchallresources): GaxiosPromise[SchemaSearchAllResourcesResponse] = js.native
  def searchAllResources(
    params: ParamsResourceV1Searchallresources,
    callback: BodyResponseCallback[SchemaSearchAllResourcesResponse]
  ): Unit = js.native
  def searchAllResources(
    params: ParamsResourceV1Searchallresources,
    options: BodyResponseCallback[Readable | SchemaSearchAllResourcesResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchAllResourcesResponse]
  ): Unit = js.native
  def searchAllResources(params: ParamsResourceV1Searchallresources, options: MethodOptions): GaxiosPromise[SchemaSearchAllResourcesResponse] = js.native
  def searchAllResources(
    params: ParamsResourceV1Searchallresources,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchAllResourcesResponse]
  ): Unit = js.native
  /**
    * Searches all Cloud resources within the specified scope, such as a project, folder, or organization. The caller must be granted the `cloudasset.assets.searchAllResources` permission on the desired scope, otherwise the request will be rejected.
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
    *   const res = await cloudasset.searchAllResources({
    *     // Optional. A list of asset types that this request searches for. If empty, it will search all the [searchable asset types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types). Regular expressions are also supported. For example: * "compute.googleapis.com.*" snapshots resources whose asset type starts with "compute.googleapis.com". * ".*Instance" snapshots resources whose asset type ends with "Instance". * ".*Instance.*" snapshots resources whose asset type contains "Instance". See [RE2](https://github.com/google/re2/wiki/Syntax) for all supported regular expression syntax. If the regular expression does not match any supported asset type, an INVALID_ARGUMENT error will be returned.
    *     assetTypes: 'placeholder-value',
    *     // Optional. A comma-separated list of fields specifying the sorting order of the results. The default order is ascending. Add " DESC" after the field name to indicate descending order. Redundant space characters are ignored. Example: "location DESC, name". Only singular primitive fields in the response are sortable: * name * assetType * project * displayName * description * location * kmsKey * createTime * updateTime * state * parentFullResourceName * parentAssetType All the other fields such as repeated fields (e.g., `networkTags`), map fields (e.g., `labels`) and struct fields (e.g., `additionalAttributes`) are not supported.
    *     orderBy: 'placeholder-value',
    *     // Optional. The page size for search result pagination. Page size is capped at 500 even if a larger value is given. If set to zero, server will pick an appropriate default. Returned results may be fewer than requested. When this happens, there could be more results as long as `next_page_token` is returned.
    *     pageSize: 'placeholder-value',
    *     // Optional. If present, then retrieve the next batch of results from the preceding call to this method. `page_token` must be the value of `next_page_token` from the previous response. The values of all other method parameters, must be identical to those in the previous call.
    *     pageToken: 'placeholder-value',
    *     // Optional. The query statement. See [how to construct a query](https://cloud.google.com/asset-inventory/docs/searching-resources#how_to_construct_a_query) for more information. If not specified or empty, it will search all the resources within the specified `scope`. Examples: * `name:Important` to find Cloud resources whose name contains "Important" as a word. * `name=Important` to find the Cloud resource whose name is exactly "Important". * `displayName:Impor*` to find Cloud resources whose display name contains "Impor" as a prefix of any word in the field. * `location:us-west*` to find Cloud resources whose location contains both "us" and "west" as prefixes. * `labels:prod` to find Cloud resources whose labels contain "prod" as a key or value. * `labels.env:prod` to find Cloud resources that have a label "env" and its value is "prod". * `labels.env:*` to find Cloud resources that have a label "env". * `kmsKey:key` to find Cloud resources encrypted with a customer-managed encryption key whose name contains the word "key". * `relationships:instance-group-1` to find Cloud resources that have relationships with "instance-group-1" in the related resource name. * `relationships:INSTANCE_TO_INSTANCEGROUP` to find compute instances that have relationships of type "INSTANCE_TO_INSTANCEGROUP". * `relationships.INSTANCE_TO_INSTANCEGROUP:instance-group-1` to find compute instances that have relationships with "instance-group-1" in the compute instance group resource name, for relationship type "INSTANCE_TO_INSTANCEGROUP". * `state:ACTIVE` to find Cloud resources whose state contains "ACTIVE" as a word. * `NOT state:ACTIVE` to find Cloud resources whose state doesn't contain "ACTIVE" as a word. * `createTime<1609459200` to find Cloud resources that were created before "2021-01-01 00:00:00 UTC". 1609459200 is the epoch timestamp of "2021-01-01 00:00:00 UTC" in seconds. * `updateTime\>1609459200` to find Cloud resources that were updated after "2021-01-01 00:00:00 UTC". 1609459200 is the epoch timestamp of "2021-01-01 00:00:00 UTC" in seconds. * `Important` to find Cloud resources that contain "Important" as a word in any of the searchable fields. * `Impor*` to find Cloud resources that contain "Impor" as a prefix of any word in any of the searchable fields. * `Important location:(us-west1 OR global)` to find Cloud resources that contain "Important" as a word in any of the searchable fields and are also located in the "us-west1" region or the "global" location.
    *     query: 'placeholder-value',
    *     // Optional. A comma-separated list of fields specifying which fields to be returned in ResourceSearchResult. Only '*' or combination of top level fields can be specified. Field names of both snake_case and camelCase are supported. Examples: `"*"`, `"name,location"`, `"name,versionedResources"`. The read_mask paths must be valid field paths listed but not limited to (both snake_case and camelCase are supported): * name * assetType * project * displayName * description * location * tagKeys * tagValues * tagValueIds * labels * networkTags * kmsKey * createTime * updateTime * state * additionalAttributes * versionedResources If read_mask is not specified, all fields except versionedResources will be returned. If only '*' is specified, all fields including versionedResources will be returned. Any invalid field path will trigger INVALID_ARGUMENT error.
    *     readMask: 'placeholder-value',
    *     // Required. A scope can be a project, a folder, or an organization. The search is limited to the resources within the `scope`. The caller must be granted the [`cloudasset.assets.searchAllResources`](https://cloud.google.com/asset-inventory/docs/access-control#required_permissions) permission on the desired scope. The allowed values are: * projects/{PROJECT_ID\} (e.g., "projects/foo-bar") * projects/{PROJECT_NUMBER\} (e.g., "projects/12345678") * folders/{FOLDER_NUMBER\} (e.g., "folders/1234567") * organizations/{ORGANIZATION_NUMBER\} (e.g., "organizations/123456")
    *     scope: '[^/]+/[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "results": []
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
  def searchAllResources(params: ParamsResourceV1Searchallresources, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def searchAllResources(
    params: ParamsResourceV1Searchallresources,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
