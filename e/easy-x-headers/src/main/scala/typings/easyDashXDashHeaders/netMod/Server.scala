package typings.easyDashXDashHeaders.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends Socket {
  var connections: Double = js.native
  var maxConnections: Double = js.native
  def close(): Server = js.native
  def close(callback: js.Function): Server = js.native
  def listen(handle: js.Any): Server = js.native
  def listen(handle: js.Any, listeningListener: js.Function): Server = js.native
  def listen(path: String): Server = js.native
  def listen(path: String, listeningListener: js.Function): Server = js.native
  def listen(port: Double): Server = js.native
  def listen(port: Double, host: String): Server = js.native
  def listen(port: Double, host: String, backlog: Double): Server = js.native
  def listen(port: Double, host: String, backlog: Double, listeningListener: js.Function): Server = js.native
}

