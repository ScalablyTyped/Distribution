package typings.freedom.freedom

import typings.freedom.freedomStrings.onclose
import typings.freedom.freedomStrings.onerror
import typings.freedom.freedomStrings.onmessage_
import typings.freedom.freedomStrings.onopen
import typings.std.ArrayBuffer
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RTCDataChannel {
  
  trait Message extends StObject {
    
    var binary: js.UndefOr[Blob] = js.undefined
    
    var buffer: js.UndefOr[ArrayBuffer] = js.undefined
    
    // Exactly one of the below must be specified.
    var text: js.UndefOr[String] = js.undefined
  }
  object Message {
    
    @scala.inline
    def apply(): Message = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinary(value: Blob): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      @scala.inline
      def setBuffer(value: ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  // Constructed by |freedom['rtcdatachannel'](id)| where |id| is a string
  // representing the channel id created by an |rtcpeerconnection| object.
  @js.native
  trait RTCDataChannel extends StObject {
    
    def close(): js.Promise[Unit] = js.native
    
    def getBinaryType(): js.Promise[String] = js.native
    
    def getBufferedAmount(): js.Promise[Double] = js.native
    
    def getId(): js.Promise[Double] = js.native
    
    def getLabel(): js.Promise[String] = js.native
    
    def getMaxPacketLifeTime(): js.Promise[Double] = js.native
    
    def getMaxRetransmits(): js.Promise[Double] = js.native
    
    def getNegotiated(): js.Promise[Boolean] = js.native
    
    def getOrdered(): js.Promise[Boolean] = js.native
    
    def getProtocol(): js.Promise[String] = js.native
    
    def getReadyState(): js.Promise[String] = js.native
    
    def on(t: String, f: js.Function): Unit = js.native
    @JSName("on")
    def on_onclose(t: onclose, f: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_onerror(t: onerror, f: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_onmessage(t: onmessage_, f: js.Function1[/* m */ Message, Unit]): Unit = js.native
    @JSName("on")
    def on_onopen(t: onopen, f: js.Function0[Unit]): Unit = js.native
    
    def send(a: String): js.Promise[Unit] = js.native
    
    def sendBuffer(a: ArrayBuffer): js.Promise[Unit] = js.native
    @JSName("sendBuffer")
    var sendBuffer_Original: Method1[ArrayBuffer, Unit] = js.native
    
    @JSName("send")
    var send_Original: Method1[String, Unit] = js.native
    
    def setBinaryType(`type`: String): js.Promise[Unit] = js.native
  }
}
