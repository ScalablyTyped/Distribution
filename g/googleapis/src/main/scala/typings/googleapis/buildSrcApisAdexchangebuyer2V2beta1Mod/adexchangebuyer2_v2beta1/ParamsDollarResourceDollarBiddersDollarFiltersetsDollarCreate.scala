package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarBiddersDollarFiltersetsDollarCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Whether the filter set is transient, or should be persisted indefinitely.
    * By default, filter sets are not transient. If transient, it will be
    * available for at least 1 hour after creation.
    */
  var isTransient: js.UndefOr[Boolean] = js.native
  /**
    * Name of the owner (bidder or account) of the filter set to be created.
    * For example:  - For a bidder-level filter set for bidder 123:
    * `bidders/123`  - For an account-level filter set for the buyer account
    * representing bidder   123: `bidders/123/accounts/123`  - For an
    * account-level filter set for the child seat buyer account 456   whose
    * bidder is 123: `bidders/123/accounts/456`
    */
  var ownerName: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$FilterSet] = js.native
}

