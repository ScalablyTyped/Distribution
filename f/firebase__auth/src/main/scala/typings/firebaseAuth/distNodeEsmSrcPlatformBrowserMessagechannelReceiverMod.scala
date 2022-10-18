package typings.firebaseAuth

import typings.firebaseAuth.distNodeEsmSrcPlatformBrowserMessagechannelMod.EventType
import typings.firebaseAuth.distNodeEsmSrcPlatformBrowserMessagechannelMod.ReceiverHandler
import typings.firebaseAuth.distNodeEsmSrcPlatformBrowserMessagechannelMod.ReceiverResponse
import typings.firebaseAuth.distNodeEsmSrcPlatformBrowserMessagechannelMod.SenderRequest
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcPlatformBrowserMessagechannelReceiverMod {
  
  @JSImport("@firebase/auth/dist/node-esm/src/platform_browser/messagechannel/receiver", "Receiver")
  @js.native
  open class Receiver protected () extends StObject {
    def this(eventTarget: EventTarget) = this()
    
    /**
      * Subscribe an event handler for a particular event.
      *
      * @param eventType - Event name to subscribe to.
      * @param eventHandler - The event handler which should receive the events.
      *
      */
    def _subscribe[T /* <: ReceiverResponse */, S /* <: SenderRequest */](eventType: EventType, eventHandler: ReceiverHandler[T, S]): Unit = js.native
    
    /**
      * Unsubscribe an event handler from a particular event.
      *
      * @param eventType - Event name to unsubscribe from.
      * @param eventHandler - Optinoal event handler, if none provided, unsubscribe all handlers on this event.
      *
      */
    def _unsubscribe[T /* <: ReceiverResponse */, S /* <: SenderRequest */](eventType: EventType): Unit = js.native
    def _unsubscribe[T /* <: ReceiverResponse */, S /* <: SenderRequest */](eventType: EventType, eventHandler: ReceiverHandler[T, S]): Unit = js.native
    
    /* private */ val boundEventHandler: Any = js.native
    
    /* private */ val eventTarget: Any = js.native
    
    /**
      * Fans out a MessageEvent to the appropriate listeners.
      *
      * @remarks
      * Sends an {@link Status.ACK} upon receipt and a {@link Status.DONE} once all handlers have
      * finished processing.
      *
      * @param event - The MessageEvent.
      *
      */
    /* private */ var handleEvent: Any = js.native
    
    /* private */ val handlersMap: Any = js.native
    
    /* private */ var isListeningto: Any = js.native
  }
  /* static members */
  object Receiver {
    
    @JSImport("@firebase/auth/dist/node-esm/src/platform_browser/messagechannel/receiver", "Receiver")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Obtain an instance of a Receiver for a given event target, if none exists it will be created.
      *
      * @param eventTarget - An event target (such as window or self) through which the underlying
      * messages will be received.
      */
    inline def _getInstance(eventTarget: EventTarget): Receiver = ^.asInstanceOf[js.Dynamic].applyDynamic("_getInstance")(eventTarget.asInstanceOf[js.Any]).asInstanceOf[Receiver]
    
    @JSImport("@firebase/auth/dist/node-esm/src/platform_browser/messagechannel/receiver", "Receiver.receivers")
    @js.native
    val receivers: Any = js.native
  }
}
