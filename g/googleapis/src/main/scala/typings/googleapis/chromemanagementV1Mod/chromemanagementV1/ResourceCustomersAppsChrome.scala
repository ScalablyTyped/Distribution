package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/chromemanagement/v1", "chromemanagement_v1.Resource$Customers$Apps$Chrome")
@js.native
open class ResourceCustomersAppsChrome protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleChromeManagementV1AppDetails] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleChromeManagementV1AppDetails]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleChromeManagementV1AppDetails] = js.native
  def get(params: ParamsResourceCustomersAppsChromeGet): GaxiosPromise[SchemaGoogleChromeManagementV1AppDetails] = js.native
  def get(
    params: ParamsResourceCustomersAppsChromeGet,
    callback: BodyResponseCallback[SchemaGoogleChromeManagementV1AppDetails]
  ): Unit = js.native
  def get(
    params: ParamsResourceCustomersAppsChromeGet,
    options: BodyResponseCallback[Readable | SchemaGoogleChromeManagementV1AppDetails],
    callback: BodyResponseCallback[Readable | SchemaGoogleChromeManagementV1AppDetails]
  ): Unit = js.native
  def get(params: ParamsResourceCustomersAppsChromeGet, options: MethodOptions): GaxiosPromise[SchemaGoogleChromeManagementV1AppDetails] = js.native
  def get(
    params: ParamsResourceCustomersAppsChromeGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleChromeManagementV1AppDetails]
  ): Unit = js.native
  /**
    * Get a specific app for a customer by its resource name.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/chromemanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const chromemanagement = google.chromemanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/chrome.management.appdetails.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await chromemanagement.customers.apps.chrome.get({
    *     // Required. The app for which details are being queried. Examples: "customers/my_customer/apps/chrome/gmbmikajjgmnabiglmofipeabaddhgne@2.1.2" for the Save to Google Drive Chrome extension version 2.1.2, "customers/my_customer/apps/android/com.google.android.apps.docs" for the Google Drive Android app's latest version.
    *     name: 'customers/my-customer/apps/chrome/[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "androidAppInfo": {},
    *   //   "appId": "my_appId",
    *   //   "chromeAppInfo": {},
    *   //   "description": "my_description",
    *   //   "detailUri": "my_detailUri",
    *   //   "displayName": "my_displayName",
    *   //   "firstPublishTime": "my_firstPublishTime",
    *   //   "homepageUri": "my_homepageUri",
    *   //   "iconUri": "my_iconUri",
    *   //   "isPaidApp": false,
    *   //   "latestPublishTime": "my_latestPublishTime",
    *   //   "name": "my_name",
    *   //   "privacyPolicyUri": "my_privacyPolicyUri",
    *   //   "publisher": "my_publisher",
    *   //   "reviewNumber": "my_reviewNumber",
    *   //   "reviewRating": {},
    *   //   "revisionId": "my_revisionId",
    *   //   "serviceError": {},
    *   //   "type": "my_type"
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
  def get(params: ParamsResourceCustomersAppsChromeGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCustomersAppsChromeGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
