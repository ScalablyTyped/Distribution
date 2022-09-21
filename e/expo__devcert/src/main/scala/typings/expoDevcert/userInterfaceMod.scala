package typings.expoDevcert

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userInterfaceMod extends Shortcut {
  
  @JSImport("@expo/devcert/dist/user-interface", JSImport.Default)
  @js.native
  val default: UserInterface = js.native
  
  trait UserInterface extends StObject {
    
    def closeFirefoxBeforeContinuing(): js.Promise[Unit]
    
    def firefoxWizardPromptPage(certificateURL: String): js.Promise[String]
    
    def getWindowsEncryptionPassword(): js.Promise[String]
    
    def startFirefoxWizard(certificateHost: String): js.Promise[Unit]
    
    def waitForFirefoxWizard(): js.Promise[Unit]
    
    def warnChromeOnLinuxWithoutCertutil(): js.Promise[Unit]
  }
  object UserInterface {
    
    inline def apply(
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
    
    extension [Self <: UserInterface](x: Self) {
      
      inline def setCloseFirefoxBeforeContinuing(value: () => js.Promise[Unit]): Self = StObject.set(x, "closeFirefoxBeforeContinuing", js.Any.fromFunction0(value))
      
      inline def setFirefoxWizardPromptPage(value: String => js.Promise[String]): Self = StObject.set(x, "firefoxWizardPromptPage", js.Any.fromFunction1(value))
      
      inline def setGetWindowsEncryptionPassword(value: () => js.Promise[String]): Self = StObject.set(x, "getWindowsEncryptionPassword", js.Any.fromFunction0(value))
      
      inline def setStartFirefoxWizard(value: String => js.Promise[Unit]): Self = StObject.set(x, "startFirefoxWizard", js.Any.fromFunction1(value))
      
      inline def setWaitForFirefoxWizard(value: () => js.Promise[Unit]): Self = StObject.set(x, "waitForFirefoxWizard", js.Any.fromFunction0(value))
      
      inline def setWarnChromeOnLinuxWithoutCertutil(value: () => js.Promise[Unit]): Self = StObject.set(x, "warnChromeOnLinuxWithoutCertutil", js.Any.fromFunction0(value))
    }
  }
  
  type _To = UserInterface
  
  /* This means you don't have to write `default`, but can instead just say `userInterfaceMod.foo` */
  override def _to: UserInterface = default
}
