package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarMattersDollarSavedqueriesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The matter id of the parent matter for which the saved queries are to be
    * retrieved.
    */
  var matterId: js.UndefOr[String] = js.native
  /**
    * The maximum number of saved queries to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The pagination token as returned in the previous response. An empty token
    * means start from the beginning.
    */
  var pageToken: js.UndefOr[String] = js.native
}

