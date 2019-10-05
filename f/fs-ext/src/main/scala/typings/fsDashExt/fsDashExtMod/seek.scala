package typings.fsDashExt.fsDashExtMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-ext", "seek")
@js.native
object seek extends js.Object {
  def apply(
    fd: Double,
    offset: Double,
    whence: Double,
    callback: js.Function2[/* err */ Error, /* currFilePos */ Double, Unit]
  ): Unit = js.native
}

