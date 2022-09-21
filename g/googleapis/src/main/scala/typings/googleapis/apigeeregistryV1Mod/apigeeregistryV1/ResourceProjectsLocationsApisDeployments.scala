package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/apigeeregistry/v1", "apigeeregistry_v1.Resource$Projects$Locations$Apis$Deployments")
@js.native
open class ResourceProjectsLocationsApisDeployments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var artifacts: ResourceProjectsLocationsApisDeploymentsArtifacts = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaApiDeployment] = js.native
  def create(callback: BodyResponseCallback[SchemaApiDeployment]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApiDeployment] = js.native
  def create(params: ParamsResourceProjectsLocationsApisDeploymentsCreate): GaxiosPromise[SchemaApiDeployment] = js.native
  def create(
    params: ParamsResourceProjectsLocationsApisDeploymentsCreate,
    callback: BodyResponseCallback[SchemaApiDeployment]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsApisDeploymentsCreate,
    options: BodyResponseCallback[Readable | SchemaApiDeployment],
    callback: BodyResponseCallback[Readable | SchemaApiDeployment]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsApisDeploymentsCreate, options: MethodOptions): GaxiosPromise[SchemaApiDeployment] = js.native
  def create(
    params: ParamsResourceProjectsLocationsApisDeploymentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApiDeployment]
  ): Unit = js.native
  /**
    * CreateApiDeployment creates a specified deployment.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigeeregistry.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigeeregistry = google.apigeeregistry('v1');
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
    *   const res = await apigeeregistry.projects.locations.apis.deployments.create({
    *     // Required. The ID to use for the deployment, which will become the final component of the deployment's resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID.
    *     apiDeploymentId: 'placeholder-value',
    *     // Required. The parent, which owns this collection of deployments. Format: projects/x/locations/x/apis/x
    *     parent: 'projects/my-project/locations/my-location/apis/my-api',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accessGuidance": "my_accessGuidance",
    *       //   "annotations": {},
    *       //   "apiSpecRevision": "my_apiSpecRevision",
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "endpointUri": "my_endpointUri",
    *       //   "externalChannelUri": "my_externalChannelUri",
    *       //   "intendedAudience": "my_intendedAudience",
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "revisionCreateTime": "my_revisionCreateTime",
    *       //   "revisionId": "my_revisionId",
    *       //   "revisionUpdateTime": "my_revisionUpdateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessGuidance": "my_accessGuidance",
    *   //   "annotations": {},
    *   //   "apiSpecRevision": "my_apiSpecRevision",
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "endpointUri": "my_endpointUri",
    *   //   "externalChannelUri": "my_externalChannelUri",
    *   //   "intendedAudience": "my_intendedAudience",
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionId": "my_revisionId",
    *   //   "revisionUpdateTime": "my_revisionUpdateTime"
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
  def create(params: ParamsResourceProjectsLocationsApisDeploymentsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsApisDeploymentsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsApisDeploymentsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsApisDeploymentsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsApisDeploymentsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsApisDeploymentsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsApisDeploymentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * DeleteApiDeployment removes a specified deployment, all revisions, and all child resources (e.g. artifacts).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigeeregistry.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigeeregistry = google.apigeeregistry('v1');
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
    *   const res = await apigeeregistry.projects.locations.apis.deployments.delete({
    *     // If set to true, any child resources will also be deleted. (Otherwise, the request will only work if there are no child resources.)
    *     force: 'placeholder-value',
    *     // Required. The name of the deployment to delete. Format: projects/x/locations/x/apis/x/deployments/x
    *     name: 'projects/my-project/locations/my-location/apis/my-api/deployments/my-deployment',
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
  def delete(params: ParamsResourceProjectsLocationsApisDeploymentsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsApisDeploymentsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def deleteRevision(): GaxiosPromise[SchemaApiDeployment] = js.native
  def deleteRevision(callback: BodyResponseCallback[SchemaApiDeployment]): Unit = js.native
  def deleteRevision(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApiDeployment] = js.native
  def deleteRevision(params: ParamsResourceProjectsLocationsApisDeploymentsDeleterevision): GaxiosPromise[SchemaApiDeployment] = js.native
  def deleteRevision(
    params: ParamsResourceProjectsLocationsApisDeploymentsDeleterevision,
    callback: BodyResponseCallback[SchemaApiDeployment]
  ): Unit = js.native
  def deleteRevision(
    params: ParamsResourceProjectsLocationsApisDeploymentsDeleterevision,
    options: BodyResponseCallback[Readable | SchemaApiDeployment],
    callback: BodyResponseCallback[Readable | SchemaApiDeployment]
  ): Unit = js.native
  def deleteRevision(params: ParamsResourceProjectsLocationsApisDeploymentsDeleterevision, options: MethodOptions): GaxiosPromise[SchemaApiDeployment] = js.native
  def deleteRevision(
    params: ParamsResourceProjectsLocationsApisDeploymentsDeleterevision,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApiDeployment]
  ): Unit = js.native
  /**
    * DeleteApiDeploymentRevision deletes a revision of a deployment.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigeeregistry.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigeeregistry = google.apigeeregistry('v1');
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
    *   const res =
    *     await apigeeregistry.projects.locations.apis.deployments.deleteRevision({
    *       // Required. The name of the deployment revision to be deleted, with a revision ID explicitly included. Example: projects/sample/locations/global/apis/petstore/deployments/prod@c7cfa2a8
    *       name: 'projects/my-project/locations/my-location/apis/my-api/deployments/my-deployment',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessGuidance": "my_accessGuidance",
    *   //   "annotations": {},
    *   //   "apiSpecRevision": "my_apiSpecRevision",
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "endpointUri": "my_endpointUri",
    *   //   "externalChannelUri": "my_externalChannelUri",
    *   //   "intendedAudience": "my_intendedAudience",
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionId": "my_revisionId",
    *   //   "revisionUpdateTime": "my_revisionUpdateTime"
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
  def deleteRevision(params: ParamsResourceProjectsLocationsApisDeploymentsDeleterevision, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deleteRevision(
    params: ParamsResourceProjectsLocationsApisDeploymentsDeleterevision,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaApiDeployment] = js.native
  def get(callback: BodyResponseCallback[SchemaApiDeployment]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApiDeployment] = js.native
  def get(params: ParamsResourceProjectsLocationsApisDeploymentsGet): GaxiosPromise[SchemaApiDeployment] = js.native
  def get(
    params: ParamsResourceProjectsLocationsApisDeploymentsGet,
    callback: BodyResponseCallback[SchemaApiDeployment]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsApisDeploymentsGet,
    options: BodyResponseCallback[Readable | SchemaApiDeployment],
    callback: BodyResponseCallback[Readable | SchemaApiDeployment]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsApisDeploymentsGet, options: MethodOptions): GaxiosPromise[SchemaApiDeployment] = js.native
  def get(
    params: ParamsResourceProjectsLocationsApisDeploymentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApiDeployment]
  ): Unit = js.native
  /**
    * GetApiDeployment returns a specified deployment.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigeeregistry.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigeeregistry = google.apigeeregistry('v1');
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
    *   const res = await apigeeregistry.projects.locations.apis.deployments.get({
    *     // Required. The name of the deployment to retrieve. Format: projects/x/locations/x/apis/x/deployments/x
    *     name: 'projects/my-project/locations/my-location/apis/my-api/deployments/my-deployment',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessGuidance": "my_accessGuidance",
    *   //   "annotations": {},
    *   //   "apiSpecRevision": "my_apiSpecRevision",
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "endpointUri": "my_endpointUri",
    *   //   "externalChannelUri": "my_externalChannelUri",
    *   //   "intendedAudience": "my_intendedAudience",
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionId": "my_revisionId",
    *   //   "revisionUpdateTime": "my_revisionUpdateTime"
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
  def get(params: ParamsResourceProjectsLocationsApisDeploymentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsApisDeploymentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsApisDeploymentsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsApisDeploymentsGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsApisDeploymentsGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsApisDeploymentsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsApisDeploymentsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigeeregistry.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigeeregistry = google.apigeeregistry('v1');
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
    *   const res =
    *     await apigeeregistry.projects.locations.apis.deployments.getIamPolicy({
    *       // Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
    *       'options.requestedPolicyVersion': 'placeholder-value',
    *       // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/apis/my-api/deployments/my-deployment',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
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
  def getIamPolicy(params: ParamsResourceProjectsLocationsApisDeploymentsGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsApisDeploymentsGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListApiDeploymentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListApiDeploymentsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListApiDeploymentsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsApisDeploymentsList): GaxiosPromise[SchemaListApiDeploymentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsApisDeploymentsList,
    callback: BodyResponseCallback[SchemaListApiDeploymentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsApisDeploymentsList,
    options: BodyResponseCallback[Readable | SchemaListApiDeploymentsResponse],
    callback: BodyResponseCallback[Readable | SchemaListApiDeploymentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsApisDeploymentsList, options: MethodOptions): GaxiosPromise[SchemaListApiDeploymentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsApisDeploymentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListApiDeploymentsResponse]
  ): Unit = js.native
  /**
    * ListApiDeployments returns matching deployments.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigeeregistry.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigeeregistry = google.apigeeregistry('v1');
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
    *   const res = await apigeeregistry.projects.locations.apis.deployments.list({
    *     // An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields.
    *     filter: 'placeholder-value',
    *     // The maximum number of deployments to return. The service may return fewer than this value. If unspecified, at most 50 values will be returned. The maximum is 1000; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListApiDeployments` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListApiDeployments` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent, which owns this collection of deployments. Format: projects/x/locations/x/apis/x
    *     parent: 'projects/my-project/locations/my-location/apis/my-api',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiDeployments": [],
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
  def list(params: ParamsResourceProjectsLocationsApisDeploymentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsApisDeploymentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listRevisions(): GaxiosPromise[SchemaListApiDeploymentRevisionsResponse] = js.native
  def listRevisions(callback: BodyResponseCallback[SchemaListApiDeploymentRevisionsResponse]): Unit = js.native
  def listRevisions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListApiDeploymentRevisionsResponse] = js.native
  def listRevisions(params: ParamsResourceProjectsLocationsApisDeploymentsListrevisions): GaxiosPromise[SchemaListApiDeploymentRevisionsResponse] = js.native
  def listRevisions(
    params: ParamsResourceProjectsLocationsApisDeploymentsListrevisions,
    callback: BodyResponseCallback[SchemaListApiDeploymentRevisionsResponse]
  ): Unit = js.native
  def listRevisions(
    params: ParamsResourceProjectsLocationsApisDeploymentsListrevisions,
    options: BodyResponseCallback[Readable | SchemaListApiDeploymentRevisionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListApiDeploymentRevisionsResponse]
  ): Unit = js.native
  def listRevisions(params: ParamsResourceProjectsLocationsApisDeploymentsListrevisions, options: MethodOptions): GaxiosPromise[SchemaListApiDeploymentRevisionsResponse] = js.native
  def listRevisions(
    params: ParamsResourceProjectsLocationsApisDeploymentsListrevisions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListApiDeploymentRevisionsResponse]
  ): Unit = js.native
  /**
    * ListApiDeploymentRevisions lists all revisions of a deployment. Revisions are returned in descending order of revision creation time.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigeeregistry.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigeeregistry = google.apigeeregistry('v1');
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
    *   const res =
    *     await apigeeregistry.projects.locations.apis.deployments.listRevisions({
    *       // Required. The name of the deployment to list revisions for.
    *       name: 'projects/my-project/locations/my-location/apis/my-api/deployments/my-deployment',
    *       // The maximum number of revisions to return per page.
    *       pageSize: 'placeholder-value',
    *       // The page token, received from a previous ListApiDeploymentRevisions call. Provide this to retrieve the subsequent page.
    *       pageToken: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiDeployments": [],
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
  def listRevisions(params: ParamsResourceProjectsLocationsApisDeploymentsListrevisions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listRevisions(
    params: ParamsResourceProjectsLocationsApisDeploymentsListrevisions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaApiDeployment] = js.native
  def patch(callback: BodyResponseCallback[SchemaApiDeployment]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApiDeployment] = js.native
  def patch(params: ParamsResourceProjectsLocationsApisDeploymentsPatch): GaxiosPromise[SchemaApiDeployment] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsApisDeploymentsPatch,
    callback: BodyResponseCallback[SchemaApiDeployment]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsApisDeploymentsPatch,
    options: BodyResponseCallback[Readable | SchemaApiDeployment],
    callback: BodyResponseCallback[Readable | SchemaApiDeployment]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsApisDeploymentsPatch, options: MethodOptions): GaxiosPromise[SchemaApiDeployment] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsApisDeploymentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApiDeployment]
  ): Unit = js.native
  /**
    * UpdateApiDeployment can be used to modify a specified deployment.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigeeregistry.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigeeregistry = google.apigeeregistry('v1');
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
    *   const res = await apigeeregistry.projects.locations.apis.deployments.patch({
    *     // If set to true, and the deployment is not found, a new deployment will be created. In this situation, `update_mask` is ignored.
    *     allowMissing: 'placeholder-value',
    *     // Resource name.
    *     name: 'projects/my-project/locations/my-location/apis/my-api/deployments/my-deployment',
    *     // The list of fields to be updated. If omitted, all fields are updated that are set in the request message (fields set to default values are ignored). If a "*" is specified, all fields are updated, including fields that are unspecified/default in the request.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accessGuidance": "my_accessGuidance",
    *       //   "annotations": {},
    *       //   "apiSpecRevision": "my_apiSpecRevision",
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "endpointUri": "my_endpointUri",
    *       //   "externalChannelUri": "my_externalChannelUri",
    *       //   "intendedAudience": "my_intendedAudience",
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "revisionCreateTime": "my_revisionCreateTime",
    *       //   "revisionId": "my_revisionId",
    *       //   "revisionUpdateTime": "my_revisionUpdateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessGuidance": "my_accessGuidance",
    *   //   "annotations": {},
    *   //   "apiSpecRevision": "my_apiSpecRevision",
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "endpointUri": "my_endpointUri",
    *   //   "externalChannelUri": "my_externalChannelUri",
    *   //   "intendedAudience": "my_intendedAudience",
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionId": "my_revisionId",
    *   //   "revisionUpdateTime": "my_revisionUpdateTime"
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
  def patch(params: ParamsResourceProjectsLocationsApisDeploymentsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsApisDeploymentsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def rollback(): GaxiosPromise[SchemaApiDeployment] = js.native
  def rollback(callback: BodyResponseCallback[SchemaApiDeployment]): Unit = js.native
  def rollback(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApiDeployment] = js.native
  def rollback(params: ParamsResourceProjectsLocationsApisDeploymentsRollback): GaxiosPromise[SchemaApiDeployment] = js.native
  def rollback(
    params: ParamsResourceProjectsLocationsApisDeploymentsRollback,
    callback: BodyResponseCallback[SchemaApiDeployment]
  ): Unit = js.native
  def rollback(
    params: ParamsResourceProjectsLocationsApisDeploymentsRollback,
    options: BodyResponseCallback[Readable | SchemaApiDeployment],
    callback: BodyResponseCallback[Readable | SchemaApiDeployment]
  ): Unit = js.native
  def rollback(params: ParamsResourceProjectsLocationsApisDeploymentsRollback, options: MethodOptions): GaxiosPromise[SchemaApiDeployment] = js.native
  def rollback(
    params: ParamsResourceProjectsLocationsApisDeploymentsRollback,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApiDeployment]
  ): Unit = js.native
  /**
    * RollbackApiDeployment sets the current revision to a specified prior revision. Note that this creates a new revision with a new revision ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigeeregistry.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigeeregistry = google.apigeeregistry('v1');
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
    *   const res = await apigeeregistry.projects.locations.apis.deployments.rollback(
    *     {
    *       // Required. The deployment being rolled back.
    *       name: 'projects/my-project/locations/my-location/apis/my-api/deployments/my-deployment',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "revisionId": "my_revisionId"
    *         // }
    *       },
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessGuidance": "my_accessGuidance",
    *   //   "annotations": {},
    *   //   "apiSpecRevision": "my_apiSpecRevision",
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "endpointUri": "my_endpointUri",
    *   //   "externalChannelUri": "my_externalChannelUri",
    *   //   "intendedAudience": "my_intendedAudience",
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionId": "my_revisionId",
    *   //   "revisionUpdateTime": "my_revisionUpdateTime"
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
  def rollback(params: ParamsResourceProjectsLocationsApisDeploymentsRollback, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def rollback(
    params: ParamsResourceProjectsLocationsApisDeploymentsRollback,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsApisDeploymentsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsApisDeploymentsSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsApisDeploymentsSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsApisDeploymentsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsApisDeploymentsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigeeregistry.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigeeregistry = google.apigeeregistry('v1');
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
    *   const res =
    *     await apigeeregistry.projects.locations.apis.deployments.setIamPolicy({
    *       // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/apis/my-api/deployments/my-deployment',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "policy": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
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
  def setIamPolicy(params: ParamsResourceProjectsLocationsApisDeploymentsSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsApisDeploymentsSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def tagRevision(): GaxiosPromise[SchemaApiDeployment] = js.native
  def tagRevision(callback: BodyResponseCallback[SchemaApiDeployment]): Unit = js.native
  def tagRevision(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApiDeployment] = js.native
  def tagRevision(params: ParamsResourceProjectsLocationsApisDeploymentsTagrevision): GaxiosPromise[SchemaApiDeployment] = js.native
  def tagRevision(
    params: ParamsResourceProjectsLocationsApisDeploymentsTagrevision,
    callback: BodyResponseCallback[SchemaApiDeployment]
  ): Unit = js.native
  def tagRevision(
    params: ParamsResourceProjectsLocationsApisDeploymentsTagrevision,
    options: BodyResponseCallback[Readable | SchemaApiDeployment],
    callback: BodyResponseCallback[Readable | SchemaApiDeployment]
  ): Unit = js.native
  def tagRevision(params: ParamsResourceProjectsLocationsApisDeploymentsTagrevision, options: MethodOptions): GaxiosPromise[SchemaApiDeployment] = js.native
  def tagRevision(
    params: ParamsResourceProjectsLocationsApisDeploymentsTagrevision,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApiDeployment]
  ): Unit = js.native
  /**
    * TagApiDeploymentRevision adds a tag to a specified revision of a deployment.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigeeregistry.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigeeregistry = google.apigeeregistry('v1');
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
    *   const res =
    *     await apigeeregistry.projects.locations.apis.deployments.tagRevision({
    *       // Required. The name of the deployment to be tagged, including the revision ID.
    *       name: 'projects/my-project/locations/my-location/apis/my-api/deployments/my-deployment',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "tag": "my_tag"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessGuidance": "my_accessGuidance",
    *   //   "annotations": {},
    *   //   "apiSpecRevision": "my_apiSpecRevision",
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "endpointUri": "my_endpointUri",
    *   //   "externalChannelUri": "my_externalChannelUri",
    *   //   "intendedAudience": "my_intendedAudience",
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionId": "my_revisionId",
    *   //   "revisionUpdateTime": "my_revisionUpdateTime"
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
  def tagRevision(params: ParamsResourceProjectsLocationsApisDeploymentsTagrevision, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def tagRevision(
    params: ParamsResourceProjectsLocationsApisDeploymentsTagrevision,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsApisDeploymentsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsApisDeploymentsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsApisDeploymentsTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsApisDeploymentsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsApisDeploymentsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigeeregistry.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigeeregistry = google.apigeeregistry('v1');
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
    *   const res =
    *     await apigeeregistry.projects.locations.apis.deployments.testIamPermissions(
    *       {
    *         // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *         resource:
    *           'projects/my-project/locations/my-location/apis/my-api/deployments/my-deployment',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "permissions": []
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "permissions": []
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
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsApisDeploymentsTestiampermissions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsApisDeploymentsTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
