package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusResponse extends js.Object {
  var authResponse: AuthResponse
  var status: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.authorization_expired | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.connected | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.not_authorized | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.unknown
}

object StatusResponse {
  @scala.inline
  def apply(
    authResponse: AuthResponse,
    status: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.authorization_expired | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.connected | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.not_authorized | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.unknown
  ): StatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authResponse")(authResponse)
    __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusResponse]
  }
}

