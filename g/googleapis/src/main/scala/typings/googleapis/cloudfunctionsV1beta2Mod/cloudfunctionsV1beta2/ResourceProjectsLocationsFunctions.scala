package typings.googleapis.cloudfunctionsV1beta2Mod.cloudfunctionsV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudfunctions/v1beta2", "cloudfunctions_v1beta2.Resource$Projects$Locations$Functions")
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
    * cloudfunctions.projects.locations.functions.call
    * @desc Synchronously invokes a deployed Cloud Function. To be used for testing purposes as very limited traffic is allowed. For more information on the actual limits refer to [API Calls]( https://cloud.google.com/functions/quotas#rate_limits).
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudfunctions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudfunctions = google.cloudfunctions('v1beta2');
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
    * @alias cloudfunctions.projects.locations.functions.call
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the function to be called.
    * @param {().CallFunctionRequest} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
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
    * cloudfunctions.projects.locations.functions.create
    * @desc Creates a new function. If a function with the given name already exists in the specified project, the long running operation will return `ALREADY_EXISTS` error.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudfunctions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudfunctions = google.cloudfunctions('v1beta2');
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
    *     // Required. The project and location in which the function should be created, specified
    *     // in the format `projects/x/locations/x`
    *     location: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "availableMemoryMb": 0,
    *       //   "entryPoint": "my_entryPoint",
    *       //   "environmentVariables": {},
    *       //   "eventTrigger": {},
    *       //   "httpsTrigger": {},
    *       //   "labels": {},
    *       //   "latestOperation": "my_latestOperation",
    *       //   "maxInstances": 0,
    *       //   "name": "my_name",
    *       //   "network": "my_network",
    *       //   "runtime": "my_runtime",
    *       //   "serviceAccount": "my_serviceAccount",
    *       //   "sourceArchiveUrl": "my_sourceArchiveUrl",
    *       //   "sourceRepository": {},
    *       //   "sourceRepositoryUrl": "my_sourceRepositoryUrl",
    *       //   "sourceUploadUrl": "my_sourceUploadUrl",
    *       //   "status": "my_status",
    *       //   "timeout": "my_timeout",
    *       //   "updateTime": "my_updateTime",
    *       //   "versionId": "my_versionId",
    *       //   "vpcConnector": "my_vpcConnector"
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
    * @alias cloudfunctions.projects.locations.functions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.location Required. The project and location in which the function should be created, specified in the format `projects/x/locations/x`
    * @param {().CloudFunction} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
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
    * cloudfunctions.projects.locations.functions.delete
    * @desc Deletes a function with the given name from the specified project. If the given function is used by some trigger, the trigger will be updated to remove this function.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudfunctions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudfunctions = google.cloudfunctions('v1beta2');
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
    * @alias cloudfunctions.projects.locations.functions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the function which should be deleted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
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
    * cloudfunctions.projects.locations.functions.generateDownloadUrl
    * @desc Returns a signed URL for downloading deployed function source code. The URL is only valid for a limited period and should be used within minutes after generation. For more information about the signed URL usage see: https://cloud.google.com/storage/docs/access-control/signed-urls
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudfunctions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudfunctions = google.cloudfunctions('v1beta2');
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
    *   const res = await cloudfunctions.projects.locations.functions.generateDownloadUrl(
    *     {
    *       // The name of function for which source code Google Cloud Storage signed
    *       // URL should be generated.
    *       name: 'projects/my-project/locations/my-location/functions/my-function',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "versionId": "my_versionId"
    *         // }
    *       },
    *     }
    *   );
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
    * @alias cloudfunctions.projects.locations.functions.generateDownloadUrl
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of function for which source code Google Cloud Storage signed URL should be generated.
    * @param {().GenerateDownloadUrlRequest} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
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
    * cloudfunctions.projects.locations.functions.generateUploadUrl
    * @desc Returns a signed URL for uploading a function source code. For more information about the signed URL usage see: https://cloud.google.com/storage/docs/access-control/signed-urls Once the function source code upload is complete, the used signed URL should be provided in CreateFunction or UpdateFunction request as a reference to the function source code.  When uploading source code to the generated signed URL, please follow these restrictions:  * Source file type should be a zip file. * Source file size should not exceed 100MB limit. * No credentials should be attached - the signed URLs provide access to the   target bucket using internal service identity; if credentials were   attached, the identity from the credentials would be used, but that   identity does not have permissions to upload files to the URL.  When making a HTTP PUT request, these two headers need to be specified:  * `content-type: application/zip` * `x-goog-content-length-range: 0,104857600`  And this header SHOULD NOT be specified:  * `Authorization: Bearer YOUR_TOKEN`
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudfunctions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudfunctions = google.cloudfunctions('v1beta2');
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
    *   const res = await cloudfunctions.projects.locations.functions.generateUploadUrl(
    *     {
    *       // The project and location in which the Google Cloud Storage signed URL
    *       // should be generated, specified in the format `projects/x/locations/x`.
    *       parent: 'projects/my-project/locations/my-location',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {}
    *       },
    *     }
    *   );
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
    * @alias cloudfunctions.projects.locations.functions.generateUploadUrl
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The project and location in which the Google Cloud Storage signed URL should be generated, specified in the format `projects/x/locations/x`.
    * @param {().GenerateUploadUrlRequest} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
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
    * cloudfunctions.projects.locations.functions.get
    * @desc Returns a function with the given name from the requested project.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudfunctions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudfunctions = google.cloudfunctions('v1beta2');
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
    *   //   "entryPoint": "my_entryPoint",
    *   //   "environmentVariables": {},
    *   //   "eventTrigger": {},
    *   //   "httpsTrigger": {},
    *   //   "labels": {},
    *   //   "latestOperation": "my_latestOperation",
    *   //   "maxInstances": 0,
    *   //   "name": "my_name",
    *   //   "network": "my_network",
    *   //   "runtime": "my_runtime",
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "sourceArchiveUrl": "my_sourceArchiveUrl",
    *   //   "sourceRepository": {},
    *   //   "sourceRepositoryUrl": "my_sourceRepositoryUrl",
    *   //   "sourceUploadUrl": "my_sourceUploadUrl",
    *   //   "status": "my_status",
    *   //   "timeout": "my_timeout",
    *   //   "updateTime": "my_updateTime",
    *   //   "versionId": "my_versionId",
    *   //   "vpcConnector": "my_vpcConnector"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias cloudfunctions.projects.locations.functions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the function which details should be obtained.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(params: ParamsResourceProjectsLocationsFunctionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsFunctionsGet,
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
    * cloudfunctions.projects.locations.functions.list
    * @desc Returns a list of functions that belong to the requested project.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudfunctions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudfunctions = google.cloudfunctions('v1beta2');
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
    *     // Required. The project and location from which the function should be listed,
    *     // specified in the format `projects/x/locations/x`
    *     // If you want to list functions in all locations, use "-" in place of a
    *     // location. When listing functions in all locations, if one or more
    *     // location(s) are unreachable, the response will contain functions from all
    *     // reachable locations along with the names of any unreachable locations.
    *     location: 'projects/my-project/locations/my-location',
    *     // Maximum number of functions to return per call.
    *     pageSize: 'placeholder-value',
    *     // The value returned by the last
    *     // `ListFunctionsResponse`; indicates that
    *     // this is a continuation of a prior `ListFunctions` call, and that the
    *     // system should return the next page of data.
    *     pageToken: 'placeholder-value',
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
    * @alias cloudfunctions.projects.locations.functions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.location Required. The project and location from which the function should be listed, specified in the format `projects/x/locations/x` If you want to list functions in all locations, use "-" in place of a location. When listing functions in all locations, if one or more location(s) are unreachable, the response will contain functions from all reachable locations along with the names of any unreachable locations.
    * @param {integer=} params.pageSize Maximum number of functions to return per call.
    * @param {string=} params.pageToken The value returned by the last `ListFunctionsResponse`; indicates that this is a continuation of a prior `ListFunctions` call, and that the system should return the next page of data.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(params: ParamsResourceProjectsLocationsFunctionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsFunctionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceProjectsLocationsFunctionsUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceProjectsLocationsFunctionsUpdate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(
    params: ParamsResourceProjectsLocationsFunctionsUpdate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsLocationsFunctionsUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceProjectsLocationsFunctionsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * cloudfunctions.projects.locations.functions.update
    * @desc Updates existing function.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudfunctions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudfunctions = google.cloudfunctions('v1beta2');
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
    *   const res = await cloudfunctions.projects.locations.functions.update({
    *     // Required. The name of the function to be updated.
    *     name: 'projects/my-project/locations/my-location/functions/my-function',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "availableMemoryMb": 0,
    *       //   "entryPoint": "my_entryPoint",
    *       //   "environmentVariables": {},
    *       //   "eventTrigger": {},
    *       //   "httpsTrigger": {},
    *       //   "labels": {},
    *       //   "latestOperation": "my_latestOperation",
    *       //   "maxInstances": 0,
    *       //   "name": "my_name",
    *       //   "network": "my_network",
    *       //   "runtime": "my_runtime",
    *       //   "serviceAccount": "my_serviceAccount",
    *       //   "sourceArchiveUrl": "my_sourceArchiveUrl",
    *       //   "sourceRepository": {},
    *       //   "sourceRepositoryUrl": "my_sourceRepositoryUrl",
    *       //   "sourceUploadUrl": "my_sourceUploadUrl",
    *       //   "status": "my_status",
    *       //   "timeout": "my_timeout",
    *       //   "updateTime": "my_updateTime",
    *       //   "versionId": "my_versionId",
    *       //   "vpcConnector": "my_vpcConnector"
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
    * @alias cloudfunctions.projects.locations.functions.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the function to be updated.
    * @param {().CloudFunction} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(params: ParamsResourceProjectsLocationsFunctionsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceProjectsLocationsFunctionsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
