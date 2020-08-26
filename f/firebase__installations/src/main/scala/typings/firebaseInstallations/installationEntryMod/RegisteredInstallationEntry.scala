package typings.firebaseInstallations.installationEntryMod

import typings.firebaseInstallations.firebaseInstallationsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisteredInstallationEntry extends InstallationEntry {
  /** Firebase Installation Authentication Token. */
  val authToken: AuthToken = js.native
  /** Firebase Installation ID */
  val fid: String = js.native
  /**
    * Refresh Token returned from the server.
    * Used for authenticating generateAuthToken requests.
    */
  val refreshToken: String = js.native
  /** Status of the Firebase Installation registration on the server. */
  val registrationStatus: `2` = js.native
}

object RegisteredInstallationEntry {
  @scala.inline
  def apply(authToken: AuthToken, fid: String, refreshToken: String, registrationStatus: `2`): RegisteredInstallationEntry = {
    val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], fid = fid.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], registrationStatus = registrationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredInstallationEntry]
  }
  @scala.inline
  implicit class RegisteredInstallationEntryOps[Self <: RegisteredInstallationEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthToken(value: AuthToken): Self = this.set("authToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setFid(value: String): Self = this.set("fid", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegistrationStatus(value: `2`): Self = this.set("registrationStatus", value.asInstanceOf[js.Any])
  }
  
}

