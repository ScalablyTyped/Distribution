package typings.devcertSan

import typings.node.Buffer
import typings.node.childProcessMod.ExecSyncOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devcert-san/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def generateKey(filename: String): Unit = js.native
  def openssl(cmd: String): Buffer = js.native
  def run(cmd: String): Buffer = js.native
  def run(cmd: String, options: ExecSyncOptions): Buffer = js.native
  def waitForUser(): js.Promise[js.Object] = js.native
}

