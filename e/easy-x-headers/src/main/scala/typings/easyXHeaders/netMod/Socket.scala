package typings.easyXHeaders.netMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.easyXHeaders.anon.Address
import typings.easyXHeaders.anon.AllowHalfOpen
import typings.easyXHeaders.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Socket extends Duplex {
  
  def address(): Address = js.native
  
  var bufferSize: Double = js.native
  
  var bytesRead: Double = js.native
  
  var bytesWritten: Double = js.native
  
  def connect(path: String): Unit = js.native
  def connect(path: String, connectionListener: js.Function): Unit = js.native
  def connect(port: Double): Unit = js.native
  def connect(port: Double, host: js.UndefOr[scala.Nothing], connectionListener: js.Function): Unit = js.native
  def connect(port: Double, host: String): Unit = js.native
  def connect(port: Double, host: String, connectionListener: js.Function): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def end(data: js.UndefOr[scala.Nothing], encoding: String): Unit = js.native
  def end(data: js.Any): Unit = js.native
  def end(data: js.Any, encoding: String): Unit = js.native
  
  var localAddress: String = js.native
  
  var localPort: Double = js.native
  
  def ref(): Unit = js.native
  
  var remoteAddress: String = js.native
  
  var remoteFamily: String = js.native
  
  var remotePort: Double = js.native
  
  def setEncoding(): Unit = js.native
  
  def setKeepAlive(): Unit = js.native
  def setKeepAlive(enable: js.UndefOr[scala.Nothing], initialDelay: Double): Unit = js.native
  def setKeepAlive(enable: Boolean): Unit = js.native
  def setKeepAlive(enable: Boolean, initialDelay: Double): Unit = js.native
  
  def setNoDelay(): Unit = js.native
  def setNoDelay(noDelay: Boolean): Unit = js.native
  
  def setTimeout(timeout: Double): Unit = js.native
  def setTimeout(timeout: Double, callback: js.Function): Unit = js.native
  
  def unref(): Unit = js.native
  
  def write(data: js.Any): Unit = js.native
  def write(data: js.Any, encoding: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
  def write(data: js.Any, encoding: String): Unit = js.native
  def write(data: js.Any, encoding: String, callback: js.Function): Unit = js.native
  def write(str: String, encoding: js.UndefOr[scala.Nothing], fd: String): Boolean = js.native
  def write(str: String, encoding: String, fd: String): Boolean = js.native
}
@JSImport("net", "Socket")
@js.native
object Socket
  extends Instantiable0[Socket]
     with Instantiable1[/* options */ AllowHalfOpen, Socket]
