package typings.googleCloudPubsub

import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.mod.GoogleAuth
import typings.googleCloudPubsub.googleCloudPubsubStrings.PublisherClient
import typings.googleCloudPubsub.googleCloudPubsubStrings.SubscriberClient
import typings.googleCloudPubsub.googleCloudPubsubStrings.close
import typings.googleCloudPubsub.googleCloudPubsubStrings.data
import typings.googleCloudPubsub.googleCloudPubsubStrings.drain
import typings.googleCloudPubsub.googleCloudPubsubStrings.end
import typings.googleCloudPubsub.googleCloudPubsubStrings.error
import typings.googleCloudPubsub.googleCloudPubsubStrings.finish
import typings.googleCloudPubsub.googleCloudPubsubStrings.pause
import typings.googleCloudPubsub.googleCloudPubsubStrings.pipe
import typings.googleCloudPubsub.googleCloudPubsubStrings.readable
import typings.googleCloudPubsub.googleCloudPubsubStrings.resume
import typings.googleCloudPubsub.googleCloudPubsubStrings.unpipe
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
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.anon.Chunk
import typings.node.anon.End
import typings.node.eventsMod.EventEmitterOptions
import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.TransformCallback
import typings.node.streamMod.TransformOptions
import typings.node.streamMod.WritableOptions
import typings.std.Error
import typings.std.Exclude
import typings.std.Pick
import typings.std.PromiseConstructor
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait ClientConfig extends GrpcClientOptions {
    
    var apiEndpoint: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[String | Double] = js.native
    
    var servicePath: js.UndefOr[String] = js.native
    
    var sslCreds: js.UndefOr[ChannelCredentials] = js.native
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
  
  @js.native
  trait GetClientConfig extends StObject {
    
    var client: PublisherClient | SubscriberClient = js.native
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
  
  /* Inlined @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.PageOptions & {  topic :string | @google-cloud/pubsub.@google-cloud/pubsub/build/src/topic.Topic | undefined} */
  @js.native
  trait GetSubscriptionsOptions extends StObject {
    
    var autoPaginate: js.UndefOr[Boolean] = js.native
    
    var gaxOpts: js.UndefOr[CallOptions] = js.native
    
    var pageSize: js.UndefOr[Double] = js.native
    
    var pageToken: js.UndefOr[String] = js.native
    
    var topic: js.UndefOr[String | Topic] = js.native
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
  
  /* Inlined {addListener (event : 'data', listener : (data : O): void): @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O>, emit (event : 'data', data : O): boolean, on (event : 'data', listener : (data : O): void): @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O>, once (event : 'data', listener : (data : O): void): @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O>, prependListener (event : 'data', listener : (data : O): void): @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O>, prependOnceListener (event : 'data', listener : (data : O): void): @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O>} & node.stream.Transform */
  @js.native
  trait ObjectStream[O] extends StObject {
    
    def _destroy(error: Null, callback: js.Function1[js.UndefOr[Error | Null], Unit]): Unit = js.native
    def _destroy(error: Error, callback: js.Function1[js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    def _final(callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    def _flush(callback: TransformCallback): Unit = js.native
    
    def _read(size: Double): Unit = js.native
    
    def _transform(chunk: js.Any, encoding: BufferEncoding, callback: TransformCallback): Unit = js.native
    
    def _write(
      chunk: js.Any,
      encoding: BufferEncoding,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    
    var _writev: js.UndefOr[
        js.Function2[
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    
    def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /**
      * Event emitter
      * The defined events on documents including:
      * 1. close
      * 2. drain
      * 3. error
      * 4. finish
      * 5. pipe
      * 6. unpipe
      */
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_data_ObjectStream(event: data, listener: js.Function1[/* data */ O, Unit]): ObjectStream[O] = js.native
    @JSName("addListener")
    def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def cork(): Unit = js.native
    
    def destroy(): Unit = js.native
    def destroy(error: Error): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, chunk: js.Any): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, data: O): Boolean = js.native
    @JSName("emit")
    def emit_drain(event: drain): Boolean = js.native
    @JSName("emit")
    def emit_end(event: end): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: Error): Boolean = js.native
    @JSName("emit")
    def emit_finish(event: finish): Boolean = js.native
    @JSName("emit")
    def emit_pause(event: pause): Boolean = js.native
    @JSName("emit")
    def emit_pipe(event: pipe, src: Readable): Boolean = js.native
    @JSName("emit")
    def emit_readable(event: readable): Boolean = js.native
    @JSName("emit")
    def emit_resume(event: resume): Boolean = js.native
    @JSName("emit")
    def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
    
    def end(): Unit = js.native
    def end(cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any): Unit = js.native
    def end(chunk: js.Any, cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any, encoding: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
    def end(chunk: js.Any, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
    def end(data: String): Unit = js.native
    def end(data: String, cb: js.Function0[Unit]): Unit = js.native
    def end(data: Uint8Array): Unit = js.native
    def end(data: Uint8Array, cb: js.Function0[Unit]): Unit = js.native
    def end(str: String, encoding: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
    def end(str: String, encoding: BufferEncoding): Unit = js.native
    def end(str: String, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
    
    def eventNames(): js.Array[String | js.Symbol] = js.native
    
    def getMaxListeners(): Double = js.native
    
    def isPaused(): Boolean = js.native
    
    def listenerCount(event: String): Double = js.native
    def listenerCount(event: js.Symbol): Double = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_data_ObjectStream(event: data, listener: js.Function1[/* data */ O, Unit]): ObjectStream[O] = js.native
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_data_ObjectStream(event: data, listener: js.Function1[/* data */ O, Unit]): ObjectStream[O] = js.native
    @JSName("once")
    def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("once")
    def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("once")
    def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def pause(): this.type = js.native
    
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data_ObjectStream(event: data, listener: js.Function1[/* data */ O, Unit]): ObjectStream[O] = js.native
    @JSName("prependListener")
    def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data_ObjectStream(event: data, listener: js.Function1[/* data */ O, Unit]): ObjectStream[O] = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def push(chunk: js.Any): Boolean = js.native
    def push(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    
    def rawListeners(event: String): js.Array[js.Function] = js.native
    def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def read(): js.Any = js.native
    def read(size: Double): js.Any = js.native
    @JSName("read")
    def read_Union(): String | Buffer = js.native
    @JSName("read")
    def read_Union(size: Double): String | Buffer = js.native
    
    var readable: Boolean = js.native
    
    val readableEncoding: BufferEncoding | Null = js.native
    
    val readableEnded: Boolean = js.native
    
    val readableFlowing: Boolean | Null = js.native
    
    val readableHighWaterMark: Double = js.native
    
    val readableLength: Double = js.native
    
    val readableObjectMode: Boolean = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    def removeAllListeners(event: js.Symbol): this.type = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def resume(): this.type = js.native
    
    def setDefaultEncoding(encoding: BufferEncoding): this.type = js.native
    
    def setEncoding(encoding: BufferEncoding): this.type = js.native
    
    def setMaxListeners(n: Double): this.type = js.native
    
    def uncork(): Unit = js.native
    
    def unpipe(): this.type = js.native
    def unpipe(destination: WritableStream): this.type = js.native
    
    def unshift(chunk: String): Unit = js.native
    def unshift(chunk: String, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: js.Any): Unit = js.native
    def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: Uint8Array): Unit = js.native
    def unshift(chunk: Uint8Array, encoding: BufferEncoding): Unit = js.native
    
    def wrap(oldStream: ReadableStream): this.type = js.native
    
    val writable: Boolean = js.native
    
    val writableCorked: Double = js.native
    
    val writableEnded: Boolean = js.native
    
    val writableFinished: Boolean = js.native
    
    val writableHighWaterMark: Double = js.native
    
    val writableLength: Double = js.native
    
    val writableObjectMode: Boolean = js.native
    
    def write(buffer: String): Boolean = js.native
    def write(buffer: String, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(buffer: Uint8Array): Boolean = js.native
    def write(buffer: Uint8Array, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(chunk: js.Any): Boolean = js.native
    def write(chunk: js.Any, cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(
      chunk: js.Any,
      encoding: js.UndefOr[scala.Nothing],
      cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Boolean = js.native
    def write(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    def write(
      chunk: js.Any,
      encoding: BufferEncoding,
      cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Boolean = js.native
    def write(
      str: String,
      encoding: js.UndefOr[scala.Nothing],
      cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
    ): Boolean = js.native
    def write(str: String, encoding: BufferEncoding): Boolean = js.native
    def write(str: String, encoding: BufferEncoding, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
  }
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  @js.native
  trait PageOptions extends StObject {
    
    var autoPaginate: js.UndefOr[Boolean] = js.native
    
    var gaxOpts: js.UndefOr[CallOptions] = js.native
    
    var pageSize: js.UndefOr[Double] = js.native
    
    var pageToken: js.UndefOr[String] = js.native
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
  
  @js.native
  trait RequestConfig extends GetClientConfig {
    
    var gaxOpts: js.UndefOr[CallOptions] = js.native
    
    var method: String = js.native
    
    var reqOpts: js.UndefOr[js.Object] = js.native
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
