package typings.gaeChannelApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object goog {
  
  object appengine {
    
    @js.native
    trait Channel extends StObject {
      
      /**
        * Open a socket on this channel. open() returns a goog.appengine.Socket object.
        * You can set the callback properties directly on the returned socket object or set them using an optional object handler with the following properties:
        * onopen, onmessage, onerror, onclose .
        * If the token specified during channel creation is invalid or expired then the onerror and onclose callbacks will be called.
        * The code field for the error object will be 401 (Unauthorized) and the description field will be 'Invalid+token.' or 'Token+timed+out.' respectively.
        * The onerror callback is also called asynchronously whenever the token for the channel expires.
        * An onerror call is always followed by an onclose call and the channel object will have to be recreated after this event.
        * @param {Function} [handler]
        * @return {Socket}
        */
      def open(): Socket = js.native
      def open(handler: js.Function): Socket = js.native
    }
    
    trait Socket extends StObject {
      
      /**
        * Close the socket.
        * The socket cannot be used again after calling close; the server must create a new socket.
        */
      def close(): Unit
      
      /**
        * Set this property to a function that called when the socket is closed.
        * When the socket is closed, it cannot be reopened.
        * Use the open() method on a goog.appengine.Channel object to create a new socket.
        */
      def onclose(): Unit
      
      /**
        * Set this property to a function called when an error occurs on the socket.
        * The function is passed one parameter: an error object.
        * The description field is a description of the error and the code field is an HTTP error code indicating the error.
        */
      var onerror: js.Function
      
      /**
        * Set this to a function called when the socket receives a message.
        * The function is passed one parameter: a message object.
        * The data field of this object is the string passed to the send_message method on the server.
        * @param message
        * @param message.data
        */
      def onmessage(message: js.Any): Unit
      
      /**
        * Set this to a function called when the socket is ready to receive messages.
        */
      def onopen(): Unit
    }
    object Socket {
      
      inline def apply(
        close: () => Unit,
        onclose: () => Unit,
        onerror: js.Function,
        onmessage: js.Any => Unit,
        onopen: () => Unit
      ): Socket = {
        val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), onclose = js.Any.fromFunction0(onclose), onerror = onerror.asInstanceOf[js.Any], onmessage = js.Any.fromFunction1(onmessage), onopen = js.Any.fromFunction0(onopen))
        __obj.asInstanceOf[Socket]
      }
      
      extension [Self <: Socket](x: Self) {
        
        inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
        
        inline def setOnclose(value: () => Unit): Self = StObject.set(x, "onclose", js.Any.fromFunction0(value))
        
        inline def setOnerror(value: js.Function): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
        
        inline def setOnmessage(value: js.Any => Unit): Self = StObject.set(x, "onmessage", js.Any.fromFunction1(value))
        
        inline def setOnopen(value: () => Unit): Self = StObject.set(x, "onopen", js.Any.fromFunction0(value))
      }
    }
  }
}
