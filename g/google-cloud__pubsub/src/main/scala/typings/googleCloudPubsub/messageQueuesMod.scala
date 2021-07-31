package typings.googleCloudPubsub

import typings.googleCloudPubsub.subscriberMod.Message
import typings.googleCloudPubsub.subscriberMod.Subscriber
import typings.googleGax.gaxMod.CallOptions
import typings.grpcGrpcJs.callMod.ServiceError
import typings.grpcGrpcJs.constantsMod.Status
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.node.NodeJS.Timer
import typings.pDefer.mod.DeferredPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageQueuesMod {
  
  @JSImport("@google-cloud/pubsub/build/src/message-queues", "AckQueue")
  @js.native
  class AckQueue protected () extends MessageQueue {
    def this(sub: Subscriber) = this()
    def this(sub: Subscriber, options: BatchOptions) = this()
  }
  
  @JSImport("@google-cloud/pubsub/build/src/message-queues", "BatchError")
  @js.native
  class BatchError protected ()
    extends StObject
       with ServiceError {
    def this(err: ServiceError, ackIds: js.Array[String], rpc: String) = this()
    
    var ackIds: js.Array[String] = js.native
    
    /* CompleteClass */
    var code: Status = js.native
    
    /* CompleteClass */
    var details: String = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var metadata: Metadata = js.native
    @JSName("metadata")
    var metadata_BatchError: typings.googleGax.mod.grpc.Metadata = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@google-cloud/pubsub/build/src/message-queues", "MessageQueue")
  @js.native
  abstract class MessageQueue protected () extends StObject {
    def this(sub: Subscriber) = this()
    def this(sub: Subscriber, options: BatchOptions) = this()
    
    var _onDrain: js.UndefOr[DeferredPromise[Unit]] = js.native
    
    var _onFlush: js.UndefOr[DeferredPromise[Unit]] = js.native
    
    var _options: BatchOptions = js.native
    
    var _requests: QueuedMessages = js.native
    
    /* protected */ def _sendBatch(batch: QueuedMessages): js.Promise[Unit] = js.native
    
    var _subscriber: Subscriber = js.native
    
    var _timer: js.UndefOr[Timer] = js.native
    
    /**
      * Adds a message to the queue.
      *
      * @param {Message} message The message to add.
      * @param {number} [deadline] The deadline.
      * @private
      */
    def add(hasAckId: Message): Unit = js.native
    def add(hasAckId: Message, deadline: Double): Unit = js.native
    
    /**
      * Sends a batch of messages.
      * @private
      */
    def flush(): js.Promise[Unit] = js.native
    
    /**
      * Gets the default buffer time in ms.
      *
      * @returns {number}
      * @private
      */
    def maxMilliseconds: Double = js.native
    
    var numInFlightRequests: Double = js.native
    
    var numPendingRequests: Double = js.native
    
    /**
      * Returns a promise that resolves when all in-flight messages have settled.
      */
    def onDrain(): js.Promise[Unit] = js.native
    
    /**
      * Returns a promise that resolves after the next flush occurs.
      *
      * @returns {Promise}
      * @private
      */
    def onFlush(): js.Promise[Unit] = js.native
    
    /**
      * Set the batching options.
      *
      * @param {BatchOptions} options Batching options.
      * @private
      */
    def setOptions(options: BatchOptions): Unit = js.native
  }
  
  @JSImport("@google-cloud/pubsub/build/src/message-queues", "ModAckQueue")
  @js.native
  class ModAckQueue protected () extends MessageQueue {
    def this(sub: Subscriber) = this()
    def this(sub: Subscriber, options: BatchOptions) = this()
  }
  
  trait BatchOptions extends StObject {
    
    var callOptions: js.UndefOr[CallOptions] = js.undefined
    
    var maxMessages: js.UndefOr[Double] = js.undefined
    
    var maxMilliseconds: js.UndefOr[Double] = js.undefined
  }
  object BatchOptions {
    
    @scala.inline
    def apply(): BatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchOptions]
    }
    
    @scala.inline
    implicit class BatchOptionsMutableBuilder[Self <: BatchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallOptions(value: CallOptions): Self = StObject.set(x, "callOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallOptionsUndefined: Self = StObject.set(x, "callOptions", js.undefined)
      
      @scala.inline
      def setMaxMessages(value: Double): Self = StObject.set(x, "maxMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMessagesUndefined: Self = StObject.set(x, "maxMessages", js.undefined)
      
      @scala.inline
      def setMaxMilliseconds(value: Double): Self = StObject.set(x, "maxMilliseconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMillisecondsUndefined: Self = StObject.set(x, "maxMilliseconds", js.undefined)
    }
  }
  
  type QueuedMessages = js.Array[js.Tuple2[String, js.UndefOr[Double]]]
}
