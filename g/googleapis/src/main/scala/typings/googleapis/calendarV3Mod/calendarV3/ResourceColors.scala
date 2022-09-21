package typings.googleapis.calendarV3Mod.calendarV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/calendar/v3", "calendar_v3.Resource$Colors")
@js.native
open class ResourceColors protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaColors] = js.native
  def get(callback: BodyResponseCallback[SchemaColors]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaColors] = js.native
  def get(params: ParamsResourceColorsGet): GaxiosPromise[SchemaColors] = js.native
  def get(params: ParamsResourceColorsGet, callback: BodyResponseCallback[SchemaColors]): Unit = js.native
  def get(
    params: ParamsResourceColorsGet,
    options: BodyResponseCallback[Readable | SchemaColors],
    callback: BodyResponseCallback[Readable | SchemaColors]
  ): Unit = js.native
  def get(params: ParamsResourceColorsGet, options: MethodOptions): GaxiosPromise[SchemaColors] = js.native
  def get(
    params: ParamsResourceColorsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaColors]
  ): Unit = js.native
  /**
    * Returns the color definitions for calendars and events.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/calendar.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const calendar = google.calendar('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/calendar',
    *       'https://www.googleapis.com/auth/calendar.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await calendar.colors.get({});
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "calendar": {},
    *   //   "event": {},
    *   //   "kind": "my_kind",
    *   //   "updated": "my_updated"
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
  def get(params: ParamsResourceColorsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceColorsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
