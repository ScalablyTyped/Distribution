package typings.devcertSan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devcert-san/dist/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  val caCertsDir: String = js.native
  var configDir: String = js.native
  val isLinux: Boolean = js.native
  val isMac: Boolean = js.native
  val isWindows: Boolean = js.native
  val opensslConfPath: String = js.native
  val opensslConfTemplate: String = js.native
  val rootCertPath: String = js.native
  val rootKeyPath: String = js.native
  def configPath(pathSegments: String*): String = js.native
}

