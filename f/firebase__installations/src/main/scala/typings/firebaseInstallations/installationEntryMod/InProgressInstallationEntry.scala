package typings.firebaseInstallations.installationEntryMod

import typings.firebaseInstallations.firebaseInstallationsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InProgressInstallationEntry extends InstallationEntry {
  /** Firebase Installation ID */
  val fid: String = js.native
  /** Status of the Firebase Installation registration on the server. */
  val registrationStatus: `1` = js.native
  /**
    * Unix timestamp that shows the time when the current createInstallation
    * request was initiated.
    * Used for figuring out how long the registration status has been PENDING.
    */
  val registrationTime: Double = js.native
}

object InProgressInstallationEntry {
  @scala.inline
  def apply(fid: String, registrationStatus: `1`, registrationTime: Double): InProgressInstallationEntry = {
    val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], registrationStatus = registrationStatus.asInstanceOf[js.Any], registrationTime = registrationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[InProgressInstallationEntry]
  }
  @scala.inline
  implicit class InProgressInstallationEntryOps[Self <: InProgressInstallationEntry] (val x: Self) extends AnyVal {
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
    def setFid(value: String): Self = this.set("fid", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegistrationStatus(value: `1`): Self = this.set("registrationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegistrationTime(value: Double): Self = this.set("registrationTime", value.asInstanceOf[js.Any])
  }
  
}

