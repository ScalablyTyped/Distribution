package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Imagefamilyviews")
@js.native
open class ResourceImagefamilyviews protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaImageFamilyView] = js.native
  def get(callback: BodyResponseCallback[SchemaImageFamilyView]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaImageFamilyView] = js.native
  def get(params: ParamsResourceImagefamilyviewsGet): GaxiosPromise[SchemaImageFamilyView] = js.native
  def get(params: ParamsResourceImagefamilyviewsGet, callback: BodyResponseCallback[SchemaImageFamilyView]): Unit = js.native
  def get(
    params: ParamsResourceImagefamilyviewsGet,
    options: BodyResponseCallback[Readable | SchemaImageFamilyView],
    callback: BodyResponseCallback[Readable | SchemaImageFamilyView]
  ): Unit = js.native
  def get(params: ParamsResourceImagefamilyviewsGet, options: MethodOptions): GaxiosPromise[SchemaImageFamilyView] = js.native
  def get(
    params: ParamsResourceImagefamilyviewsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaImageFamilyView]
  ): Unit = js.native
  /**
    * Returns the latest image that is part of an image family, is not deprecated and is rolled out in the specified zone.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.imageFamilyViews.get({
    *     // Name of the image family to search for.
    *     family: '[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?|[1-9][0-9]{0,19}',
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // The name of the zone for this request.
    *     zone: '[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "image": {}
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
  def get(params: ParamsResourceImagefamilyviewsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceImagefamilyviewsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
