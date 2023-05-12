package typings.firebaseAuth

import typings.firebaseAuth.distBrowserCjsSrcPlatformBrowserMessagechannelMod.EventType
import typings.firebaseAuth.distBrowserCjsSrcPlatformBrowserMessagechannelMod.KeyChangedRequest
import typings.firebaseAuth.distBrowserCjsSrcPlatformBrowserMessagechannelMod.PingRequest
import typings.firebaseAuth.distBrowserCjsSrcPlatformBrowserMessagechannelMod.ReceiverMessageResponse
import typings.firebaseAuth.distBrowserCjsSrcPlatformBrowserMessagechannelMod.ReceiverResponse
import typings.firebaseAuth.distBrowserCjsSrcPlatformBrowserMessagechannelMod.TimeoutDuration
import typings.std.ServiceWorker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBrowserCjsSrcPlatformBrowserMessagechannelSenderMod {
  
  @JSImport("@firebase/auth/dist/browser-cjs/src/platform_browser/messagechannel/sender", "Sender")
  @js.native
  open class Sender protected () extends StObject {
    def this(target: ServiceWorker) = this()
    
    /**
      * Send a message to the Receiver located at {@link target}.
      *
      * @remarks
      * We'll first wait a bit for an ACK , if we get one we will wait significantly longer until the
      * receiver has had a chance to fully process the event.
      *
      * @param eventType - Type of event to send.
      * @param data - The payload of the event.
      * @param timeout - Timeout for waiting on an ACK from the receiver.
      *
      * @returns An array of settled promises from all the handlers that were listening on the receiver.
      */
    def _send[T /* <: ReceiverResponse */](eventType: EventType, data: KeyChangedRequest): js.Promise[ReceiverMessageResponse[T]] = js.native
    def _send[T /* <: ReceiverResponse */](eventType: EventType, data: KeyChangedRequest, timeout: TimeoutDuration): js.Promise[ReceiverMessageResponse[T]] = js.native
    def _send[T /* <: ReceiverResponse */](eventType: EventType, data: PingRequest): js.Promise[ReceiverMessageResponse[T]] = js.native
    def _send[T /* <: ReceiverResponse */](eventType: EventType, data: PingRequest, timeout: TimeoutDuration): js.Promise[ReceiverMessageResponse[T]] = js.native
    
    /* private */ val handlers: Any = js.native
    
    /**
      * Unsubscribe the handler and remove it from our tracking Set.
      *
      * @param handler - The handler to unsubscribe.
      */
    /* private */ var removeMessageHandler: Any = js.native
    
    /* private */ val target: Any = js.native
  }
}
