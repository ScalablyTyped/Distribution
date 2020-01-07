package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Adunits")
@js.native
class Resource$Adunits protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var customchannels: ResourceDollarAdunitsDollarCustomchannels = js.native
  /**
    * adsense.adunits.get
    * @desc Gets the specified ad unit in the specified ad client.
    * @alias adsense.adunits.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client for which to get the ad unit.
    * @param {string} params.adUnitId Ad unit to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$AdUnit] = js.native
  def get(callback: BodyResponseCallback[Schema$AdUnit]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAdunitsDollarGet): GaxiosPromise[Schema$AdUnit] = js.native
  def get(params: ParamsDollarResourceDollarAdunitsDollarGet, callback: BodyResponseCallback[Schema$AdUnit]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAdunitsDollarGet,
    options: BodyResponseCallback[Schema$AdUnit],
    callback: BodyResponseCallback[Schema$AdUnit]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAdunitsDollarGet, options: MethodOptions): GaxiosPromise[Schema$AdUnit] = js.native
  def get(
    params: ParamsDollarResourceDollarAdunitsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdUnit]
  ): Unit = js.native
  /**
    * adsense.adunits.getAdCode
    * @desc Get ad code for the specified ad unit.
    * @alias adsense.adunits.getAdCode
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client with contains the ad unit.
    * @param {string} params.adUnitId Ad unit to get the code for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getAdCode(): GaxiosPromise[Schema$AdCode] = js.native
  def getAdCode(callback: BodyResponseCallback[Schema$AdCode]): Unit = js.native
  def getAdCode(params: ParamsDollarResourceDollarAdunitsDollarGetadcode): GaxiosPromise[Schema$AdCode] = js.native
  def getAdCode(
    params: ParamsDollarResourceDollarAdunitsDollarGetadcode,
    callback: BodyResponseCallback[Schema$AdCode]
  ): Unit = js.native
  def getAdCode(
    params: ParamsDollarResourceDollarAdunitsDollarGetadcode,
    options: BodyResponseCallback[Schema$AdCode],
    callback: BodyResponseCallback[Schema$AdCode]
  ): Unit = js.native
  def getAdCode(params: ParamsDollarResourceDollarAdunitsDollarGetadcode, options: MethodOptions): GaxiosPromise[Schema$AdCode] = js.native
  def getAdCode(
    params: ParamsDollarResourceDollarAdunitsDollarGetadcode,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdCode]
  ): Unit = js.native
  /**
    * adsense.adunits.list
    * @desc List all ad units in the specified ad client for this AdSense
    * account.
    * @alias adsense.adunits.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client for which to list ad units.
    * @param {boolean=} params.includeInactive Whether to include inactive ad units. Default: true.
    * @param {integer=} params.maxResults The maximum number of ad units to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through ad units. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$AdUnits] = js.native
  def list(callback: BodyResponseCallback[Schema$AdUnits]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAdunitsDollarList): GaxiosPromise[Schema$AdUnits] = js.native
  def list(
    params: ParamsDollarResourceDollarAdunitsDollarList,
    callback: BodyResponseCallback[Schema$AdUnits]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAdunitsDollarList,
    options: BodyResponseCallback[Schema$AdUnits],
    callback: BodyResponseCallback[Schema$AdUnits]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAdunitsDollarList, options: MethodOptions): GaxiosPromise[Schema$AdUnits] = js.native
  def list(
    params: ParamsDollarResourceDollarAdunitsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdUnits]
  ): Unit = js.native
}

