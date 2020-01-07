package typings.googleapis.buildSrcApisAdsensehostV4Dot1Mod.adsensehost_v4_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsensehost/v4.1", "adsensehost_v4_1.Resource$Accounts")
@js.native
class Resource$Accounts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var adclients: ResourceDollarAccountsDollarAdclients = js.native
  var adunits: ResourceDollarAccountsDollarAdunits = js.native
  var context: APIRequestContext = js.native
  var reports: ResourceDollarAccountsDollarReports = js.native
  /**
    * adsensehost.accounts.get
    * @desc Get information about the selected associated AdSense account.
    * @alias adsensehost.accounts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account to get information about.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Account] = js.native
  def get(callback: BodyResponseCallback[Schema$Account]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarGet): GaxiosPromise[Schema$Account] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarGet,
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarGet,
    options: BodyResponseCallback[Schema$Account],
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Account] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
  /**
    * adsensehost.accounts.list
    * @desc List hosted accounts associated with this AdSense account by ad
    * client id.
    * @alias adsensehost.accounts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.filterAdClientId Ad clients to list accounts for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Accounts] = js.native
  def list(callback: BodyResponseCallback[Schema$Accounts]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarList): GaxiosPromise[Schema$Accounts] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarList,
    callback: BodyResponseCallback[Schema$Accounts]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarList,
    options: BodyResponseCallback[Schema$Accounts],
    callback: BodyResponseCallback[Schema$Accounts]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarList, options: MethodOptions): GaxiosPromise[Schema$Accounts] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Accounts]
  ): Unit = js.native
}

