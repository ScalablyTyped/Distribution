package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarMattersDollarSavedqueriesDollarDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The matter id of the parent matter for which the saved query is to be
    * deleted.
    */
  var matterId: js.UndefOr[String] = js.native
  /**
    * Id of the saved query to be deleted.
    */
  var savedQueryId: js.UndefOr[String] = js.native
}

