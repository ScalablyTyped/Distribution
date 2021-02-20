package typings.googleCloudPubsub

import typings.googleCloudPubsub.messageBatchMod.BatchPublishOptions
import typings.googleCloudPubsub.messageBatchMod.MessageBatch
import typings.googleCloudPubsub.publishErrorMod.PublishError
import typings.googleCloudPubsub.publisherMod.PublishCallback
import typings.googleCloudPubsub.publisherMod.Publisher
import typings.googleCloudPubsub.publisherMod.PubsubMessage
import typings.grpcGrpcJs.callMod.ServiceError
import typings.node.NodeJS.Timer
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publisherMessageQueuesMod {
  
  @JSImport("@google-cloud/pubsub/build/src/publisher/message-queues", "MessageQueue")
  @js.native
  abstract class MessageQueue protected () extends EventEmitter {
    def this(publisher: Publisher) = this()
    
    /**
      * Accepts a batch of messages and publishes them to the API.
      *
      * @param {object[]} messages The messages to publish.
      * @param {PublishCallback[]} callbacks The corresponding callback functions.
      * @param {function} [callback] Callback to be fired when publish is done.
      */
    def _publish(messages: js.Array[PubsubMessage], callbacks: js.Array[PublishCallback]): Unit = js.native
    def _publish(messages: js.Array[PubsubMessage], callbacks: js.Array[PublishCallback], callback: PublishDone): Unit = js.native
    
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
      * Method to initiate publishing.
      *
      * @abstract
      */
    def publish(): Unit = js.native
    
    var publisher: Publisher = js.native
  }
  
  @JSImport("@google-cloud/pubsub/build/src/publisher/message-queues", "OrderedQueue")
  @js.native
  class OrderedQueue protected () extends MessageQueue {
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
    
    def publish(callback: PublishDone): Unit = js.native
    
    /**
      * Tells the queue it is ok to continue publishing messages.
      */
    def resumePublishing(): Unit = js.native
  }
  
  @JSImport("@google-cloud/pubsub/build/src/publisher/message-queues", "Queue")
  @js.native
  class Queue protected () extends MessageQueue {
    def this(publisher: Publisher) = this()
    
    var batch: MessageBatch = js.native
    
    def publish(callback: PublishDone): Unit = js.native
  }
  
  type PublishDone = js.Function1[/* err */ ServiceError | Null, Unit]
}
