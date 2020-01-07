package typings.googleapis.buildSrcApisCloudkmsV1Mod.cloudkms_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Output only. The resource name for this CryptoKey in the format
    * `projects/x/locations/x/keyRings/x/cryptoKeys/x`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$CryptoKey] = js.native
  /**
    * Required list of fields to be updated in this request.
    */
  var updateMask: js.UndefOr[String] = js.native
}

