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

@JSImport("googleapis/build/src/apis/alertcenter/v1beta1", "alertcenter_v1beta1.Resource$Alerts")
@js.native
open class ResourceAlerts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchDelete(): GaxiosPromise[SchemaBatchDeleteAlertsResponse] = js.native
  def batchDelete(callback: BodyResponseCallback[SchemaBatchDeleteAlertsResponse]): Unit = js.native
  def batchDelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchDeleteAlertsResponse] = js.native
  def batchDelete(params: ParamsResourceAlertsBatchdelete): GaxiosPromise[SchemaBatchDeleteAlertsResponse] = js.native
  def batchDelete(
    params: ParamsResourceAlertsBatchdelete,
    callback: BodyResponseCallback[SchemaBatchDeleteAlertsResponse]
  ): Unit = js.native
  def batchDelete(
    params: ParamsResourceAlertsBatchdelete,
    options: BodyResponseCallback[Readable | SchemaBatchDeleteAlertsResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchDeleteAlertsResponse]
  ): Unit = js.native
  def batchDelete(params: ParamsResourceAlertsBatchdelete, options: MethodOptions): GaxiosPromise[SchemaBatchDeleteAlertsResponse] = js.native
  def batchDelete(
    params: ParamsResourceAlertsBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchDeleteAlertsResponse]
  ): Unit = js.native
  /**
    * Performs batch delete operation on alerts.
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
    *   const res = await alertcenter.alerts.batchDelete({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alertId": [],
    *       //   "customerId": "my_customerId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "failedAlertStatus": {},
    *   //   "successAlertIds": []
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
  def batchDelete(params: ParamsResourceAlertsBatchdelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchDelete(
    params: ParamsResourceAlertsBatchdelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchUndelete(): GaxiosPromise[SchemaBatchUndeleteAlertsResponse] = js.native
  def batchUndelete(callback: BodyResponseCallback[SchemaBatchUndeleteAlertsResponse]): Unit = js.native
  def batchUndelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchUndeleteAlertsResponse] = js.native
  def batchUndelete(params: ParamsResourceAlertsBatchundelete): GaxiosPromise[SchemaBatchUndeleteAlertsResponse] = js.native
  def batchUndelete(
    params: ParamsResourceAlertsBatchundelete,
    callback: BodyResponseCallback[SchemaBatchUndeleteAlertsResponse]
  ): Unit = js.native
  def batchUndelete(
    params: ParamsResourceAlertsBatchundelete,
    options: BodyResponseCallback[Readable | SchemaBatchUndeleteAlertsResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchUndeleteAlertsResponse]
  ): Unit = js.native
  def batchUndelete(params: ParamsResourceAlertsBatchundelete, options: MethodOptions): GaxiosPromise[SchemaBatchUndeleteAlertsResponse] = js.native
  def batchUndelete(
    params: ParamsResourceAlertsBatchundelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchUndeleteAlertsResponse]
  ): Unit = js.native
  /**
    * Performs batch undelete operation on alerts.
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
    *   const res = await alertcenter.alerts.batchUndelete({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alertId": [],
    *       //   "customerId": "my_customerId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "failedAlertStatus": {},
    *   //   "successAlertIds": []
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
  def batchUndelete(params: ParamsResourceAlertsBatchundelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchUndelete(
    params: ParamsResourceAlertsBatchundelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAlertsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAlertsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceAlertsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAlertsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAlertsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Marks the specified alert for deletion. An alert that has been marked for deletion is removed from Alert Center after 30 days. Marking an alert for deletion has no effect on an alert which has already been marked for deletion. Attempting to mark a nonexistent alert for deletion results in a `NOT_FOUND` error.
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
    *   const res = await alertcenter.alerts.delete({
    *     // Required. The identifier of the alert to delete.
    *     alertId: 'placeholder-value',
    *     // Optional. The unique identifier of the Google Workspace organization account of the customer the alert is associated with. Inferred from the caller identity if not provided.
    *     customerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceAlertsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAlertsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var feedback: ResourceAlertsFeedback = js.native
  
  def get(): GaxiosPromise[SchemaAlert] = js.native
  def get(callback: BodyResponseCallback[SchemaAlert]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAlert] = js.native
  def get(params: ParamsResourceAlertsGet): GaxiosPromise[SchemaAlert] = js.native
  def get(params: ParamsResourceAlertsGet, callback: BodyResponseCallback[SchemaAlert]): Unit = js.native
  def get(
    params: ParamsResourceAlertsGet,
    options: BodyResponseCallback[Readable | SchemaAlert],
    callback: BodyResponseCallback[Readable | SchemaAlert]
  ): Unit = js.native
  def get(params: ParamsResourceAlertsGet, options: MethodOptions): GaxiosPromise[SchemaAlert] = js.native
  def get(
    params: ParamsResourceAlertsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAlert]
  ): Unit = js.native
  /**
    * Gets the specified alert. Attempting to get a nonexistent alert returns `NOT_FOUND` error.
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
    *   const res = await alertcenter.alerts.get({
    *     // Required. The identifier of the alert to retrieve.
    *     alertId: 'placeholder-value',
    *     // Optional. The unique identifier of the Google Workspace organization account of the customer the alert is associated with. Inferred from the caller identity if not provided.
    *     customerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alertId": "my_alertId",
    *   //   "createTime": "my_createTime",
    *   //   "customerId": "my_customerId",
    *   //   "data": {},
    *   //   "deleted": false,
    *   //   "endTime": "my_endTime",
    *   //   "etag": "my_etag",
    *   //   "metadata": {},
    *   //   "securityInvestigationToolLink": "my_securityInvestigationToolLink",
    *   //   "source": "my_source",
    *   //   "startTime": "my_startTime",
    *   //   "type": "my_type",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceAlertsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAlertsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getMetadata(): GaxiosPromise[SchemaAlertMetadata] = js.native
  def getMetadata(callback: BodyResponseCallback[SchemaAlertMetadata]): Unit = js.native
  def getMetadata(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAlertMetadata] = js.native
  def getMetadata(params: ParamsResourceAlertsGetmetadata): GaxiosPromise[SchemaAlertMetadata] = js.native
  def getMetadata(params: ParamsResourceAlertsGetmetadata, callback: BodyResponseCallback[SchemaAlertMetadata]): Unit = js.native
  def getMetadata(
    params: ParamsResourceAlertsGetmetadata,
    options: BodyResponseCallback[Readable | SchemaAlertMetadata],
    callback: BodyResponseCallback[Readable | SchemaAlertMetadata]
  ): Unit = js.native
  def getMetadata(params: ParamsResourceAlertsGetmetadata, options: MethodOptions): GaxiosPromise[SchemaAlertMetadata] = js.native
  def getMetadata(
    params: ParamsResourceAlertsGetmetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAlertMetadata]
  ): Unit = js.native
  /**
    * Returns the metadata of an alert. Attempting to get metadata for a non-existent alert returns `NOT_FOUND` error.
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
    *   const res = await alertcenter.alerts.getMetadata({
    *     // Required. The identifier of the alert this metadata belongs to.
    *     alertId: 'placeholder-value',
    *     // Optional. The unique identifier of the Google Workspace organization account of the customer the alert metadata is associated with. Inferred from the caller identity if not provided.
    *     customerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alertId": "my_alertId",
    *   //   "assignee": "my_assignee",
    *   //   "customerId": "my_customerId",
    *   //   "etag": "my_etag",
    *   //   "severity": "my_severity",
    *   //   "status": "my_status",
    *   //   "updateTime": "my_updateTime"
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
  def getMetadata(params: ParamsResourceAlertsGetmetadata, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getMetadata(
    params: ParamsResourceAlertsGetmetadata,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAlertsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAlertsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAlertsResponse] = js.native
  def list(params: ParamsResourceAlertsList): GaxiosPromise[SchemaListAlertsResponse] = js.native
  def list(params: ParamsResourceAlertsList, callback: BodyResponseCallback[SchemaListAlertsResponse]): Unit = js.native
  def list(
    params: ParamsResourceAlertsList,
    options: BodyResponseCallback[Readable | SchemaListAlertsResponse],
    callback: BodyResponseCallback[Readable | SchemaListAlertsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAlertsList, options: MethodOptions): GaxiosPromise[SchemaListAlertsResponse] = js.native
  def list(
    params: ParamsResourceAlertsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAlertsResponse]
  ): Unit = js.native
  /**
    * Lists the alerts.
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
    *   const res = await alertcenter.alerts.list({
    *     // Optional. The unique identifier of the Google Workspace organization account of the customer the alerts are associated with. Inferred from the caller identity if not provided.
    *     customerId: 'placeholder-value',
    *     // Optional. A query string for filtering alert results. For more details, see [Query filters](https://developers.google.com/admin-sdk/alertcenter/guides/query-filters) and [Supported query filter fields](https://developers.google.com/admin-sdk/alertcenter/reference/filter-fields#alerts.list).
    *     filter: 'placeholder-value',
    *     // Optional. The sort order of the list results. If not specified results may be returned in arbitrary order. You can sort the results in descending order based on the creation timestamp using `order_by="create_time desc"`. Currently, supported sorting are `create_time asc`, `create_time desc`, `update_time desc`
    *     orderBy: 'placeholder-value',
    *     // Optional. The requested page size. Server may return fewer items than requested. If unspecified, server picks an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // Optional. A token identifying a page of results the server should return. If empty, a new iteration is started. To continue an iteration, pass in the value from the previous ListAlertsResponse's next_page_token field.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alerts": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceAlertsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAlertsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def undelete(): GaxiosPromise[SchemaAlert] = js.native
  def undelete(callback: BodyResponseCallback[SchemaAlert]): Unit = js.native
  def undelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAlert] = js.native
  def undelete(params: ParamsResourceAlertsUndelete): GaxiosPromise[SchemaAlert] = js.native
  def undelete(params: ParamsResourceAlertsUndelete, callback: BodyResponseCallback[SchemaAlert]): Unit = js.native
  def undelete(
    params: ParamsResourceAlertsUndelete,
    options: BodyResponseCallback[Readable | SchemaAlert],
    callback: BodyResponseCallback[Readable | SchemaAlert]
  ): Unit = js.native
  def undelete(params: ParamsResourceAlertsUndelete, options: MethodOptions): GaxiosPromise[SchemaAlert] = js.native
  def undelete(
    params: ParamsResourceAlertsUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAlert]
  ): Unit = js.native
  /**
    * Restores, or "undeletes", an alert that was marked for deletion within the past 30 days. Attempting to undelete an alert which was marked for deletion over 30 days ago (which has been removed from the Alert Center database) or a nonexistent alert returns a `NOT_FOUND` error. Attempting to undelete an alert which has not been marked for deletion has no effect.
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
    *   const res = await alertcenter.alerts.undelete({
    *     // Required. The identifier of the alert to undelete.
    *     alertId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "customerId": "my_customerId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alertId": "my_alertId",
    *   //   "createTime": "my_createTime",
    *   //   "customerId": "my_customerId",
    *   //   "data": {},
    *   //   "deleted": false,
    *   //   "endTime": "my_endTime",
    *   //   "etag": "my_etag",
    *   //   "metadata": {},
    *   //   "securityInvestigationToolLink": "my_securityInvestigationToolLink",
    *   //   "source": "my_source",
    *   //   "startTime": "my_startTime",
    *   //   "type": "my_type",
    *   //   "updateTime": "my_updateTime"
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
  def undelete(params: ParamsResourceAlertsUndelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def undelete(
    params: ParamsResourceAlertsUndelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
