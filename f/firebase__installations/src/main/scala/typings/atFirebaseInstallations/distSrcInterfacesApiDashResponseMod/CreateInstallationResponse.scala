package typings.atFirebaseInstallations.distSrcInterfacesApiDashResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInstallationResponse extends js.Object {
  val authToken: GenerateAuthTokenResponse
  val fid: js.UndefOr[String] = js.undefined
  val refreshToken: String
}

object CreateInstallationResponse {
  @scala.inline
  def apply(authToken: GenerateAuthTokenResponse, refreshToken: String, fid: String = null): CreateInstallationResponse = {
    val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
    if (fid != null) __obj.updateDynamic("fid")(fid.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstallationResponse]
  }
}

