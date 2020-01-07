package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Mobilecarriers")
@js.native
class Resource$Mobilecarriers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.mobileCarriers.get
    * @desc Gets one mobile carrier by ID.
    * @alias dfareporting.mobileCarriers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Mobile carrier ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$MobileCarrier] = js.native
  def get(callback: BodyResponseCallback[Schema$MobileCarrier]): Unit = js.native
  def get(params: ParamsDollarResourceDollarMobilecarriersDollarGet): GaxiosPromise[Schema$MobileCarrier] = js.native
  def get(
    params: ParamsDollarResourceDollarMobilecarriersDollarGet,
    callback: BodyResponseCallback[Schema$MobileCarrier]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarMobilecarriersDollarGet,
    options: BodyResponseCallback[Schema$MobileCarrier],
    callback: BodyResponseCallback[Schema$MobileCarrier]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarMobilecarriersDollarGet, options: MethodOptions): GaxiosPromise[Schema$MobileCarrier] = js.native
  def get(
    params: ParamsDollarResourceDollarMobilecarriersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$MobileCarrier]
  ): Unit = js.native
  /**
    * dfareporting.mobileCarriers.list
    * @desc Retrieves a list of mobile carriers.
    * @alias dfareporting.mobileCarriers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$MobileCarriersListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$MobileCarriersListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarMobilecarriersDollarList): GaxiosPromise[Schema$MobileCarriersListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarMobilecarriersDollarList,
    callback: BodyResponseCallback[Schema$MobileCarriersListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarMobilecarriersDollarList,
    options: BodyResponseCallback[Schema$MobileCarriersListResponse],
    callback: BodyResponseCallback[Schema$MobileCarriersListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarMobilecarriersDollarList, options: MethodOptions): GaxiosPromise[Schema$MobileCarriersListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarMobilecarriersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$MobileCarriersListResponse]
  ): Unit = js.native
}

