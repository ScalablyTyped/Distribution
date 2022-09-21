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

@JSImport("googleapis/build/src/apis/chromemanagement/v1", "chromemanagement_v1.Resource$Customers$Apps")
@js.native
open class ResourceCustomersApps protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var android: ResourceCustomersAppsAndroid = js.native
  
  var chrome: ResourceCustomersAppsChrome = js.native
  
  var context: APIRequestContext = js.native
  
  def countChromeAppRequests(): GaxiosPromise[SchemaGoogleChromeManagementV1CountChromeAppRequestsResponse] = js.native
  def countChromeAppRequests(callback: BodyResponseCallback[SchemaGoogleChromeManagementV1CountChromeAppRequestsResponse]): Unit = js.native
  def countChromeAppRequests(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleChromeManagementV1CountChromeAppRequestsResponse] = js.native
  def countChromeAppRequests(params: ParamsResourceCustomersAppsCountchromeapprequests): GaxiosPromise[SchemaGoogleChromeManagementV1CountChromeAppRequestsResponse] = js.native
  def countChromeAppRequests(
    params: ParamsResourceCustomersAppsCountchromeapprequests,
    callback: BodyResponseCallback[SchemaGoogleChromeManagementV1CountChromeAppRequestsResponse]
  ): Unit = js.native
  def countChromeAppRequests(
    params: ParamsResourceCustomersAppsCountchromeapprequests,
    options: BodyResponseCallback[Readable | SchemaGoogleChromeManagementV1CountChromeAppRequestsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleChromeManagementV1CountChromeAppRequestsResponse]
  ): Unit = js.native
  def countChromeAppRequests(params: ParamsResourceCustomersAppsCountchromeapprequests, options: MethodOptions): GaxiosPromise[SchemaGoogleChromeManagementV1CountChromeAppRequestsResponse] = js.native
  def countChromeAppRequests(
    params: ParamsResourceCustomersAppsCountchromeapprequests,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleChromeManagementV1CountChromeAppRequestsResponse]
  ): Unit = js.native
  /**
    * Generate summary of app installation requests.
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
    *   const res = await chromemanagement.customers.apps.countChromeAppRequests({
    *     // Required. Customer id or "my_customer" to use the customer associated to the account making the request.
    *     customer: 'customers/my-customer',
    *     // Field used to order results. Supported fields: * request_count * latest_request_time
    *     orderBy: 'placeholder-value',
    *     // The ID of the organizational unit.
    *     orgUnitId: 'placeholder-value',
    *     // Maximum number of results to return. Maximum and default are 50, anything above will be coerced to 50.
    *     pageSize: 'placeholder-value',
    *     // Token to specify the page of the request to be returned.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "requestedApps": [],
    *   //   "totalSize": 0
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
  def countChromeAppRequests(params: ParamsResourceCustomersAppsCountchromeapprequests, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def countChromeAppRequests(
    params: ParamsResourceCustomersAppsCountchromeapprequests,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var web: ResourceCustomersAppsWeb = js.native
}
