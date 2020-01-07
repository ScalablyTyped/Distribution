package typings.googleapis.buildSrcApisStreetviewpublishV1Mod.streetviewpublish_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarPhotosDollarBatchget extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The BCP-47 language code, such as "en-US" or "sr-Latn". For more
    * information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. If
    * language_code is unspecified, the user's language preference for Google
    * services is used.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Required. IDs of the Photos. For HTTP GET requests, the URL query
    * parameter should be `photoIds=<id1>&photoIds=<id2>&...`.
    */
  var photoIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specifies if a download URL for the photo bytes should be returned in the
    * Photo response.
    */
  var view: js.UndefOr[String] = js.native
}

