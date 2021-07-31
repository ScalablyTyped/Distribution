package typings.easyXapiSupertest

import typings.easyXapiSupertest.anon.Address
import typings.easyXapiSupertest.anon.AllowHalfOpen
import typings.easyXapiSupertest.anon.`0`
import typings.easyXapiSupertest.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object netMod {
  
  @JSImport("net", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("net", "Socket")
  @js.native
  class SocketCls () extends Socket {
    def this(options: AllowHalfOpen) = this()
  }
  
  @scala.inline
  def connect(options: `0`): Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[Socket]
  @scala.inline
  def connect(options: `0`, connectionListener: js.Function): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]
  @scala.inline
  def connect(path: String): Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(path.asInstanceOf[js.Any]).asInstanceOf[Socket]
  @scala.inline
  def connect(path: String, connectionListener: js.Function): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(path.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]
  @scala.inline
  def connect(port: Double): Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any]).asInstanceOf[Socket]
  @scala.inline
  def connect(port: Double, host: String): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Socket]
  @scala.inline
  def connect(port: Double, host: String, connectionListener: js.Function): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]
  @scala.inline
  def connect(port: Double, host: Unit, connectionListener: js.Function): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]
  
  @scala.inline
  def createConnection(options: `0`): Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any]).asInstanceOf[Socket]
  @scala.inline
  def createConnection(options: `0`, connectionListener: js.Function): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]
  @scala.inline
  def createConnection(path: String): Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(path.asInstanceOf[js.Any]).asInstanceOf[Socket]
  @scala.inline
  def createConnection(path: String, connectionListener: js.Function): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(path.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]
  @scala.inline
  def createConnection(port: Double): Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any]).asInstanceOf[Socket]
  @scala.inline
  def createConnection(port: Double, host: String): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Socket]
  @scala.inline
  def createConnection(port: Double, host: String, connectionListener: js.Function): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]
  @scala.inline
  def createConnection(port: Double, host: Unit, connectionListener: js.Function): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Socket]
  
  @scala.inline
  def createServer(): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[Server]
  @scala.inline
  def createServer(connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(connectionListener.asInstanceOf[js.Any]).asInstanceOf[Server]
  @scala.inline
  def createServer(options: Unit, connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Server]
  @scala.inline
  def createServer(options: `0`): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
  @scala.inline
  def createServer(options: `0`, connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Server]
  
  @scala.inline
  def isIP(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("isIP")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def isIPv4(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv4")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isIPv6(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv6")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
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
    def listen(port: Double, host: String): Server = js.native
    def listen(port: Double, host: String, backlog: Double): Server = js.native
    def listen(port: Double, host: String, backlog: Double, listeningListener: js.Function): Server = js.native
    def listen(port: Double, host: String, backlog: Unit, listeningListener: js.Function): Server = js.native
    def listen(port: Double, host: Unit, backlog: Double): Server = js.native
    def listen(port: Double, host: Unit, backlog: Double, listeningListener: js.Function): Server = js.native
    def listen(port: Double, host: Unit, backlog: Unit, listeningListener: js.Function): Server = js.native
    
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
    def connect(port: Double, host: String): Unit = js.native
    def connect(port: Double, host: String, connectionListener: js.Function): Unit = js.native
    def connect(port: Double, host: Unit, connectionListener: js.Function): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def end(data: js.Any): Unit = js.native
    def end(data: js.Any, encoding: String): Unit = js.native
    def end(data: Unit, encoding: String): Unit = js.native
    
    var localAddress: String = js.native
    
    var localPort: Double = js.native
    
    def ref(): Unit = js.native
    
    var remoteAddress: String = js.native
    
    var remoteFamily: String = js.native
    
    var remotePort: Double = js.native
    
    def setEncoding(): Unit = js.native
    
    def setKeepAlive(): Unit = js.native
    def setKeepAlive(enable: Boolean): Unit = js.native
    def setKeepAlive(enable: Boolean, initialDelay: Double): Unit = js.native
    def setKeepAlive(enable: Unit, initialDelay: Double): Unit = js.native
    
    def setNoDelay(): Unit = js.native
    def setNoDelay(noDelay: Boolean): Unit = js.native
    
    def setTimeout(timeout: Double): Unit = js.native
    def setTimeout(timeout: Double, callback: js.Function): Unit = js.native
    
    def unref(): Unit = js.native
    
    def write(data: js.Any): Unit = js.native
    def write(data: js.Any, encoding: String): Unit = js.native
    def write(data: js.Any, encoding: String, callback: js.Function): Unit = js.native
    def write(data: js.Any, encoding: Unit, callback: js.Function): Unit = js.native
    def write(str: String, encoding: String, fd: String): Boolean = js.native
    def write(str: String, encoding: Unit, fd: String): Boolean = js.native
  }
}
