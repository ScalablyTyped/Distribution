package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits$Details")
@js.native
open class ResourceEditsDetails protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaAppDetails] = js.native
  def get(callback: BodyResponseCallback[SchemaAppDetails]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAppDetails] = js.native
  def get(params: ParamsResourceEditsDetailsGet): GaxiosPromise[SchemaAppDetails] = js.native
  def get(params: ParamsResourceEditsDetailsGet, callback: BodyResponseCallback[SchemaAppDetails]): Unit = js.native
  def get(
    params: ParamsResourceEditsDetailsGet,
    options: BodyResponseCallback[Readable | SchemaAppDetails],
    callback: BodyResponseCallback[Readable | SchemaAppDetails]
  ): Unit = js.native
  def get(params: ParamsResourceEditsDetailsGet, options: MethodOptions): GaxiosPromise[SchemaAppDetails] = js.native
  def get(
    params: ParamsResourceEditsDetailsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAppDetails]
  ): Unit = js.native
  /**
    * Gets details of an app.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidpublisher.edits.details.get({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contactEmail": "my_contactEmail",
    *   //   "contactPhone": "my_contactPhone",
    *   //   "contactWebsite": "my_contactWebsite",
    *   //   "defaultLanguage": "my_defaultLanguage"
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
  def get(params: ParamsResourceEditsDetailsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceEditsDetailsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaAppDetails] = js.native
  def patch(callback: BodyResponseCallback[SchemaAppDetails]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAppDetails] = js.native
  def patch(params: ParamsResourceEditsDetailsPatch): GaxiosPromise[SchemaAppDetails] = js.native
  def patch(params: ParamsResourceEditsDetailsPatch, callback: BodyResponseCallback[SchemaAppDetails]): Unit = js.native
  def patch(
    params: ParamsResourceEditsDetailsPatch,
    options: BodyResponseCallback[Readable | SchemaAppDetails],
    callback: BodyResponseCallback[Readable | SchemaAppDetails]
  ): Unit = js.native
  def patch(params: ParamsResourceEditsDetailsPatch, options: MethodOptions): GaxiosPromise[SchemaAppDetails] = js.native
  def patch(
    params: ParamsResourceEditsDetailsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAppDetails]
  ): Unit = js.native
  /**
    * Patches details of an app.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidpublisher.edits.details.patch({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "contactEmail": "my_contactEmail",
    *       //   "contactPhone": "my_contactPhone",
    *       //   "contactWebsite": "my_contactWebsite",
    *       //   "defaultLanguage": "my_defaultLanguage"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contactEmail": "my_contactEmail",
    *   //   "contactPhone": "my_contactPhone",
    *   //   "contactWebsite": "my_contactWebsite",
    *   //   "defaultLanguage": "my_defaultLanguage"
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
  def patch(params: ParamsResourceEditsDetailsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceEditsDetailsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaAppDetails] = js.native
  def update(callback: BodyResponseCallback[SchemaAppDetails]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAppDetails] = js.native
  def update(params: ParamsResourceEditsDetailsUpdate): GaxiosPromise[SchemaAppDetails] = js.native
  def update(params: ParamsResourceEditsDetailsUpdate, callback: BodyResponseCallback[SchemaAppDetails]): Unit = js.native
  def update(
    params: ParamsResourceEditsDetailsUpdate,
    options: BodyResponseCallback[Readable | SchemaAppDetails],
    callback: BodyResponseCallback[Readable | SchemaAppDetails]
  ): Unit = js.native
  def update(params: ParamsResourceEditsDetailsUpdate, options: MethodOptions): GaxiosPromise[SchemaAppDetails] = js.native
  def update(
    params: ParamsResourceEditsDetailsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAppDetails]
  ): Unit = js.native
  /**
    * Updates details of an app.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidpublisher.edits.details.update({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "contactEmail": "my_contactEmail",
    *       //   "contactPhone": "my_contactPhone",
    *       //   "contactWebsite": "my_contactWebsite",
    *       //   "defaultLanguage": "my_defaultLanguage"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contactEmail": "my_contactEmail",
    *   //   "contactPhone": "my_contactPhone",
    *   //   "contactWebsite": "my_contactWebsite",
    *   //   "defaultLanguage": "my_defaultLanguage"
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
  def update(params: ParamsResourceEditsDetailsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceEditsDetailsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
