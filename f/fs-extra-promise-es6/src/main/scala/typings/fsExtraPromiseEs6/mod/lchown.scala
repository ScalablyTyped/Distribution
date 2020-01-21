package typings.fsExtraPromiseEs6.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise-es6", "lchown")
@js.native
object lchown extends js.Object {
  def apply(path: String, uid: Double, gid: Double): Unit = js.native
  def apply(path: String, uid: Double, gid: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

