package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarTestenvironmentcatalogDollarGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The type of environment that should be listed.
    */
  var environmentType: js.UndefOr[String] = js.native
  /**
    * For authorization, the cloud project requesting the
    * TestEnvironmentCatalog.
    */
  var projectId: js.UndefOr[String] = js.native
}

