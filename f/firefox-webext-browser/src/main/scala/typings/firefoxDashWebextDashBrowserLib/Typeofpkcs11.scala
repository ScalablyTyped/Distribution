package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofpkcs11 extends js.Object {
  /** Enumerate a module's slots, each with their name and whether a token is present */
  def getModuleSlots(name: java.lang.String): js.Promise[Anon_NameToken] = js.native
  /** Install a PKCS#11 module with a given name */
  def installModule(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def installModule(name: java.lang.String, flags: scala.Double): js.Promise[scala.Unit] = js.native
  /* pkcs11 functions */
  /** checks whether a PKCS#11 module, given by name, is installed */
  def isModuleInstalled(name: java.lang.String): js.Promise[scala.Boolean] = js.native
  /** Remove an installed PKCS#11 module from firefox */
  def uninstallModule(name: java.lang.String): js.Promise[scala.Unit] = js.native
}

