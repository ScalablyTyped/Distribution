package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Countries")
@js.native
class Resource$Countries protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.countries.get
    * @desc Gets one country by ID.
    * @alias dfareporting.countries.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dartId Country DART ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Country] = js.native
  def get(callback: BodyResponseCallback[Schema$Country]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCountriesDollarGet): GaxiosPromise[Schema$Country] = js.native
  def get(
    params: ParamsDollarResourceDollarCountriesDollarGet,
    callback: BodyResponseCallback[Schema$Country]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCountriesDollarGet,
    options: BodyResponseCallback[Schema$Country],
    callback: BodyResponseCallback[Schema$Country]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCountriesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Country] = js.native
  def get(
    params: ParamsDollarResourceDollarCountriesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Country]
  ): Unit = js.native
  /**
    * dfareporting.countries.list
    * @desc Retrieves a list of countries.
    * @alias dfareporting.countries.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$CountriesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$CountriesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCountriesDollarList): GaxiosPromise[Schema$CountriesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCountriesDollarList,
    callback: BodyResponseCallback[Schema$CountriesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCountriesDollarList,
    options: BodyResponseCallback[Schema$CountriesListResponse],
    callback: BodyResponseCallback[Schema$CountriesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCountriesDollarList, options: MethodOptions): GaxiosPromise[Schema$CountriesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCountriesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CountriesListResponse]
  ): Unit = js.native
}

