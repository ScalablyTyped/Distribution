package typings.googleCloudPubsub

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPreciseDate.mod.PreciseDate
import typings.googleCloudPubsub.buildSrcLeaseManagerMod.FlowControlOptions
import typings.googleCloudPubsub.buildSrcMessageQueuesMod.BatchOptions
import typings.googleCloudPubsub.buildSrcMessageStreamMod.MessageStreamOptions
import typings.googleCloudPubsub.buildSrcSubscriptionMod.Subscription
import typings.googleCloudPubsub.buildSrcTemporalMod.Duration
import typings.googleCloudPubsub.googleCloudPubsubStrings.FAILED_PRECONDITION
import typings.googleCloudPubsub.googleCloudPubsubStrings.INVALID
import typings.googleCloudPubsub.googleCloudPubsubStrings.OTHER
import typings.googleCloudPubsub.googleCloudPubsubStrings.PERMISSION_DENIED
import typings.googleCloudPubsub.googleCloudPubsubStrings.SUCCESS
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcSubscriberMod {
  
  @JSImport("@google-cloud/pubsub/build/src/subscriber", "AckError")
  @js.native
  open class AckError protected ()
    extends StObject
       with Error {
    def this(errorCode: AckResponse) = this()
    def this(errorCode: AckResponse, message: String) = this()
    
    var errorCode: AckResponse = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  object AckResponses {
    
    @JSImport("@google-cloud/pubsub/build/src/subscriber", "AckResponses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@google-cloud/pubsub/build/src/subscriber", "AckResponses.FailedPrecondition")
    @js.native
    def FailedPrecondition: FAILED_PRECONDITION = js.native
    inline def FailedPrecondition_=(x: FAILED_PRECONDITION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FailedPrecondition")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub/build/src/subscriber", "AckResponses.Invalid")
    @js.native
    def Invalid: INVALID = js.native
    inline def Invalid_=(x: INVALID): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Invalid")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub/build/src/subscriber", "AckResponses.Other")
    @js.native
    def Other: OTHER = js.native
    inline def Other_=(x: OTHER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Other")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub/build/src/subscriber", "AckResponses.PermissionDenied")
    @js.native
    def PermissionDenied: PERMISSION_DENIED = js.native
    inline def PermissionDenied_=(x: PERMISSION_DENIED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PermissionDenied")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub/build/src/subscriber", "AckResponses.Success")
    @js.native
    def Success: SUCCESS = js.native
    inline def Success_=(x: SUCCESS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Success")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@google-cloud/pubsub/build/src/subscriber", "Message")
  @js.native
  open class Message protected () extends StObject {
    /**
      * @hideconstructor
      *
      * @param {Subscriber} sub The parent subscriber.
      * @param {object} message The raw message response.
      */
    def this(
      sub: Subscriber,
      param1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.IReceivedMessage */ Any
    ) = this()
    
    /* private */ var _handled: Any = js.native
    
    /* private */ var _length: Any = js.native
    
    /* private */ var _subscriber: Any = js.native
    
    /**
      * Acknowledges the message.
      *
      * @example
      * ```
      * subscription.on('message', message => {
      *   message.ack();
      * });
      * ```
      */
    def ack(): Unit = js.native
    
    var ackId: String = js.native
    
    /**
      * Acknowledges the message, expecting a response (for exactly-once delivery subscriptions).
      * If exactly-once delivery is not enabled, this will immediately resolve successfully.
      *
      * @example
      * ```
      * subscription.on('message', async (message) => {
      *   const response = await message.ackWithResponse();
      * });
      * ```
      */
    def ackWithResponse(): js.Promise[AckResponse] = js.native
    
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
      * Modifies the ack deadline, expecting a response (for exactly-once delivery subscriptions).
      * If exactly-once delivery is not enabled, this will immediately resolve successfully.
      *
      * @param {number} deadline The number of seconds to extend the deadline.
      * @private
      */
    def modAckWithResponse(deadline: Double): js.Promise[AckResponse] = js.native
    
    /**
      * Removes the message from our inventory and schedules it to be redelivered.
      *
      * @example
      * ```
      * subscription.on('message', message => {
      *   message.nack();
      * });
      * ```
      */
    def nack(): Unit = js.native
    
    /**
      * Removes the message from our inventory and schedules it to be redelivered,
      * with the modAck response being returned (for exactly-once delivery subscriptions).
      * If exactly-once delivery is not enabled, this will immediately resolve successfully.
      *
      * @example
      * ```
      * subscription.on('message', async (message) => {
      *   const response = await message.nackWithResponse();
      * });
      * ```
      */
    def nackWithResponse(): js.Promise[AckResponse] = js.native
    
    var orderingKey: js.UndefOr[String] = js.native
    
    var publishTime: PreciseDate = js.native
    
    var received: Double = js.native
  }
  
  @JSImport("@google-cloud/pubsub/build/src/subscriber", "Subscriber")
  @js.native
  open class Subscriber protected () extends EventEmitter {
    def this(subscription: Subscription) = this()
    def this(subscription: Subscription, options: js.Object) = this()
    
    /* private */ var _acks: Any = js.native
    
    /**
      * Constructs an OpenTelemetry span from the incoming message.
      *
      * @param {Message} message One of the received messages
      * @private
      */
    /* private */ var _constructSpan: Any = js.native
    
    /* private */ var _histogram: Any = js.native
    
    /* private */ var _inventory: Any = js.native
    
    /* private */ var _latencies: Any = js.native
    
    /* private */ var _modAcks: Any = js.native
    
    /* private */ var _name: Any = js.native
    
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
    /* private */ var _onData: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _stream: Any = js.native
    
    /* private */ var _subscription: Any = js.native
    
    /* private */ var _useOpentelemetry: Any = js.native
    
    /**
      * Returns a promise that will resolve once all pending requests have settled.
      *
      * @private
      *
      * @returns {Promise}
      */
    /* private */ var _waitForFlush: Any = js.native
    
    /**
      * Acknowledges the supplied message.
      *
      * @param {Message} message The message to acknowledge.
      * @returns {Promise<void>}
      * @private
      */
    def ack(message: Message): js.Promise[Unit] = js.native
    
    var ackDeadline: Double = js.native
    
    /**
      * Acknowledges the supplied message, expecting a response (for exactly
      * once subscriptions).
      *
      * @param {Message} message The message to acknowledge.
      * @returns {Promise<AckResponse>}
      * @private
      */
    def ackWithResponse(message: Message): js.Promise[AckResponse] = js.native
    
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
    def getClient(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscriberClient */ Any
      ] = js.native
    
    /* private */ var getMinMaxDeadlines: Any = js.native
    
    /**
      * Returns true if an exactly-once delivery subscription has been detected.
      *
      * @private
      */
    def isExactlyOnceDelivery: Boolean = js.native
    
    var isOpen: Boolean = js.native
    
    var maxBytes: Double = js.native
    
    var maxMessages: Double = js.native
    
    /**
      * Modifies the acknowledge deadline for the provided message.
      *
      * @param {Message} message The message to modify.
      * @param {number} deadline The deadline.
      * @returns {Promise<void>}
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
      * Modifies the acknowledge deadline for the provided message, expecting
      * a reply (for exactly-once delivery subscriptions).
      *
      * @param {Message} message The message to modify.
      * @param {number} deadline The deadline.
      * @returns {Promise<AckResponse>}
      * @private
      */
    def modAckWithResponse(message: Message, deadline: Double): js.Promise[AckResponse] = js.native
    
    /**
      * Modfies the acknowledge deadline for the provided message and then removes
      * it from our inventory.
      *
      * @param {Message} message The message.
      * @return {Promise<void>}
      * @private
      */
    def nack(message: Message): js.Promise[Unit] = js.native
    
    /**
      * Modfies the acknowledge deadline for the provided message and then removes
      * it from our inventory, expecting a response from modAck (for
      * exactly-once delivery subscriptions).
      *
      * @param {Message} message The message.
      * @return {Promise<AckResponse>}
      * @private
      */
    def nackWithResponse(message: Message): js.Promise[AckResponse] = js.native
    
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
    
    /**
      * Sets our subscription properties from incoming messages.
      *
      * @param {SubscriptionProperties} subscriptionProperties The new properties.
      * @private
      */
    def setSubscriptionProperties(subscriptionProperties: SubscriptionProperties): Unit = js.native
    
    var subscriptionProperties: js.UndefOr[SubscriptionProperties] = js.native
    
    /**
      * Update our ack extension time that will be used by the lease manager
      * for sending modAcks.
      *
      * Should not be called from outside this class, except for unit tests.
      *
      * @param {number} [ackTimeSeconds] The number of seconds that the last
      *   ack took after the message was received. If this is undefined, then
      *   we won't update the histogram, but we will still recalculate the
      *   ackDeadline based on the situation.
      *
      * @private
      */
    def updateAckDeadline(): Unit = js.native
    def updateAckDeadline(ackTimeSeconds: Double): Unit = js.native
    
    var useLegacyFlowControl: Boolean = js.native
  }
  
  /* Inlined @google-cloud/pubsub.@google-cloud/pubsub/build/src/subscriber.ValueOf<{  PermissionDenied :'PERMISSION_DENIED',   FailedPrecondition :'FAILED_PRECONDITION',   Success :'SUCCESS',   Invalid :'INVALID',   Other :'OTHER'}> */
  /* Rewritten from type alias, can be one of: 
    - typings.googleCloudPubsub.googleCloudPubsubStrings.SUCCESS
    - typings.googleCloudPubsub.googleCloudPubsubStrings.INVALID
    - typings.googleCloudPubsub.googleCloudPubsubStrings.FAILED_PRECONDITION
    - typings.googleCloudPubsub.googleCloudPubsubStrings.PERMISSION_DENIED
    - typings.googleCloudPubsub.googleCloudPubsubStrings.OTHER
  */
  trait AckResponse extends StObject
  object AckResponse {
    
    inline def FAILED_PRECONDITION: typings.googleCloudPubsub.googleCloudPubsubStrings.FAILED_PRECONDITION = "FAILED_PRECONDITION".asInstanceOf[typings.googleCloudPubsub.googleCloudPubsubStrings.FAILED_PRECONDITION]
    
    inline def INVALID: typings.googleCloudPubsub.googleCloudPubsubStrings.INVALID = "INVALID".asInstanceOf[typings.googleCloudPubsub.googleCloudPubsubStrings.INVALID]
    
    inline def OTHER: typings.googleCloudPubsub.googleCloudPubsubStrings.OTHER = "OTHER".asInstanceOf[typings.googleCloudPubsub.googleCloudPubsubStrings.OTHER]
    
    inline def PERMISSION_DENIED: typings.googleCloudPubsub.googleCloudPubsubStrings.PERMISSION_DENIED = "PERMISSION_DENIED".asInstanceOf[typings.googleCloudPubsub.googleCloudPubsubStrings.PERMISSION_DENIED]
    
    inline def SUCCESS: typings.googleCloudPubsub.googleCloudPubsubStrings.SUCCESS = "SUCCESS".asInstanceOf[typings.googleCloudPubsub.googleCloudPubsubStrings.SUCCESS]
  }
  
  type PullResponse = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.IStreamingPullResponse */ Any
  
  trait SubscriberOptions extends StObject {
    
    /** @deprecated Use minAckDeadline and maxAckDeadline. */
    var ackDeadline: js.UndefOr[Double] = js.undefined
    
    var batching: js.UndefOr[BatchOptions] = js.undefined
    
    var enableOpenTelemetryTracing: js.UndefOr[Boolean] = js.undefined
    
    var flowControl: js.UndefOr[FlowControlOptions] = js.undefined
    
    var maxAckDeadline: js.UndefOr[Duration] = js.undefined
    
    var minAckDeadline: js.UndefOr[Duration] = js.undefined
    
    var streamingOptions: js.UndefOr[MessageStreamOptions] = js.undefined
    
    var useLegacyFlowControl: js.UndefOr[Boolean] = js.undefined
  }
  object SubscriberOptions {
    
    inline def apply(): SubscriberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscriberOptions]
    }
    
    extension [Self <: SubscriberOptions](x: Self) {
      
      inline def setAckDeadline(value: Double): Self = StObject.set(x, "ackDeadline", value.asInstanceOf[js.Any])
      
      inline def setAckDeadlineUndefined: Self = StObject.set(x, "ackDeadline", js.undefined)
      
      inline def setBatching(value: BatchOptions): Self = StObject.set(x, "batching", value.asInstanceOf[js.Any])
      
      inline def setBatchingUndefined: Self = StObject.set(x, "batching", js.undefined)
      
      inline def setEnableOpenTelemetryTracing(value: Boolean): Self = StObject.set(x, "enableOpenTelemetryTracing", value.asInstanceOf[js.Any])
      
      inline def setEnableOpenTelemetryTracingUndefined: Self = StObject.set(x, "enableOpenTelemetryTracing", js.undefined)
      
      inline def setFlowControl(value: FlowControlOptions): Self = StObject.set(x, "flowControl", value.asInstanceOf[js.Any])
      
      inline def setFlowControlUndefined: Self = StObject.set(x, "flowControl", js.undefined)
      
      inline def setMaxAckDeadline(value: Duration): Self = StObject.set(x, "maxAckDeadline", value.asInstanceOf[js.Any])
      
      inline def setMaxAckDeadlineUndefined: Self = StObject.set(x, "maxAckDeadline", js.undefined)
      
      inline def setMinAckDeadline(value: Duration): Self = StObject.set(x, "minAckDeadline", value.asInstanceOf[js.Any])
      
      inline def setMinAckDeadlineUndefined: Self = StObject.set(x, "minAckDeadline", js.undefined)
      
      inline def setStreamingOptions(value: MessageStreamOptions): Self = StObject.set(x, "streamingOptions", value.asInstanceOf[js.Any])
      
      inline def setStreamingOptionsUndefined: Self = StObject.set(x, "streamingOptions", js.undefined)
      
      inline def setUseLegacyFlowControl(value: Boolean): Self = StObject.set(x, "useLegacyFlowControl", value.asInstanceOf[js.Any])
      
      inline def setUseLegacyFlowControlUndefined: Self = StObject.set(x, "useLegacyFlowControl", js.undefined)
    }
  }
  
  type SubscriptionProperties = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.StreamingPullResponse.ISubscriptionProperties */ Any
  
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
