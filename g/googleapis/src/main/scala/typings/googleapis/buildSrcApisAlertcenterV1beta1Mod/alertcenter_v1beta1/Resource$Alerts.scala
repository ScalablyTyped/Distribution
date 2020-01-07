package typings.googleapis.buildSrcApisAlertcenterV1beta1Mod.alertcenter_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/alertcenter/v1beta1", "alertcenter_v1beta1.Resource$Alerts")
@js.native
class Resource$Alerts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var feedback: ResourceDollarAlertsDollarFeedback = js.native
  /**
    * alertcenter.alerts.delete
    * @desc Marks the specified alert for deletion. An alert that has been
    * marked for deletion is removed from Alert Center after 30 days. Marking
    * an alert for deletion has no effect on an alert which has already been
    * marked for deletion. Attempting to mark a nonexistent alert for deletion
    * results in a `NOT_FOUND` error.
    * @alias alertcenter.alerts.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.alertId Required. The identifier of the alert to delete.
    * @param {string=} params.customerId Optional. The unique identifier of the G Suite organization account of the customer the alert is associated with. Inferred from the caller identity if not provided.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAlertsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(params: ParamsDollarResourceDollarAlertsDollarDelete, callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAlertsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAlertsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarAlertsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * alertcenter.alerts.get
    * @desc Gets the specified alert. Attempting to get a nonexistent alert
    * returns `NOT_FOUND` error.
    * @alias alertcenter.alerts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.alertId Required. The identifier of the alert to retrieve.
    * @param {string=} params.customerId Optional. The unique identifier of the G Suite organization account of the customer the alert is associated with. Inferred from the caller identity if not provided.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Alert] = js.native
  def get(callback: BodyResponseCallback[Schema$Alert]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAlertsDollarGet): GaxiosPromise[Schema$Alert] = js.native
  def get(params: ParamsDollarResourceDollarAlertsDollarGet, callback: BodyResponseCallback[Schema$Alert]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAlertsDollarGet,
    options: BodyResponseCallback[Schema$Alert],
    callback: BodyResponseCallback[Schema$Alert]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAlertsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Alert] = js.native
  def get(
    params: ParamsDollarResourceDollarAlertsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Alert]
  ): Unit = js.native
  /**
    * alertcenter.alerts.list
    * @desc Lists the alerts.
    * @alias alertcenter.alerts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.customerId Optional. The unique identifier of the G Suite organization account of the customer the alerts are associated with. Inferred from the caller identity if not provided.
    * @param {string=} params.filter Optional. A query string for filtering alert results. For more details, see [Query filters](/admin-sdk/alertcenter/guides/query-filters) and [Supported query filter fields](/admin-sdk/alertcenter/reference/filter-fields#alerts.list).
    * @param {string=} params.orderBy Optional. The sort order of the list results. If not specified results may be returned in arbitrary order. You can sort the results in descending order based on the creation timestamp using `order_by="create_time desc"`. Currently, only sorting by `create_time desc` is supported.
    * @param {integer=} params.pageSize Optional. The requested page size. Server may return fewer items than requested. If unspecified, server picks an appropriate default.
    * @param {string=} params.pageToken Optional. A token identifying a page of results the server should return. If empty, a new iteration is started. To continue an iteration, pass in the value from the previous ListAlertsResponse's next_page_token field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListAlertsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListAlertsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAlertsDollarList): GaxiosPromise[Schema$ListAlertsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAlertsDollarList,
    callback: BodyResponseCallback[Schema$ListAlertsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAlertsDollarList,
    options: BodyResponseCallback[Schema$ListAlertsResponse],
    callback: BodyResponseCallback[Schema$ListAlertsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAlertsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListAlertsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAlertsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListAlertsResponse]
  ): Unit = js.native
  /**
    * alertcenter.alerts.undelete
    * @desc Restores, or "undeletes", an alert that was marked for deletion
    * within the past 30 days. Attempting to undelete an alert which was marked
    * for deletion over 30 days ago (which has been removed from the Alert
    * Center database) or a nonexistent alert returns a `NOT_FOUND` error.
    * Attempting to undelete an alert which has not been marked for deletion
    * has no effect.
    * @alias alertcenter.alerts.undelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.alertId Required. The identifier of the alert to undelete.
    * @param {().UndeleteAlertRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def undelete(): GaxiosPromise[Schema$Alert] = js.native
  def undelete(callback: BodyResponseCallback[Schema$Alert]): Unit = js.native
  def undelete(params: ParamsDollarResourceDollarAlertsDollarUndelete): GaxiosPromise[Schema$Alert] = js.native
  def undelete(
    params: ParamsDollarResourceDollarAlertsDollarUndelete,
    callback: BodyResponseCallback[Schema$Alert]
  ): Unit = js.native
  def undelete(
    params: ParamsDollarResourceDollarAlertsDollarUndelete,
    options: BodyResponseCallback[Schema$Alert],
    callback: BodyResponseCallback[Schema$Alert]
  ): Unit = js.native
  def undelete(params: ParamsDollarResourceDollarAlertsDollarUndelete, options: MethodOptions): GaxiosPromise[Schema$Alert] = js.native
  def undelete(
    params: ParamsDollarResourceDollarAlertsDollarUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Alert]
  ): Unit = js.native
}

