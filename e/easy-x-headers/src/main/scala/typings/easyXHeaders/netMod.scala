package typings.easyXHeaders

import typings.easyXHeaders.anon.Address
import typings.easyXHeaders.anon.AllowHalfOpen
import typings.easyXHeaders.anon.`0`
import typings.easyXHeaders.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object netMod {
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("net", "Socket")
  @js.native
  class SocketCls () extends Socket {
    def this(options: AllowHalfOpen) = this()
  }
  
  @JSImport("net", "connect")
  @js.native
  def connect(options: `0`): Socket = js.native
  @JSImport("net", "connect")
  @js.native
  def connect(options: `0`, connectionListener: js.Function): Socket = js.native
  @JSImport("net", "connect")
  @js.native
  def connect(path: String): Socket = js.native
  @JSImport("net", "connect")
  @js.native
  def connect(path: String, connectionListener: js.Function): Socket = js.native
  @JSImport("net", "connect")
  @js.native
  def connect(port: Double): Socket = js.native
  @JSImport("net", "connect")
  @js.native
  def connect(port: Double, host: js.UndefOr[scala.Nothing], connectionListener: js.Function): Socket = js.native
  @JSImport("net", "connect")
  @js.native
  def connect(port: Double, host: String): Socket = js.native
  @JSImport("net", "connect")
  @js.native
  def connect(port: Double, host: String, connectionListener: js.Function): Socket = js.native
  
  @JSImport("net", "createConnection")
  @js.native
  def createConnection(options: `0`): Socket = js.native
  @JSImport("net", "createConnection")
  @js.native
  def createConnection(options: `0`, connectionListener: js.Function): Socket = js.native
  @JSImport("net", "createConnection")
  @js.native
  def createConnection(path: String): Socket = js.native
  @JSImport("net", "createConnection")
  @js.native
  def createConnection(path: String, connectionListener: js.Function): Socket = js.native
  @JSImport("net", "createConnection")
  @js.native
  def createConnection(port: Double): Socket = js.native
  @JSImport("net", "createConnection")
  @js.native
  def createConnection(port: Double, host: js.UndefOr[scala.Nothing], connectionListener: js.Function): Socket = js.native
  @JSImport("net", "createConnection")
  @js.native
  def createConnection(port: Double, host: String): Socket = js.native
  @JSImport("net", "createConnection")
  @js.native
  def createConnection(port: Double, host: String, connectionListener: js.Function): Socket = js.native
  
  @JSImport("net", "createServer")
  @js.native
  def createServer(): Server = js.native
  @JSImport("net", "createServer")
  @js.native
  def createServer(connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = js.native
  @JSImport("net", "createServer")
  @js.native
  def createServer(options: js.UndefOr[scala.Nothing], connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = js.native
  @JSImport("net", "createServer")
  @js.native
  def createServer(options: `0`): Server = js.native
  @JSImport("net", "createServer")
  @js.native
  def createServer(options: `0`, connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = js.native
  
  @JSImport("net", "isIP")
  @js.native
  def isIP(input: String): Double = js.native
  
  @JSImport("net", "isIPv4")
  @js.native
  def isIPv4(input: String): Boolean = js.native
  
  @JSImport("net", "isIPv6")
  @js.native
  def isIPv6(input: String): Boolean = js.native
  
  @js.native
  trait Server extends Socket {
    
    def close(): Server = js.native
    def close(callback: js.Function): Server = js.native
    
    var connections: Double = js.native
    
    def listen(handle: js.Any): Server = js.native
    def listen(handle: js.Any, listeningListener: js.Function): Server = js.native
    def listen(path: String): Server = js.native
    def listen(path: String, listeningListener: js.Function): Server = js.native
    def listen(port: Double): Server = js.native
    def listen(
      port: Double,
      host: js.UndefOr[scala.Nothing],
      backlog: js.UndefOr[scala.Nothing],
      listeningListener: js.Function
    ): Server = js.native
    def listen(port: Double, host: js.UndefOr[scala.Nothing], backlog: Double): Server = js.native
    def listen(port: Double, host: js.UndefOr[scala.Nothing], backlog: Double, listeningListener: js.Function): Server = js.native
    def listen(port: Double, host: String): Server = js.native
    def listen(port: Double, host: String, backlog: js.UndefOr[scala.Nothing], listeningListener: js.Function): Server = js.native
    def listen(port: Double, host: String, backlog: Double): Server = js.native
    def listen(port: Double, host: String, backlog: Double, listeningListener: js.Function): Server = js.native
    
    var maxConnections: Double = js.native
  }
  
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
}
