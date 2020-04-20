package typings.firebaseInstallations.installationEntryMod

import typings.firebaseInstallations.firebaseInstallationsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisteredInstallationEntry extends InstallationEntry {
  /** Firebase Installation Authentication Token. */
  val authToken: AuthToken
  /** Firebase Installation ID */
  val fid: String
  /**
    * Refresh Token returned from the server.
    * Used for authenticating generateAuthToken requests.
    */
  val refreshToken: String
  /** Status of the Firebase Installation registration on the server. */
  val registrationStatus: `2`
}

object RegisteredInstallationEntry {
  @scala.inline
  def apply(authToken: AuthToken, fid: String, refreshToken: String, registrationStatus: `2`): RegisteredInstallationEntry = {
    val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], fid = fid.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], registrationStatus = registrationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredInstallationEntry]
  }
}

