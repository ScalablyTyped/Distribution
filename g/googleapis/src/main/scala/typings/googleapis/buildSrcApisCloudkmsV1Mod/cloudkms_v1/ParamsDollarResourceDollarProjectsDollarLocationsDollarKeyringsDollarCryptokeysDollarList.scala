package typings.googleapis.buildSrcApisCloudkmsV1Mod.cloudkms_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional limit on the number of CryptoKeys to include in the response.
    * Further CryptoKeys can subsequently be obtained by including the
    * ListCryptoKeysResponse.next_page_token in a subsequent request.  If
    * unspecified, the server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional pagination token, returned earlier via
    * ListCryptoKeysResponse.next_page_token.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The resource name of the KeyRing to list, in the format
    * `projects/x/locations/x/keyRings/x`.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * The fields of the primary version to include in the response.
    */
  var versionView: js.UndefOr[String] = js.native
}

