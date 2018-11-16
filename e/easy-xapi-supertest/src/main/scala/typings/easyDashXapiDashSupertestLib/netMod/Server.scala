package typings
package easyDashXapiDashSupertestLib.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends Socket {
  var connections: scala.Double = js.native
  var maxConnections: scala.Double = js.native
  def close(): Server = js.native
  def close(callback: js.Function): Server = js.native
  def listen(handle: js.Any): Server = js.native
  def listen(handle: js.Any, listeningListener: js.Function): Server = js.native
  def listen(path: java.lang.String): Server = js.native
  def listen(path: java.lang.String, listeningListener: js.Function): Server = js.native
  def listen(port: scala.Double): Server = js.native
  def listen(port: scala.Double, host: java.lang.String): Server = js.native
  def listen(port: scala.Double, host: java.lang.String, backlog: scala.Double): Server = js.native
  def listen(port: scala.Double, host: java.lang.String, backlog: scala.Double, listeningListener: js.Function): Server = js.native
}

