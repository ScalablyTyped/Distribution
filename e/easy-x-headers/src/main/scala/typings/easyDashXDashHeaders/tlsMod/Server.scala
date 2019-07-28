package typings.easyDashXDashHeaders.tlsMod

import typings.easyDashXDashHeaders.Anon_Ca
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server
  extends typings.easyDashXDashHeaders.netMod.Server {
  def addContext(hostName: String, credentials: Anon_Ca): Unit = js.native
  def listen(port: Double, host: String, callback: js.Function): Server = js.native
}

