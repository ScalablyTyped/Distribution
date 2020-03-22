package typings.devcert

import typings.node.Buffer
import typings.node.childProcessMod.ExecSyncOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devcert/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def mktmp(): String = js.native
  def openssl(cmd: String): Buffer = js.native
  def reportableError(message: String): Error = js.native
  def run(cmd: String): Buffer = js.native
  def run(cmd: String, options: ExecSyncOptions): Buffer = js.native
  def sudo(cmd: String): js.Promise[String | Null] = js.native
  def waitForUser(): js.Promise[js.Object] = js.native
}

