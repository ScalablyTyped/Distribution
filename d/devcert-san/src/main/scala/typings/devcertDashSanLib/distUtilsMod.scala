package typings
package devcertDashSanLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devcert-san/dist/utils", JSImport.Namespace)
@js.native
object distUtilsMod extends js.Object {
  def generateKey(filename: java.lang.String): scala.Unit = js.native
  def openssl(cmd: java.lang.String): nodeLib.Buffer = js.native
  def run(cmd: java.lang.String): nodeLib.Buffer = js.native
  def run(cmd: java.lang.String, options: nodeLib.childUnderscoreProcessMod.ExecSyncOptions): nodeLib.Buffer = js.native
  def waitForUser(): js.Promise[js.Object] = js.native
}

