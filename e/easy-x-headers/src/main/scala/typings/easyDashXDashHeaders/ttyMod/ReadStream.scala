package typings.easyDashXDashHeaders.ttyMod

import typings.easyDashXDashHeaders.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadStream extends Socket {
  var isRaw: Boolean = js.native
  def setRawMode(mode: Boolean): Unit = js.native
}

