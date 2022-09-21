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

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits$Countryavailability")
@js.native
open class ResourceEditsCountryavailability protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaTrackCountryAvailability] = js.native
  def get(callback: BodyResponseCallback[SchemaTrackCountryAvailability]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTrackCountryAvailability] = js.native
  def get(params: ParamsResourceEditsCountryavailabilityGet): GaxiosPromise[SchemaTrackCountryAvailability] = js.native
  def get(
    params: ParamsResourceEditsCountryavailabilityGet,
    callback: BodyResponseCallback[SchemaTrackCountryAvailability]
  ): Unit = js.native
  def get(
    params: ParamsResourceEditsCountryavailabilityGet,
    options: BodyResponseCallback[Readable | SchemaTrackCountryAvailability],
    callback: BodyResponseCallback[Readable | SchemaTrackCountryAvailability]
  ): Unit = js.native
  def get(params: ParamsResourceEditsCountryavailabilityGet, options: MethodOptions): GaxiosPromise[SchemaTrackCountryAvailability] = js.native
  def get(
    params: ParamsResourceEditsCountryavailabilityGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTrackCountryAvailability]
  ): Unit = js.native
  /**
    * Gets country availability.
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
    *   const res = await androidpublisher.edits.countryavailability.get({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *     // The track to read from.
    *     track: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "countries": [],
    *   //   "restOfWorld": false,
    *   //   "syncWithProduction": false
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
  def get(params: ParamsResourceEditsCountryavailabilityGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceEditsCountryavailabilityGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
