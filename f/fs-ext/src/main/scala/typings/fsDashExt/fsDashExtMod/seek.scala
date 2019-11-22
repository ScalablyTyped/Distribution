package typings.fsDashExt.fsDashExtMod

import typings.node.NodeJS.ErrnoException
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
    callback: js.Function2[/* err */ ErrnoException | Null, /* currFilePos */ Double, Unit]
  ): Unit = js.native
}

