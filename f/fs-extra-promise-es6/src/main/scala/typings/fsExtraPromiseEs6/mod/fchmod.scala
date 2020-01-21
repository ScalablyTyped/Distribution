package typings.fsExtraPromiseEs6.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise-es6", "fchmod")
@js.native
object fchmod extends js.Object {
  def apply(fd: Double, mode: String): Unit = js.native
  def apply(fd: Double, mode: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(fd: Double, mode: Double): Unit = js.native
  def apply(fd: Double, mode: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

