package typings.googleCloudPubsub

import typings.googleCloudPubsub.anon.ToError
import typings.googleCloudPubsub.buildSrcDebugMod.DebugMessage
import typings.googleCloudPubsub.buildSrcExponentialRetryMod.ExponentialRetry
import typings.googleCloudPubsub.buildSrcSubscriberMod.Message
import typings.googleCloudPubsub.buildSrcSubscriberMod.Subscriber
import typings.googleGax.buildSrcGaxMod.CallOptions
import typings.googleGax.mod.GoogleError
import typings.grpcGrpcJs.buildSrcConstantsMod.Status
import typings.node.timersMod.global.NodeJS.Timer
import typings.pDefer.mod.DeferredPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcMessageQueuesMod {
  
  @JSImport("@google-cloud/pubsub/build/src/message-queues", "AckQueue")
  @js.native
  open class AckQueue protected () extends MessageQueue {
    def this(sub: Subscriber) = this()
    def this(sub: Subscriber, options: BatchOptions) = this()
  }
  
  @JSImport("@google-cloud/pubsub/build/src/message-queues", "BatchError")
  @js.native
  open class BatchError protected () extends DebugMessage {
    def this(err: GoogleError, ackIds: js.Array[String], rpc: String) = this()
    
    var ackIds: js.Array[String] = js.native
    
    var code: Status = js.native
    
    var details: String = js.native
  }
  
  /* note: abstract class */ @JSImport("@google-cloud/pubsub/build/src/message-queues", "MessageQueue")
  @js.native
  open class MessageQueue protected () extends StObject {
    def this(sub: Subscriber) = this()
    def this(sub: Subscriber, options: BatchOptions) = this()
    
    /* protected */ var _closed: Boolean = js.native
    
    /* protected */ var _onDrain: js.UndefOr[DeferredPromise[Unit]] = js.native
    
    /* protected */ var _onFlush: js.UndefOr[DeferredPromise[Unit]] = js.native
    
    /* protected */ var _options: BatchOptions = js.native
    
    /* protected */ var _requests: QueuedMessages = js.native
    
    /* protected */ var _retrier: ExponentialRetry[QueuedMessage] = js.native
    
    /* protected */ def _sendBatch(batch: QueuedMessages): js.Promise[QueuedMessages] = js.native
    
    /* protected */ var _subscriber: Subscriber = js.native
    
    /* protected */ var _timer: js.UndefOr[Timer] = js.native
    
    /**
      * Adds a message to the queue.
      *
      * @param {Message} message The message to add.
      * @param {number} [deadline] The deadline.
      * @private
      */
    def add(param0: Message): js.Promise[Unit] = js.native
    def add(param0: Message, deadline: Double): js.Promise[Unit] = js.native
    
    /**
      * Shuts down this message queue gracefully. Any acks/modAcks pending in
      * the queue or waiting for retry will be removed. If exactly-once delivery
      * is enabled on the subscription, we'll send permanent failures to
      * anyone waiting on completions; otherwise we'll send successes.
      *
      * If a flush is desired first, do it before calling close().
      *
      * @private
      */
    def close(): Unit = js.native
    
    /**
      * Sends a batch of messages.
      * @private
      */
    def flush(): js.Promise[Unit] = js.native
    
    /**
      * Since we handle our own retries for ack/modAck calls when exactly-once
      * delivery is enabled on a subscription, we conditionally need to disable
      * the gax retries. This returns an appropriate CallOptions for the
      * subclasses to pass down.
      *
      * @private
      */
    /* protected */ def getCallOptions(): js.UndefOr[CallOptions] = js.native
    
    /**
      * If we get an RPC failure of any kind, this will take care of deciding
      * what to do for each related ack/modAck. Successful ones will have their
      * Promises resolved, permanent errors will have their Promises rejected,
      * and transients will be returned for retry.
      *
      * Note that this is only used for subscriptions with exactly-once
      * delivery enabled, so _sendBatch() in the classes below take care of
      * resolving errors to success; they don't make it here.
      *
      * @private
      */
    def handleAckFailures(operation: String, batch: QueuedMessages, rpcError: GoogleError): ToError = js.native
    
    /**
      * Succeed a whole batch of Acks/Modacks for an OK RPC response.
      *
      * @private
      */
    def handleAckSuccesses(batch: QueuedMessages): Unit = js.native
    
    /**
      * Retry handler for acks/modacks that have transient failures. Unless
      * it's passed the final deadline, we will just re-queue it for sending.
      *
      * @private
      */
    /* private */ var handleRetry: Any = js.native
    
    /**
      * Gets the default buffer time in ms.
      *
      * @returns {number}
      * @private
      */
    def maxMilliseconds: Double = js.native
    
    var numInFlightRequests: Double = js.native
    
    var numInRetryRequests: Double = js.native
    
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
    
    /**
      * This hook lets a subclass tell the retry handler to go ahead and fail early.
      *
      * @private
      */
    /* protected */ def shouldFailEarly(message: QueuedMessage): Boolean = js.native
  }
  
  @JSImport("@google-cloud/pubsub/build/src/message-queues", "ModAckQueue")
  @js.native
  open class ModAckQueue protected () extends MessageQueue {
    def this(sub: Subscriber) = this()
    def this(sub: Subscriber, options: BatchOptions) = this()
  }
  
  trait BatchOptions extends StObject {
    
    var callOptions: js.UndefOr[CallOptions] = js.undefined
    
    var maxMessages: js.UndefOr[Double] = js.undefined
    
    var maxMilliseconds: js.UndefOr[Double] = js.undefined
  }
  object BatchOptions {
    
    inline def apply(): BatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchOptions] (val x: Self) extends AnyVal {
      
      inline def setCallOptions(value: CallOptions): Self = StObject.set(x, "callOptions", value.asInstanceOf[js.Any])
      
      inline def setCallOptionsUndefined: Self = StObject.set(x, "callOptions", js.undefined)
      
      inline def setMaxMessages(value: Double): Self = StObject.set(x, "maxMessages", value.asInstanceOf[js.Any])
      
      inline def setMaxMessagesUndefined: Self = StObject.set(x, "maxMessages", js.undefined)
      
      inline def setMaxMilliseconds(value: Double): Self = StObject.set(x, "maxMilliseconds", value.asInstanceOf[js.Any])
      
      inline def setMaxMillisecondsUndefined: Self = StObject.set(x, "maxMilliseconds", js.undefined)
    }
  }
  
  trait QueuedMessage extends StObject {
    
    var ackId: String
    
    var deadline: js.UndefOr[Double] = js.undefined
    
    var responsePromise: js.UndefOr[DeferredPromise[Unit]] = js.undefined
    
    var retryCount: Double
  }
  object QueuedMessage {
    
    inline def apply(ackId: String, retryCount: Double): QueuedMessage = {
      val __obj = js.Dynamic.literal(ackId = ackId.asInstanceOf[js.Any], retryCount = retryCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueuedMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueuedMessage] (val x: Self) extends AnyVal {
      
      inline def setAckId(value: String): Self = StObject.set(x, "ackId", value.asInstanceOf[js.Any])
      
      inline def setDeadline(value: Double): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
      
      inline def setDeadlineUndefined: Self = StObject.set(x, "deadline", js.undefined)
      
      inline def setResponsePromise(value: DeferredPromise[Unit]): Self = StObject.set(x, "responsePromise", value.asInstanceOf[js.Any])
      
      inline def setResponsePromiseUndefined: Self = StObject.set(x, "responsePromise", js.undefined)
      
      inline def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
    }
  }
  
  type QueuedMessages = js.Array[QueuedMessage]
}
