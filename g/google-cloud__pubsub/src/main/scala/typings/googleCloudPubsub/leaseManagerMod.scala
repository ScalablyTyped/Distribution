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
  class LeaseManager protected () extends EventEmitter {
    def this(sub: Subscriber) = this()
    def this(sub: Subscriber, options: js.Object) = this()
    
    /**
      * Stops extending message deadlines.
      *
      * @private
      */
    var _cancelExtension: js.Any = js.native
    
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
    var _dispense: js.Any = js.native
    
    /**
      * Loops through inventory and extends the deadlines for any messages that
      * have not hit the max extension option.
      *
      * @private
      */
    var _extendDeadlines: js.Any = js.native
    
    /**
      * Creates a timeout(ms) that should allow us to extend any message deadlines
      * before they would be redelivered.
      *
      * @private
      *
      * @returns {number}
      */
    var _getNextExtensionTimeoutMs: js.Any = js.native
    
    var _isLeasing: js.Any = js.native
    
    var _messages: js.Any = js.native
    
    var _options: js.Any = js.native
    
    var _pending: js.Any = js.native
    
    /**
      * Schedules an deadline extension for all messages.
      *
      * @private
      */
    var _scheduleExtension: js.Any = js.native
    
    var _subscriber: js.Any = js.native
    
    var _timer: js.Any = js.native
    
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
    
    var maxExtension: js.UndefOr[Double] = js.undefined
    
    var maxMessages: js.UndefOr[Double] = js.undefined
  }
  object FlowControlOptions {
    
    @scala.inline
    def apply(): FlowControlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlowControlOptions]
    }
    
    @scala.inline
    implicit class FlowControlOptionsMutableBuilder[Self <: FlowControlOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowExcessMessages(value: Boolean): Self = StObject.set(x, "allowExcessMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowExcessMessagesUndefined: Self = StObject.set(x, "allowExcessMessages", js.undefined)
      
      @scala.inline
      def setMaxBytes(value: Double): Self = StObject.set(x, "maxBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBytesUndefined: Self = StObject.set(x, "maxBytes", js.undefined)
      
      @scala.inline
      def setMaxExtension(value: Double): Self = StObject.set(x, "maxExtension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxExtensionUndefined: Self = StObject.set(x, "maxExtension", js.undefined)
      
      @scala.inline
      def setMaxMessages(value: Double): Self = StObject.set(x, "maxMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMessagesUndefined: Self = StObject.set(x, "maxMessages", js.undefined)
    }
  }
}
