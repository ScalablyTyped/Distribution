package typings.googleapis.buildSrcApisAlertcenterV1beta1Mod.alertcenter_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/alertcenter/v1beta1", "alertcenter_v1beta1.Resource$Alerts$Feedback")
@js.native
class ResourceDollarAlertsDollarFeedback protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * alertcenter.alerts.feedback.create
    * @desc Creates new feedback for an alert. Attempting to create a feedback
    * for a non-existent alert returns `NOT_FOUND` error.
    * @alias alertcenter.alerts.feedback.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.alertId Required. The identifier of the alert this feedback belongs to.
    * @param {string=} params.customerId Optional. The unique identifier of the G Suite organization account of the customer the alert is associated with. Inferred from the caller identity if not provided.
    * @param {().AlertFeedback} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$AlertFeedback] = js.native
  def create(callback: BodyResponseCallback[Schema$AlertFeedback]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAlertsDollarFeedbackDollarCreate): GaxiosPromise[Schema$AlertFeedback] = js.native
  def create(
    params: ParamsDollarResourceDollarAlertsDollarFeedbackDollarCreate,
    callback: BodyResponseCallback[Schema$AlertFeedback]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAlertsDollarFeedbackDollarCreate,
    options: BodyResponseCallback[Schema$AlertFeedback],
    callback: BodyResponseCallback[Schema$AlertFeedback]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarAlertsDollarFeedbackDollarCreate, options: MethodOptions): GaxiosPromise[Schema$AlertFeedback] = js.native
  def create(
    params: ParamsDollarResourceDollarAlertsDollarFeedbackDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AlertFeedback]
  ): Unit = js.native
  /**
    * alertcenter.alerts.feedback.list
    * @desc Lists all the feedback for an alert. Attempting to list feedbacks
    * for a non-existent alert returns `NOT_FOUND` error.
    * @alias alertcenter.alerts.feedback.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.alertId Required. The alert identifier. The "-" wildcard could be used to represent all alerts.
    * @param {string=} params.customerId Optional. The unique identifier of the G Suite organization account of the customer the alert feedback are associated with. Inferred from the caller identity if not provided.
    * @param {string=} params.filter Optional. A query string for filtering alert feedback results. For more details, see [Query filters](/admin-sdk/alertcenter/guides/query-filters) and [Supported query filter fields](/admin-sdk/alertcenter/reference/filter-fields#alerts.feedback.list).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListAlertFeedbackResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListAlertFeedbackResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAlertsDollarFeedbackDollarList): GaxiosPromise[Schema$ListAlertFeedbackResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAlertsDollarFeedbackDollarList,
    callback: BodyResponseCallback[Schema$ListAlertFeedbackResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAlertsDollarFeedbackDollarList,
    options: BodyResponseCallback[Schema$ListAlertFeedbackResponse],
    callback: BodyResponseCallback[Schema$ListAlertFeedbackResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAlertsDollarFeedbackDollarList, options: MethodOptions): GaxiosPromise[Schema$ListAlertFeedbackResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAlertsDollarFeedbackDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListAlertFeedbackResponse]
  ): Unit = js.native
}

