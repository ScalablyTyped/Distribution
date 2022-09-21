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

@JSImport("googleapis/build/src/apis/chromemanagement/v1", "chromemanagement_v1.Resource$Customers$Reports")
@js.native
open class ResourceCustomersReports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def countChromeDevicesReachingAutoExpirationDate(): GaxiosPromise[
    SchemaGoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse
  ] = js.native
  def countChromeDevicesReachingAutoExpirationDate(
    callback: BodyResponseCallback[
      SchemaGoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse
    ]
  ): Unit = js.native
  def countChromeDevicesReachingAutoExpirationDate(params: Unit, options: MethodOptions): GaxiosPromise[
    SchemaGoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse
  ] = js.native
  def countChromeDevicesReachingAutoExpirationDate(params: ParamsResourceCustomersReportsCountchromedevicesreachingautoexpirationdate): GaxiosPromise[
    SchemaGoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse
  ] = js.native
  def countChromeDevicesReachingAutoExpirationDate(
    params: ParamsResourceCustomersReportsCountchromedevicesreachingautoexpirationdate,
    callback: BodyResponseCallback[
      SchemaGoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse
    ]
  ): Unit = js.native
  def countChromeDevicesReachingAutoExpirationDate(
    params: ParamsResourceCustomersReportsCountchromedevicesreachingautoexpirationdate,
    options: BodyResponseCallback[
      Readable | SchemaGoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse
    ]
  ): Unit = js.native
  def countChromeDevicesReachingAutoExpirationDate(
    params: ParamsResourceCustomersReportsCountchromedevicesreachingautoexpirationdate,
    options: MethodOptions
  ): GaxiosPromise[
    SchemaGoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse
  ] = js.native
  def countChromeDevicesReachingAutoExpirationDate(
    params: ParamsResourceCustomersReportsCountchromedevicesreachingautoexpirationdate,
    options: MethodOptions,
    callback: BodyResponseCallback[
      SchemaGoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse
    ]
  ): Unit = js.native
  /**
    * Generate report of the number of devices expiring in each month of the selected time frame. Devices are grouped by auto update expiration date and model. Further information can be found [here](https://support.google.com/chrome/a/answer/10564947).
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
    *       'https://www.googleapis.com/auth/chrome.management.reports.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await chromemanagement.customers.reports.countChromeDevicesReachingAutoExpirationDate(
    *       {
    *         // Required. The customer ID or "my_customer" prefixed with "customers/".
    *         customer: 'customers/my-customer',
    *         // Optional. Maximum expiration date in format yyyy-mm-dd in UTC timezone. If included returns all devices that have already expired and devices with auto expiration date equal to or earlier than the maximum date.
    *         maxAueDate: 'placeholder-value',
    *         // Optional. Maximum expiration date in format yyyy-mm-dd in UTC timezone. If included returns all devices that have already expired and devices with auto expiration date equal to or later than the minimum date.
    *         minAueDate: 'placeholder-value',
    *         // Optional. The organizational unit ID, if omitted, will return data for all organizational units.
    *         orgUnitId: 'placeholder-value',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deviceAueCountReports": []
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
  def countChromeDevicesReachingAutoExpirationDate(
    params: ParamsResourceCustomersReportsCountchromedevicesreachingautoexpirationdate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def countChromeDevicesReachingAutoExpirationDate(
    params: ParamsResourceCustomersReportsCountchromedevicesreachingautoexpirationdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def countChromeDevicesThatNeedAttention(): GaxiosPromise[SchemaGoogleChromeManagementV1CountChromeDevicesThatNeedAttentionResponse] = js.native
  def countChromeDevicesThatNeedAttention(
    callback: BodyResponseCallback[SchemaGoogleChromeManagementV1CountChromeDevicesThatNeedAttentionResponse]
  ): Unit = js.native
  def countChromeDevicesThatNeedAttention(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleChromeManagementV1CountChromeDevicesThatNeedAttentionResponse] = js.native
  def countChromeDevicesThatNeedAttention(params: ParamsResourceCustomersReportsCountchromedevicesthatneedattention): GaxiosPromise[SchemaGoogleChromeManagementV1CountChromeDevicesThatNeedAttentionResponse] = js.native
  def countChromeDevicesThatNeedAttention(
    params: ParamsResourceCustomersReportsCountchromedevicesthatneedattention,
    callback: BodyResponseCallback[SchemaGoogleChromeManagementV1CountChromeDevicesThatNeedAttentionResponse]
  ): Unit = js.native
  def countChromeDevicesThatNeedAttention(
    params: ParamsResourceCustomersReportsCountchromedevicesthatneedattention,
    options: BodyResponseCallback[
      Readable | SchemaGoogleChromeManagementV1CountChromeDevicesThatNeedAttentionResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleChromeManagementV1CountChromeDevicesThatNeedAttentionResponse
    ]
  ): Unit = js.native
  def countChromeDevicesThatNeedAttention(params: ParamsResourceCustomersReportsCountchromedevicesthatneedattention, options: MethodOptions): GaxiosPromise[SchemaGoogleChromeManagementV1CountChromeDevicesThatNeedAttentionResponse] = js.native
  def countChromeDevicesThatNeedAttention(
    params: ParamsResourceCustomersReportsCountchromedevicesthatneedattention,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleChromeManagementV1CountChromeDevicesThatNeedAttentionResponse]
  ): Unit = js.native
  /**
    * Counts of ChromeOS devices that have not synced policies or have lacked user activity in the past 28 days, are out of date, or are not complaint. Further information can be found here https://support.google.com/chrome/a/answer/10564947
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
    *       'https://www.googleapis.com/auth/chrome.management.reports.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await chromemanagement.customers.reports.countChromeDevicesThatNeedAttention(
    *       {
    *         // Required. The customer ID or "my_customer" prefixed with "customers/".
    *         customer: 'customers/my-customer',
    *         // Optional. The ID of the organizational unit. If omitted, all data will be returned.
    *         orgUnitId: 'placeholder-value',
    *         // Required. Mask of the fields that should be populated in the returned report.
    *         readMask: 'placeholder-value',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "noRecentPolicySyncCount": "my_noRecentPolicySyncCount",
    *   //   "noRecentUserActivityCount": "my_noRecentUserActivityCount",
    *   //   "osVersionNotCompliantCount": "my_osVersionNotCompliantCount",
    *   //   "pendingUpdate": "my_pendingUpdate",
    *   //   "unsupportedPolicyCount": "my_unsupportedPolicyCount"
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
  def countChromeDevicesThatNeedAttention(
    params: ParamsResourceCustomersReportsCountchromedevicesthatneedattention,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def countChromeDevicesThatNeedAttention(
    params: ParamsResourceCustomersReportsCountchromedevicesthatneedattention,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def countChromeVersions(): GaxiosPromise[SchemaGoogleChromeManagementV1CountChromeVersionsResponse] = js.native
  def countChromeVersions(callback: BodyResponseCallback[SchemaGoogleChromeManagementV1CountChromeVersionsResponse]): Unit = js.native
  def countChromeVersions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleChromeManagementV1CountChromeVersionsResponse] = js.native
  def countChromeVersions(params: ParamsResourceCustomersReportsCountchromeversions): GaxiosPromise[SchemaGoogleChromeManagementV1CountChromeVersionsResponse] = js.native
  def countChromeVersions(
    params: ParamsResourceCustomersReportsCountchromeversions,
    callback: BodyResponseCallback[SchemaGoogleChromeManagementV1CountChromeVersionsResponse]
  ): Unit = js.native
  def countChromeVersions(
    params: ParamsResourceCustomersReportsCountchromeversions,
    options: BodyResponseCallback[Readable | SchemaGoogleChromeManagementV1CountChromeVersionsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleChromeManagementV1CountChromeVersionsResponse]
  ): Unit = js.native
  def countChromeVersions(params: ParamsResourceCustomersReportsCountchromeversions, options: MethodOptions): GaxiosPromise[SchemaGoogleChromeManagementV1CountChromeVersionsResponse] = js.native
  def countChromeVersions(
    params: ParamsResourceCustomersReportsCountchromeversions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleChromeManagementV1CountChromeVersionsResponse]
  ): Unit = js.native
  /**
    * Generate report of installed Chrome versions.
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
    *       'https://www.googleapis.com/auth/chrome.management.reports.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await chromemanagement.customers.reports.countChromeVersions({
    *     // Required. Customer id or "my_customer" to use the customer associated to the account making the request.
    *     customer: 'customers/my-customer',
    *     // Query string to filter results, AND-separated fields in EBNF syntax. Note: OR operations are not supported in this filter. Supported filter fields: * last_active_date
    *     filter: 'placeholder-value',
    *     // The ID of the organizational unit.
    *     orgUnitId: 'placeholder-value',
    *     // Maximum number of results to return. Maximum and default are 100.
    *     pageSize: 'placeholder-value',
    *     // Token to specify the page of the request to be returned.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "browserVersions": [],
    *   //   "nextPageToken": "my_nextPageToken",
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
  def countChromeVersions(params: ParamsResourceCustomersReportsCountchromeversions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def countChromeVersions(
    params: ParamsResourceCustomersReportsCountchromeversions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def countInstalledApps(): GaxiosPromise[SchemaGoogleChromeManagementV1CountInstalledAppsResponse] = js.native
  def countInstalledApps(callback: BodyResponseCallback[SchemaGoogleChromeManagementV1CountInstalledAppsResponse]): Unit = js.native
  def countInstalledApps(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleChromeManagementV1CountInstalledAppsResponse] = js.native
  def countInstalledApps(params: ParamsResourceCustomersReportsCountinstalledapps): GaxiosPromise[SchemaGoogleChromeManagementV1CountInstalledAppsResponse] = js.native
  def countInstalledApps(
    params: ParamsResourceCustomersReportsCountinstalledapps,
    callback: BodyResponseCallback[SchemaGoogleChromeManagementV1CountInstalledAppsResponse]
  ): Unit = js.native
  def countInstalledApps(
    params: ParamsResourceCustomersReportsCountinstalledapps,
    options: BodyResponseCallback[Readable | SchemaGoogleChromeManagementV1CountInstalledAppsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleChromeManagementV1CountInstalledAppsResponse]
  ): Unit = js.native
  def countInstalledApps(params: ParamsResourceCustomersReportsCountinstalledapps, options: MethodOptions): GaxiosPromise[SchemaGoogleChromeManagementV1CountInstalledAppsResponse] = js.native
  def countInstalledApps(
    params: ParamsResourceCustomersReportsCountinstalledapps,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleChromeManagementV1CountInstalledAppsResponse]
  ): Unit = js.native
  /**
    * Generate report of app installations.
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
    *       'https://www.googleapis.com/auth/chrome.management.reports.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await chromemanagement.customers.reports.countInstalledApps({
    *     // Required. Customer id or "my_customer" to use the customer associated to the account making the request.
    *     customer: 'customers/my-customer',
    *     // Query string to filter results, AND-separated fields in EBNF syntax. Note: OR operations are not supported in this filter. Supported filter fields: * app_name * app_type * install_type * number_of_permissions * total_install_count * latest_profile_active_date * permission_name
    *     filter: 'placeholder-value',
    *     // Field used to order results. Supported order by fields: * app_name * app_type * install_type * number_of_permissions * total_install_count
    *     orderBy: 'placeholder-value',
    *     // The ID of the organizational unit.
    *     orgUnitId: 'placeholder-value',
    *     // Maximum number of results to return. Maximum and default are 100.
    *     pageSize: 'placeholder-value',
    *     // Token to specify the page of the request to be returned.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "installedApps": [],
    *   //   "nextPageToken": "my_nextPageToken",
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
  def countInstalledApps(params: ParamsResourceCustomersReportsCountinstalledapps, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def countInstalledApps(
    params: ParamsResourceCustomersReportsCountinstalledapps,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def findInstalledAppDevices(): GaxiosPromise[SchemaGoogleChromeManagementV1FindInstalledAppDevicesResponse] = js.native
  def findInstalledAppDevices(callback: BodyResponseCallback[SchemaGoogleChromeManagementV1FindInstalledAppDevicesResponse]): Unit = js.native
  def findInstalledAppDevices(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleChromeManagementV1FindInstalledAppDevicesResponse] = js.native
  def findInstalledAppDevices(params: ParamsResourceCustomersReportsFindinstalledappdevices): GaxiosPromise[SchemaGoogleChromeManagementV1FindInstalledAppDevicesResponse] = js.native
  def findInstalledAppDevices(
    params: ParamsResourceCustomersReportsFindinstalledappdevices,
    callback: BodyResponseCallback[SchemaGoogleChromeManagementV1FindInstalledAppDevicesResponse]
  ): Unit = js.native
  def findInstalledAppDevices(
    params: ParamsResourceCustomersReportsFindinstalledappdevices,
    options: BodyResponseCallback[Readable | SchemaGoogleChromeManagementV1FindInstalledAppDevicesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleChromeManagementV1FindInstalledAppDevicesResponse]
  ): Unit = js.native
  def findInstalledAppDevices(params: ParamsResourceCustomersReportsFindinstalledappdevices, options: MethodOptions): GaxiosPromise[SchemaGoogleChromeManagementV1FindInstalledAppDevicesResponse] = js.native
  def findInstalledAppDevices(
    params: ParamsResourceCustomersReportsFindinstalledappdevices,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleChromeManagementV1FindInstalledAppDevicesResponse]
  ): Unit = js.native
  /**
    * Generate report of devices that have a specified app installed.
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
    *       'https://www.googleapis.com/auth/chrome.management.reports.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await chromemanagement.customers.reports.findInstalledAppDevices({
    *     // Unique identifier of the app. For Chrome apps and extensions, the 32-character id (e.g. ehoadneljpdggcbbknedodolkkjodefl). For Android apps, the package name (e.g. com.evernote).
    *     appId: 'placeholder-value',
    *     // Type of the app.
    *     appType: 'placeholder-value',
    *     // Required. Customer id or "my_customer" to use the customer associated to the account making the request.
    *     customer: 'customers/my-customer',
    *     // Query string to filter results, AND-separated fields in EBNF syntax. Note: OR operations are not supported in this filter. Supported filter fields: * last_active_date
    *     filter: 'placeholder-value',
    *     // Field used to order results. Supported order by fields: * machine * device_id
    *     orderBy: 'placeholder-value',
    *     // The ID of the organizational unit.
    *     orgUnitId: 'placeholder-value',
    *     // Maximum number of results to return. Maximum and default are 100.
    *     pageSize: 'placeholder-value',
    *     // Token to specify the page of the request to be returned.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "devices": [],
    *   //   "nextPageToken": "my_nextPageToken",
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
  def findInstalledAppDevices(params: ParamsResourceCustomersReportsFindinstalledappdevices, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def findInstalledAppDevices(
    params: ParamsResourceCustomersReportsFindinstalledappdevices,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
