package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Accounts$Adclients")
@js.native
class ResourceDollarAccountsDollarAdclients protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adsense.accounts.adclients.getAdCode
    * @desc Get Auto ad code for a given ad client.
    * @alias adsense.accounts.adclients.getAdCode
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account which contains the ad client.
    * @param {string} params.adClientId Ad client to get the code for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getAdCode(): GaxiosPromise[Schema$AdCode] = js.native
  def getAdCode(callback: BodyResponseCallback[Schema$AdCode]): Unit = js.native
  def getAdCode(params: ParamsDollarResourceDollarAccountsDollarAdclientsDollarGetadcode): GaxiosPromise[Schema$AdCode] = js.native
  def getAdCode(
    params: ParamsDollarResourceDollarAccountsDollarAdclientsDollarGetadcode,
    callback: BodyResponseCallback[Schema$AdCode]
  ): Unit = js.native
  def getAdCode(
    params: ParamsDollarResourceDollarAccountsDollarAdclientsDollarGetadcode,
    options: BodyResponseCallback[Schema$AdCode],
    callback: BodyResponseCallback[Schema$AdCode]
  ): Unit = js.native
  def getAdCode(params: ParamsDollarResourceDollarAccountsDollarAdclientsDollarGetadcode, options: MethodOptions): GaxiosPromise[Schema$AdCode] = js.native
  def getAdCode(
    params: ParamsDollarResourceDollarAccountsDollarAdclientsDollarGetadcode,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdCode]
  ): Unit = js.native
  /**
    * adsense.accounts.adclients.list
    * @desc List all ad clients in the specified account.
    * @alias adsense.accounts.adclients.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account for which to list ad clients.
    * @param {integer=} params.maxResults The maximum number of ad clients to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through ad clients. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$AdClients] = js.native
  def list(callback: BodyResponseCallback[Schema$AdClients]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarAdclientsDollarList): GaxiosPromise[Schema$AdClients] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarAdclientsDollarList,
    callback: BodyResponseCallback[Schema$AdClients]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarAdclientsDollarList,
    options: BodyResponseCallback[Schema$AdClients],
    callback: BodyResponseCallback[Schema$AdClients]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarAdclientsDollarList, options: MethodOptions): GaxiosPromise[Schema$AdClients] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarAdclientsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdClients]
  ): Unit = js.native
}

