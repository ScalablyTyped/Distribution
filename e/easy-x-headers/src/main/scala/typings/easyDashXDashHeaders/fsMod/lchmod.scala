package typings.easyDashXDashHeaders.fsMod

import typings.easyDashXDashHeaders.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "lchmod")
@js.native
object lchmod extends js.Object {
  def apply(path: String, mode: String): Unit = js.native
  def apply(path: String, mode: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  def apply(path: String, mode: Double): Unit = js.native
  def apply(path: String, mode: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
}

