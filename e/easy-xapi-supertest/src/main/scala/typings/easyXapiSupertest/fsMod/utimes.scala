package typings.easyXapiSupertest.fsMod

import typings.easyXapiSupertest.NodeJS.ErrnoException
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "utimes")
@js.native
object utimes extends js.Object {
  def apply(path: String, atime: Double, mtime: Double): Unit = js.native
  def apply(
    path: String,
    atime: Double,
    mtime: Double,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
  def apply(path: String, atime: Date, mtime: Date): Unit = js.native
  def apply(
    path: String,
    atime: Date,
    mtime: Date,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
}

