package typings.devcert.userInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserInterface extends js.Object {
  
  def closeFirefoxBeforeContinuing(): js.Promise[Unit] = js.native
  
  def firefoxWizardPromptPage(certificateURL: String): js.Promise[String] = js.native
  
  def getWindowsEncryptionPassword(): js.Promise[String] = js.native
  
  def startFirefoxWizard(certificateHost: String): js.Promise[Unit] = js.native
  
  def waitForFirefoxWizard(): js.Promise[Unit] = js.native
  
  def warnChromeOnLinuxWithoutCertutil(): js.Promise[Unit] = js.native
}
object UserInterface {
  
  @scala.inline
  def apply(
    closeFirefoxBeforeContinuing: () => js.Promise[Unit],
    firefoxWizardPromptPage: String => js.Promise[String],
    getWindowsEncryptionPassword: () => js.Promise[String],
    startFirefoxWizard: String => js.Promise[Unit],
    waitForFirefoxWizard: () => js.Promise[Unit],
    warnChromeOnLinuxWithoutCertutil: () => js.Promise[Unit]
  ): UserInterface = {
    val __obj = js.Dynamic.literal(closeFirefoxBeforeContinuing = js.Any.fromFunction0(closeFirefoxBeforeContinuing), firefoxWizardPromptPage = js.Any.fromFunction1(firefoxWizardPromptPage), getWindowsEncryptionPassword = js.Any.fromFunction0(getWindowsEncryptionPassword), startFirefoxWizard = js.Any.fromFunction1(startFirefoxWizard), waitForFirefoxWizard = js.Any.fromFunction0(waitForFirefoxWizard), warnChromeOnLinuxWithoutCertutil = js.Any.fromFunction0(warnChromeOnLinuxWithoutCertutil))
    __obj.asInstanceOf[UserInterface]
  }
  
  @scala.inline
  implicit class UserInterfaceOps[Self <: UserInterface] (val x: Self) extends AnyVal {
    
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
    def setCloseFirefoxBeforeContinuing(value: () => js.Promise[Unit]): Self = this.set("closeFirefoxBeforeContinuing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFirefoxWizardPromptPage(value: String => js.Promise[String]): Self = this.set("firefoxWizardPromptPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWindowsEncryptionPassword(value: () => js.Promise[String]): Self = this.set("getWindowsEncryptionPassword", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartFirefoxWizard(value: String => js.Promise[Unit]): Self = this.set("startFirefoxWizard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWaitForFirefoxWizard(value: () => js.Promise[Unit]): Self = this.set("waitForFirefoxWizard", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWarnChromeOnLinuxWithoutCertutil(value: () => js.Promise[Unit]): Self = this.set("warnChromeOnLinuxWithoutCertutil", js.Any.fromFunction0(value))
  }
}
