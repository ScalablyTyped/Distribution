package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Signupurls")
@js.native
open class ResourceSignupurls protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaSignupUrl] = js.native
  def create(callback: BodyResponseCallback[SchemaSignupUrl]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSignupUrl] = js.native
  def create(params: ParamsResourceSignupurlsCreate): GaxiosPromise[SchemaSignupUrl] = js.native
  def create(params: ParamsResourceSignupurlsCreate, callback: BodyResponseCallback[SchemaSignupUrl]): Unit = js.native
  def create(
    params: ParamsResourceSignupurlsCreate,
    options: BodyResponseCallback[Readable | SchemaSignupUrl],
    callback: BodyResponseCallback[Readable | SchemaSignupUrl]
  ): Unit = js.native
  def create(params: ParamsResourceSignupurlsCreate, options: MethodOptions): GaxiosPromise[SchemaSignupUrl] = js.native
  def create(
    params: ParamsResourceSignupurlsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSignupUrl]
  ): Unit = js.native
  /**
    * Creates an enterprise signup URL.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidmanagement = google.androidmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidmanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidmanagement.signupUrls.create({
    *     // The callback URL that the admin will be redirected to after successfully creating an enterprise. Before redirecting there the system will add a query parameter to this URL named enterpriseToken which will contain an opaque token to be used for the create enterprise request. The URL will be parsed then reformatted in order to add the enterpriseToken parameter, so there may be some minor formatting changes.
    *     callbackUrl: 'placeholder-value',
    *     // The ID of the Google Cloud Platform project which will own the enterprise.
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "url": "my_url"
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
  def create(params: ParamsResourceSignupurlsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceSignupurlsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
