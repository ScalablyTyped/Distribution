package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarInstancesDollarPartialupdateinstance extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * (`OutputOnly`) The unique name of the instance. Values are of the form
    * `projects/<project>/instances/a-z+[a-z0-9]`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Instance] = js.native
  /**
    * The subset of Instance fields which should be replaced. Must be
    * explicitly set.
    */
  var updateMask: js.UndefOr[String] = js.native
}

