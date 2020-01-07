package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarAccountsDollarFinalizedproposalsDollarList extends StandardParameters {
  /**
    * Account ID of the buyer.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * An optional PQL filter query used to query for proposals.  Nested
    * repeated fields, such as proposal.deals.targetingCriterion, cannot be
    * filtered.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Syntax the filter is written in. Current implementation defaults to PQL
    * but in the future it will be LIST_FILTER.
    */
  var filterSyntax: js.UndefOr[String] = js.native
  /**
    * Requested page size. The server may return fewer results than requested.
    * If unspecified, the server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The page token as returned from ListProposalsResponse.
    */
  var pageToken: js.UndefOr[String] = js.native
}

