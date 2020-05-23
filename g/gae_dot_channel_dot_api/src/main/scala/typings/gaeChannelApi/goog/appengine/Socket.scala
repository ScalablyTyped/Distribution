package typings.gaeChannelApi.goog.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Socket extends js.Object {
  /**
    * Set this property to a function called when an error occurs on the socket.
    * The function is passed one parameter: an error object.
    * The description field is a description of the error and the code field is an HTTP error code indicating the error.
    */
  var onerror: js.Function
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
  @scala.inline
  def apply(
    close: () => Unit,
    onclose: () => Unit,
    onerror: js.Function,
    onmessage: js.Any => Unit,
    onopen: () => Unit
  ): Socket = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), onclose = js.Any.fromFunction0(onclose), onerror = onerror.asInstanceOf[js.Any], onmessage = js.Any.fromFunction1(onmessage), onopen = js.Any.fromFunction0(onopen))
    __obj.asInstanceOf[Socket]
  }
}

