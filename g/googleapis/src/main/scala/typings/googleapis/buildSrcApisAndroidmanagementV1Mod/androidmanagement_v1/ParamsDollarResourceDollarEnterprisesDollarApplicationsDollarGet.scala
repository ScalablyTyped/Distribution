package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarEnterprisesDollarApplicationsDollarGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The preferred language for localized application info, as a BCP47 tag
    * (e.g. "en-US", "de"). If not specified the default language of the
    * application will be used.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * The name of the application in the form
    * enterprises/{enterpriseId}/applications/{package_name}.
    */
  var name: js.UndefOr[String] = js.native
}

