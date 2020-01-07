package typings.googleapis.buildSrcApisFirebasedynamiclinksV1Mod.firebasedynamiclinks_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarV1DollarGetlinkstats extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The span of time requested in days.
    */
  var durationDays: js.UndefOr[String] = js.native
  /**
    * Dynamic Link URL. e.g. https://abcd.app.goo.gl/wxyz
    */
  var dynamicLink: js.UndefOr[String] = js.native
  /**
    * Google SDK version. Version takes the form "$major.$minor.$patch"
    */
  var sdkVersion: js.UndefOr[String] = js.native
}

