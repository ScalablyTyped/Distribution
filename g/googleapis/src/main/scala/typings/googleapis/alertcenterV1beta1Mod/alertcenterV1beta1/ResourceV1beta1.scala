package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/alertcenter/v1beta1", "alertcenter_v1beta1.Resource$V1beta1")
@js.native
open class ResourceV1beta1 protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getSettings(): GaxiosPromise[SchemaSettings] = js.native
  def getSettings(callback: BodyResponseCallback[SchemaSettings]): Unit = js.native
  def getSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSettings] = js.native
  def getSettings(params: ParamsResourceV1beta1Getsettings): GaxiosPromise[SchemaSettings] = js.native
  def getSettings(params: ParamsResourceV1beta1Getsettings, callback: BodyResponseCallback[SchemaSettings]): Unit = js.native
  def getSettings(
    params: ParamsResourceV1beta1Getsettings,
    options: BodyResponseCallback[Readable | SchemaSettings],
    callback: BodyResponseCallback[Readable | SchemaSettings]
  ): Unit = js.native
  def getSettings(params: ParamsResourceV1beta1Getsettings, options: MethodOptions): GaxiosPromise[SchemaSettings] = js.native
  def getSettings(
    params: ParamsResourceV1beta1Getsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSettings]
  ): Unit = js.native
  /**
    * Returns customer-level settings.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/alertcenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const alertcenter = google.alertcenter('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/apps.alerts'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await alertcenter.getSettings({
    *     // Optional. The unique identifier of the Google Workspace organization account of the customer the alert settings are associated with. Inferred from the caller identity if not provided.
    *     customerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "notifications": []
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
  def getSettings(params: ParamsResourceV1beta1Getsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getSettings(
    params: ParamsResourceV1beta1Getsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateSettings(): GaxiosPromise[SchemaSettings] = js.native
  def updateSettings(callback: BodyResponseCallback[SchemaSettings]): Unit = js.native
  def updateSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSettings] = js.native
  def updateSettings(params: ParamsResourceV1beta1Updatesettings): GaxiosPromise[SchemaSettings] = js.native
  def updateSettings(params: ParamsResourceV1beta1Updatesettings, callback: BodyResponseCallback[SchemaSettings]): Unit = js.native
  def updateSettings(
    params: ParamsResourceV1beta1Updatesettings,
    options: BodyResponseCallback[Readable | SchemaSettings],
    callback: BodyResponseCallback[Readable | SchemaSettings]
  ): Unit = js.native
  def updateSettings(params: ParamsResourceV1beta1Updatesettings, options: MethodOptions): GaxiosPromise[SchemaSettings] = js.native
  def updateSettings(
    params: ParamsResourceV1beta1Updatesettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSettings]
  ): Unit = js.native
  /**
    * Updates the customer-level settings.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/alertcenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const alertcenter = google.alertcenter('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/apps.alerts'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await alertcenter.updateSettings({
    *     // Optional. The unique identifier of the Google Workspace organization account of the customer the alert settings are associated with. Inferred from the caller identity if not provided.
    *     customerId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "notifications": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "notifications": []
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
  def updateSettings(params: ParamsResourceV1beta1Updatesettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateSettings(
    params: ParamsResourceV1beta1Updatesettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
