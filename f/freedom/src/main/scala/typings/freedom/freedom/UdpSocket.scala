package typings.freedom.freedom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UdpSocket {
  
  trait Implementation extends StObject {
    
    def bind(address: String, port: Double, continuation: js.Function0[Unit]): Unit
    
    def destroy(continuation: js.Function0[Unit]): Unit
    
    def getInfo(continuation: js.Function1[/* socketInfo */ SocketInfo, Unit]): Unit
    
    def sendTo(
      data: js.typedarray.ArrayBuffer,
      address: String,
      port: Double,
      continuation: js.Function1[/* bytesWritten */ Double, Unit]
    ): Unit
  }
  object Implementation {
    
    inline def apply(
      bind: (String, Double, js.Function0[Unit]) => Unit,
      destroy: js.Function0[Unit] => Unit,
      getInfo: js.Function1[/* socketInfo */ SocketInfo, Unit] => Unit,
      sendTo: (js.typedarray.ArrayBuffer, String, Double, js.Function1[/* bytesWritten */ Double, Unit]) => Unit
    ): Implementation = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction3(bind), destroy = js.Any.fromFunction1(destroy), getInfo = js.Any.fromFunction1(getInfo), sendTo = js.Any.fromFunction4(sendTo))
      __obj.asInstanceOf[Implementation]
    }
    
    extension [Self <: Implementation](x: Self) {
      
      inline def setBind(value: (String, Double, js.Function0[Unit]) => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction3(value))
      
      inline def setDestroy(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setGetInfo(value: js.Function1[/* socketInfo */ SocketInfo, Unit] => Unit): Self = StObject.set(x, "getInfo", js.Any.fromFunction1(value))
      
      inline def setSendTo(
        value: (js.typedarray.ArrayBuffer, String, Double, js.Function1[/* bytesWritten */ Double, Unit]) => Unit
      ): Self = StObject.set(x, "sendTo", js.Any.fromFunction4(value))
    }
  }
  
  // Type for the chrome.socket.recvFrom callback:
  //   http://developer.chrome.com/apps/socket#method-recvFrom
  // This is also the type returned to onData callbacks.
  trait RecvFromInfo extends StObject {
    
    var address: String
    
    var data: js.typedarray.ArrayBuffer
    
    var port: Double
    
    var resultCode: Double
  }
  object RecvFromInfo {
    
    inline def apply(address: String, data: js.typedarray.ArrayBuffer, port: Double, resultCode: Double): RecvFromInfo = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecvFromInfo]
    }
    
    extension [Self <: RecvFromInfo](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setResultCode(value: Double): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Socket extends StObject {
    
    def bind(address: String, port: Double): js.Promise[Unit]
    
    def destroy(): js.Promise[Unit]
    
    def getInfo(): js.Promise[SocketInfo]
    
    def on(name: String, listener: js.Function): Unit
    
    def sendTo(a: js.typedarray.ArrayBuffer, b: String, c: Double): js.Promise[Double]
    @JSName("sendTo")
    var sendTo_Original: Method3[js.typedarray.ArrayBuffer, String, Double, Double]
  }
  object Socket {
    
    inline def apply(
      bind: (String, Double) => js.Promise[Unit],
      destroy: () => js.Promise[Unit],
      getInfo: () => js.Promise[SocketInfo],
      on: (String, js.Function) => Unit,
      sendTo: Method3[js.typedarray.ArrayBuffer, String, Double, Double]
    ): Socket = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction2(bind), destroy = js.Any.fromFunction0(destroy), getInfo = js.Any.fromFunction0(getInfo), on = js.Any.fromFunction2(on), sendTo = sendTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Socket]
    }
    
    extension [Self <: Socket](x: Self) {
      
      inline def setBind(value: (String, Double) => js.Promise[Unit]): Self = StObject.set(x, "bind", js.Any.fromFunction2(value))
      
      inline def setDestroy(value: () => js.Promise[Unit]): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetInfo(value: () => js.Promise[SocketInfo]): Self = StObject.set(x, "getInfo", js.Any.fromFunction0(value))
      
      inline def setOn(value: (String, js.Function) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setSendTo(value: Method3[js.typedarray.ArrayBuffer, String, Double, Double]): Self = StObject.set(x, "sendTo", value.asInstanceOf[js.Any])
    }
  }
  
  // Type for the chrome.socket.getInfo callback:
  //   https://developer.chrome.com/apps/sockets_udp#type-SocketInfo
  // This is also the type returned by getInfo().
  trait SocketInfo extends StObject {
    
    // Note that there are other fields but these are the ones we care about.
    var localAddress: String
    
    var localPort: Double
  }
  object SocketInfo {
    
    inline def apply(localAddress: String, localPort: Double): SocketInfo = {
      val __obj = js.Dynamic.literal(localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketInfo]
    }
    
    extension [Self <: SocketInfo](x: Self) {
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
    }
  }
}
