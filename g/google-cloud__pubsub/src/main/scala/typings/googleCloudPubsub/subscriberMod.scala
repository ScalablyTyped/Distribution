package typings.googleCloudPubsub

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPreciseDate.mod.PreciseDate
import typings.googleCloudPubsub.leaseManagerMod.FlowControlOptions
import typings.googleCloudPubsub.messageQueuesMod.BatchOptions
import typings.googleCloudPubsub.messageStreamMod.MessageStreamOptions
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IPullResponse
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IReceivedMessage
import typings.googleCloudPubsub.subscriptionMod.Subscription
import typings.googleCloudPubsub.v1Mod.SubscriberClient
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriberMod {
  
  @JSImport("@google-cloud/pubsub/build/src/subscriber", "Message")
  @js.native
  class Message protected () extends StObject {
    /**
      * @hideconstructor
      *
      * @param {Subscriber} sub The parent subscriber.
      * @param {object} message The raw message response.
      */
    def this(sub: Subscriber, hasAckIdMessageDeliveryAttempt: IReceivedMessage) = this()
    
    var _handled: js.Any = js.native
    
    var _length: js.Any = js.native
    
    var _subscriber: js.Any = js.native
    
    /**
      * Acknowledges the message.
      *
      * @example
      * subscription.on('message', message => {
      *   message.ack();
      * });
      */
    def ack(): Unit = js.native
    
    var ackId: String = js.native
    
    var attributes: StringDictionary[String] = js.native
    
    var data: Buffer = js.native
    
    var deliveryAttempt: Double = js.native
    
    var id: String = js.native
    
    /**
      * The length of the message data.
      *
      * @type {number}
      */
    def length: Double = js.native
    
    /**
      * Modifies the ack deadline.
      *
      * @param {number} deadline The number of seconds to extend the deadline.
      * @private
      */
    def modAck(deadline: Double): Unit = js.native
    
    /**
      * Removes the message from our inventory and schedules it to be redelivered.
      *
      * @example
      * subscription.on('message', message => {
      *   message.nack();
      * });
      */
    def nack(): Unit = js.native
    
    var orderingKey: js.UndefOr[String] = js.native
    
    var publishTime: PreciseDate = js.native
    
    var received: Double = js.native
  }
  
  @JSImport("@google-cloud/pubsub/build/src/subscriber", "Subscriber")
  @js.native
  class Subscriber protected () extends EventEmitter {
    def this(subscription: Subscription) = this()
    def this(subscription: Subscription, options: js.Object) = this()
    
    var _acks: js.Any = js.native
    
    /**
      * Constructs an OpenTelemetry span from the incoming message.
      *
      * @param {Message} message One of the received messages
      * @private
      */
    var _constructSpan: js.Any = js.native
    
    var _histogram: js.Any = js.native
    
    var _inventory: js.Any = js.native
    
    var _isUserSetDeadline: js.Any = js.native
    
    var _latencies: js.Any = js.native
    
    var _modAcks: js.Any = js.native
    
    var _name: js.Any = js.native
    
    /**
      * Callback to be invoked when a new message is available.
      *
      * New messages will be added to the subscribers inventory, which in turn will
      * automatically extend the messages ack deadline until either:
      *   a. the user acks/nacks it
      *   b. the maxExtension option is hit
      *
      * If the message puts us at/over capacity, then we'll pause our message
      * stream until we've freed up some inventory space.
      *
      * New messages must immediately issue a ModifyAckDeadline request
      * (aka receipt) to confirm with the backend that we did infact receive the
      * message and its ok to start ticking down on the deadline.
      *
      * @private
      */
    var _onData: js.Any = js.native
    
    var _options: js.Any = js.native
    
    var _stream: js.Any = js.native
    
    var _subscription: js.Any = js.native
    
    var _tracing: js.Any = js.native
    
    /**
      * Returns a promise that will resolve once all pending requests have settled.
      *
      * @private
      *
      * @returns {Promise}
      */
    var _waitForFlush: js.Any = js.native
    
    /**
      * Acknowledges the supplied message.
      *
      * @param {Message} message The message to acknowledge.
      * @returns {Promise}
      * @private
      */
    def ack(message: Message): js.Promise[Unit] = js.native
    
    var ackDeadline: Double = js.native
    
    /**
      * Closes the subscriber. The returned promise will resolve once any pending
      * acks/modAcks are finished.
      *
      * @returns {Promise}
      * @private
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Gets the subscriber client instance.
      *
      * @returns {Promise<object>}
      * @private
      */
    def getClient(): js.Promise[SubscriberClient] = js.native
    
    var isOpen: Boolean = js.native
    
    var maxBytes: Double = js.native
    
    var maxMessages: Double = js.native
    
    /**
      * Modifies the acknowledge deadline for the provided message.
      *
      * @param {Message} message The message to modify.
      * @param {number} deadline The deadline.
      * @returns {Promise}
      * @private
      */
    def modAck(message: Message, deadline: Double): js.Promise[Unit] = js.native
    
    /**
      * The 99th percentile of request latencies.
      *
      * @type {number}
      * @private
      */
    def modAckLatency: Double = js.native
    
    /**
      * Modfies the acknowledge deadline for the provided message and then removes
      * it from our inventory.
      *
      * @param {Message} message The message.
      * @return {Promise}
      * @private
      */
    def nack(message: Message): js.Promise[Unit] = js.native
    
    /**
      * The full name of the Subscription.
      *
      * @type {string}
      * @private
      */
    def name: String = js.native
    
    /**
      * Starts pulling messages.
      * @private
      */
    def open(): Unit = js.native
    
    /**
      * Sets subscriber options.
      *
      * @param {SubscriberOptions} options The options.
      * @private
      */
    def setOptions(options: SubscriberOptions): Unit = js.native
  }
  
  type PullResponse = IPullResponse
  
  trait SubscriberOptions extends StObject {
    
    var ackDeadline: js.UndefOr[Double] = js.undefined
    
    var batching: js.UndefOr[BatchOptions] = js.undefined
    
    var enableOpenTelemetryTracing: js.UndefOr[Boolean] = js.undefined
    
    var flowControl: js.UndefOr[FlowControlOptions] = js.undefined
    
    var streamingOptions: js.UndefOr[MessageStreamOptions] = js.undefined
  }
  object SubscriberOptions {
    
    @scala.inline
    def apply(): SubscriberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscriberOptions]
    }
    
    @scala.inline
    implicit class SubscriberOptionsMutableBuilder[Self <: SubscriberOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAckDeadline(value: Double): Self = StObject.set(x, "ackDeadline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAckDeadlineUndefined: Self = StObject.set(x, "ackDeadline", js.undefined)
      
      @scala.inline
      def setBatching(value: BatchOptions): Self = StObject.set(x, "batching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchingUndefined: Self = StObject.set(x, "batching", js.undefined)
      
      @scala.inline
      def setEnableOpenTelemetryTracing(value: Boolean): Self = StObject.set(x, "enableOpenTelemetryTracing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableOpenTelemetryTracingUndefined: Self = StObject.set(x, "enableOpenTelemetryTracing", js.undefined)
      
      @scala.inline
      def setFlowControl(value: FlowControlOptions): Self = StObject.set(x, "flowControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowControlUndefined: Self = StObject.set(x, "flowControl", js.undefined)
      
      @scala.inline
      def setStreamingOptions(value: MessageStreamOptions): Self = StObject.set(x, "streamingOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamingOptionsUndefined: Self = StObject.set(x, "streamingOptions", js.undefined)
    }
  }
}
