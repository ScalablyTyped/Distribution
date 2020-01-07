package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The unique name of the instance in which to create the table. Values are
    * of the form `projects/<project>/instances/<instance>`.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$CreateTableRequest] = js.native
}

