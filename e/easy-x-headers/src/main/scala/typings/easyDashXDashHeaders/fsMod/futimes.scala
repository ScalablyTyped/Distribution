package typings.easyDashXDashHeaders.fsMod

import typings.easyDashXDashHeaders.NodeJS.ErrnoException
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "futimes")
@js.native
object futimes extends js.Object {
  def apply(fd: Double, atime: Double, mtime: Double): Unit = js.native
  def apply(
    fd: Double,
    atime: Double,
    mtime: Double,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
  def apply(fd: Double, atime: Date, mtime: Date): Unit = js.native
  def apply(
    fd: Double,
    atime: Date,
    mtime: Date,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
}

