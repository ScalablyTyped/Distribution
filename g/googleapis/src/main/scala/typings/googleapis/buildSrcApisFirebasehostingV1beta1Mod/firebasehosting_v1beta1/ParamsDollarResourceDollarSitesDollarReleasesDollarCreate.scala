package typings.googleapis.buildSrcApisFirebasehostingV1beta1Mod.firebasehosting_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarSitesDollarReleasesDollarCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The site that the release belongs to, in the format:
    * <code>sites/<var>site-name</var></code>
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Release] = js.native
  /**
    * The unique identifier for a version, in the format:
    * <code>/sites/<var>site-name</var>/versions/<var>versionID</var></code>
    * The <var>site-name</var> in this version identifier must match the
    * <var>site-name</var> in the `parent` parameter. <br> <br>This query
    * parameter must be empty if the `type` field in the request body is
    * `SITE_DISABLE`.
    */
  var versionName: js.UndefOr[String] = js.native
}

