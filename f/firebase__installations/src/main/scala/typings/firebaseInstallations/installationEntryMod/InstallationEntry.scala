package typings.firebaseInstallations.installationEntryMod

import typings.firebaseInstallations.firebaseInstallationsNumbers.`0`
import typings.firebaseInstallations.firebaseInstallationsNumbers.`1`
import typings.firebaseInstallations.firebaseInstallationsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.firebaseInstallations.installationEntryMod.UnregisteredInstallationEntry
  - typings.firebaseInstallations.installationEntryMod.InProgressInstallationEntry
  - typings.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
*/
trait InstallationEntry extends js.Object
object InstallationEntry {
  
  @scala.inline
  def UnregisteredInstallationEntry(fid: String, registrationStatus: `0`): InstallationEntry = {
    val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], registrationStatus = registrationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationEntry]
  }
  
  @scala.inline
  def InProgressInstallationEntry(fid: String, registrationStatus: `1`, registrationTime: Double): InstallationEntry = {
    val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], registrationStatus = registrationStatus.asInstanceOf[js.Any], registrationTime = registrationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationEntry]
  }
  
  @scala.inline
  def RegisteredInstallationEntry(authToken: AuthToken, fid: String, refreshToken: String, registrationStatus: `2`): InstallationEntry = {
    val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], fid = fid.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], registrationStatus = registrationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationEntry]
  }
}
