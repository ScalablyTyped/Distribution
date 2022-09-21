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

@JSImport("googleapis/build/src/apis/alertcenter/v1beta1", "alertcenter_v1beta1.Resource$Alerts$Feedback")
@js.native
open class ResourceAlertsFeedback protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaAlertFeedback] = js.native
  def create(callback: BodyResponseCallback[SchemaAlertFeedback]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAlertFeedback] = js.native
  def create(params: ParamsResourceAlertsFeedbackCreate): GaxiosPromise[SchemaAlertFeedback] = js.native
  def create(params: ParamsResourceAlertsFeedbackCreate, callback: BodyResponseCallback[SchemaAlertFeedback]): Unit = js.native
  def create(
    params: ParamsResourceAlertsFeedbackCreate,
    options: BodyResponseCallback[Readable | SchemaAlertFeedback],
    callback: BodyResponseCallback[Readable | SchemaAlertFeedback]
  ): Unit = js.native
  def create(params: ParamsResourceAlertsFeedbackCreate, options: MethodOptions): GaxiosPromise[SchemaAlertFeedback] = js.native
  def create(
    params: ParamsResourceAlertsFeedbackCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAlertFeedback]
  ): Unit = js.native
  /**
    * Creates new feedback for an alert. Attempting to create a feedback for a non-existent alert returns `NOT_FOUND` error. Attempting to create a feedback for an alert that is marked for deletion returns `FAILED_PRECONDITION' error.
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
    *   const res = await alertcenter.alerts.feedback.create({
    *     // Required. The identifier of the alert this feedback belongs to.
    *     alertId: 'placeholder-value',
    *     // Optional. The unique identifier of the Google Workspace organization account of the customer the alert is associated with. Inferred from the caller identity if not provided.
    *     customerId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alertId": "my_alertId",
    *       //   "createTime": "my_createTime",
    *       //   "customerId": "my_customerId",
    *       //   "email": "my_email",
    *       //   "feedbackId": "my_feedbackId",
    *       //   "type": "my_type"
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
    *   //   "email": "my_email",
    *   //   "feedbackId": "my_feedbackId",
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
  def create(params: ParamsResourceAlertsFeedbackCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAlertsFeedbackCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAlertFeedbackResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAlertFeedbackResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAlertFeedbackResponse] = js.native
  def list(params: ParamsResourceAlertsFeedbackList): GaxiosPromise[SchemaListAlertFeedbackResponse] = js.native
  def list(
    params: ParamsResourceAlertsFeedbackList,
    callback: BodyResponseCallback[SchemaListAlertFeedbackResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAlertsFeedbackList,
    options: BodyResponseCallback[Readable | SchemaListAlertFeedbackResponse],
    callback: BodyResponseCallback[Readable | SchemaListAlertFeedbackResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAlertsFeedbackList, options: MethodOptions): GaxiosPromise[SchemaListAlertFeedbackResponse] = js.native
  def list(
    params: ParamsResourceAlertsFeedbackList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAlertFeedbackResponse]
  ): Unit = js.native
  /**
    * Lists all the feedback for an alert. Attempting to list feedbacks for a non-existent alert returns `NOT_FOUND` error.
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
    *   const res = await alertcenter.alerts.feedback.list({
    *     // Required. The alert identifier. The "-" wildcard could be used to represent all alerts.
    *     alertId: 'placeholder-value',
    *     // Optional. The unique identifier of the Google Workspace organization account of the customer the alert feedback are associated with. Inferred from the caller identity if not provided.
    *     customerId: 'placeholder-value',
    *     // Optional. A query string for filtering alert feedback results. For more details, see [Query filters](https://developers.google.com/admin-sdk/alertcenter/guides/query-filters) and [Supported query filter fields](https://developers.google.com/admin-sdk/alertcenter/reference/filter-fields#alerts.feedback.list).
    *     filter: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "feedback": []
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
  def list(params: ParamsResourceAlertsFeedbackList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAlertsFeedbackList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
