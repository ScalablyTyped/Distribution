package typings.googleapis.buildSrcApisFirebasehostingV1beta1Mod.firebasehosting_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarSitesDollarDomainsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The page size to return. Defaults to 50.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The next_page_token from a previous request, if provided.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The parent for which to list domains, in the format:
    * <code>sites/<var>site-name</var></code>
    */
  var parent: js.UndefOr[String] = js.native
}

