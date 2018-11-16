package typings
package easyDashXapiDashSupertestLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server
  extends easyDashXapiDashSupertestLib.netMod.Server {
  def addContext(hostName: java.lang.String, credentials: easyDashXapiDashSupertestLib.Anon_Ca): scala.Unit = js.native
  def listen(port: scala.Double, host: java.lang.String, callback: js.Function): Server = js.native
}

