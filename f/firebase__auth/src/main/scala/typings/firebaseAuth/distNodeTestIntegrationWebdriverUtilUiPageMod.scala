package typings.firebaseAuth

import typings.seleniumWebdriver.mod.WebDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeTestIntegrationWebdriverUtilUiPageMod {
  
  @JSImport("@firebase/auth/dist/node/test/integration/webdriver/util/ui_page", "UiPage")
  @js.native
  open class UiPage protected () extends StObject {
    def this(driver: WebDriver) = this()
    
    def clickEmailSignIn(): js.Promise[Unit] = js.native
    
    def clickGoogleSignIn(): js.Promise[Unit] = js.native
    
    def clickGuestSignIn(): js.Promise[Unit] = js.native
    
    def clickPhoneSignIn(): js.Promise[Unit] = js.native
    
    def clickSubmit(): js.Promise[Unit] = js.native
    
    /* private */ val driver: Any = js.native
    
    def enterEmail(email: String): js.Promise[Unit] = js.native
    
    def enterEmailDisplayName(name: String): js.Promise[Unit] = js.native
    
    def enterPassword(name: String): js.Promise[Unit] = js.native
    
    def enterPhoneCode(code: String): js.Promise[Unit] = js.native
    
    def enterPhoneNumber(phoneNumber: String): js.Promise[Unit] = js.native
    
    /* private */ var fillInput: Any = js.native
    
    def waitForCodeInputToBePresent(): js.Promise[Unit] = js.native
  }
}
