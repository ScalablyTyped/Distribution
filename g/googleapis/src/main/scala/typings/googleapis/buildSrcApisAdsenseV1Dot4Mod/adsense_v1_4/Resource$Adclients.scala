package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Adclients")
@js.native
class Resource$Adclients protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adsense.adclients.list
    * @desc List all ad clients in this AdSense account.
    * @alias adsense.adclients.list
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

