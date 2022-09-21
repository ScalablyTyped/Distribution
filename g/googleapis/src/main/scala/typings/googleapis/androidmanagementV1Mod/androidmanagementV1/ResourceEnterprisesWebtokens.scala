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

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Enterprises$Webtokens")
@js.native
open class ResourceEnterprisesWebtokens protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaWebToken] = js.native
  def create(callback: BodyResponseCallback[SchemaWebToken]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebToken] = js.native
  def create(params: ParamsResourceEnterprisesWebtokensCreate): GaxiosPromise[SchemaWebToken] = js.native
  def create(params: ParamsResourceEnterprisesWebtokensCreate, callback: BodyResponseCallback[SchemaWebToken]): Unit = js.native
  def create(
    params: ParamsResourceEnterprisesWebtokensCreate,
    options: BodyResponseCallback[Readable | SchemaWebToken],
    callback: BodyResponseCallback[Readable | SchemaWebToken]
  ): Unit = js.native
  def create(params: ParamsResourceEnterprisesWebtokensCreate, options: MethodOptions): GaxiosPromise[SchemaWebToken] = js.native
  def create(
    params: ParamsResourceEnterprisesWebtokensCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebToken]
  ): Unit = js.native
  /**
    * Creates a web token to access an embeddable managed Google Play web UI for a given enterprise.
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
    *   const res = await androidmanagement.enterprises.webTokens.create({
    *     // The name of the enterprise in the form enterprises/{enterpriseId\}.
    *     parent: 'enterprises/my-enterprise',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "enabledFeatures": [],
    *       //   "name": "my_name",
    *       //   "parentFrameUrl": "my_parentFrameUrl",
    *       //   "permissions": [],
    *       //   "value": "my_value"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "enabledFeatures": [],
    *   //   "name": "my_name",
    *   //   "parentFrameUrl": "my_parentFrameUrl",
    *   //   "permissions": [],
    *   //   "value": "my_value"
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
  def create(params: ParamsResourceEnterprisesWebtokensCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceEnterprisesWebtokensCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
