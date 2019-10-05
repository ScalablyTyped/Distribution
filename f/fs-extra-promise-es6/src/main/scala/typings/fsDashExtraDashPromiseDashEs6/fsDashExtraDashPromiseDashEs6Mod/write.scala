package typings.fsDashExtraDashPromiseDashEs6.fsDashExtraDashPromiseDashEs6Mod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise-es6", "write")
@js.native
object write extends js.Object {
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Unit = js.native
  def apply(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ Error, /* written */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
}

