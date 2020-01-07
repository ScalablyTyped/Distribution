package typings.googleapis.buildSrcApisAccesscontextmanagerV1Mod.accesscontextmanager_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarAccesspoliciesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Number of AccessPolicy instances to include in the list. Default 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Next page token for the next batch of AccessPolicy instances. Defaults to
    * the first page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. Resource name for the container to list AccessPolicy instances
    * from.  Format: `organizations/{org_id}`
    */
  var parent: js.UndefOr[String] = js.native
}

