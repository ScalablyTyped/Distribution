package typings.firebaseInstallations.installationEntryMod

import typings.firebaseInstallations.firebaseInstallationsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InProgressInstallationEntry extends InstallationEntry {
  /** Firebase Installation ID */
  val fid: String
  /** Status of the Firebase Installation registration on the server. */
  val registrationStatus: `1`
  /**
    * Unix timestamp that shows the time when the current createInstallation
    * request was initiated.
    * Used for figuring out how long the registration status has been PENDING.
    */
  val registrationTime: Double
}

object InProgressInstallationEntry {
  @scala.inline
  def apply(fid: String, registrationStatus: `1`, registrationTime: Double): InProgressInstallationEntry = {
    val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], registrationStatus = registrationStatus.asInstanceOf[js.Any], registrationTime = registrationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[InProgressInstallationEntry]
  }
}

