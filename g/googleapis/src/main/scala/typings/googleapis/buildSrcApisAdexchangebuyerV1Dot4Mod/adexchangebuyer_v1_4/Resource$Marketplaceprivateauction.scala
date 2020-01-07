package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Marketplaceprivateauction")
@js.native
class Resource$Marketplaceprivateauction protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer.marketplaceprivateauction.updateproposal
    * @desc Update a given private auction proposal
    * @alias adexchangebuyer.marketplaceprivateauction.updateproposal
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.privateAuctionId The private auction id to be updated.
    * @param {().UpdatePrivateAuctionProposalRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateproposal(): GaxiosPromise[Unit] = js.native
  def updateproposal(callback: BodyResponseCallback[Unit]): Unit = js.native
  def updateproposal(params: ParamsDollarResourceDollarMarketplaceprivateauctionDollarUpdateproposal): GaxiosPromise[Unit] = js.native
  def updateproposal(
    params: ParamsDollarResourceDollarMarketplaceprivateauctionDollarUpdateproposal,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def updateproposal(
    params: ParamsDollarResourceDollarMarketplaceprivateauctionDollarUpdateproposal,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def updateproposal(
    params: ParamsDollarResourceDollarMarketplaceprivateauctionDollarUpdateproposal,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def updateproposal(
    params: ParamsDollarResourceDollarMarketplaceprivateauctionDollarUpdateproposal,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

