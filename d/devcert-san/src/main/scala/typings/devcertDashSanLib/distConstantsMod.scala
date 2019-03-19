package typings
package devcertDashSanLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devcert-san/dist/constants", JSImport.Namespace)
@js.native
object distConstantsMod extends js.Object {
  val caCertsDir: java.lang.String = js.native
  var configDir: java.lang.String = js.native
  val isLinux: scala.Boolean = js.native
  val isMac: scala.Boolean = js.native
  val isWindows: scala.Boolean = js.native
  val opensslConfPath: java.lang.String = js.native
  val opensslConfTemplate: java.lang.String = js.native
  val rootCertPath: java.lang.String = js.native
  val rootKeyPath: java.lang.String = js.native
  def configPath(pathSegments: java.lang.String*): java.lang.String = js.native
}

