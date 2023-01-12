package typings.googleCloudPubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPublisherFlowControlMod {
  
  @JSImport("@google-cloud/pubsub/build/src/publisher/flow-control", "FlowControl")
  @js.native
  open class FlowControl protected () extends StObject {
    def this(options: FlowControlOptions) = this()
    
    /**
      * Adds the specified number of bytes or messages to our count. We'll
      * assume that this is end running around our queueing mechanisms.
      *
      * @param {number} bytes The number of bytes to add to the count.
      * @param {number} messages The number of messages to add to the count.
      */
    def addToCount(bytes: Double, messages: Double): Unit = js.native
    
    /* private */ var bytes: Any = js.native
    
    /**
      * @returns {number} The number of bytes that are queued up.
      */
    def currentByteCount: Double = js.native
    
    /**
      * @returns {number} The number of messages that are queued up.
      */
    def currentMessageCount: Double = js.native
    
    /* private */ var exceeded: Any = js.native
    
    /* private */ var messages: Any = js.native
    
    var options: FlowControlOptions = js.native
    
    /* private */ var requests: Any = js.native
    
    /**
      * Removes the specified number of bytes and messages from our queued
      * counts, after a deferred request was released. If there is enough
      * space.
      *
      * Do not use externally, it may change without warning.
      * @private
      */
    def sent(bytes: Double, messages: Double): Unit = js.native
    
    /**
      * Update our options after the fact.
      *
      * Do not use externally, it may change without warning.
      * @private
      */
    def setOptions(options: FlowControlOptions): Unit = js.native
    
    /**
      * Attempts to queue the specified number of bytes and messages. If
      * there are too many things in the publisher flow control queue
      * already, we will defer and come back to it.
      *
      * Do not use externally, it may change without warning.
      * @private
      */
    def willSend(bytes: Double, messages: Double): js.Promise[Unit] = js.native
    
    /**
      * Returns true if adding the specified number of bytes or messages
      * would exceed limits imposed by configuration.
      *
      * Do not use externally, it may change without warning.
      * @private
      */
    def wouldExceed(bytes: Double, messages: Double): Boolean = js.native
  }
  
  trait FlowControlOptions extends StObject {
    
    var maxOutstandingBytes: js.UndefOr[Double] = js.undefined
    
    var maxOutstandingMessages: js.UndefOr[Double] = js.undefined
  }
  object FlowControlOptions {
    
    inline def apply(): FlowControlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlowControlOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlowControlOptions] (val x: Self) extends AnyVal {
      
      inline def setMaxOutstandingBytes(value: Double): Self = StObject.set(x, "maxOutstandingBytes", value.asInstanceOf[js.Any])
      
      inline def setMaxOutstandingBytesUndefined: Self = StObject.set(x, "maxOutstandingBytes", js.undefined)
      
      inline def setMaxOutstandingMessages(value: Double): Self = StObject.set(x, "maxOutstandingMessages", value.asInstanceOf[js.Any])
      
      inline def setMaxOutstandingMessagesUndefined: Self = StObject.set(x, "maxOutstandingMessages", js.undefined)
    }
  }
}
