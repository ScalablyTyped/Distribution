package typings
package easyDashXapiDashSupertestLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server
  extends easyDashXapiDashSupertestLib.eventsMod.EventEmitter {
  var maxHeadersCount: scala.Double = js.native
  def address(): easyDashXapiDashSupertestLib.Anon_Address = js.native
  def close(): Server = js.native
  def close(cb: js.Any): Server = js.native
  def listen(handle: js.Any): Server = js.native
  def listen(handle: js.Any, listeningListener: js.Function): Server = js.native
  def listen(path: java.lang.String): Server = js.native
  def listen(path: java.lang.String, callback: js.Function): Server = js.native
  def listen(port: scala.Double): Server = js.native
  def listen(port: scala.Double, hostname: java.lang.String): Server = js.native
  def listen(port: scala.Double, hostname: java.lang.String, backlog: scala.Double): Server = js.native
  def listen(port: scala.Double, hostname: java.lang.String, backlog: scala.Double, callback: js.Function): Server = js.native
  def listen(port: scala.Double, hostname: java.lang.String, callback: js.Function): Server = js.native
}

