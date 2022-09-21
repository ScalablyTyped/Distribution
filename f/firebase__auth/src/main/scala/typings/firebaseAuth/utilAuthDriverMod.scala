package typings.firebaseAuth

import typings.firebaseAuth.anon.NoWait
import typings.firebaseAuth.firebaseAuthStrings.LOCAL
import typings.firebaseAuth.firebaseAuthStrings.NONE
import typings.firebaseAuth.firebaseAuthStrings.SESSION
import typings.firebaseAuth.mod.Auth
import typings.firebaseAuth.mod.User
import typings.seleniumWebdriver.mod.WebDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilAuthDriverMod {
  
  @JSImport("@firebase/auth/dist/esm2017/test/integration/webdriver/util/auth_driver", "AuthDriver")
  @js.native
  open class AuthDriver () extends StObject {
    
    def call[T](fn: String, args: Any*): js.Promise[T] = js.native
    
    def callNoWait(fn: String, args: Any*): js.Promise[Unit] = js.native
    
    def closeExtraWindows(): js.Promise[Unit] = js.native
    
    def closePopup(): js.Promise[Unit] = js.native
    
    def getAuthSnapshot(): js.Promise[Auth] = js.native
    
    def getUserSnapshot(): js.Promise[User] = js.native
    
    def goToTestPage(): js.Promise[Unit] = js.native
    
    /* private */ var injectConfig: Any = js.native
    
    def injectConfigAndInitAuth(): js.Promise[Unit] = js.native
    
    def injectConfigAndInitLegacySDK(): js.Promise[Unit] = js.native
    def injectConfigAndInitLegacySDK(persistence: SESSION | LOCAL | NONE): js.Promise[Unit] = js.native
    
    def isCompatLayer(): Boolean = js.native
    
    def pause(ms: Double): js.Promise[Unit] = js.native
    
    def refresh(): js.Promise[Unit] = js.native
    
    def reinitOnRedirect(): js.Promise[Unit] = js.native
    
    def reset(): js.Promise[Unit] = js.native
    
    def selectMainWindow(): js.Promise[Unit] = js.native
    def selectMainWindow(options: NoWait): js.Promise[Unit] = js.native
    
    def selectPopupWindow(): js.Promise[Unit] = js.native
    
    def start(browser: String): js.Promise[Unit] = js.native
    
    def stop(): js.Promise[Unit] = js.native
    
    def waitForAuthInit(): js.Promise[Unit] = js.native
    
    def waitForLegacyAuthInit(): js.Promise[Unit] = js.native
    
    var webDriver: WebDriver = js.native
  }
  
  @JSImport("@firebase/auth/dist/esm2017/test/integration/webdriver/util/auth_driver", "START_FUNCTION")
  @js.native
  val START_FUNCTION: /* "startAuth" */ String = js.native
}
