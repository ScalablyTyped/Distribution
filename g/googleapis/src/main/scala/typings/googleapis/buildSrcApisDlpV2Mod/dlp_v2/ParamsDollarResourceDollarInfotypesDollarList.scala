package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarInfotypesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional filter to only return infoTypes supported by certain parts of
    * the API. Defaults to supported_by=INSPECT.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Optional BCP-47 language code for localized infoType friendly names. If
    * omitted, or if localized strings are not available, en-US strings will be
    * returned.
    */
  var languageCode: js.UndefOr[String] = js.native
}

