package typings.firebaseInstallations.getInstallationEntryMod

import typings.firebaseInstallations.installationEntryMod.InstallationEntry
import typings.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstallationEntryWithRegistrationPromise extends js.Object {
  
  var installationEntry: InstallationEntry = js.native
  
  /** Exist iff the installationEntry is not registered. */
  var registrationPromise: js.UndefOr[js.Promise[RegisteredInstallationEntry]] = js.native
}
object InstallationEntryWithRegistrationPromise {
  
  @scala.inline
  def apply(installationEntry: InstallationEntry): InstallationEntryWithRegistrationPromise = {
    val __obj = js.Dynamic.literal(installationEntry = installationEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationEntryWithRegistrationPromise]
  }
  
  @scala.inline
  implicit class InstallationEntryWithRegistrationPromiseOps[Self <: InstallationEntryWithRegistrationPromise] (val x: Self) extends AnyVal {
    
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
    def setInstallationEntry(value: InstallationEntry): Self = this.set("installationEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationPromise(value: js.Promise[RegisteredInstallationEntry]): Self = this.set("registrationPromise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistrationPromise: Self = this.set("registrationPromise", js.undefined)
  }
}
