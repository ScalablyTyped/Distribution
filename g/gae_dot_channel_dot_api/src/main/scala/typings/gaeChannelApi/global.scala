package typings.gaeChannelApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object goog extends js.Object {
    @js.native
    object appengine extends js.Object {
      @js.native
      class Channel protected ()
        extends typings.gaeChannelApi.goog.appengine.Channel {
        /**
          * Create a channel object using the token returned by the createChannel() call on the server.
          * @param token {string}
          */
        def this(token: String) = this()
      }
      
      @js.native
      class Socket ()
        extends typings.gaeChannelApi.goog.appengine.Socket {
        /**
          * Set this property to a function called when an error occurs on the socket.
          * The function is passed one parameter: an error object.
          * The description field is a description of the error and the code field is an HTTP error code indicating the error.
          */
        /* CompleteClass */
        override var onerror: js.Function = js.native
        /**
          * Close the socket.
          * The socket cannot be used again after calling close; the server must create a new socket.
          */
        /* CompleteClass */
        override def close(): Unit = js.native
        /**
          * Set this property to a function that called when the socket is closed.
          * When the socket is closed, it cannot be reopened.
          * Use the open() method on a goog.appengine.Channel object to create a new socket.
          */
        /* CompleteClass */
        override def onclose(): Unit = js.native
        /**
          * Set this to a function called when the socket receives a message.
          * The function is passed one parameter: a message object.
          * The data field of this object is the string passed to the send_message method on the server.
          * @param message
          * @param message.data
          */
        /* CompleteClass */
        override def onmessage(message: js.Any): Unit = js.native
        /**
          * Set this to a function called when the socket is ready to receive messages.
          */
        /* CompleteClass */
        override def onopen(): Unit = js.native
      }
      
    }
    
  }
  
}

