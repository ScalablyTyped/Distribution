package typings.freedom.freedom

import typings.freedom.freedomStrings.onConnection
import typings.freedom.freedomStrings.onData
import typings.freedom.freedomStrings.onDisconnect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TcpSocket {
  
  trait ConnectInfo extends StObject {
    
    var host: String
    
    var port: Double
    
    var socket: Double
  }
  object ConnectInfo {
    
    inline def apply(host: String, port: Double, socket: Double): ConnectInfo = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectInfo]
    }
    
    extension [Self <: ConnectInfo](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setSocket(value: Double): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  trait DisconnectInfo extends StObject {
    
    var errcode: String
    
    var message: String
  }
  object DisconnectInfo {
    
    inline def apply(errcode: String, message: String): DisconnectInfo = {
      val __obj = js.Dynamic.literal(errcode = errcode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisconnectInfo]
    }
    
    extension [Self <: DisconnectInfo](x: Self) {
      
      inline def setErrcode(value: String): Self = StObject.set(x, "errcode", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReadInfo extends StObject {
    
    var data: js.typedarray.ArrayBuffer
  }
  object ReadInfo {
    
    inline def apply(data: js.typedarray.ArrayBuffer): ReadInfo = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadInfo]
    }
    
    extension [Self <: ReadInfo](x: Self) {
      
      inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  // The TcpSocket class (freedom['core.TcpSocket'])
  @js.native
  trait Socket extends StObject {
    
    def close(): js.Promise[Unit] = js.native
    
    def connect(hostname: String, port: Double): js.Promise[Unit] = js.native
    
    def getInfo(): js.Promise[SocketInfo] = js.native
    
    def listen(address: String, port: Double): js.Promise[Unit] = js.native
    
    def off(eventType: String, f: js.Function1[/* i */ js.Object, Unit]): Unit = js.native
    @JSName("off")
    def off_onData(`type`: onData, f: js.Function1[/* i */ ReadInfo, Unit]): Unit = js.native
    
    def on(eventType: String, f: js.Function1[/* i */ js.Object, Unit]): Unit = js.native
    // TcpSockets have 3 types of events:
    @JSName("on")
    def on_onConnection(`type`: onConnection, f: js.Function1[/* i */ ConnectInfo, Unit]): Unit = js.native
    @JSName("on")
    def on_onData(`type`: onData, f: js.Function1[/* i */ ReadInfo, Unit]): Unit = js.native
    @JSName("on")
    def on_onDisconnect(`type`: onDisconnect, f: js.Function1[/* i */ DisconnectInfo, Unit]): Unit = js.native
    
    def pause(): js.Promise[Unit] = js.native
    @JSName("pause")
    var pause_Original: Method0[Unit] = js.native
    
    def resume(): js.Promise[Unit] = js.native
    @JSName("resume")
    var resume_Original: Method0[Unit] = js.native
    
    def secure(): js.Promise[Unit] = js.native
    
    def write(a: js.typedarray.ArrayBuffer): js.Promise[WriteInfo] = js.native
    @JSName("write")
    var write_Original: Method1[js.typedarray.ArrayBuffer, WriteInfo] = js.native
  }
  
  trait SocketInfo extends StObject {
    
    var connected: Boolean
    
    var localAddress: js.UndefOr[String] = js.undefined
    
    var localPort: js.UndefOr[Double] = js.undefined
    
    var peerAddress: js.UndefOr[String] = js.undefined
    
    var peerPort: js.UndefOr[Double] = js.undefined
  }
  object SocketInfo {
    
    inline def apply(connected: Boolean): SocketInfo = {
      val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketInfo]
    }
    
    extension [Self <: SocketInfo](x: Self) {
      
      inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
      
      inline def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
      
      inline def setPeerAddress(value: String): Self = StObject.set(x, "peerAddress", value.asInstanceOf[js.Any])
      
      inline def setPeerAddressUndefined: Self = StObject.set(x, "peerAddress", js.undefined)
      
      inline def setPeerPort(value: Double): Self = StObject.set(x, "peerPort", value.asInstanceOf[js.Any])
      
      inline def setPeerPortUndefined: Self = StObject.set(x, "peerPort", js.undefined)
    }
  }
  
  trait WriteInfo extends StObject {
    
    var bytesWritten: Double
  }
  object WriteInfo {
    
    inline def apply(bytesWritten: Double): WriteInfo = {
      val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriteInfo]
    }
    
    extension [Self <: WriteInfo](x: Self) {
      
      inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
    }
  }
}
