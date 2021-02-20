package typings.googleCloudPubsub

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.anon.FnCall
import typings.googleCloudPubsub.iamMod.IAM
import typings.googleCloudPubsub.leaseManagerMod.FlowControlOptions
import typings.googleCloudPubsub.messageQueuesMod.BatchOptions
import typings.googleCloudPubsub.messageStreamMod.MessageStreamOptions
import typings.googleCloudPubsub.protosMod.google.protobuf.IDuration
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IDeadLetterPolicy
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IExpirationPolicy
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IPushConfig
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IRetryPolicy
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.ISubscription
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig.IOidcToken
import typings.googleCloudPubsub.pubsubMod.DetachedCallback
import typings.googleCloudPubsub.pubsubMod.DetachedResponse
import typings.googleCloudPubsub.pubsubMod.EmptyCallback
import typings.googleCloudPubsub.pubsubMod.EmptyResponse
import typings.googleCloudPubsub.pubsubMod.ExistsCallback
import typings.googleCloudPubsub.pubsubMod.ExistsResponse
import typings.googleCloudPubsub.pubsubMod.PubSub
import typings.googleCloudPubsub.pubsubMod.RequestCallback
import typings.googleCloudPubsub.pubsubMod.RequestConfig
import typings.googleCloudPubsub.pubsubMod.ResourceCallback
import typings.googleCloudPubsub.snapshotMod.CreateSnapshotCallback
import typings.googleCloudPubsub.snapshotMod.CreateSnapshotResponse
import typings.googleCloudPubsub.snapshotMod.SeekCallback
import typings.googleCloudPubsub.snapshotMod.SeekResponse
import typings.googleCloudPubsub.snapshotMod.Snapshot
import typings.googleCloudPubsub.subscriberMod.SubscriberOptions
import typings.googleCloudPubsub.topicMod.Topic
import typings.googleGax.bundleExecutorMod.BundleOptions
import typings.googleGax.gaxMod.BackoffSettings
import typings.googleGax.gaxMod.CallOptions
import typings.googleGax.gaxMod.RetryOptions
import typings.googleGax.gaxMod.RetryRequestOptions
import typings.node.eventsMod.EventEmitter
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionMod {
  
  @JSImport("@google-cloud/pubsub/build/src/subscription", "Subscription")
  @js.native
  class Subscription protected () extends EventEmitter {
    def this(pubsub: PubSub, name: String) = this()
    def this(pubsub: PubSub, name: String, options: SubscriptionOptions) = this()
    
    /**
      * Watches for incoming message event handlers and open/closes the
      * subscriber as needed.
      *
      * @private
      */
    var _listen: js.Any = js.native
    
    var _subscriber: js.Any = js.native
    
    def close(): js.Promise[Unit] = js.native
    def close(callback: SubscriptionCloseCallback): Unit = js.native
    
    def create(): js.Promise[CreateSubscriptionResponse] = js.native
    def create(callback: CreateSubscriptionCallback): Unit = js.native
    def create(options: CreateSubscriptionOptions): js.Promise[CreateSubscriptionResponse] = js.native
    def create(options: CreateSubscriptionOptions, callback: CreateSubscriptionCallback): Unit = js.native
    
    def createSnapshot(name: String): js.Promise[CreateSnapshotResponse] = js.native
    def createSnapshot(name: String, callback: CreateSnapshotCallback): Unit = js.native
    def createSnapshot(name: String, gaxOpts: CallOptions): js.Promise[CreateSnapshotResponse] = js.native
    def createSnapshot(name: String, gaxOpts: CallOptions, callback: CreateSnapshotCallback): Unit = js.native
    
    def delete(): js.Promise[EmptyResponse] = js.native
    def delete(callback: EmptyCallback): Unit = js.native
    def delete(gaxOpts: CallOptions): js.Promise[EmptyResponse] = js.native
    def delete(gaxOpts: CallOptions, callback: EmptyCallback): Unit = js.native
    
    def detached(): js.Promise[DetachedResponse] = js.native
    def detached(callback: DetachedCallback): Unit = js.native
    
    def exists(): js.Promise[ExistsResponse] = js.native
    def exists(callback: ExistsCallback): Unit = js.native
    
    def get(): js.Promise[GetSubscriptionResponse] = js.native
    def get(callback: GetSubscriptionCallback): Unit = js.native
    def get(gaxOpts: GetSubscriptionOptions): js.Promise[GetSubscriptionResponse] = js.native
    def get(gaxOpts: GetSubscriptionOptions, callback: GetSubscriptionCallback): Unit = js.native
    
    def getMetadata(): js.Promise[GetSubscriptionMetadataResponse] = js.native
    def getMetadata(callback: GetSubscriptionMetadataCallback): Unit = js.native
    def getMetadata(gaxOpts: CallOptions): js.Promise[GetSubscriptionMetadataResponse] = js.native
    def getMetadata(gaxOpts: CallOptions, callback: GetSubscriptionMetadataCallback): Unit = js.native
    
    var iam: IAM = js.native
    
    /**
      * Indicates if the Subscription is open and receiving messages.
      *
      * @type {boolean}
      */
    def isOpen: Boolean = js.native
    
    var metadata: js.UndefOr[ISubscription] = js.native
    
    def modifyPushConfig(config: PushConfig): js.Promise[EmptyResponse] = js.native
    def modifyPushConfig(config: PushConfig, callback: EmptyCallback): Unit = js.native
    def modifyPushConfig(config: PushConfig, gaxOpts: CallOptions): js.Promise[EmptyResponse] = js.native
    def modifyPushConfig(config: PushConfig, gaxOpts: CallOptions, callback: EmptyCallback): Unit = js.native
    
    var name: String = js.native
    
    /**
      * Opens the Subscription to receive messages. In general this method
      * shouldn't need to be called, unless you wish to receive messages after
      * calling {@link Subscription#close}. Alternatively one could just assign a
      * new `message` event listener which will also re-open the Subscription.
      *
      * @example
      * subscription.on('message', message => message.ack());
      *
      * // Close the subscription.
      * subscription.close(err => {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   The subscription has been closed and messages will no longer be received.
      * });
      *
      * // Resume receiving messages.
      * subscription.open();
      */
    def open(): Unit = js.native
    
    /**
      * @type {string}
      */
    def projectId: String = js.native
    
    var pubsub: PubSub = js.native
    
    def request[T, R](config: RequestConfig, callback: RequestCallback[T, R]): Unit = js.native
    @JSName("request")
    var request_Original: FnCall = js.native
    
    def seek(snapshot: String): js.Promise[SeekResponse] = js.native
    def seek(snapshot: String, callback: SeekCallback): Unit = js.native
    def seek(snapshot: String, gaxOpts: CallOptions): js.Promise[SeekResponse] = js.native
    def seek(snapshot: String, gaxOpts: CallOptions, callback: SeekCallback): Unit = js.native
    def seek(snapshot: Date): js.Promise[SeekResponse] = js.native
    def seek(snapshot: Date, callback: SeekCallback): Unit = js.native
    def seek(snapshot: Date, gaxOpts: CallOptions): js.Promise[SeekResponse] = js.native
    def seek(snapshot: Date, gaxOpts: CallOptions, callback: SeekCallback): Unit = js.native
    
    def setMetadata(metadata: SubscriptionMetadata): js.Promise[SetSubscriptionMetadataResponse] = js.native
    def setMetadata(metadata: SubscriptionMetadata, callback: SetSubscriptionMetadataCallback): Unit = js.native
    def setMetadata(metadata: SubscriptionMetadata, gaxOpts: CallOptions): js.Promise[SetSubscriptionMetadataResponse] = js.native
    def setMetadata(metadata: SubscriptionMetadata, gaxOpts: CallOptions, callback: SetSubscriptionMetadataCallback): Unit = js.native
    
    /**
      * Sets the Subscription options.
      *
      * @param {SubscriberOptions} options The options.
      */
    def setOptions(options: SubscriberOptions): Unit = js.native
    
    /**
      * Create a Snapshot object. See {@link Subscription#createSnapshot} to
      * create a snapshot.
      *
      * @throws {Error} If a name is not provided.
      *
      * @param {string} name The name of the snapshot.
      * @returns {Snapshot}
      *
      * @example
      * const snapshot = subscription.snapshot('my-snapshot');
      */
    def snapshot(name: String): Snapshot = js.native
    
    var topic: js.UndefOr[Topic | String] = js.native
  }
  /* static members */
  object Subscription {
    
    /*!
      * Formats Subscription metadata.
      *
      * @private
      */
    @JSImport("@google-cloud/pubsub/build/src/subscription", "Subscription.formatMetadata_")
    @js.native
    def formatMetadata_(metadata: SubscriptionMetadata): ISubscription = js.native
    
    /*!
      * Format the name of a subscription. A subscription's full name is in the
      * format of projects/{projectId}/subscriptions/{subName}.
      *
      * @private
      */
    @JSImport("@google-cloud/pubsub/build/src/subscription", "Subscription.formatName_")
    @js.native
    def formatName_(projectId: String, name: String): String = js.native
  }
  
  type CreateSubscriptionCallback = SubscriptionCallback
  
  /* Inlined @google-cloud/pubsub.@google-cloud/pubsub/build/src/subscription.SubscriptionMetadata & {  gaxOpts :google-gax.google-gax.CallOptions | undefined,   flowControl :@google-cloud/pubsub.@google-cloud/pubsub/build/src/lease-manager.FlowControlOptions | undefined} */
  @js.native
  trait CreateSubscriptionOptions extends StObject {
    
    var ackDeadlineSeconds: js.UndefOr[Double | Null] = js.native
    
    var deadLetterPolicy: js.UndefOr[IDeadLetterPolicy | Null] = js.native
    
    var detached: js.UndefOr[Boolean | Null] = js.native
    
    var enableMessageOrdering: js.UndefOr[Boolean | Null] = js.native
    
    var expirationPolicy: js.UndefOr[IExpirationPolicy | Null] = js.native
    
    var filter: js.UndefOr[String | Null] = js.native
    
    var flowControl: js.UndefOr[FlowControlOptions] = js.native
    
    var gaxOpts: js.UndefOr[CallOptions] = js.native
    
    var labels: js.UndefOr[StringDictionary[String] | Null] = js.native
    
    var messageRetentionDuration: js.UndefOr[IDuration | Double] = js.native
    
    var name: js.UndefOr[String | Null] = js.native
    
    var oidcToken: js.UndefOr[OidcToken] = js.native
    
    var pushConfig: js.UndefOr[IPushConfig | Null] = js.native
    
    var pushEndpoint: js.UndefOr[String] = js.native
    
    var retainAckedMessages: js.UndefOr[Boolean | Null] = js.native
    
    var retryPolicy: js.UndefOr[IRetryPolicy | Null] = js.native
    
    var topic: js.UndefOr[String | Null] = js.native
  }
  object CreateSubscriptionOptions {
    
    @scala.inline
    def apply(): CreateSubscriptionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateSubscriptionOptions]
    }
    
    @scala.inline
    implicit class CreateSubscriptionOptionsMutableBuilder[Self <: CreateSubscriptionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAckDeadlineSeconds(value: Double): Self = StObject.set(x, "ackDeadlineSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAckDeadlineSecondsNull: Self = StObject.set(x, "ackDeadlineSeconds", null)
      
      @scala.inline
      def setAckDeadlineSecondsUndefined: Self = StObject.set(x, "ackDeadlineSeconds", js.undefined)
      
      @scala.inline
      def setDeadLetterPolicy(value: IDeadLetterPolicy): Self = StObject.set(x, "deadLetterPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeadLetterPolicyNull: Self = StObject.set(x, "deadLetterPolicy", null)
      
      @scala.inline
      def setDeadLetterPolicyUndefined: Self = StObject.set(x, "deadLetterPolicy", js.undefined)
      
      @scala.inline
      def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetachedNull: Self = StObject.set(x, "detached", null)
      
      @scala.inline
      def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      @scala.inline
      def setEnableMessageOrdering(value: Boolean): Self = StObject.set(x, "enableMessageOrdering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMessageOrderingNull: Self = StObject.set(x, "enableMessageOrdering", null)
      
      @scala.inline
      def setEnableMessageOrderingUndefined: Self = StObject.set(x, "enableMessageOrdering", js.undefined)
      
      @scala.inline
      def setExpirationPolicy(value: IExpirationPolicy): Self = StObject.set(x, "expirationPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationPolicyNull: Self = StObject.set(x, "expirationPolicy", null)
      
      @scala.inline
      def setExpirationPolicyUndefined: Self = StObject.set(x, "expirationPolicy", js.undefined)
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterNull: Self = StObject.set(x, "filter", null)
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFlowControl(value: FlowControlOptions): Self = StObject.set(x, "flowControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowControlUndefined: Self = StObject.set(x, "flowControl", js.undefined)
      
      @scala.inline
      def setGaxOpts(value: CallOptions): Self = StObject.set(x, "gaxOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGaxOptsUndefined: Self = StObject.set(x, "gaxOpts", js.undefined)
      
      @scala.inline
      def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsNull: Self = StObject.set(x, "labels", null)
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setMessageRetentionDuration(value: IDuration | Double): Self = StObject.set(x, "messageRetentionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageRetentionDurationUndefined: Self = StObject.set(x, "messageRetentionDuration", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOidcToken(value: OidcToken): Self = StObject.set(x, "oidcToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOidcTokenUndefined: Self = StObject.set(x, "oidcToken", js.undefined)
      
      @scala.inline
      def setPushConfig(value: IPushConfig): Self = StObject.set(x, "pushConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushConfigNull: Self = StObject.set(x, "pushConfig", null)
      
      @scala.inline
      def setPushConfigUndefined: Self = StObject.set(x, "pushConfig", js.undefined)
      
      @scala.inline
      def setPushEndpoint(value: String): Self = StObject.set(x, "pushEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushEndpointUndefined: Self = StObject.set(x, "pushEndpoint", js.undefined)
      
      @scala.inline
      def setRetainAckedMessages(value: Boolean): Self = StObject.set(x, "retainAckedMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetainAckedMessagesNull: Self = StObject.set(x, "retainAckedMessages", null)
      
      @scala.inline
      def setRetainAckedMessagesUndefined: Self = StObject.set(x, "retainAckedMessages", js.undefined)
      
      @scala.inline
      def setRetryPolicy(value: IRetryPolicy): Self = StObject.set(x, "retryPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryPolicyNull: Self = StObject.set(x, "retryPolicy", null)
      
      @scala.inline
      def setRetryPolicyUndefined: Self = StObject.set(x, "retryPolicy", js.undefined)
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicNull: Self = StObject.set(x, "topic", null)
      
      @scala.inline
      def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
  
  type CreateSubscriptionResponse = SubscriptionResponse
  
  type DetachSubscriptionCallback = EmptyCallback
  
  type DetachSubscriptionResponse = EmptyResponse
  
  type GetSubscriptionCallback = SubscriptionCallback
  
  type GetSubscriptionMetadataCallback = MetadataCallback
  
  type GetSubscriptionMetadataResponse = MetadataResponse
  
  /* Inlined google-gax.google-gax.CallOptions & {  autoCreate :boolean | undefined} */
  @js.native
  trait GetSubscriptionOptions extends StObject {
    
    var apiName: js.UndefOr[String] = js.native
    
    var autoCreate: js.UndefOr[Boolean] = js.native
    
    var autoPaginate: js.UndefOr[Boolean] = js.native
    
    var bundleOptions: js.UndefOr[BundleOptions | Null] = js.native
    
    var isBundling: js.UndefOr[Boolean] = js.native
    
    var longrunning: js.UndefOr[BackoffSettings] = js.native
    
    var maxResults: js.UndefOr[Double] = js.native
    
    var maxRetries: js.UndefOr[Double] = js.native
    
    var otherArgs: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var pageSize: js.UndefOr[Double] = js.native
    
    var pageToken: js.UndefOr[String] = js.native
    
    var retry: js.UndefOr[RetryOptions | Null] = js.native
    
    var retryRequestOptions: js.UndefOr[RetryRequestOptions] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object GetSubscriptionOptions {
    
    @scala.inline
    def apply(): GetSubscriptionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSubscriptionOptions]
    }
    
    @scala.inline
    implicit class GetSubscriptionOptionsMutableBuilder[Self <: GetSubscriptionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiName(value: String): Self = StObject.set(x, "apiName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiNameUndefined: Self = StObject.set(x, "apiName", js.undefined)
      
      @scala.inline
      def setAutoCreate(value: Boolean): Self = StObject.set(x, "autoCreate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCreateUndefined: Self = StObject.set(x, "autoCreate", js.undefined)
      
      @scala.inline
      def setAutoPaginate(value: Boolean): Self = StObject.set(x, "autoPaginate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPaginateUndefined: Self = StObject.set(x, "autoPaginate", js.undefined)
      
      @scala.inline
      def setBundleOptions(value: BundleOptions): Self = StObject.set(x, "bundleOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundleOptionsNull: Self = StObject.set(x, "bundleOptions", null)
      
      @scala.inline
      def setBundleOptionsUndefined: Self = StObject.set(x, "bundleOptions", js.undefined)
      
      @scala.inline
      def setIsBundling(value: Boolean): Self = StObject.set(x, "isBundling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBundlingUndefined: Self = StObject.set(x, "isBundling", js.undefined)
      
      @scala.inline
      def setLongrunning(value: BackoffSettings): Self = StObject.set(x, "longrunning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongrunningUndefined: Self = StObject.set(x, "longrunning", js.undefined)
      
      @scala.inline
      def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setOtherArgs(value: StringDictionary[js.Any]): Self = StObject.set(x, "otherArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherArgsUndefined: Self = StObject.set(x, "otherArgs", js.undefined)
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      @scala.inline
      def setRetry(value: RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryNull: Self = StObject.set(x, "retry", null)
      
      @scala.inline
      def setRetryRequestOptions(value: RetryRequestOptions): Self = StObject.set(x, "retryRequestOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryRequestOptionsUndefined: Self = StObject.set(x, "retryRequestOptions", js.undefined)
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type GetSubscriptionResponse = SubscriptionResponse
  
  type MetadataCallback = RequestCallback[ISubscription, Unit]
  
  type MetadataResponse = js.Array[ISubscription]
  
  type OidcToken = IOidcToken
  
  type PushConfig = IPushConfig
  
  type SetSubscriptionMetadataCallback = MetadataCallback
  
  type SetSubscriptionMetadataResponse = MetadataResponse
  
  type SubscriptionCallback = ResourceCallback[Subscription, ISubscription]
  
  type SubscriptionCloseCallback = js.Function1[/* err */ js.UndefOr[Error], Unit]
  
  /* Inlined {  messageRetentionDuration :@google-cloud/pubsub.@google-cloud/pubsub/build/protos/protos.google.protobuf.IDuration | number | undefined,   pushEndpoint :string | undefined,   oidcToken :@google-cloud/pubsub.@google-cloud/pubsub/build/src/subscription.OidcToken | undefined} & @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.Omit<@google-cloud/pubsub.@google-cloud/pubsub/build/protos/protos.google.pubsub.v1.ISubscription, 'messageRetentionDuration'> */
  @js.native
  trait SubscriptionMetadata extends StObject {
    
    var ackDeadlineSeconds: js.UndefOr[Double | Null] = js.native
    
    var deadLetterPolicy: js.UndefOr[IDeadLetterPolicy | Null] = js.native
    
    var detached: js.UndefOr[Boolean | Null] = js.native
    
    var enableMessageOrdering: js.UndefOr[Boolean | Null] = js.native
    
    var expirationPolicy: js.UndefOr[IExpirationPolicy | Null] = js.native
    
    var filter: js.UndefOr[String | Null] = js.native
    
    var labels: js.UndefOr[StringDictionary[String] | Null] = js.native
    
    var messageRetentionDuration: js.UndefOr[IDuration | Double] = js.native
    
    var name: js.UndefOr[String | Null] = js.native
    
    var oidcToken: js.UndefOr[OidcToken] = js.native
    
    var pushConfig: js.UndefOr[IPushConfig | Null] = js.native
    
    var pushEndpoint: js.UndefOr[String] = js.native
    
    var retainAckedMessages: js.UndefOr[Boolean | Null] = js.native
    
    var retryPolicy: js.UndefOr[IRetryPolicy | Null] = js.native
    
    var topic: js.UndefOr[String | Null] = js.native
  }
  object SubscriptionMetadata {
    
    @scala.inline
    def apply(): SubscriptionMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscriptionMetadata]
    }
    
    @scala.inline
    implicit class SubscriptionMetadataMutableBuilder[Self <: SubscriptionMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAckDeadlineSeconds(value: Double): Self = StObject.set(x, "ackDeadlineSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAckDeadlineSecondsNull: Self = StObject.set(x, "ackDeadlineSeconds", null)
      
      @scala.inline
      def setAckDeadlineSecondsUndefined: Self = StObject.set(x, "ackDeadlineSeconds", js.undefined)
      
      @scala.inline
      def setDeadLetterPolicy(value: IDeadLetterPolicy): Self = StObject.set(x, "deadLetterPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeadLetterPolicyNull: Self = StObject.set(x, "deadLetterPolicy", null)
      
      @scala.inline
      def setDeadLetterPolicyUndefined: Self = StObject.set(x, "deadLetterPolicy", js.undefined)
      
      @scala.inline
      def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetachedNull: Self = StObject.set(x, "detached", null)
      
      @scala.inline
      def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      @scala.inline
      def setEnableMessageOrdering(value: Boolean): Self = StObject.set(x, "enableMessageOrdering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMessageOrderingNull: Self = StObject.set(x, "enableMessageOrdering", null)
      
      @scala.inline
      def setEnableMessageOrderingUndefined: Self = StObject.set(x, "enableMessageOrdering", js.undefined)
      
      @scala.inline
      def setExpirationPolicy(value: IExpirationPolicy): Self = StObject.set(x, "expirationPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationPolicyNull: Self = StObject.set(x, "expirationPolicy", null)
      
      @scala.inline
      def setExpirationPolicyUndefined: Self = StObject.set(x, "expirationPolicy", js.undefined)
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterNull: Self = StObject.set(x, "filter", null)
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsNull: Self = StObject.set(x, "labels", null)
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setMessageRetentionDuration(value: IDuration | Double): Self = StObject.set(x, "messageRetentionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageRetentionDurationUndefined: Self = StObject.set(x, "messageRetentionDuration", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOidcToken(value: OidcToken): Self = StObject.set(x, "oidcToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOidcTokenUndefined: Self = StObject.set(x, "oidcToken", js.undefined)
      
      @scala.inline
      def setPushConfig(value: IPushConfig): Self = StObject.set(x, "pushConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushConfigNull: Self = StObject.set(x, "pushConfig", null)
      
      @scala.inline
      def setPushConfigUndefined: Self = StObject.set(x, "pushConfig", js.undefined)
      
      @scala.inline
      def setPushEndpoint(value: String): Self = StObject.set(x, "pushEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushEndpointUndefined: Self = StObject.set(x, "pushEndpoint", js.undefined)
      
      @scala.inline
      def setRetainAckedMessages(value: Boolean): Self = StObject.set(x, "retainAckedMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetainAckedMessagesNull: Self = StObject.set(x, "retainAckedMessages", null)
      
      @scala.inline
      def setRetainAckedMessagesUndefined: Self = StObject.set(x, "retainAckedMessages", js.undefined)
      
      @scala.inline
      def setRetryPolicy(value: IRetryPolicy): Self = StObject.set(x, "retryPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryPolicyNull: Self = StObject.set(x, "retryPolicy", null)
      
      @scala.inline
      def setRetryPolicyUndefined: Self = StObject.set(x, "retryPolicy", js.undefined)
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicNull: Self = StObject.set(x, "topic", null)
      
      @scala.inline
      def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
  
  /* Inlined @google-cloud/pubsub.@google-cloud/pubsub/build/src/subscriber.SubscriberOptions & {  topic :@google-cloud/pubsub.@google-cloud/pubsub/build/src/topic.Topic | undefined} */
  @js.native
  trait SubscriptionOptions extends StObject {
    
    var ackDeadline: js.UndefOr[Double] = js.native
    
    var batching: js.UndefOr[BatchOptions] = js.native
    
    var enableOpenTelemetryTracing: js.UndefOr[Boolean] = js.native
    
    var flowControl: js.UndefOr[FlowControlOptions] = js.native
    
    var streamingOptions: js.UndefOr[MessageStreamOptions] = js.native
    
    var topic: js.UndefOr[Topic] = js.native
  }
  object SubscriptionOptions {
    
    @scala.inline
    def apply(): SubscriptionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscriptionOptions]
    }
    
    @scala.inline
    implicit class SubscriptionOptionsMutableBuilder[Self <: SubscriptionOptions] (val x: Self) extends AnyVal {
      
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
      
      @scala.inline
      def setTopic(value: Topic): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
  
  type SubscriptionResponse = js.Tuple2[Subscription, ISubscription]
}
