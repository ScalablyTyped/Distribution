package typings.googleCloudPubsub

import typings.googleCloudPubsub.buildSrcPublisherMessageBatchMod.BatchPublishOptions
import typings.googleCloudPubsub.buildSrcPublisherMessageBatchMod.MessageBatch
import typings.googleCloudPubsub.buildSrcPublisherMod.PublishCallback
import typings.googleCloudPubsub.buildSrcPublisherMod.Publisher
import typings.googleCloudPubsub.buildSrcPublisherPublishErrorMod.PublishError
import typings.googleCloudPubsub.buildSrcPublisherPubsubMessageMod.PubsubMessage
import typings.grpcGrpcJs.buildSrcCallMod.ServiceError
import typings.node.eventsMod.EventEmitter
import typings.node.timersMod.global.NodeJS.Timer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPublisherMessageQueuesMod {
  
  /* note: abstract class */ @JSImport("@google-cloud/pubsub/build/src/publisher/message-queues", "MessageQueue")
  @js.native
  open class MessageQueue protected () extends EventEmitter {
    def this(publisher: Publisher) = this()
    
    /**
      * Accepts a batch of messages and publishes them to the API.
      *
      * @param {object[]} messages The messages to publish.
      * @param {PublishCallback[]} callbacks The corresponding callback functions.
      */
    def _publish(messages: js.Array[PubsubMessage], callbacks: js.Array[PublishCallback]): js.Promise[Unit] = js.native
    
    /**
      * Adds a message to the queue.
      *
      * @abstract
      *
      * @param {object} message The message to publish.
      * @param {PublishCallback} callback The publish callback.
      */
    def add(message: PubsubMessage, callback: PublishCallback): Unit = js.native
    
    var batchOptions: BatchPublishOptions = js.native
    
    var pending: js.UndefOr[Timer] = js.native
    
    /**
      * Method to initiate publishing. Full drain behaviour depends on whether the
      * queues are ordered or not.
      *
      * @abstract
      */
    def publish(): js.Promise[Unit] = js.native
    
    /**
      * Method to finalize publishing. Does as many publishes as are needed
      * to finish emptying the queues, and fires a drain event afterward.
      *
      * @abstract
      */
    def publishDrain(): js.Promise[Unit] = js.native
    
    var publisher: Publisher = js.native
    
    /**
      * Forces the queue to update its options from the publisher.
      * The specific queue will need to do a bit more to pass the new
      * values down into any MessageBatch.
      *
      * This is only for use by {@link Publisher}.
      *
      * @private
      */
    def updateOptions(): Unit = js.native
  }
  
  @JSImport("@google-cloud/pubsub/build/src/publisher/message-queues", "OrderedQueue")
  @js.native
  open class OrderedQueue protected () extends MessageQueue {
    def this(publisher: Publisher, key: String) = this()
    
    var batches: js.Array[MessageBatch] = js.native
    
    /**
      * Starts a timeout to publish any pending messages.
      */
    def beginNextPublish(): Unit = js.native
    
    /**
      * Creates a new {@link MessageBatch} instance.
      *
      * @returns {MessageBatch}
      */
    def createBatch(): MessageBatch = js.native
    
    /**
      * Reference to the batch we're currently filling.
      * @returns {MessageBatch}
      */
    def currentBatch: MessageBatch = js.native
    
    var error: js.UndefOr[Null | PublishError] = js.native
    
    /**
      * In the event of a publish failure, we need to cache the error in question
      * and reject all pending publish calls, prompting the user to call
      * {@link OrderedQueue#resumePublishing}.
      *
      * @param {Error} err The publishing error.
      */
    def handlePublishFailure(err: ServiceError): Unit = js.native
    
    var inFlight: Boolean = js.native
    
    var key: String = js.native
    
    /**
      * Tells the queue it is ok to continue publishing messages.
      */
    def resumePublishing(): Unit = js.native
  }
  
  @JSImport("@google-cloud/pubsub/build/src/publisher/message-queues", "Queue")
  @js.native
  open class Queue protected () extends MessageQueue {
    def this(publisher: Publisher) = this()
    
    /**
      * Cancels any pending publishes and calls _publish immediately.
      *
      * @emits Queue#drain when all messages are sent.
      */
    def _publishInternal(fullyDrain: Boolean): js.Promise[Unit] = js.native
    
    var batch: MessageBatch = js.native
  }
}
