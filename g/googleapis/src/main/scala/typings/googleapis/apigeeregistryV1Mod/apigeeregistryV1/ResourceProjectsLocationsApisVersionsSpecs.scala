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

@JSImport("googleapis/build/src/apis/apigeeregistry/v1", "apigeeregistry_v1.Resource$Projects$Locations$Apis$Versions$Specs")
@js.native
open class ResourceProjectsLocationsApisVersionsSpecs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var artifacts: ResourceProjectsLocationsApisVersionsSpecsArtifacts = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaApiSpec] = js.native
  def create(callback: BodyResponseCallback[SchemaApiSpec]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApiSpec] = js.native
  def create(params: ParamsResourceProjectsLocationsApisVersionsSpecsCreate): GaxiosPromise[SchemaApiSpec] = js.native
  def create(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsCreate,
    callback: BodyResponseCallback[SchemaApiSpec]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsCreate,
    options: BodyResponseCallback[Readable | SchemaApiSpec],
    callback: BodyResponseCallback[Readable | SchemaApiSpec]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsApisVersionsSpecsCreate, options: MethodOptions): GaxiosPromise[SchemaApiSpec] = js.native
  def create(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApiSpec]
  ): Unit = js.native
  /**
    * CreateApiSpec creates a specified spec.
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
    *     await apigeeregistry.projects.locations.apis.versions.specs.create({
    *       // Required. The ID to use for the spec, which will become the final component of the spec's resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID.
    *       apiSpecId: 'placeholder-value',
    *       // Required. The parent, which owns this collection of specs. Format: projects/x/locations/x/apis/x/versions/x
    *       parent:
    *         'projects/my-project/locations/my-location/apis/my-api/versions/my-version',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "annotations": {},
    *         //   "contents": "my_contents",
    *         //   "createTime": "my_createTime",
    *         //   "description": "my_description",
    *         //   "filename": "my_filename",
    *         //   "hash": "my_hash",
    *         //   "labels": {},
    *         //   "mimeType": "my_mimeType",
    *         //   "name": "my_name",
    *         //   "revisionCreateTime": "my_revisionCreateTime",
    *         //   "revisionId": "my_revisionId",
    *         //   "revisionUpdateTime": "my_revisionUpdateTime",
    *         //   "sizeBytes": 0,
    *         //   "sourceUri": "my_sourceUri"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotations": {},
    *   //   "contents": "my_contents",
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "filename": "my_filename",
    *   //   "hash": "my_hash",
    *   //   "labels": {},
    *   //   "mimeType": "my_mimeType",
    *   //   "name": "my_name",
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionId": "my_revisionId",
    *   //   "revisionUpdateTime": "my_revisionUpdateTime",
    *   //   "sizeBytes": 0,
    *   //   "sourceUri": "my_sourceUri"
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
  def create(params: ParamsResourceProjectsLocationsApisVersionsSpecsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsApisVersionsSpecsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsApisVersionsSpecsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * DeleteApiSpec removes a specified spec, all revisions, and all child resources (e.g. artifacts).
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
    *     await apigeeregistry.projects.locations.apis.versions.specs.delete({
    *       // If set to true, any child resources will also be deleted. (Otherwise, the request will only work if there are no child resources.)
    *       force: 'placeholder-value',
    *       // Required. The name of the spec to delete. Format: projects/x/locations/x/apis/x/versions/x/specs/x
    *       name: 'projects/my-project/locations/my-location/apis/my-api/versions/my-version/specs/my-spec',
    *     });
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
  def delete(params: ParamsResourceProjectsLocationsApisVersionsSpecsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def deleteRevision(): GaxiosPromise[SchemaApiSpec] = js.native
  def deleteRevision(callback: BodyResponseCallback[SchemaApiSpec]): Unit = js.native
  def deleteRevision(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApiSpec] = js.native
  def deleteRevision(params: ParamsResourceProjectsLocationsApisVersionsSpecsDeleterevision): GaxiosPromise[SchemaApiSpec] = js.native
  def deleteRevision(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsDeleterevision,
    callback: BodyResponseCallback[SchemaApiSpec]
  ): Unit = js.native
  def deleteRevision(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsDeleterevision,
    options: BodyResponseCallback[Readable | SchemaApiSpec],
    callback: BodyResponseCallback[Readable | SchemaApiSpec]
  ): Unit = js.native
  def deleteRevision(params: ParamsResourceProjectsLocationsApisVersionsSpecsDeleterevision, options: MethodOptions): GaxiosPromise[SchemaApiSpec] = js.native
  def deleteRevision(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsDeleterevision,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApiSpec]
  ): Unit = js.native
  /**
    * DeleteApiSpecRevision deletes a revision of a spec.
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
    *     await apigeeregistry.projects.locations.apis.versions.specs.deleteRevision({
    *       // Required. The name of the spec revision to be deleted, with a revision ID explicitly included. Example: projects/sample/locations/global/apis/petstore/versions/1.0.0/specs/openapi.yaml@c7cfa2a8
    *       name: 'projects/my-project/locations/my-location/apis/my-api/versions/my-version/specs/my-spec',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotations": {},
    *   //   "contents": "my_contents",
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "filename": "my_filename",
    *   //   "hash": "my_hash",
    *   //   "labels": {},
    *   //   "mimeType": "my_mimeType",
    *   //   "name": "my_name",
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionId": "my_revisionId",
    *   //   "revisionUpdateTime": "my_revisionUpdateTime",
    *   //   "sizeBytes": 0,
    *   //   "sourceUri": "my_sourceUri"
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
  def deleteRevision(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsDeleterevision,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def deleteRevision(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsDeleterevision,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaApiSpec] = js.native
  def get(callback: BodyResponseCallback[SchemaApiSpec]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApiSpec] = js.native
  def get(params: ParamsResourceProjectsLocationsApisVersionsSpecsGet): GaxiosPromise[SchemaApiSpec] = js.native
  def get(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsGet,
    callback: BodyResponseCallback[SchemaApiSpec]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsGet,
    options: BodyResponseCallback[Readable | SchemaApiSpec],
    callback: BodyResponseCallback[Readable | SchemaApiSpec]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsApisVersionsSpecsGet, options: MethodOptions): GaxiosPromise[SchemaApiSpec] = js.native
  def get(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApiSpec]
  ): Unit = js.native
  /**
    * GetApiSpec returns a specified spec.
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
    *   const res = await apigeeregistry.projects.locations.apis.versions.specs.get({
    *     // Required. The name of the spec to retrieve. Format: projects/x/locations/x/apis/x/versions/x/specs/x
    *     name: 'projects/my-project/locations/my-location/apis/my-api/versions/my-version/specs/my-spec',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotations": {},
    *   //   "contents": "my_contents",
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "filename": "my_filename",
    *   //   "hash": "my_hash",
    *   //   "labels": {},
    *   //   "mimeType": "my_mimeType",
    *   //   "name": "my_name",
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionId": "my_revisionId",
    *   //   "revisionUpdateTime": "my_revisionUpdateTime",
    *   //   "sizeBytes": 0,
    *   //   "sourceUri": "my_sourceUri"
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
  def get(params: ParamsResourceProjectsLocationsApisVersionsSpecsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getContents(): GaxiosPromise[SchemaHttpBody] = js.native
  def getContents(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def getContents(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def getContents(params: ParamsResourceProjectsLocationsApisVersionsSpecsGetcontents): GaxiosPromise[SchemaHttpBody] = js.native
  def getContents(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsGetcontents,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def getContents(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsGetcontents,
    options: BodyResponseCallback[Readable | SchemaHttpBody],
    callback: BodyResponseCallback[Readable | SchemaHttpBody]
  ): Unit = js.native
  def getContents(params: ParamsResourceProjectsLocationsApisVersionsSpecsGetcontents, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def getContents(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsGetcontents,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * GetApiSpecContents returns the contents of a specified spec. If specs are stored with GZip compression, the default behavior is to return the spec uncompressed (the mime_type response field indicates the exact format returned).
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
    *     await apigeeregistry.projects.locations.apis.versions.specs.getContents({
    *       // Required. The name of the spec whose contents should be retrieved. Format: projects/x/locations/x/apis/x/versions/x/specs/x
    *       name: 'projects/my-project/locations/my-location/apis/my-api/versions/my-version/specs/my-spec',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contentType": "my_contentType",
    *   //   "data": "my_data",
    *   //   "extensions": []
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
  def getContents(params: ParamsResourceProjectsLocationsApisVersionsSpecsGetcontents, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getContents(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsGetcontents,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsApisVersionsSpecsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsApisVersionsSpecsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsGetiampolicy,
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
    *     await apigeeregistry.projects.locations.apis.versions.specs.getIamPolicy({
    *       // Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
    *       'options.requestedPolicyVersion': 'placeholder-value',
    *       // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/apis/my-api/versions/my-version/specs/my-spec',
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
  def getIamPolicy(params: ParamsResourceProjectsLocationsApisVersionsSpecsGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListApiSpecsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListApiSpecsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListApiSpecsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsApisVersionsSpecsList): GaxiosPromise[SchemaListApiSpecsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsList,
    callback: BodyResponseCallback[SchemaListApiSpecsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsList,
    options: BodyResponseCallback[Readable | SchemaListApiSpecsResponse],
    callback: BodyResponseCallback[Readable | SchemaListApiSpecsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsApisVersionsSpecsList, options: MethodOptions): GaxiosPromise[SchemaListApiSpecsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListApiSpecsResponse]
  ): Unit = js.native
  /**
    * ListApiSpecs returns matching specs.
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
    *   const res = await apigeeregistry.projects.locations.apis.versions.specs.list({
    *     // An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields except contents.
    *     filter: 'placeholder-value',
    *     // The maximum number of specs to return. The service may return fewer than this value. If unspecified, at most 50 values will be returned. The maximum is 1000; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListApiSpecs` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListApiSpecs` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent, which owns this collection of specs. Format: projects/x/locations/x/apis/x/versions/x
    *     parent:
    *       'projects/my-project/locations/my-location/apis/my-api/versions/my-version',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiSpecs": [],
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
  def list(params: ParamsResourceProjectsLocationsApisVersionsSpecsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listRevisions(): GaxiosPromise[SchemaListApiSpecRevisionsResponse] = js.native
  def listRevisions(callback: BodyResponseCallback[SchemaListApiSpecRevisionsResponse]): Unit = js.native
  def listRevisions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListApiSpecRevisionsResponse] = js.native
  def listRevisions(params: ParamsResourceProjectsLocationsApisVersionsSpecsListrevisions): GaxiosPromise[SchemaListApiSpecRevisionsResponse] = js.native
  def listRevisions(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsListrevisions,
    callback: BodyResponseCallback[SchemaListApiSpecRevisionsResponse]
  ): Unit = js.native
  def listRevisions(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsListrevisions,
    options: BodyResponseCallback[Readable | SchemaListApiSpecRevisionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListApiSpecRevisionsResponse]
  ): Unit = js.native
  def listRevisions(params: ParamsResourceProjectsLocationsApisVersionsSpecsListrevisions, options: MethodOptions): GaxiosPromise[SchemaListApiSpecRevisionsResponse] = js.native
  def listRevisions(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsListrevisions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListApiSpecRevisionsResponse]
  ): Unit = js.native
  /**
    * ListApiSpecRevisions lists all revisions of a spec. Revisions are returned in descending order of revision creation time.
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
    *     await apigeeregistry.projects.locations.apis.versions.specs.listRevisions({
    *       // Required. The name of the spec to list revisions for.
    *       name: 'projects/my-project/locations/my-location/apis/my-api/versions/my-version/specs/my-spec',
    *       // The maximum number of revisions to return per page.
    *       pageSize: 'placeholder-value',
    *       // The page token, received from a previous ListApiSpecRevisions call. Provide this to retrieve the subsequent page.
    *       pageToken: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiSpecs": [],
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
  def listRevisions(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsListrevisions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def listRevisions(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsListrevisions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaApiSpec] = js.native
  def patch(callback: BodyResponseCallback[SchemaApiSpec]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApiSpec] = js.native
  def patch(params: ParamsResourceProjectsLocationsApisVersionsSpecsPatch): GaxiosPromise[SchemaApiSpec] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsPatch,
    callback: BodyResponseCallback[SchemaApiSpec]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsPatch,
    options: BodyResponseCallback[Readable | SchemaApiSpec],
    callback: BodyResponseCallback[Readable | SchemaApiSpec]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsApisVersionsSpecsPatch, options: MethodOptions): GaxiosPromise[SchemaApiSpec] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApiSpec]
  ): Unit = js.native
  /**
    * UpdateApiSpec can be used to modify a specified spec.
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
    *   const res = await apigeeregistry.projects.locations.apis.versions.specs.patch(
    *     {
    *       // If set to true, and the spec is not found, a new spec will be created. In this situation, `update_mask` is ignored.
    *       allowMissing: 'placeholder-value',
    *       // Resource name.
    *       name: 'projects/my-project/locations/my-location/apis/my-api/versions/my-version/specs/my-spec',
    *       // The list of fields to be updated. If omitted, all fields are updated that are set in the request message (fields set to default values are ignored). If a "*" is specified, all fields are updated, including fields that are unspecified/default in the request.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "annotations": {},
    *         //   "contents": "my_contents",
    *         //   "createTime": "my_createTime",
    *         //   "description": "my_description",
    *         //   "filename": "my_filename",
    *         //   "hash": "my_hash",
    *         //   "labels": {},
    *         //   "mimeType": "my_mimeType",
    *         //   "name": "my_name",
    *         //   "revisionCreateTime": "my_revisionCreateTime",
    *         //   "revisionId": "my_revisionId",
    *         //   "revisionUpdateTime": "my_revisionUpdateTime",
    *         //   "sizeBytes": 0,
    *         //   "sourceUri": "my_sourceUri"
    *         // }
    *       },
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotations": {},
    *   //   "contents": "my_contents",
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "filename": "my_filename",
    *   //   "hash": "my_hash",
    *   //   "labels": {},
    *   //   "mimeType": "my_mimeType",
    *   //   "name": "my_name",
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionId": "my_revisionId",
    *   //   "revisionUpdateTime": "my_revisionUpdateTime",
    *   //   "sizeBytes": 0,
    *   //   "sourceUri": "my_sourceUri"
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
  def patch(params: ParamsResourceProjectsLocationsApisVersionsSpecsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def rollback(): GaxiosPromise[SchemaApiSpec] = js.native
  def rollback(callback: BodyResponseCallback[SchemaApiSpec]): Unit = js.native
  def rollback(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApiSpec] = js.native
  def rollback(params: ParamsResourceProjectsLocationsApisVersionsSpecsRollback): GaxiosPromise[SchemaApiSpec] = js.native
  def rollback(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsRollback,
    callback: BodyResponseCallback[SchemaApiSpec]
  ): Unit = js.native
  def rollback(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsRollback,
    options: BodyResponseCallback[Readable | SchemaApiSpec],
    callback: BodyResponseCallback[Readable | SchemaApiSpec]
  ): Unit = js.native
  def rollback(params: ParamsResourceProjectsLocationsApisVersionsSpecsRollback, options: MethodOptions): GaxiosPromise[SchemaApiSpec] = js.native
  def rollback(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsRollback,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApiSpec]
  ): Unit = js.native
  /**
    * RollbackApiSpec sets the current revision to a specified prior revision. Note that this creates a new revision with a new revision ID.
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
    *     await apigeeregistry.projects.locations.apis.versions.specs.rollback({
    *       // Required. The spec being rolled back.
    *       name: 'projects/my-project/locations/my-location/apis/my-api/versions/my-version/specs/my-spec',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "revisionId": "my_revisionId"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotations": {},
    *   //   "contents": "my_contents",
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "filename": "my_filename",
    *   //   "hash": "my_hash",
    *   //   "labels": {},
    *   //   "mimeType": "my_mimeType",
    *   //   "name": "my_name",
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionId": "my_revisionId",
    *   //   "revisionUpdateTime": "my_revisionUpdateTime",
    *   //   "sizeBytes": 0,
    *   //   "sourceUri": "my_sourceUri"
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
  def rollback(params: ParamsResourceProjectsLocationsApisVersionsSpecsRollback, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def rollback(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsRollback,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsApisVersionsSpecsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsApisVersionsSpecsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsSetiampolicy,
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
    *     await apigeeregistry.projects.locations.apis.versions.specs.setIamPolicy({
    *       // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/apis/my-api/versions/my-version/specs/my-spec',
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
  def setIamPolicy(params: ParamsResourceProjectsLocationsApisVersionsSpecsSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def tagRevision(): GaxiosPromise[SchemaApiSpec] = js.native
  def tagRevision(callback: BodyResponseCallback[SchemaApiSpec]): Unit = js.native
  def tagRevision(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApiSpec] = js.native
  def tagRevision(params: ParamsResourceProjectsLocationsApisVersionsSpecsTagrevision): GaxiosPromise[SchemaApiSpec] = js.native
  def tagRevision(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsTagrevision,
    callback: BodyResponseCallback[SchemaApiSpec]
  ): Unit = js.native
  def tagRevision(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsTagrevision,
    options: BodyResponseCallback[Readable | SchemaApiSpec],
    callback: BodyResponseCallback[Readable | SchemaApiSpec]
  ): Unit = js.native
  def tagRevision(params: ParamsResourceProjectsLocationsApisVersionsSpecsTagrevision, options: MethodOptions): GaxiosPromise[SchemaApiSpec] = js.native
  def tagRevision(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsTagrevision,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApiSpec]
  ): Unit = js.native
  /**
    * TagApiSpecRevision adds a tag to a specified revision of a spec.
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
    *     await apigeeregistry.projects.locations.apis.versions.specs.tagRevision({
    *       // Required. The name of the spec to be tagged, including the revision ID.
    *       name: 'projects/my-project/locations/my-location/apis/my-api/versions/my-version/specs/my-spec',
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
    *   //   "annotations": {},
    *   //   "contents": "my_contents",
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "filename": "my_filename",
    *   //   "hash": "my_hash",
    *   //   "labels": {},
    *   //   "mimeType": "my_mimeType",
    *   //   "name": "my_name",
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionId": "my_revisionId",
    *   //   "revisionUpdateTime": "my_revisionUpdateTime",
    *   //   "sizeBytes": 0,
    *   //   "sourceUri": "my_sourceUri"
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
  def tagRevision(params: ParamsResourceProjectsLocationsApisVersionsSpecsTagrevision, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def tagRevision(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsTagrevision,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsApisVersionsSpecsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsApisVersionsSpecsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsTestiampermissions,
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
    *     await apigeeregistry.projects.locations.apis.versions.specs.testIamPermissions(
    *       {
    *         // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *         resource:
    *           'projects/my-project/locations/my-location/apis/my-api/versions/my-version/specs/my-spec',
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
    params: ParamsResourceProjectsLocationsApisVersionsSpecsTestiampermissions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsApisVersionsSpecsTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
