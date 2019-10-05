package typings.fsDashExt.fsDashExtMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-ext", "utime")
@js.native
object utime extends js.Object {
  def apply(path: String, atime: Double, mtime: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

