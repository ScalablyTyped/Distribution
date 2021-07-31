package typings.googleCloudPubsub

import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.mod.GoogleAuth
import typings.googleCloudPubsub.googleCloudPubsubStrings.PublisherClient
import typings.googleCloudPubsub.googleCloudPubsubStrings.SubscriberClient
import typings.googleCloudPubsub.googleCloudPubsubStrings.data
import typings.googleCloudPubsub.protosMod.google.protobuf.IEmpty
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListSnapshotsResponse
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListSubscriptionsResponse
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListTopicsResponse
import typings.googleCloudPubsub.publisherMod.PublishOptions
import typings.googleCloudPubsub.snapshotMod.Snapshot
import typings.googleCloudPubsub.subscriptionMod.CreateSubscriptionCallback
import typings.googleCloudPubsub.subscriptionMod.CreateSubscriptionOptions
import typings.googleCloudPubsub.subscriptionMod.CreateSubscriptionResponse
import typings.googleCloudPubsub.subscriptionMod.DetachSubscriptionCallback
import typings.googleCloudPubsub.subscriptionMod.DetachSubscriptionResponse
import typings.googleCloudPubsub.subscriptionMod.Subscription
import typings.googleCloudPubsub.subscriptionMod.SubscriptionOptions
import typings.googleCloudPubsub.topicMod.CreateTopicCallback
import typings.googleCloudPubsub.topicMod.CreateTopicResponse
import typings.googleCloudPubsub.topicMod.GetTopicSubscriptionsCallback
import typings.googleCloudPubsub.topicMod.GetTopicSubscriptionsResponse
import typings.googleCloudPubsub.topicMod.Topic
import typings.googleGax.gaxMod.CallOptions
import typings.googleGax.grpcMod.GrpcClientOptions
import typings.googleGax.mod.ClientStub
import typings.googleGax.mod.grpc.ChannelCredentials
import typings.grpcGrpcJs.callMod.ServiceError
import typings.node.streamMod.Transform
import typings.std.Error
import typings.std.Exclude
import typings.std.Pick
import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pubsubMod {
  
  @JSImport("@google-cloud/pubsub/build/src/pubsub", "PubSub")
  @js.native
  class PubSub () extends StObject {
    def this(options: ClientConfig) = this()
    
    var Promise: js.UndefOr[PromiseConstructor] = js.native
    
    var api: StringDictionary[ClientStub] = js.native
    
    var auth: GoogleAuth = js.native
    
    def close(): js.Promise[Unit] = js.native
    def close(callback: EmptyCallback): Unit = js.native
    
    /**
      * Close all open client objects.
      *
      * @private
      *
      * @returns {Promise}
      */
    def closeAllClients_(): js.Promise[Unit] = js.native
    
    def createSubscription(topic: String, name: String): js.Promise[CreateSubscriptionResponse] = js.native
    def createSubscription(topic: String, name: String, callback: CreateSubscriptionCallback): Unit = js.native
    def createSubscription(topic: String, name: String, options: CreateSubscriptionOptions): js.Promise[CreateSubscriptionResponse] = js.native
    def createSubscription(
      topic: String,
      name: String,
      options: CreateSubscriptionOptions,
      callback: CreateSubscriptionCallback
    ): Unit = js.native
    def createSubscription(topic: Topic, name: String): js.Promise[CreateSubscriptionResponse] = js.native
    def createSubscription(topic: Topic, name: String, callback: CreateSubscriptionCallback): Unit = js.native
    def createSubscription(topic: Topic, name: String, options: CreateSubscriptionOptions): js.Promise[CreateSubscriptionResponse] = js.native
    def createSubscription(
      topic: Topic,
      name: String,
      options: CreateSubscriptionOptions,
      callback: CreateSubscriptionCallback
    ): Unit = js.native
    
    def createTopic(name: String): js.Promise[CreateTopicResponse] = js.native
    def createTopic(name: String, callback: CreateTopicCallback): Unit = js.native
    def createTopic(name: String, gaxOpts: CallOptions): js.Promise[CreateTopicResponse] = js.native
    def createTopic(name: String, gaxOpts: CallOptions, callback: CreateTopicCallback): Unit = js.native
    
    def detachSubscription(name: String): js.Promise[DetachSubscriptionResponse] = js.native
    def detachSubscription(name: String, callback: DetachSubscriptionCallback): Unit = js.native
    def detachSubscription(name: String, gaxOpts: CallOptions): js.Promise[DetachSubscriptionResponse] = js.native
    def detachSubscription(name: String, gaxOpts: CallOptions, callback: DetachSubscriptionCallback): Unit = js.native
    
    /**
      * Determine the appropriate endpoint to use for API requests, first trying
      * the `apiEndpoint` parameter. If that isn't set, we try the Pub/Sub emulator
      * environment variable (PUBSUB_EMULATOR_HOST). If that is also null, we try
      * the standard `gcloud alpha pubsub` environment variable
      * (CLOUDSDK_API_ENDPOINT_OVERRIDES_PUBSUB). Otherwise the default production
      * API is used.
      *
      * Note that if the URL doesn't end in '.googleapis.com', we will assume that
      * it's an emulator and disable strict SSL checks.
      *
      * @private
      */
    def determineBaseUrl_(): Unit = js.native
    
    /**
      * Get the PubSub client object.
      *
      * @private
      *
      * @param {object} config Configuration object.
      * @param {object} config.gaxOpts GAX options.
      * @param {function} config.method The gax method to call.
      * @param {object} config.reqOpts Request options.
      * @returns {Promise}
      */
    def getClientAsync_(config: GetClientConfig): js.Promise[ClientStub] = js.native
    
    /**
      * Callback function to PubSub.getClient_().
      * @private
      * @callback GetClientCallback
      * @param err - Error, if any.
      * @param gaxClient - The gax client specified in RequestConfig.client.
      *                    Typed any since it's importing Javascript source.
      */
    /**
      * Get the PubSub client object.
      *
      * @private
      *
      * @param {object} config Configuration object.
      * @param {object} config.gaxOpts GAX options.
      * @param {function} config.method The gax method to call.
      * @param {object} config.reqOpts Request options.
      * @param {function} [callback] The callback function.
      */
    def getClient_(config: GetClientConfig, callback: GetClientCallback): Unit = js.native
    
    def getSnapshots(): js.Promise[GetSnapshotsResponse] = js.native
    def getSnapshots(callback: GetSnapshotsCallback): Unit = js.native
    def getSnapshots(options: PageOptions): js.Promise[GetSnapshotsResponse] = js.native
    def getSnapshots(options: PageOptions, callback: GetSnapshotsCallback): Unit = js.native
    
    def getSnapshotsStream(): ObjectStream[Snapshot] = js.native
    
    def getSubscriptions(): js.Promise[GetSubscriptionsResponse] = js.native
    def getSubscriptions(callback: GetSubscriptionsCallback): Unit = js.native
    def getSubscriptions(options: GetSubscriptionsOptions): js.Promise[GetSubscriptionsResponse] = js.native
    def getSubscriptions(options: GetSubscriptionsOptions, callback: GetSubscriptionsCallback): Unit = js.native
    
    def getSubscriptionsStream(): ObjectStream[Subscription] = js.native
    
    def getTopics(): js.Promise[GetTopicsResponse] = js.native
    def getTopics(callback: GetTopicsCallback): Unit = js.native
    def getTopics(options: PageOptions): js.Promise[GetTopicsResponse] = js.native
    def getTopics(options: PageOptions, callback: GetTopicsCallback): Unit = js.native
    
    def getTopicsStream(): ObjectStream[Topic] = js.native
    
    var isEmulator: Boolean = js.native
    
    var isOpen: Boolean = js.native
    
    var options: ClientConfig = js.native
    
    var projectId: String = js.native
    
    /**
      * Funnel all API requests through this method, to be sure we have a project
      * ID.
      *
      * @private
      *
      * @param {object} config Configuration object.
      * @param {object} config.gaxOpts GAX options.
      * @param {function} config.method The gax method to call.
      * @param {object} config.reqOpts Request options.
      * @param {function} [callback] The callback function.
      */
    def request[T, R](config: RequestConfig, callback: RequestCallback[T, R]): Unit = js.native
    
    /**
      * Create a Snapshot object. See {@link Subscription#createSnapshot} to
      * create a snapshot.
      *
      * @throws {Error} If a name is not provided.
      *
      * @param {string} name The name of the snapshot.
      * @returns {Snapshot} A {@link Snapshot} instance.
      *
      * @example
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const snapshot = pubsub.snapshot('my-snapshot');
      */
    def snapshot(name: String): Snapshot = js.native
    
    /**
      * Create a Subscription object. This command by itself will not run any API
      * requests. You will receive a {@link Subscription} object,
      * which will allow you to interact with a subscription.
      *
      * @throws {Error} If subscription name is omitted.
      *
      * @param {string} name Name of the subscription.
      * @param {SubscriberOptions} [options] Configuration object.
      * @returns {Subscription} A {@link Subscription} instance.
      *
      * @example
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const subscription = pubsub.subscription('my-subscription');
      *
      * // Register a listener for `message` events.
      * subscription.on('message', function(message) {
      *   // Called every time a message is received.
      *   // message.id = ID of the message.
      *   // message.ackId = ID used to acknowledge the message receival.
      *   // message.data = Contents of the message.
      *   // message.attributes = Attributes of the message.
      *   // message.publishTime = Date when Pub/Sub received the message.
      * });
      */
    def subscription(name: String): Subscription = js.native
    def subscription(name: String, options: SubscriptionOptions): Subscription = js.native
    
    /**
      * Create a Topic object. See {@link PubSub#createTopic} to create a topic.
      *
      * @throws {Error} If a name is not provided.
      *
      * @param {string} name The name of the topic.
      * @param {PublishOptions} [options] Publisher configuration object.
      * @returns {Topic} A {@link Topic} instance.
      *
      * @example
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      */
    def topic(name: String): Topic = js.native
    def topic(name: String, options: PublishOptions): Topic = js.native
  }
  
  trait ClientConfig
    extends StObject
       with GrpcClientOptions {
    
    var apiEndpoint: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[String | Double] = js.undefined
    
    var servicePath: js.UndefOr[String] = js.undefined
    
    var sslCreds: js.UndefOr[ChannelCredentials] = js.undefined
  }
  object ClientConfig {
    
    @scala.inline
    def apply(): ClientConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientConfig]
    }
    
    @scala.inline
    implicit class ClientConfigMutableBuilder[Self <: ClientConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiEndpoint(value: String): Self = StObject.set(x, "apiEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiEndpointUndefined: Self = StObject.set(x, "apiEndpoint", js.undefined)
      
      @scala.inline
      def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setServicePath(value: String): Self = StObject.set(x, "servicePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicePathUndefined: Self = StObject.set(x, "servicePath", js.undefined)
      
      @scala.inline
      def setSslCreds(value: ChannelCredentials): Self = StObject.set(x, "sslCreds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslCredsUndefined: Self = StObject.set(x, "sslCreds", js.undefined)
    }
  }
  
  type DetachedCallback = RequestCallback[Boolean, Unit]
  
  type DetachedResponse = js.Array[Boolean]
  
  type EmptyCallback = RequestCallback[IEmpty, Unit]
  
  type EmptyResponse = js.Array[IEmpty]
  
  type ExistsCallback = RequestCallback[Boolean, Unit]
  
  type ExistsResponse = js.Array[Boolean]
  
  type GetAllSubscriptionsCallback = RequestCallback[Subscription, IListSubscriptionsResponse]
  
  type GetAllSubscriptionsResponse = PagedResponse[Subscription, IListSubscriptionsResponse]
  
  type GetClientCallback = js.Function2[/* err */ Error | Null, /* gaxClient */ js.UndefOr[ClientStub], Unit]
  
  trait GetClientConfig extends StObject {
    
    var client: PublisherClient | SubscriberClient
  }
  object GetClientConfig {
    
    @scala.inline
    def apply(client: PublisherClient | SubscriberClient): GetClientConfig = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClientConfig]
    }
    
    @scala.inline
    implicit class GetClientConfigMutableBuilder[Self <: GetClientConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: PublisherClient | SubscriberClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
  
  type GetSnapshotsCallback = RequestCallback[Snapshot, IListSnapshotsResponse]
  
  type GetSnapshotsResponse = PagedResponse[Snapshot, IListSnapshotsResponse]
  
  type GetSubscriptionsCallback = GetAllSubscriptionsCallback | GetTopicSubscriptionsCallback
  
  trait GetSubscriptionsOptions
    extends StObject
       with PageOptions {
    
    var topic: js.UndefOr[String | Topic] = js.undefined
  }
  object GetSubscriptionsOptions {
    
    @scala.inline
    def apply(): GetSubscriptionsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSubscriptionsOptions]
    }
    
    @scala.inline
    implicit class GetSubscriptionsOptionsMutableBuilder[Self <: GetSubscriptionsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTopic(value: String | Topic): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
  
  type GetSubscriptionsResponse = GetAllSubscriptionsResponse | GetTopicSubscriptionsResponse
  
  type GetTopicsCallback = RequestCallback[Topic, IListTopicsResponse]
  
  type GetTopicsResponse = PagedResponse[Topic, IListTopicsResponse]
  
  type NormalCallback[TResponse] = js.Function2[/* err */ ServiceError | Null, /* res */ js.UndefOr[TResponse | Null], Unit]
  
  @js.native
  trait ObjectStream[O] extends Transform {
    
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[/* data */ O, Unit]): ObjectStream[O] = js.native
    
    @JSName("emit")
    def emit_data(event: data, data: O): Boolean = js.native
    
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* data */ O, Unit]): ObjectStream[O] = js.native
    
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* data */ O, Unit]): ObjectStream[O] = js.native
    
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* data */ O, Unit]): ObjectStream[O] = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* data */ O, Unit]): ObjectStream[O] = js.native
  }
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  trait PageOptions extends StObject {
    
    var autoPaginate: js.UndefOr[Boolean] = js.undefined
    
    var gaxOpts: js.UndefOr[CallOptions] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object PageOptions {
    
    @scala.inline
    def apply(): PageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageOptions]
    }
    
    @scala.inline
    implicit class PageOptionsMutableBuilder[Self <: PageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoPaginate(value: Boolean): Self = StObject.set(x, "autoPaginate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPaginateUndefined: Self = StObject.set(x, "autoPaginate", js.undefined)
      
      @scala.inline
      def setGaxOpts(value: CallOptions): Self = StObject.set(x, "gaxOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGaxOptsUndefined: Self = StObject.set(x, "gaxOpts", js.undefined)
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  type PagedCallback[Item, Response] = js.Function4[
    /* err */ ServiceError | Null, 
    /* results */ js.UndefOr[js.Array[Item] | Null], 
    /* nextQuery */ js.UndefOr[js.Object | Null], 
    /* response */ js.UndefOr[Response | Null], 
    Unit
  ]
  
  type PagedResponse[Item, Response] = js.Array[js.Array[Item]] | (js.Tuple3[js.Array[Item], js.Object | Null, Response])
  
  type RequestCallback[T, R] = (PagedCallback[T, R]) | NormalCallback[T]
  
  trait RequestConfig
    extends StObject
       with GetClientConfig {
    
    var gaxOpts: js.UndefOr[CallOptions] = js.undefined
    
    var method: String
    
    var reqOpts: js.UndefOr[js.Object] = js.undefined
  }
  object RequestConfig {
    
    @scala.inline
    def apply(client: PublisherClient | SubscriberClient, method: String): RequestConfig = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestConfig]
    }
    
    @scala.inline
    implicit class RequestConfigMutableBuilder[Self <: RequestConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGaxOpts(value: CallOptions): Self = StObject.set(x, "gaxOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGaxOptsUndefined: Self = StObject.set(x, "gaxOpts", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqOpts(value: js.Object): Self = StObject.set(x, "reqOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqOptsUndefined: Self = StObject.set(x, "reqOpts", js.undefined)
    }
  }
  
  type ResourceCallback[Resource, Response] = js.Function3[
    /* err */ ServiceError | Null, 
    /* resource */ js.UndefOr[Resource | Null], 
    /* response */ js.UndefOr[Response | Null], 
    Unit
  ]
}
