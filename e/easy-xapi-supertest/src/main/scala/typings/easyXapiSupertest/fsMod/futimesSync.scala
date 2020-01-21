package typings.easyXapiSupertest.fsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "futimesSync")
@js.native
object futimesSync extends js.Object {
  def apply(fd: Double, atime: Double, mtime: Double): Unit = js.native
  def apply(fd: Double, atime: Date, mtime: Date): Unit = js.native
}

