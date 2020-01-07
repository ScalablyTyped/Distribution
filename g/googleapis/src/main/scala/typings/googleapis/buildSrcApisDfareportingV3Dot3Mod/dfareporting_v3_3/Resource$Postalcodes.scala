package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Postalcodes")
@js.native
class Resource$Postalcodes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.postalCodes.get
    * @desc Gets one postal code by ID.
    * @alias dfareporting.postalCodes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.code Postal code ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$PostalCode] = js.native
  def get(callback: BodyResponseCallback[Schema$PostalCode]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPostalcodesDollarGet): GaxiosPromise[Schema$PostalCode] = js.native
  def get(
    params: ParamsDollarResourceDollarPostalcodesDollarGet,
    callback: BodyResponseCallback[Schema$PostalCode]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPostalcodesDollarGet,
    options: BodyResponseCallback[Schema$PostalCode],
    callback: BodyResponseCallback[Schema$PostalCode]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPostalcodesDollarGet, options: MethodOptions): GaxiosPromise[Schema$PostalCode] = js.native
  def get(
    params: ParamsDollarResourceDollarPostalcodesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PostalCode]
  ): Unit = js.native
  /**
    * dfareporting.postalCodes.list
    * @desc Retrieves a list of postal codes.
    * @alias dfareporting.postalCodes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$PostalCodesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$PostalCodesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarPostalcodesDollarList): GaxiosPromise[Schema$PostalCodesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPostalcodesDollarList,
    callback: BodyResponseCallback[Schema$PostalCodesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPostalcodesDollarList,
    options: BodyResponseCallback[Schema$PostalCodesListResponse],
    callback: BodyResponseCallback[Schema$PostalCodesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPostalcodesDollarList, options: MethodOptions): GaxiosPromise[Schema$PostalCodesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPostalcodesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PostalCodesListResponse]
  ): Unit = js.native
}

