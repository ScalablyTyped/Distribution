package typings.googleCloudPubsub

import typings.googleCloudPubsub.publisherMod.PublishCallback
import typings.googleCloudPubsub.publisherMod.PubsubMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageBatchMod {
  
  @JSImport("@google-cloud/pubsub/build/src/publisher/message-batch", "MessageBatch")
  @js.native
  class MessageBatch protected () extends StObject {
    def this(options: BatchPublishOptions) = this()
    
    /**
      * Adds a message to the current batch.
      *
      * @param {object} message The message to publish.
      * @param {PublishCallback} callback The callback function.
      */
    def add(message: PubsubMessage, callback: PublishCallback): Unit = js.native
    
    var bytes: Double = js.native
    
    var callbacks: js.Array[PublishCallback] = js.native
    
    /**
      * Indicates if a given message can fit in the batch.
      *
      * @param {object} message The message in question.
      * @returns {boolean}
      */
    def canFit(hasData: PubsubMessage): Boolean = js.native
    
    var created: Double = js.native
    
    /**
      * Checks to see if this batch is at the maximum allowed payload size.
      * When publishing ordered messages, it is ok to exceed the user configured
      * thresholds while a batch is in flight.
      *
      * @returns {boolean}
      */
    def isAtMax(): Boolean = js.native
    
    /**
      * Indicates if the batch is at capacity.
      *
      * @returns {boolean}
      */
    def isFull(): Boolean = js.native
    
    var messages: js.Array[PubsubMessage] = js.native
    
    var options: BatchPublishOptions = js.native
  }
  
  trait BatchPublishOptions extends StObject {
    
    var maxBytes: js.UndefOr[Double] = js.undefined
    
    var maxMessages: js.UndefOr[Double] = js.undefined
    
    var maxMilliseconds: js.UndefOr[Double] = js.undefined
  }
  object BatchPublishOptions {
    
    inline def apply(): BatchPublishOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchPublishOptions]
    }
    
    extension [Self <: BatchPublishOptions](x: Self) {
      
      inline def setMaxBytes(value: Double): Self = StObject.set(x, "maxBytes", value.asInstanceOf[js.Any])
      
      inline def setMaxBytesUndefined: Self = StObject.set(x, "maxBytes", js.undefined)
      
      inline def setMaxMessages(value: Double): Self = StObject.set(x, "maxMessages", value.asInstanceOf[js.Any])
      
      inline def setMaxMessagesUndefined: Self = StObject.set(x, "maxMessages", js.undefined)
      
      inline def setMaxMilliseconds(value: Double): Self = StObject.set(x, "maxMilliseconds", value.asInstanceOf[js.Any])
      
      inline def setMaxMillisecondsUndefined: Self = StObject.set(x, "maxMilliseconds", js.undefined)
    }
  }
}
