package typings.googleapis.buildSrcApisAdsensehostV4Dot1Mod.adsensehost_v4_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsensehost/v4.1", "adsensehost_v4_1.Resource$Adclients")
@js.native
class Resource$Adclients protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adsensehost.adclients.get
    * @desc Get information about one of the ad clients in the Host AdSense
    * account.
    * @alias adsensehost.adclients.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$AdClient] = js.native
  def get(callback: BodyResponseCallback[Schema$AdClient]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAdclientsDollarGet): GaxiosPromise[Schema$AdClient] = js.native
  def get(
    params: ParamsDollarResourceDollarAdclientsDollarGet,
    callback: BodyResponseCallback[Schema$AdClient]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAdclientsDollarGet,
    options: BodyResponseCallback[Schema$AdClient],
    callback: BodyResponseCallback[Schema$AdClient]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAdclientsDollarGet, options: MethodOptions): GaxiosPromise[Schema$AdClient] = js.native
  def get(
    params: ParamsDollarResourceDollarAdclientsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdClient]
  ): Unit = js.native
  /**
    * adsensehost.adclients.list
    * @desc List all host ad clients in this AdSense account.
    * @alias adsensehost.adclients.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.maxResults The maximum number of ad clients to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through ad clients. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$AdClients] = js.native
  def list(callback: BodyResponseCallback[Schema$AdClients]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAdclientsDollarList): GaxiosPromise[Schema$AdClients] = js.native
  def list(
    params: ParamsDollarResourceDollarAdclientsDollarList,
    callback: BodyResponseCallback[Schema$AdClients]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAdclientsDollarList,
    options: BodyResponseCallback[Schema$AdClients],
    callback: BodyResponseCallback[Schema$AdClients]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAdclientsDollarList, options: MethodOptions): GaxiosPromise[Schema$AdClients] = js.native
  def list(
    params: ParamsDollarResourceDollarAdclientsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdClients]
  ): Unit = js.native
}

