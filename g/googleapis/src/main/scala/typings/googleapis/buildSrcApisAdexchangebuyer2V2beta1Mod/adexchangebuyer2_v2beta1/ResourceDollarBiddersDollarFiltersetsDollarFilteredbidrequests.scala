package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Bidders$Filtersets$Filteredbidrequests")
@js.native
class ResourceDollarBiddersDollarFiltersetsDollarFilteredbidrequests protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer2.bidders.filterSets.filteredBidRequests.list
    * @desc List all reasons that caused a bid request not to be sent for an
    * impression, with the number of bid requests not sent for each reason.
    * @alias adexchangebuyer2.bidders.filterSets.filteredBidRequests.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.filterSetName Name of the filter set that should be applied to the requested metrics. For example:  - For a bidder-level filter set for bidder 123:   `bidders/123/filterSets/abc`  - For an account-level filter set for the buyer account representing bidder   123: `bidders/123/accounts/123/filterSets/abc`  - For an account-level filter set for the child seat buyer account 456   whose bidder is 123: `bidders/123/accounts/456/filterSets/abc`
    * @param {integer=} params.pageSize Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListFilteredBidRequestsResponse.nextPageToken returned from the previous call to the filteredBidRequests.list method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListFilteredBidRequestsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListFilteredBidRequestsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarBiddersDollarFiltersetsDollarFilteredbidrequestsDollarList): GaxiosPromise[Schema$ListFilteredBidRequestsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarBiddersDollarFiltersetsDollarFilteredbidrequestsDollarList,
    callback: BodyResponseCallback[Schema$ListFilteredBidRequestsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarBiddersDollarFiltersetsDollarFilteredbidrequestsDollarList,
    options: BodyResponseCallback[Schema$ListFilteredBidRequestsResponse],
    callback: BodyResponseCallback[Schema$ListFilteredBidRequestsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarBiddersDollarFiltersetsDollarFilteredbidrequestsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListFilteredBidRequestsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarBiddersDollarFiltersetsDollarFilteredbidrequestsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListFilteredBidRequestsResponse]
  ): Unit = js.native
}

