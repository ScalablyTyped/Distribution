package typings.easyDashXapiDashSupertest.tlsMod

import typings.easyDashXapiDashSupertest.Anon_Ca
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server
  extends typings.easyDashXapiDashSupertest.netMod.Server {
  def addContext(hostName: String, credentials: Anon_Ca): Unit = js.native
  def listen(port: Double, host: String, callback: js.Function): Server = js.native
}

