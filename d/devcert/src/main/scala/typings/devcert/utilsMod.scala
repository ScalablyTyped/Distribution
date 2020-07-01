package typings.devcert

import typings.node.Buffer
import typings.node.NodeJS.ArrayBufferView
import typings.node.childProcessMod.ExecFileSyncOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devcert/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def mktmp(): String = js.native
  def openssl(args: js.Array[String]): Buffer = js.native
  def reportableError(message: String): Error = js.native
  def run(cmd: String, args: js.Array[String]): Buffer = js.native
  def run(cmd: String, args: js.Array[String], options: ExecFileSyncOptions): Buffer = js.native
  def sudo(cmd: String): js.Promise[String | Null] = js.native
  def sudoAppend(file: String): Unit = js.native
  def sudoAppend(file: String, input: String): Unit = js.native
  def sudoAppend(file: String, input: ArrayBufferView): Unit = js.native
  def waitForUser(): js.Promise[js.Object] = js.native
}

