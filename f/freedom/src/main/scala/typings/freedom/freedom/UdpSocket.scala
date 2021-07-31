package typings.freedom.freedom

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UdpSocket {
  
  trait Implementation extends StObject {
    
    def bind(address: String, port: Double, continuation: js.Function0[Unit]): Unit
    
    def destroy(continuation: js.Function0[Unit]): Unit
    
    def getInfo(continuation: js.Function1[/* socketInfo */ SocketInfo, Unit]): Unit
    
    def sendTo(
      data: ArrayBuffer,
      address: String,
      port: Double,
      continuation: js.Function1[/* bytesWritten */ Double, Unit]
    ): Unit
  }
  object Implementation {
    
    @scala.inline
    def apply(
      bind: (String, Double, js.Function0[Unit]) => Unit,
      destroy: js.Function0[Unit] => Unit,
      getInfo: js.Function1[/* socketInfo */ SocketInfo, Unit] => Unit,
      sendTo: (ArrayBuffer, String, Double, js.Function1[/* bytesWritten */ Double, Unit]) => Unit
    ): Implementation = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction3(bind), destroy = js.Any.fromFunction1(destroy), getInfo = js.Any.fromFunction1(getInfo), sendTo = js.Any.fromFunction4(sendTo))
      __obj.asInstanceOf[Implementation]
    }
    
    @scala.inline
    implicit class ImplementationMutableBuilder[Self <: Implementation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBind(value: (String, Double, js.Function0[Unit]) => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDestroy(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetInfo(value: js.Function1[/* socketInfo */ SocketInfo, Unit] => Unit): Self = StObject.set(x, "getInfo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSendTo(value: (ArrayBuffer, String, Double, js.Function1[/* bytesWritten */ Double, Unit]) => Unit): Self = StObject.set(x, "sendTo", js.Any.fromFunction4(value))
    }
  }
  
  // Type for the chrome.socket.recvFrom callback:
  //   http://developer.chrome.com/apps/socket#method-recvFrom
  // This is also the type returned to onData callbacks.
  trait RecvFromInfo extends StObject {
    
    var address: String
    
    var data: ArrayBuffer
    
    var port: Double
    
    var resultCode: Double
  }
  object RecvFromInfo {
    
    @scala.inline
    def apply(address: String, data: ArrayBuffer, port: Double, resultCode: Double): RecvFromInfo = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecvFromInfo]
    }
    
    @scala.inline
    implicit class RecvFromInfoMutableBuilder[Self <: RecvFromInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultCode(value: Double): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Socket extends StObject {
    
    def bind(address: String, port: Double): js.Promise[Unit]
    
    def destroy(): js.Promise[Unit]
    
    def getInfo(): js.Promise[SocketInfo]
    
    def on(name: String, listener: js.Function): Unit
    
    def sendTo(a: ArrayBuffer, b: String, c: Double): js.Promise[Double]
    @JSName("sendTo")
    var sendTo_Original: Method3[ArrayBuffer, String, Double, Double]
  }
  object Socket {
    
    @scala.inline
    def apply(
      bind: (String, Double) => js.Promise[Unit],
      destroy: () => js.Promise[Unit],
      getInfo: () => js.Promise[SocketInfo],
      on: (String, js.Function) => Unit,
      sendTo: Method3[ArrayBuffer, String, Double, Double]
    ): Socket = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction2(bind), destroy = js.Any.fromFunction0(destroy), getInfo = js.Any.fromFunction0(getInfo), on = js.Any.fromFunction2(on), sendTo = sendTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Socket]
    }
    
    @scala.inline
    implicit class SocketMutableBuilder[Self <: Socket] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBind(value: (String, Double) => js.Promise[Unit]): Self = StObject.set(x, "bind", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDestroy(value: () => js.Promise[Unit]): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInfo(value: () => js.Promise[SocketInfo]): Self = StObject.set(x, "getInfo", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOn(value: (String, js.Function) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSendTo(value: Method3[ArrayBuffer, String, Double, Double]): Self = StObject.set(x, "sendTo", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(localAddress: String, localPort: Double): SocketInfo = {
      val __obj = js.Dynamic.literal(localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketInfo]
    }
    
    @scala.inline
    implicit class SocketInfoMutableBuilder[Self <: SocketInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
    }
  }
}
