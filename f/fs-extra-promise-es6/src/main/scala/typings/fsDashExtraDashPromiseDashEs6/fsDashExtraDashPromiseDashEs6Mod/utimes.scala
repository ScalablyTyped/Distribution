package typings.fsDashExtraDashPromiseDashEs6.fsDashExtraDashPromiseDashEs6Mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise-es6", "utimes")
@js.native
object utimes extends js.Object {
  def apply(path: String, atime: Double, mtime: Double): Unit = js.native
  def apply(path: String, atime: Double, mtime: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

