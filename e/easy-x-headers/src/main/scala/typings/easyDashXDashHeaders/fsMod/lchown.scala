package typings.easyDashXDashHeaders.fsMod

import typings.easyDashXDashHeaders.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "lchown")
@js.native
object lchown extends js.Object {
  def apply(path: String, uid: Double, gid: Double): Unit = js.native
  def apply(
    path: String,
    uid: Double,
    gid: Double,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
}

