package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PKCS#11 module management API
  *
  * Permissions: `pkcs11`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.pkcs11")
@js.native
object pkcs11 extends js.Object {
  
  /** Enumerate a module's slots, each with their name and whether a token is present */
  def getModuleSlots(name: String): js.Promise[Name] = js.native
  
  /** Install a PKCS#11 module with a given name */
  def installModule(name: String): js.Promise[Unit] = js.native
  def installModule(name: String, flags: Double): js.Promise[Unit] = js.native
  
  /* pkcs11 functions */
  /** checks whether a PKCS#11 module, given by name, is installed */
  def isModuleInstalled(name: String): js.Promise[Boolean] = js.native
  
  /** Remove an installed PKCS#11 module from firefox */
  def uninstallModule(name: String): js.Promise[Unit] = js.native
}
