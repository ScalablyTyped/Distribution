package typings.gaeChannelApi.goog.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Channel extends js.Object {
  
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
