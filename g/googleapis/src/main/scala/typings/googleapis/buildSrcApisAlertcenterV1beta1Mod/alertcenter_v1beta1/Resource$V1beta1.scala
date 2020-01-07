package typings.googleapis.buildSrcApisAlertcenterV1beta1Mod.alertcenter_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/alertcenter/v1beta1", "alertcenter_v1beta1.Resource$V1beta1")
@js.native
class Resource$V1beta1 protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * alertcenter.getSettings
    * @desc Returns customer-level settings.
    * @alias alertcenter.getSettings
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.customerId Optional. The unique identifier of the G Suite organization account of the customer the alert settings are associated with. Inferred from the caller identity if not provided.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getSettings(): GaxiosPromise[Schema$Settings] = js.native
  def getSettings(callback: BodyResponseCallback[Schema$Settings]): Unit = js.native
  def getSettings(params: ParamsDollarResourceDollarV1beta1DollarGetsettings): GaxiosPromise[Schema$Settings] = js.native
  def getSettings(
    params: ParamsDollarResourceDollarV1beta1DollarGetsettings,
    callback: BodyResponseCallback[Schema$Settings]
  ): Unit = js.native
  def getSettings(
    params: ParamsDollarResourceDollarV1beta1DollarGetsettings,
    options: BodyResponseCallback[Schema$Settings],
    callback: BodyResponseCallback[Schema$Settings]
  ): Unit = js.native
  def getSettings(params: ParamsDollarResourceDollarV1beta1DollarGetsettings, options: MethodOptions): GaxiosPromise[Schema$Settings] = js.native
  def getSettings(
    params: ParamsDollarResourceDollarV1beta1DollarGetsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Settings]
  ): Unit = js.native
  /**
    * alertcenter.updateSettings
    * @desc Updates the customer-level settings.
    * @alias alertcenter.updateSettings
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.customerId Optional. The unique identifier of the G Suite organization account of the customer the alert settings are associated with. Inferred from the caller identity if not provided.
    * @param {().Settings} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateSettings(): GaxiosPromise[Schema$Settings] = js.native
  def updateSettings(callback: BodyResponseCallback[Schema$Settings]): Unit = js.native
  def updateSettings(params: ParamsDollarResourceDollarV1beta1DollarUpdatesettings): GaxiosPromise[Schema$Settings] = js.native
  def updateSettings(
    params: ParamsDollarResourceDollarV1beta1DollarUpdatesettings,
    callback: BodyResponseCallback[Schema$Settings]
  ): Unit = js.native
  def updateSettings(
    params: ParamsDollarResourceDollarV1beta1DollarUpdatesettings,
    options: BodyResponseCallback[Schema$Settings],
    callback: BodyResponseCallback[Schema$Settings]
  ): Unit = js.native
  def updateSettings(params: ParamsDollarResourceDollarV1beta1DollarUpdatesettings, options: MethodOptions): GaxiosPromise[Schema$Settings] = js.native
  def updateSettings(
    params: ParamsDollarResourceDollarV1beta1DollarUpdatesettings,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Settings]
  ): Unit = js.native
}

