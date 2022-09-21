package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudfunctions/v1", "cloudfunctions_v1.Resource$Projects$Locations$Functions")
@js.native
open class ResourceProjectsLocationsFunctions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def call(): GaxiosPromise[SchemaCallFunctionResponse] = js.native
  def call(callback: BodyResponseCallback[SchemaCallFunctionResponse]): Unit = js.native
  def call(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCallFunctionResponse] = js.native
  def call(params: ParamsResourceProjectsLocationsFunctionsCall): GaxiosPromise[SchemaCallFunctionResponse] = js.native
  def call(
    params: ParamsResourceProjectsLocationsFunctionsCall,
    callback: BodyResponseCallback[SchemaCallFunctionResponse]
  ): Unit = js.native
  def call(
    params: ParamsResourceProjectsLocationsFunctionsCall,
    options: BodyResponseCallback[Readable | SchemaCallFunctionResponse],
    callback: BodyResponseCallback[Readable | SchemaCallFunctionResponse]
  ): Unit = js.native
  def call(params: ParamsResourceProjectsLocationsFunctionsCall, options: MethodOptions): GaxiosPromise[SchemaCallFunctionResponse] = js.native
  def call(
    params: ParamsResourceProjectsLocationsFunctionsCall,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCallFunctionResponse]
  ): Unit = js.native
  /**
    * Synchronously invokes a deployed Cloud Function. To be used for testing purposes as very limited traffic is allowed. For more information on the actual limits, refer to [Rate Limits](https://cloud.google.com/functions/quotas#rate_limits).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudfunctions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudfunctions = google.cloudfunctions('v1');
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
    *   const res = await cloudfunctions.projects.locations.functions.call({
    *     // Required. The name of the function to be called.
    *     name: 'projects/my-project/locations/my-location/functions/my-function',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "data": "my_data"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "error": "my_error",
    *   //   "executionId": "my_executionId",
    *   //   "result": "my_result"
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
  def call(params: ParamsResourceProjectsLocationsFunctionsCall, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def call(
    params: ParamsResourceProjectsLocationsFunctionsCall,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsFunctionsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsFunctionsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsFunctionsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsFunctionsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsFunctionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a new function. If a function with the given name already exists in the specified project, the long running operation will return `ALREADY_EXISTS` error.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudfunctions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudfunctions = google.cloudfunctions('v1');
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
    *   const res = await cloudfunctions.projects.locations.functions.create({
    *     // Required. The project and location in which the function should be created, specified in the format `projects/x/locations/x`
    *     location: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "availableMemoryMb": 0,
    *       //   "buildEnvironmentVariables": {},
    *       //   "buildId": "my_buildId",
    *       //   "buildName": "my_buildName",
    *       //   "buildWorkerPool": "my_buildWorkerPool",
    *       //   "description": "my_description",
    *       //   "dockerRegistry": "my_dockerRegistry",
    *       //   "dockerRepository": "my_dockerRepository",
    *       //   "entryPoint": "my_entryPoint",
    *       //   "environmentVariables": {},
    *       //   "eventTrigger": {},
    *       //   "httpsTrigger": {},
    *       //   "ingressSettings": "my_ingressSettings",
    *       //   "kmsKeyName": "my_kmsKeyName",
    *       //   "labels": {},
    *       //   "maxInstances": 0,
    *       //   "minInstances": 0,
    *       //   "name": "my_name",
    *       //   "network": "my_network",
    *       //   "runtime": "my_runtime",
    *       //   "secretEnvironmentVariables": [],
    *       //   "secretVolumes": [],
    *       //   "serviceAccountEmail": "my_serviceAccountEmail",
    *       //   "sourceArchiveUrl": "my_sourceArchiveUrl",
    *       //   "sourceRepository": {},
    *       //   "sourceToken": "my_sourceToken",
    *       //   "sourceUploadUrl": "my_sourceUploadUrl",
    *       //   "status": "my_status",
    *       //   "timeout": "my_timeout",
    *       //   "updateTime": "my_updateTime",
    *       //   "versionId": "my_versionId",
    *       //   "vpcConnector": "my_vpcConnector",
    *       //   "vpcConnectorEgressSettings": "my_vpcConnectorEgressSettings"
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
  def create(params: ParamsResourceProjectsLocationsFunctionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsFunctionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsFunctionsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsFunctionsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsFunctionsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsFunctionsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsFunctionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a function with the given name from the specified project. If the given function is used by some trigger, the trigger will be updated to remove this function.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudfunctions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudfunctions = google.cloudfunctions('v1');
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
    *   const res = await cloudfunctions.projects.locations.functions.delete({
    *     // Required. The name of the function which should be deleted.
    *     name: 'projects/my-project/locations/my-location/functions/my-function',
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
  def delete(params: ParamsResourceProjectsLocationsFunctionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsFunctionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def generateDownloadUrl(): GaxiosPromise[SchemaGenerateDownloadUrlResponse] = js.native
  def generateDownloadUrl(callback: BodyResponseCallback[SchemaGenerateDownloadUrlResponse]): Unit = js.native
  def generateDownloadUrl(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGenerateDownloadUrlResponse] = js.native
  def generateDownloadUrl(params: ParamsResourceProjectsLocationsFunctionsGeneratedownloadurl): GaxiosPromise[SchemaGenerateDownloadUrlResponse] = js.native
  def generateDownloadUrl(
    params: ParamsResourceProjectsLocationsFunctionsGeneratedownloadurl,
    callback: BodyResponseCallback[SchemaGenerateDownloadUrlResponse]
  ): Unit = js.native
  def generateDownloadUrl(
    params: ParamsResourceProjectsLocationsFunctionsGeneratedownloadurl,
    options: BodyResponseCallback[Readable | SchemaGenerateDownloadUrlResponse],
    callback: BodyResponseCallback[Readable | SchemaGenerateDownloadUrlResponse]
  ): Unit = js.native
  def generateDownloadUrl(params: ParamsResourceProjectsLocationsFunctionsGeneratedownloadurl, options: MethodOptions): GaxiosPromise[SchemaGenerateDownloadUrlResponse] = js.native
  def generateDownloadUrl(
    params: ParamsResourceProjectsLocationsFunctionsGeneratedownloadurl,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGenerateDownloadUrlResponse]
  ): Unit = js.native
  /**
    * Returns a signed URL for downloading deployed function source code. The URL is only valid for a limited period and should be used within minutes after generation. For more information about the signed URL usage see: https://cloud.google.com/storage/docs/access-control/signed-urls
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudfunctions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudfunctions = google.cloudfunctions('v1');
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
    *     await cloudfunctions.projects.locations.functions.generateDownloadUrl({
    *       // The name of function for which source code Google Cloud Storage signed URL should be generated.
    *       name: 'projects/my-project/locations/my-location/functions/my-function',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "versionId": "my_versionId"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "downloadUrl": "my_downloadUrl"
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
  def generateDownloadUrl(params: ParamsResourceProjectsLocationsFunctionsGeneratedownloadurl, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def generateDownloadUrl(
    params: ParamsResourceProjectsLocationsFunctionsGeneratedownloadurl,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def generateUploadUrl(): GaxiosPromise[SchemaGenerateUploadUrlResponse] = js.native
  def generateUploadUrl(callback: BodyResponseCallback[SchemaGenerateUploadUrlResponse]): Unit = js.native
  def generateUploadUrl(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGenerateUploadUrlResponse] = js.native
  def generateUploadUrl(params: ParamsResourceProjectsLocationsFunctionsGenerateuploadurl): GaxiosPromise[SchemaGenerateUploadUrlResponse] = js.native
  def generateUploadUrl(
    params: ParamsResourceProjectsLocationsFunctionsGenerateuploadurl,
    callback: BodyResponseCallback[SchemaGenerateUploadUrlResponse]
  ): Unit = js.native
  def generateUploadUrl(
    params: ParamsResourceProjectsLocationsFunctionsGenerateuploadurl,
    options: BodyResponseCallback[Readable | SchemaGenerateUploadUrlResponse],
    callback: BodyResponseCallback[Readable | SchemaGenerateUploadUrlResponse]
  ): Unit = js.native
  def generateUploadUrl(params: ParamsResourceProjectsLocationsFunctionsGenerateuploadurl, options: MethodOptions): GaxiosPromise[SchemaGenerateUploadUrlResponse] = js.native
  def generateUploadUrl(
    params: ParamsResourceProjectsLocationsFunctionsGenerateuploadurl,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGenerateUploadUrlResponse]
  ): Unit = js.native
  /**
    * Returns a signed URL for uploading a function source code. For more information about the signed URL usage see: https://cloud.google.com/storage/docs/access-control/signed-urls. Once the function source code upload is complete, the used signed URL should be provided in CreateFunction or UpdateFunction request as a reference to the function source code. When uploading source code to the generated signed URL, please follow these restrictions: * Source file type should be a zip file. * Source file size should not exceed 100MB limit. * No credentials should be attached - the signed URLs provide access to the target bucket using internal service identity; if credentials were attached, the identity from the credentials would be used, but that identity does not have permissions to upload files to the URL. When making a HTTP PUT request, these two headers need to be specified: * `content-type: application/zip` * `x-goog-content-length-range: 0,104857600` And this header SHOULD NOT be specified: * `Authorization: Bearer YOUR_TOKEN`
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudfunctions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudfunctions = google.cloudfunctions('v1');
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
    *     await cloudfunctions.projects.locations.functions.generateUploadUrl({
    *       // The project and location in which the Google Cloud Storage signed URL should be generated, specified in the format `projects/x/locations/x`.
    *       parent: 'projects/my-project/locations/my-location',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "kmsKeyName": "my_kmsKeyName"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "uploadUrl": "my_uploadUrl"
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
  def generateUploadUrl(params: ParamsResourceProjectsLocationsFunctionsGenerateuploadurl, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def generateUploadUrl(
    params: ParamsResourceProjectsLocationsFunctionsGenerateuploadurl,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCloudFunction] = js.native
  def get(callback: BodyResponseCallback[SchemaCloudFunction]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCloudFunction] = js.native
  def get(params: ParamsResourceProjectsLocationsFunctionsGet): GaxiosPromise[SchemaCloudFunction] = js.native
  def get(
    params: ParamsResourceProjectsLocationsFunctionsGet,
    callback: BodyResponseCallback[SchemaCloudFunction]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsFunctionsGet,
    options: BodyResponseCallback[Readable | SchemaCloudFunction],
    callback: BodyResponseCallback[Readable | SchemaCloudFunction]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsFunctionsGet, options: MethodOptions): GaxiosPromise[SchemaCloudFunction] = js.native
  def get(
    params: ParamsResourceProjectsLocationsFunctionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCloudFunction]
  ): Unit = js.native
  /**
    * Returns a function with the given name from the requested project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudfunctions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudfunctions = google.cloudfunctions('v1');
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
    *   const res = await cloudfunctions.projects.locations.functions.get({
    *     // Required. The name of the function which details should be obtained.
    *     name: 'projects/my-project/locations/my-location/functions/my-function',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "availableMemoryMb": 0,
    *   //   "buildEnvironmentVariables": {},
    *   //   "buildId": "my_buildId",
    *   //   "buildName": "my_buildName",
    *   //   "buildWorkerPool": "my_buildWorkerPool",
    *   //   "description": "my_description",
    *   //   "dockerRegistry": "my_dockerRegistry",
    *   //   "dockerRepository": "my_dockerRepository",
    *   //   "entryPoint": "my_entryPoint",
    *   //   "environmentVariables": {},
    *   //   "eventTrigger": {},
    *   //   "httpsTrigger": {},
    *   //   "ingressSettings": "my_ingressSettings",
    *   //   "kmsKeyName": "my_kmsKeyName",
    *   //   "labels": {},
    *   //   "maxInstances": 0,
    *   //   "minInstances": 0,
    *   //   "name": "my_name",
    *   //   "network": "my_network",
    *   //   "runtime": "my_runtime",
    *   //   "secretEnvironmentVariables": [],
    *   //   "secretVolumes": [],
    *   //   "serviceAccountEmail": "my_serviceAccountEmail",
    *   //   "sourceArchiveUrl": "my_sourceArchiveUrl",
    *   //   "sourceRepository": {},
    *   //   "sourceToken": "my_sourceToken",
    *   //   "sourceUploadUrl": "my_sourceUploadUrl",
    *   //   "status": "my_status",
    *   //   "timeout": "my_timeout",
    *   //   "updateTime": "my_updateTime",
    *   //   "versionId": "my_versionId",
    *   //   "vpcConnector": "my_vpcConnector",
    *   //   "vpcConnectorEgressSettings": "my_vpcConnectorEgressSettings"
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
  def get(params: ParamsResourceProjectsLocationsFunctionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsFunctionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsFunctionsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsFunctionsGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsFunctionsGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsFunctionsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsFunctionsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the IAM access control policy for a function. Returns an empty policy if the function exists and does not have a policy set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudfunctions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudfunctions = google.cloudfunctions('v1');
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
    *   const res = await cloudfunctions.projects.locations.functions.getIamPolicy({
    *     // Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
    *     'options.requestedPolicyVersion': 'placeholder-value',
    *     // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/locations/my-location/functions/my-function',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditConfigs": [],
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
  def getIamPolicy(params: ParamsResourceProjectsLocationsFunctionsGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsFunctionsGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListFunctionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFunctionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListFunctionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsFunctionsList): GaxiosPromise[SchemaListFunctionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsFunctionsList,
    callback: BodyResponseCallback[SchemaListFunctionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsFunctionsList,
    options: BodyResponseCallback[Readable | SchemaListFunctionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListFunctionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsFunctionsList, options: MethodOptions): GaxiosPromise[SchemaListFunctionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsFunctionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFunctionsResponse]
  ): Unit = js.native
  /**
    * Returns a list of functions that belong to the requested project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudfunctions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudfunctions = google.cloudfunctions('v1');
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
    *   const res = await cloudfunctions.projects.locations.functions.list({
    *     // Maximum number of functions to return per call.
    *     pageSize: 'placeholder-value',
    *     // The value returned by the last `ListFunctionsResponse`; indicates that this is a continuation of a prior `ListFunctions` call, and that the system should return the next page of data.
    *     pageToken: 'placeholder-value',
    *     // The project and location from which the function should be listed, specified in the format `projects/x/locations/x` If you want to list functions in all locations, use "-" in place of a location. When listing functions in all locations, if one or more location(s) are unreachable, the response will contain functions from all reachable locations along with the names of any unreachable locations.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "functions": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "unreachable": []
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
  def list(params: ParamsResourceProjectsLocationsFunctionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsFunctionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsFunctionsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsFunctionsPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsFunctionsPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsFunctionsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsFunctionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates existing function.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudfunctions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudfunctions = google.cloudfunctions('v1');
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
    *   const res = await cloudfunctions.projects.locations.functions.patch({
    *     // A user-defined name of the function. Function names must be unique globally and match pattern `projects/x/locations/x/functions/x`
    *     name: 'projects/my-project/locations/my-location/functions/my-function',
    *     // Required. The list of fields in `CloudFunction` that have to be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "availableMemoryMb": 0,
    *       //   "buildEnvironmentVariables": {},
    *       //   "buildId": "my_buildId",
    *       //   "buildName": "my_buildName",
    *       //   "buildWorkerPool": "my_buildWorkerPool",
    *       //   "description": "my_description",
    *       //   "dockerRegistry": "my_dockerRegistry",
    *       //   "dockerRepository": "my_dockerRepository",
    *       //   "entryPoint": "my_entryPoint",
    *       //   "environmentVariables": {},
    *       //   "eventTrigger": {},
    *       //   "httpsTrigger": {},
    *       //   "ingressSettings": "my_ingressSettings",
    *       //   "kmsKeyName": "my_kmsKeyName",
    *       //   "labels": {},
    *       //   "maxInstances": 0,
    *       //   "minInstances": 0,
    *       //   "name": "my_name",
    *       //   "network": "my_network",
    *       //   "runtime": "my_runtime",
    *       //   "secretEnvironmentVariables": [],
    *       //   "secretVolumes": [],
    *       //   "serviceAccountEmail": "my_serviceAccountEmail",
    *       //   "sourceArchiveUrl": "my_sourceArchiveUrl",
    *       //   "sourceRepository": {},
    *       //   "sourceToken": "my_sourceToken",
    *       //   "sourceUploadUrl": "my_sourceUploadUrl",
    *       //   "status": "my_status",
    *       //   "timeout": "my_timeout",
    *       //   "updateTime": "my_updateTime",
    *       //   "versionId": "my_versionId",
    *       //   "vpcConnector": "my_vpcConnector",
    *       //   "vpcConnectorEgressSettings": "my_vpcConnectorEgressSettings"
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
  def patch(params: ParamsResourceProjectsLocationsFunctionsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsFunctionsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsFunctionsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsFunctionsSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsFunctionsSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsFunctionsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsFunctionsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the IAM access control policy on the specified function. Replaces any existing policy.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudfunctions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudfunctions = google.cloudfunctions('v1');
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
    *   const res = await cloudfunctions.projects.locations.functions.setIamPolicy({
    *     // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/locations/my-location/functions/my-function',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "policy": {},
    *       //   "updateMask": "my_updateMask"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditConfigs": [],
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
  def setIamPolicy(params: ParamsResourceProjectsLocationsFunctionsSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsFunctionsSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsFunctionsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsFunctionsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsFunctionsTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsFunctionsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsFunctionsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Tests the specified permissions against the IAM access control policy for a function. If the function does not exist, this will return an empty set of permissions, not a NOT_FOUND error.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudfunctions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudfunctions = google.cloudfunctions('v1');
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
    *     await cloudfunctions.projects.locations.functions.testIamPermissions({
    *       // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/functions/my-function',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "permissions": []
    *         // }
    *       },
    *     });
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
  def testIamPermissions(params: ParamsResourceProjectsLocationsFunctionsTestiampermissions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsFunctionsTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
