package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PKCS#11 module management API
  *
  * Permissions: `pkcs11`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object pkcs11 {
  
  @JSGlobal("browser.pkcs11")
  @js.native
  val ^ : js.Any = js.native
  
  /** Enumerate a module's slots, each with their name and whether a token is present */
  inline def getModuleSlots(name: String): js.Promise[Name] = ^.asInstanceOf[js.Dynamic].applyDynamic("getModuleSlots")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Name]]
  
  /** Install a PKCS#11 module with a given name */
  inline def installModule(name: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("installModule")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def installModule(name: String, flags: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("installModule")(name.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /* pkcs11 functions */
  /** checks whether a PKCS#11 module, given by name, is installed */
  inline def isModuleInstalled(name: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isModuleInstalled")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  /** Remove an installed PKCS#11 module from firefox */
  inline def uninstallModule(name: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstallModule")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
