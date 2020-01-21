package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional limit on the number of CryptoKeyVersions to include in the
    * response. Further CryptoKeyVersions can subsequently be obtained by
    * including the ListCryptoKeyVersionsResponse.next_page_token in a
    * subsequent request. If unspecified, the server will pick an appropriate
    * default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional pagination token, returned earlier via
    * ListCryptoKeyVersionsResponse.next_page_token.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The resource name of the CryptoKey to list, in the format
    * `projects/x/locations/x/keyRings/x/cryptoKeys/x`.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * The fields to include in the response.
    */
  var view: js.UndefOr[String] = js.native
}

