package typings.googleCloudPubsub

import typings.googleCloudPubsub.buildSrcPublisherFlowControlMod.FlowControl
import typings.googleCloudPubsub.buildSrcPublisherFlowControlMod.FlowControlOptions
import typings.googleCloudPubsub.buildSrcPublisherMessageBatchMod.BatchPublishOptions
import typings.googleCloudPubsub.buildSrcPublisherMessageQueuesMod.OrderedQueue
import typings.googleCloudPubsub.buildSrcPublisherMessageQueuesMod.Queue
import typings.googleCloudPubsub.buildSrcPublisherPubsubMessageMod.Attributes
import typings.googleCloudPubsub.buildSrcPublisherPubsubMessageMod.PubsubMessage
import typings.googleCloudPubsub.buildSrcPubsubMod.EmptyCallback
import typings.googleCloudPubsub.buildSrcPubsubMod.RequestCallback
import typings.googleCloudPubsub.buildSrcTopicMod.Topic
import typings.googleGax.buildSrcGaxMod.CallOptions
import typings.node.bufferMod.global.Buffer
import typings.opentelemetryApi.buildSrcTraceSpanMod.Span
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPublisherMod {
  
  @JSImport("@google-cloud/pubsub/build/src/publisher", "BATCH_LIMITS")
  @js.native
  val BATCH_LIMITS: BatchPublishOptions = js.native
  
  @JSImport("@google-cloud/pubsub/build/src/publisher", "Publisher")
  @js.native
  open class Publisher protected () extends StObject {
    def this(topic: Topic) = this()
    def this(topic: Topic, options: PublishOptions) = this()
    
    /**
      * Constructs an OpenTelemetry span
      *
      * @private
      *
      * @param {PubsubMessage} message The message to create a span for
      */
    def constructSpan(message: PubsubMessage): js.UndefOr[Span] = js.native
    
    var flowControl: FlowControl = js.native
    
    /**
      * Immediately sends all remaining queued data. This is mostly useful
      * if you are planning to call close() on the PubSub object that holds
      * the server connections.
      *
      * @private
      *
      * @param {EmptyCallback} [callback] Callback function.
      * @returns {Promise<EmptyResponse>}
      */
    def flush(): js.Promise[Unit] = js.native
    def flush(callback: EmptyCallback): Unit = js.native
    
    /**
      * Returns the set of default options used for {@link Publisher}. The
      * returned value is a copy, and editing it will have no effect elsehwere.
      *
      * This is a non-static method to make it easier to access/stub.
      *
      * @private
      *
      * @returns {PublishOptions}
      */
    def getOptionDefaults(): PublishOptions = js.native
    
    var orderedQueues: Map[String, OrderedQueue] = js.native
    
    /**
      * Publish the provided message.
      *
      * @deprecated use {@link Publisher#publishMessage} instead.
      *
      * @private
      * @see Publisher#publishMessage
      *
      * @param {buffer} data The message data. This must come in the form of a
      *     Buffer object.
      * @param {object.<string, string>} [attributes] Attributes for this message.
      * @param {PublishCallback} [callback] Callback function.
      * @returns {Promise<PublishResponse>}
      */
    def publish(data: Buffer): js.Promise[String] = js.native
    def publish(data: Buffer, attributes: Attributes): js.Promise[String] = js.native
    def publish(data: Buffer, attributes: Attributes, callback: PublishCallback): Unit = js.native
    def publish(data: Buffer, callback: PublishCallback): Unit = js.native
    
    /**
      * Publish the provided message.
      *
      * @private
      *
      * @throws {TypeError} If data is not a Buffer object.
      * @throws {TypeError} If any value in `attributes` object is not a string.
      *
      * @param {PubsubMessage} [message] Options for this message.
      * @param {PublishCallback} [callback] Callback function.
      */
    def publishMessage(message: PubsubMessage): js.Promise[String] = js.native
    def publishMessage(message: PubsubMessage, callback: PublishCallback): Unit = js.native
    
    var queue: Queue = js.native
    
    /**
      * Indicates to the publisher that it is safe to continue publishing for the
      * supplied ordering key.
      *
      * @private
      *
      * @param {string} key The ordering key to continue publishing for.
      */
    def resumePublishing(key: String): Unit = js.native
    
    /**
      * Sets the Publisher options.
      *
      * @private
      *
      * @param {PublishOptions} options The publisher options.
      */
    def setOptions(): Unit = js.native
    def setOptions(options: PublishOptions): Unit = js.native
    
    var settings: PublishOptions = js.native
    
    var topic: Topic = js.native
  }
  
  @JSImport("@google-cloud/pubsub/build/src/publisher", "flowControlDefaults")
  @js.native
  val flowControlDefaults: FlowControlOptions = js.native
  
  type PublishCallback = RequestCallback[String, Unit]
  
  trait PublishOptions extends StObject {
    
    var batching: js.UndefOr[BatchPublishOptions] = js.undefined
    
    var enableOpenTelemetryTracing: js.UndefOr[Boolean] = js.undefined
    
    var flowControlOptions: js.UndefOr[FlowControlOptions] = js.undefined
    
    var gaxOpts: js.UndefOr[CallOptions] = js.undefined
    
    var messageOrdering: js.UndefOr[Boolean] = js.undefined
  }
  object PublishOptions {
    
    inline def apply(): PublishOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublishOptions]
    }
    
    extension [Self <: PublishOptions](x: Self) {
      
      inline def setBatching(value: BatchPublishOptions): Self = StObject.set(x, "batching", value.asInstanceOf[js.Any])
      
      inline def setBatchingUndefined: Self = StObject.set(x, "batching", js.undefined)
      
      inline def setEnableOpenTelemetryTracing(value: Boolean): Self = StObject.set(x, "enableOpenTelemetryTracing", value.asInstanceOf[js.Any])
      
      inline def setEnableOpenTelemetryTracingUndefined: Self = StObject.set(x, "enableOpenTelemetryTracing", js.undefined)
      
      inline def setFlowControlOptions(value: FlowControlOptions): Self = StObject.set(x, "flowControlOptions", value.asInstanceOf[js.Any])
      
      inline def setFlowControlOptionsUndefined: Self = StObject.set(x, "flowControlOptions", js.undefined)
      
      inline def setGaxOpts(value: CallOptions): Self = StObject.set(x, "gaxOpts", value.asInstanceOf[js.Any])
      
      inline def setGaxOptsUndefined: Self = StObject.set(x, "gaxOpts", js.undefined)
      
      inline def setMessageOrdering(value: Boolean): Self = StObject.set(x, "messageOrdering", value.asInstanceOf[js.Any])
      
      inline def setMessageOrderingUndefined: Self = StObject.set(x, "messageOrdering", js.undefined)
    }
  }
}
