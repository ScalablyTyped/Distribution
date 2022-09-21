package typings.firebaseAuth

import typings.seleniumWebdriver.mod.WebDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idpPageMod {
  
  @JSImport("@firebase/auth/dist/cordova/test/integration/webdriver/util/idp_page", "IdPPage")
  @js.native
  open class IdPPage protected () extends StObject {
    def this(driver: WebDriver) = this()
    
    def clickAddAccount(): js.Promise[Unit] = js.native
    
    def clickSignIn(): js.Promise[Unit] = js.native
    
    /* private */ val driver: Any = js.native
    
    def fillDisplayName(displayName: String): js.Promise[Unit] = js.native
    
    def fillEmail(email: String): js.Promise[Unit] = js.native
    
    /* private */ var fillInput: Any = js.native
    
    def fillProfilePhoto(prophilePhoto: String): js.Promise[Unit] = js.native
    
    def fillScreenName(screenName: String): js.Promise[Unit] = js.native
    
    def pageLoad(): js.Promise[Unit] = js.native
    
    def selectExistingAccountByEmail(email: String): js.Promise[Unit] = js.native
  }
  /* static members */
  object IdPPage {
    
    @JSImport("@firebase/auth/dist/cordova/test/integration/webdriver/util/idp_page", "IdPPage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/auth/dist/cordova/test/integration/webdriver/util/idp_page", "IdPPage.PAGE_TITLE")
    @js.native
    def PAGE_TITLE: String = js.native
    inline def PAGE_TITLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAGE_TITLE")(x.asInstanceOf[js.Any])
  }
}
