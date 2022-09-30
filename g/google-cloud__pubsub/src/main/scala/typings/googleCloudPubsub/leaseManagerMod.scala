package typings.googleCloudPubsub

import typings.googleCloudPubsub.subscriberMod.Message
import typings.googleCloudPubsub.subscriberMod.Subscriber
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object leaseManagerMod {
  
  @JSImport("@google-cloud/pubsub/build/src/lease-manager", "LeaseManager")
  @js.native
  open class LeaseManager protected () extends EventEmitter {
    def this(sub: Subscriber) = this()
    def this(sub: Subscriber, options: js.Object) = this()
    
    /**
      * Stops extending message deadlines.
      *
      * @private
      */
    /* private */ var _cancelExtension: Any = js.native
    
    /**
      * Emits the message. Emitting messages is very slow, so to avoid it acting
      * as a bottleneck, we're wrapping it in nextTick.
      *
      * @private
      *
      * @fires Subscriber#message
      *
      * @param {Message} message The message to emit.
      */
    /* private */ var _dispense: Any = js.native
    
    /**
      * Loops through inventory and extends the deadlines for any messages that
      * have not hit the max extension option.
      *
      * @private
      */
    /* private */ var _extendDeadlines: Any = js.native
    
    /**
      * Creates a timeout(ms) that should allow us to extend any message deadlines
      * before they would be redelivered.
      *
      * @private
      *
      * @returns {number}
      */
    /* private */ var _getNextExtensionTimeoutMs: Any = js.native
    
    /* private */ var _isLeasing: Any = js.native
    
    /* private */ var _messages: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _pending: Any = js.native
    
    /**
      * Schedules an deadline extension for all messages.
      *
      * @private
      */
    /* private */ var _scheduleExtension: Any = js.native
    
    /* private */ var _subscriber: Any = js.native
    
    /* private */ var _timer: Any = js.native
    
    /**
      * Adds a message to the inventory, kicking off the deadline extender if it
      * isn't already running.
      *
      * @param {Message} message The message.
      * @private
      */
    def add(message: Message): Unit = js.native
    
    var bytes: Double = js.native
    
    /**
      * Removes ALL messages from inventory.
      * @private
      */
    def clear(): Unit = js.native
    
    /**
      * Indicates if we're at or over capacity.
      *
      * @returns {boolean}
      * @private
      */
    def isFull(): Boolean = js.native
    
    /**
      * @type {number}
      * @private
      */
    def pending: Double = js.native
    
    /**
      * Removes a message from the inventory. Stopping the deadline extender if no
      * messages are left over.
      *
      * @fires LeaseManager#free
      *
      * @param {Message} message The message to remove.
      * @private
      */
    def remove(message: Message): Unit = js.native
    
    /**
      * Sets options for the LeaseManager.
      *
      * @param {FlowControlOptions} [options] The options.
      *
      * @throws {RangeError} If both maxExtension and maxExtensionMinutes are set.
      *
      * @private
      */
    def setOptions(options: FlowControlOptions): Unit = js.native
    
    /**
      * @type {number}
      * @private
      */
    def size: Double = js.native
  }
  
  trait FlowControlOptions extends StObject {
    
    var allowExcessMessages: js.UndefOr[Boolean] = js.undefined
    
    var maxBytes: js.UndefOr[Double] = js.undefined
    
    /** @deprecated Use maxExtensionMinutes. */
    var maxExtension: js.UndefOr[Double] = js.undefined
    
    var maxExtensionMinutes: js.UndefOr[Double] = js.undefined
    
    var maxMessages: js.UndefOr[Double] = js.undefined
  }
  object FlowControlOptions {
    
    inline def apply(): FlowControlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlowControlOptions]
    }
    
    extension [Self <: FlowControlOptions](x: Self) {
      
      inline def setAllowExcessMessages(value: Boolean): Self = StObject.set(x, "allowExcessMessages", value.asInstanceOf[js.Any])
      
      inline def setAllowExcessMessagesUndefined: Self = StObject.set(x, "allowExcessMessages", js.undefined)
      
      inline def setMaxBytes(value: Double): Self = StObject.set(x, "maxBytes", value.asInstanceOf[js.Any])
      
      inline def setMaxBytesUndefined: Self = StObject.set(x, "maxBytes", js.undefined)
      
      inline def setMaxExtension(value: Double): Self = StObject.set(x, "maxExtension", value.asInstanceOf[js.Any])
      
      inline def setMaxExtensionMinutes(value: Double): Self = StObject.set(x, "maxExtensionMinutes", value.asInstanceOf[js.Any])
      
      inline def setMaxExtensionMinutesUndefined: Self = StObject.set(x, "maxExtensionMinutes", js.undefined)
      
      inline def setMaxExtensionUndefined: Self = StObject.set(x, "maxExtension", js.undefined)
      
      inline def setMaxMessages(value: Double): Self = StObject.set(x, "maxMessages", value.asInstanceOf[js.Any])
      
      inline def setMaxMessagesUndefined: Self = StObject.set(x, "maxMessages", js.undefined)
    }
  }
}
