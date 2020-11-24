package typings.firebaseInstallations.installationEntryMod

import typings.firebaseInstallations.firebaseInstallationsNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnregisteredInstallationEntry extends InstallationEntry {
  
  /** Firebase Installation ID */
  val fid: String = js.native
  
  /** Status of the Firebase Installation registration on the server. */
  val registrationStatus: `0` = js.native
}
object UnregisteredInstallationEntry {
  
  @scala.inline
  def apply(fid: String, registrationStatus: `0`): UnregisteredInstallationEntry = {
    val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], registrationStatus = registrationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnregisteredInstallationEntry]
  }
  
  @scala.inline
  implicit class UnregisteredInstallationEntryOps[Self <: UnregisteredInstallationEntry] (val x: Self) extends AnyVal {
    
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
    def setRegistrationStatus(value: `0`): Self = this.set("registrationStatus", value.asInstanceOf[js.Any])
  }
}
