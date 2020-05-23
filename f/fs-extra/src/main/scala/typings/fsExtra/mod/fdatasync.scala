package typings.fsExtra.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra", "fdatasync")
@js.native
object fdatasync extends js.Object {
  def apply(fd: Double): js.Promise[Unit] = js.native
  def apply(fd: Double, callback: js.Function0[Unit]): Unit = js.native
}

