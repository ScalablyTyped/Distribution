package typings
package easyDashXDashHeadersLib.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket
  extends easyDashXDashHeadersLib.streamMod.Duplex {
  var bufferSize: scala.Double = js.native
  var bytesRead: scala.Double = js.native
  var bytesWritten: scala.Double = js.native
  var localAddress: java.lang.String = js.native
  var localPort: scala.Double = js.native
  var remoteAddress: java.lang.String = js.native
  var remoteFamily: java.lang.String = js.native
  var remotePort: scala.Double = js.native
  def address(): easyDashXDashHeadersLib.Anon_Address = js.native
  def connect(path: java.lang.String): scala.Unit = js.native
  def connect(path: java.lang.String, connectionListener: js.Function): scala.Unit = js.native
  def connect(port: scala.Double): scala.Unit = js.native
  def connect(port: scala.Double, host: java.lang.String): scala.Unit = js.native
  def connect(port: scala.Double, host: java.lang.String, connectionListener: js.Function): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def end(data: js.Any): scala.Unit = js.native
  def end(data: js.Any, encoding: java.lang.String): scala.Unit = js.native
  def ref(): scala.Unit = js.native
  def setEncoding(): scala.Unit = js.native
  def setKeepAlive(): scala.Unit = js.native
  def setKeepAlive(enable: scala.Boolean): scala.Unit = js.native
  def setKeepAlive(enable: scala.Boolean, initialDelay: scala.Double): scala.Unit = js.native
  def setNoDelay(): scala.Unit = js.native
  def setNoDelay(noDelay: scala.Boolean): scala.Unit = js.native
  def setTimeout(timeout: scala.Double): scala.Unit = js.native
  def setTimeout(timeout: scala.Double, callback: js.Function): scala.Unit = js.native
  def unref(): scala.Unit = js.native
  def write(data: js.Any): scala.Unit = js.native
  def write(data: js.Any, encoding: java.lang.String): scala.Unit = js.native
  def write(data: js.Any, encoding: java.lang.String, callback: js.Function): scala.Unit = js.native
  def write(str: java.lang.String, encoding: java.lang.String, fd: java.lang.String): scala.Boolean = js.native
}

@JSImport("net", "Socket")
@js.native
class SocketCls () extends Socket {
  def this(options: easyDashXDashHeadersLib.Anon_AllowHalfOpen) = this()
}

