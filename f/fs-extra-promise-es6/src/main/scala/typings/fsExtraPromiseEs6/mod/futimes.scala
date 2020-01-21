package typings.fsExtraPromiseEs6.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise-es6", "futimes")
@js.native
object futimes extends js.Object {
  def apply(fd: Double, atime: Double, mtime: Double): Unit = js.native
  def apply(fd: Double, atime: Double, mtime: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

