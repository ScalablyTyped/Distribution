package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarMattersDollarHoldsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The matter ID.
    */
  var matterId: js.UndefOr[String] = js.native
  /**
    * The number of holds to return in the response, between 0 and 100
    * inclusive. Leaving this empty, or as 0, is the same as page_size = 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The pagination token as returned in the response. An empty token means
    * start from the beginning.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Specifies which parts of the Hold to return.
    */
  var view: js.UndefOr[String] = js.native
}

