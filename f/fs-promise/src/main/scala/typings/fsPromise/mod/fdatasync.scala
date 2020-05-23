package typings.fsPromise.mod

import typings.node.fsMod.NoParamCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "fdatasync")
@js.native
object fdatasync extends js.Object {
  def apply(fd: Double): js.Promise[Unit] = js.native
  def apply(fd: Double, callback: js.Function0[Unit]): Unit = js.native
  def apply(fd: Double, callback: NoParamCallback): Unit = js.native
}

