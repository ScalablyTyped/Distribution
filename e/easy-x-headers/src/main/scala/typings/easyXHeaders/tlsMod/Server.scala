package typings.easyXHeaders.tlsMod

import typings.easyXHeaders.anon.Ca
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server
  extends typings.easyXHeaders.netMod.Server {
  def addContext(hostName: String, credentials: Ca): Unit = js.native
  def listen(port: Double, host: js.UndefOr[scala.Nothing], callback: js.Function): Server = js.native
  def listen(port: Double, host: String, callback: js.Function): Server = js.native
}

