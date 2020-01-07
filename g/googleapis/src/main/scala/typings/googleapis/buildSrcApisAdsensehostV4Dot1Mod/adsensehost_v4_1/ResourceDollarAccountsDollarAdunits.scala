package typings.googleapis.buildSrcApisAdsensehostV4Dot1Mod.adsensehost_v4_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsensehost/v4.1", "adsensehost_v4_1.Resource$Accounts$Adunits")
@js.native
class ResourceDollarAccountsDollarAdunits protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adsensehost.accounts.adunits.delete
    * @desc Delete the specified ad unit from the specified publisher AdSense
    * account.
    * @alias adsensehost.accounts.adunits.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account which contains the ad unit.
    * @param {string} params.adClientId Ad client for which to get ad unit.
    * @param {string} params.adUnitId Ad unit to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$AdUnit] = js.native
  def delete(callback: BodyResponseCallback[Schema$AdUnit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarDelete): GaxiosPromise[Schema$AdUnit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarDelete,
    callback: BodyResponseCallback[Schema$AdUnit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarDelete,
    options: BodyResponseCallback[Schema$AdUnit],
    callback: BodyResponseCallback[Schema$AdUnit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$AdUnit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdUnit]
  ): Unit = js.native
  /**
    * adsensehost.accounts.adunits.get
    * @desc Get the specified host ad unit in this AdSense account.
    * @alias adsensehost.accounts.adunits.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account which contains the ad unit.
    * @param {string} params.adClientId Ad client for which to get ad unit.
    * @param {string} params.adUnitId Ad unit to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$AdUnit] = js.native
  def get(callback: BodyResponseCallback[Schema$AdUnit]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarGet): GaxiosPromise[Schema$AdUnit] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarGet,
    callback: BodyResponseCallback[Schema$AdUnit]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarGet,
    options: BodyResponseCallback[Schema$AdUnit],
    callback: BodyResponseCallback[Schema$AdUnit]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarGet, options: MethodOptions): GaxiosPromise[Schema$AdUnit] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdUnit]
  ): Unit = js.native
  /**
    * adsensehost.accounts.adunits.getAdCode
    * @desc Get ad code for the specified ad unit, attaching the specified host
    * custom channels.
    * @alias adsensehost.accounts.adunits.getAdCode
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account which contains the ad client.
    * @param {string} params.adClientId Ad client with contains the ad unit.
    * @param {string} params.adUnitId Ad unit to get the code for.
    * @param {string=} params.hostCustomChannelId Host custom channel to attach to the ad code.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getAdCode(): GaxiosPromise[Schema$AdCode] = js.native
  def getAdCode(callback: BodyResponseCallback[Schema$AdCode]): Unit = js.native
  def getAdCode(params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarGetadcode): GaxiosPromise[Schema$AdCode] = js.native
  def getAdCode(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarGetadcode,
    callback: BodyResponseCallback[Schema$AdCode]
  ): Unit = js.native
  def getAdCode(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarGetadcode,
    options: BodyResponseCallback[Schema$AdCode],
    callback: BodyResponseCallback[Schema$AdCode]
  ): Unit = js.native
  def getAdCode(params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarGetadcode, options: MethodOptions): GaxiosPromise[Schema$AdCode] = js.native
  def getAdCode(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarGetadcode,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdCode]
  ): Unit = js.native
  /**
    * adsensehost.accounts.adunits.insert
    * @desc Insert the supplied ad unit into the specified publisher AdSense
    * account.
    * @alias adsensehost.accounts.adunits.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account which will contain the ad unit.
    * @param {string} params.adClientId Ad client into which to insert the ad unit.
    * @param {().AdUnit} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$AdUnit] = js.native
  def insert(callback: BodyResponseCallback[Schema$AdUnit]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarInsert): GaxiosPromise[Schema$AdUnit] = js.native
  def insert(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarInsert,
    callback: BodyResponseCallback[Schema$AdUnit]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarInsert,
    options: BodyResponseCallback[Schema$AdUnit],
    callback: BodyResponseCallback[Schema$AdUnit]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$AdUnit] = js.native
  def insert(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdUnit]
  ): Unit = js.native
  /**
    * adsensehost.accounts.adunits.list
    * @desc List all ad units in the specified publisher's AdSense account.
    * @alias adsensehost.accounts.adunits.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account which contains the ad client.
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
  def list(params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarList): GaxiosPromise[Schema$AdUnits] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarList,
    callback: BodyResponseCallback[Schema$AdUnits]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarList,
    options: BodyResponseCallback[Schema$AdUnits],
    callback: BodyResponseCallback[Schema$AdUnits]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarList, options: MethodOptions): GaxiosPromise[Schema$AdUnits] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdUnits]
  ): Unit = js.native
  /**
    * adsensehost.accounts.adunits.patch
    * @desc Update the supplied ad unit in the specified publisher AdSense
    * account. This method supports patch semantics.
    * @alias adsensehost.accounts.adunits.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account which contains the ad client.
    * @param {string} params.adClientId Ad client which contains the ad unit.
    * @param {string} params.adUnitId Ad unit to get.
    * @param {().AdUnit} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$AdUnit] = js.native
  def patch(callback: BodyResponseCallback[Schema$AdUnit]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarPatch): GaxiosPromise[Schema$AdUnit] = js.native
  def patch(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarPatch,
    callback: BodyResponseCallback[Schema$AdUnit]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarPatch,
    options: BodyResponseCallback[Schema$AdUnit],
    callback: BodyResponseCallback[Schema$AdUnit]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$AdUnit] = js.native
  def patch(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdUnit]
  ): Unit = js.native
  /**
    * adsensehost.accounts.adunits.update
    * @desc Update the supplied ad unit in the specified publisher AdSense
    * account.
    * @alias adsensehost.accounts.adunits.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account which contains the ad client.
    * @param {string} params.adClientId Ad client which contains the ad unit.
    * @param {().AdUnit} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$AdUnit] = js.native
  def update(callback: BodyResponseCallback[Schema$AdUnit]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarUpdate): GaxiosPromise[Schema$AdUnit] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarUpdate,
    callback: BodyResponseCallback[Schema$AdUnit]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarUpdate,
    options: BodyResponseCallback[Schema$AdUnit],
    callback: BodyResponseCallback[Schema$AdUnit]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$AdUnit] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdUnit]
  ): Unit = js.native
}

