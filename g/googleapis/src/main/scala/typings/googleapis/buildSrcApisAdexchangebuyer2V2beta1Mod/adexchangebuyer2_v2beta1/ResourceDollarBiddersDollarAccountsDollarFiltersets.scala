package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Bidders$Accounts$Filtersets")
@js.native
class ResourceDollarBiddersDollarAccountsDollarFiltersets protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var bidMetrics: ResourceDollarBiddersDollarAccountsDollarFiltersetsDollarBidmetrics = js.native
  var bidResponseErrors: ResourceDollarBiddersDollarAccountsDollarFiltersetsDollarBidresponseerrors = js.native
  var bidResponsesWithoutBids: ResourceDollarBiddersDollarAccountsDollarFiltersetsDollarBidresponseswithoutbids = js.native
  var context: APIRequestContext = js.native
  var filteredBidRequests: ResourceDollarBiddersDollarAccountsDollarFiltersetsDollarFilteredbidrequests = js.native
  var filteredBids: ResourceDollarBiddersDollarAccountsDollarFiltersetsDollarFilteredbids = js.native
  var impressionMetrics: ResourceDollarBiddersDollarAccountsDollarFiltersetsDollarImpressionmetrics = js.native
  var losingBids: ResourceDollarBiddersDollarAccountsDollarFiltersetsDollarLosingbids = js.native
  var nonBillableWinningBids: ResourceDollarBiddersDollarAccountsDollarFiltersetsDollarNonbillablewinningbids = js.native
  /**
    * adexchangebuyer2.bidders.accounts.filterSets.create
    * @desc Creates the specified filter set for the account with the given
    * account ID.
    * @alias adexchangebuyer2.bidders.accounts.filterSets.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.isTransient Whether the filter set is transient, or should be persisted indefinitely. By default, filter sets are not transient. If transient, it will be available for at least 1 hour after creation.
    * @param {string} params.ownerName Name of the owner (bidder or account) of the filter set to be created. For example:  - For a bidder-level filter set for bidder 123: `bidders/123`  - For an account-level filter set for the buyer account representing bidder   123: `bidders/123/accounts/123`  - For an account-level filter set for the child seat buyer account 456   whose bidder is 123: `bidders/123/accounts/456`
    * @param {().FilterSet} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$FilterSet] = js.native
  def create(callback: BodyResponseCallback[Schema$FilterSet]): Unit = js.native
  def create(params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarCreate): GaxiosPromise[Schema$FilterSet] = js.native
  def create(
    params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarCreate,
    callback: BodyResponseCallback[Schema$FilterSet]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarCreate,
    options: BodyResponseCallback[Schema$FilterSet],
    callback: BodyResponseCallback[Schema$FilterSet]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$FilterSet] = js.native
  def create(
    params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FilterSet]
  ): Unit = js.native
  /**
    * adexchangebuyer2.bidders.accounts.filterSets.delete
    * @desc Deletes the requested filter set from the account with the given
    * account ID.
    * @alias adexchangebuyer2.bidders.accounts.filterSets.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Full name of the resource to delete. For example:  - For a bidder-level filter set for bidder 123:   `bidders/123/filterSets/abc`  - For an account-level filter set for the buyer account representing bidder   123: `bidders/123/accounts/123/filterSets/abc`  - For an account-level filter set for the child seat buyer account 456   whose bidder is 123: `bidders/123/accounts/456/filterSets/abc`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * adexchangebuyer2.bidders.accounts.filterSets.get
    * @desc Retrieves the requested filter set for the account with the given
    * account ID.
    * @alias adexchangebuyer2.bidders.accounts.filterSets.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Full name of the resource being requested. For example:  - For a bidder-level filter set for bidder 123:   `bidders/123/filterSets/abc`  - For an account-level filter set for the buyer account representing bidder   123: `bidders/123/accounts/123/filterSets/abc`  - For an account-level filter set for the child seat buyer account 456   whose bidder is 123: `bidders/123/accounts/456/filterSets/abc`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$FilterSet] = js.native
  def get(callback: BodyResponseCallback[Schema$FilterSet]): Unit = js.native
  def get(params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarGet): GaxiosPromise[Schema$FilterSet] = js.native
  def get(
    params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarGet,
    callback: BodyResponseCallback[Schema$FilterSet]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarGet,
    options: BodyResponseCallback[Schema$FilterSet],
    callback: BodyResponseCallback[Schema$FilterSet]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$FilterSet] = js.native
  def get(
    params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FilterSet]
  ): Unit = js.native
  /**
    * adexchangebuyer2.bidders.accounts.filterSets.list
    * @desc Lists all filter sets for the account with the given account ID.
    * @alias adexchangebuyer2.bidders.accounts.filterSets.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.ownerName Name of the owner (bidder or account) of the filter sets to be listed. For example:  - For a bidder-level filter set for bidder 123: `bidders/123`  - For an account-level filter set for the buyer account representing bidder   123: `bidders/123/accounts/123`  - For an account-level filter set for the child seat buyer account 456   whose bidder is 123: `bidders/123/accounts/456`
    * @param {integer=} params.pageSize Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListFilterSetsResponse.nextPageToken returned from the previous call to the accounts.filterSets.list method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListFilterSetsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListFilterSetsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarList): GaxiosPromise[Schema$ListFilterSetsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarList,
    callback: BodyResponseCallback[Schema$ListFilterSetsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarList,
    options: BodyResponseCallback[Schema$ListFilterSetsResponse],
    callback: BodyResponseCallback[Schema$ListFilterSetsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListFilterSetsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListFilterSetsResponse]
  ): Unit = js.native
}

