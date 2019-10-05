package typings.easyDashXDashHeaders.fsMod

import typings.easyDashXDashHeaders.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "rename")
@js.native
object rename extends js.Object {
  def apply(oldPath: String, newPath: String): Unit = js.native
  def apply(
    oldPath: String,
    newPath: String,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
}

