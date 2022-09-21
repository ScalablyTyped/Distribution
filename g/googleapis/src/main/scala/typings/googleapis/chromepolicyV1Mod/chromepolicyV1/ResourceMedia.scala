package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/chromepolicy/v1", "chromepolicy_v1.Resource$Media")
@js.native
open class ResourceMedia protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def upload(): GaxiosPromise[SchemaGoogleChromePolicyV1UploadPolicyFileResponse] = js.native
  def upload(callback: BodyResponseCallback[SchemaGoogleChromePolicyV1UploadPolicyFileResponse]): Unit = js.native
  def upload(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleChromePolicyV1UploadPolicyFileResponse] = js.native
  def upload(params: ParamsResourceMediaUpload): GaxiosPromise[SchemaGoogleChromePolicyV1UploadPolicyFileResponse] = js.native
  def upload(
    params: ParamsResourceMediaUpload,
    callback: BodyResponseCallback[SchemaGoogleChromePolicyV1UploadPolicyFileResponse]
  ): Unit = js.native
  def upload(
    params: ParamsResourceMediaUpload,
    options: BodyResponseCallback[Readable | SchemaGoogleChromePolicyV1UploadPolicyFileResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleChromePolicyV1UploadPolicyFileResponse]
  ): Unit = js.native
  def upload(params: ParamsResourceMediaUpload, options: MethodOptions): GaxiosPromise[SchemaGoogleChromePolicyV1UploadPolicyFileResponse] = js.native
  def upload(
    params: ParamsResourceMediaUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleChromePolicyV1UploadPolicyFileResponse]
  ): Unit = js.native
  /**
    * Creates an enterprise file from the content provided by user. Returns a public download url for end user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/chromepolicy.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const chromepolicy = google.chromepolicy('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/chrome.management.policy'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await chromepolicy.media.upload({
    *     // Required. The customer for which the file upload will apply.
    *     customer: 'customers/my-customer',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "policyField": "my_policyField"
    *       // }
    *     },
    *     media: {
    *       mimeType: 'placeholder-value',
    *       body: 'placeholder-value',
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "downloadUri": "my_downloadUri"
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
  def upload(params: ParamsResourceMediaUpload, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def upload(
    params: ParamsResourceMediaUpload,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
