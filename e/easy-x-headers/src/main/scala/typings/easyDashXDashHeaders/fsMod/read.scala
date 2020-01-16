package typings.easyDashXDashHeaders.fsMod

import typings.easyDashXDashHeaders.NodeJS.ErrnoException
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "read")
@js.native
object read extends js.Object {
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Unit = js.native
  def apply(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
}

