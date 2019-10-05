package typings.easyDashXDashHeaders.netMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.easyDashXDashHeaders.Anon_Address
import typings.easyDashXDashHeaders.Anon_AllowHalfOpen
import typings.easyDashXDashHeaders.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket extends Duplex {
  var bufferSize: Double = js.native
  var bytesRead: Double = js.native
  var bytesWritten: Double = js.native
  var localAddress: String = js.native
  var localPort: Double = js.native
  var remoteAddress: String = js.native
  var remoteFamily: String = js.native
  var remotePort: Double = js.native
  def address(): Anon_Address = js.native
  def connect(path: String): Unit = js.native
  def connect(path: String, connectionListener: js.Function): Unit = js.native
  def connect(port: Double): Unit = js.native
  def connect(port: Double, host: String): Unit = js.native
  def connect(port: Double, host: String, connectionListener: js.Function): Unit = js.native
  def destroy(): Unit = js.native
  def end(data: js.Any): Unit = js.native
  def end(data: js.Any, encoding: String): Unit = js.native
  def ref(): Unit = js.native
  def setEncoding(): Unit = js.native
  def setKeepAlive(): Unit = js.native
  def setKeepAlive(enable: Boolean): Unit = js.native
  def setKeepAlive(enable: Boolean, initialDelay: Double): Unit = js.native
  def setNoDelay(): Unit = js.native
  def setNoDelay(noDelay: Boolean): Unit = js.native
  def setTimeout(timeout: Double): Unit = js.native
  def setTimeout(timeout: Double, callback: js.Function): Unit = js.native
  def unref(): Unit = js.native
  def write(data: js.Any): Unit = js.native
  def write(data: js.Any, encoding: String): Unit = js.native
  def write(data: js.Any, encoding: String, callback: js.Function): Unit = js.native
  def write(str: String, encoding: String, fd: String): Boolean = js.native
}

@JSImport("net", "Socket")
@js.native
object Socket
  extends Instantiable0[Socket]
     with Instantiable1[/* options */ Anon_AllowHalfOpen, Socket]

