package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Accounts$Creatives$Dealassociations")
@js.native
class ResourceDollarAccountsDollarCreativesDollarDealassociations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer2.accounts.creatives.dealAssociations.add
    * @desc Associate an existing deal with a creative.
    * @alias adexchangebuyer2.accounts.creatives.dealAssociations.add
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account the creative belongs to.
    * @param {string} params.creativeId The ID of the creative associated with the deal.
    * @param {().AddDealAssociationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def add(): GaxiosPromise[Schema$Empty] = js.native
  def add(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def add(params: ParamsDollarResourceDollarAccountsDollarCreativesDollarDealassociationsDollarAdd): GaxiosPromise[Schema$Empty] = js.native
  def add(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarDealassociationsDollarAdd,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def add(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarDealassociationsDollarAdd,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def add(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarDealassociationsDollarAdd,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def add(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarDealassociationsDollarAdd,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.creatives.dealAssociations.list
    * @desc List all creative-deal associations.
    * @alias adexchangebuyer2.accounts.creatives.dealAssociations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account to list the associations from. Specify "-" to list all creatives the current user has access to.
    * @param {string} params.creativeId The creative ID to list the associations from. Specify "-" to list all creatives under the above account.
    * @param {integer=} params.pageSize Requested page size. Server may return fewer associations than requested. If unspecified, server will pick an appropriate default.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListDealAssociationsResponse.next_page_token returned from the previous call to 'ListDealAssociations' method.
    * @param {string=} params.query An optional query string to filter deal associations. If no filter is specified, all associations will be returned. Supported queries are: <ul> <li>accountId=<i>account_id_string</i> <li>creativeId=<i>creative_id_string</i> <li>dealsId=<i>deals_id_string</i> <li>dealsStatus:{approved, conditionally_approved, disapproved,                   not_checked} <li>openAuctionStatus:{approved, conditionally_approved, disapproved,                          not_checked} </ul> Example: 'dealsId=12345 AND dealsStatus:disapproved'
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListDealAssociationsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListDealAssociationsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarCreativesDollarDealassociationsDollarList): GaxiosPromise[Schema$ListDealAssociationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarDealassociationsDollarList,
    callback: BodyResponseCallback[Schema$ListDealAssociationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarDealassociationsDollarList,
    options: BodyResponseCallback[Schema$ListDealAssociationsResponse],
    callback: BodyResponseCallback[Schema$ListDealAssociationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarDealassociationsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListDealAssociationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarDealassociationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListDealAssociationsResponse]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.creatives.dealAssociations.remove
    * @desc Remove the association between a deal and a creative.
    * @alias adexchangebuyer2.accounts.creatives.dealAssociations.remove
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account the creative belongs to.
    * @param {string} params.creativeId The ID of the creative associated with the deal.
    * @param {().RemoveDealAssociationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def remove(): GaxiosPromise[Schema$Empty] = js.native
  def remove(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def remove(params: ParamsDollarResourceDollarAccountsDollarCreativesDollarDealassociationsDollarRemove): GaxiosPromise[Schema$Empty] = js.native
  def remove(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarDealassociationsDollarRemove,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def remove(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarDealassociationsDollarRemove,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def remove(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarDealassociationsDollarRemove,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def remove(
    params: ParamsDollarResourceDollarAccountsDollarCreativesDollarDealassociationsDollarRemove,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
}

