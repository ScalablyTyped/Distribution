package typings.easyDashXDashHeaders.fsMod

import typings.easyDashXDashHeaders.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "access")
@js.native
object access extends js.Object {
  def apply(path: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: String, mode: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}

