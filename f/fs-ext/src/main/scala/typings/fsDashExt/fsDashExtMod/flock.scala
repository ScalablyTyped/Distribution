package typings.fsDashExt.fsDashExtMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-ext", "flock")
@js.native
object flock extends js.Object {
  def apply(fd: Double, flags: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

