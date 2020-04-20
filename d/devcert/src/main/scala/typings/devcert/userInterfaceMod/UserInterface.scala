package typings.devcert.userInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInterface extends js.Object {
  def closeFirefoxBeforeContinuing(): js.Promise[Unit]
  def firefoxWizardPromptPage(certificateURL: String): js.Promise[String]
  def getWindowsEncryptionPassword(): js.Promise[String]
  def startFirefoxWizard(certificateHost: String): js.Promise[Unit]
  def waitForFirefoxWizard(): js.Promise[Unit]
  def warnChromeOnLinuxWithoutCertutil(): js.Promise[Unit]
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
}

