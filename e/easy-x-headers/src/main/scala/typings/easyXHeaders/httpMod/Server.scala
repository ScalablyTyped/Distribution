package typings.easyXHeaders.httpMod

import typings.easyXHeaders.AnonAddress
import typings.easyXHeaders.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends EventEmitter {
  var maxHeadersCount: Double = js.native
  def address(): AnonAddress = js.native
  def close(): Server = js.native
  def close(cb: js.Any): Server = js.native
  def listen(handle: js.Any): Server = js.native
  def listen(handle: js.Any, listeningListener: js.Function): Server = js.native
  def listen(path: String): Server = js.native
  def listen(path: String, callback: js.Function): Server = js.native
  def listen(port: Double): Server = js.native
  def listen(port: Double, hostname: String): Server = js.native
  def listen(port: Double, hostname: String, backlog: Double): Server = js.native
  def listen(port: Double, hostname: String, backlog: Double, callback: js.Function): Server = js.native
  def listen(port: Double, hostname: String, callback: js.Function): Server = js.native
}

