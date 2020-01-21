package typings.firebaseInstallations.installationEntryMod

import typings.firebaseInstallations.firebaseInstallationsNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnregisteredInstallationEntry extends InstallationEntry {
  /** Firebase Installation ID */
  val fid: String
  /** Status of the Firebase Installation registration on the server. */
  val registrationStatus: `0`
}

object UnregisteredInstallationEntry {
  @scala.inline
  def apply(fid: String, registrationStatus: `0`): UnregisteredInstallationEntry = {
    val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], registrationStatus = registrationStatus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnregisteredInstallationEntry]
  }
}

