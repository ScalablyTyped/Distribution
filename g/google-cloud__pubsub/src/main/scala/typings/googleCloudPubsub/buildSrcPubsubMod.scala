package typings.googleCloudPubsub

import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.buildSrcAuthGoogleauthMod.JSONClient
import typings.googleAuthLibrary.mod.GoogleAuth
import typings.googleCloudPubsub.buildSrcPublisherMod.PublishOptions
import typings.googleCloudPubsub.buildSrcSchemaMod.ISchema
import typings.googleCloudPubsub.buildSrcSchemaMod.Schema
import typings.googleCloudPubsub.buildSrcSchemaMod.SchemaType
import typings.googleCloudPubsub.buildSrcSchemaMod.SchemaView
import typings.googleCloudPubsub.buildSrcSnapshotMod.Snapshot
import typings.googleCloudPubsub.buildSrcSubscriptionMod.CreateSubscriptionCallback
import typings.googleCloudPubsub.buildSrcSubscriptionMod.CreateSubscriptionOptions
import typings.googleCloudPubsub.buildSrcSubscriptionMod.CreateSubscriptionResponse
import typings.googleCloudPubsub.buildSrcSubscriptionMod.DetachSubscriptionCallback
import typings.googleCloudPubsub.buildSrcSubscriptionMod.DetachSubscriptionResponse
import typings.googleCloudPubsub.buildSrcSubscriptionMod.Subscription
import typings.googleCloudPubsub.buildSrcSubscriptionMod.SubscriptionOptions
import typings.googleCloudPubsub.buildSrcTopicMod.CreateTopicCallback
import typings.googleCloudPubsub.buildSrcTopicMod.CreateTopicResponse
import typings.googleCloudPubsub.buildSrcTopicMod.GetTopicSubscriptionsCallback
import typings.googleCloudPubsub.buildSrcTopicMod.GetTopicSubscriptionsResponse
import typings.googleCloudPubsub.buildSrcTopicMod.Topic
import typings.googleCloudPubsub.buildSrcTopicMod.TopicMetadata
import typings.googleCloudPubsub.googleCloudPubsubStrings.PublisherClient
import typings.googleCloudPubsub.googleCloudPubsubStrings.SubscriberClient
import typings.googleCloudPubsub.googleCloudPubsubStrings.data
import typings.googleGax.buildSrcGaxMod.CallOptions
import typings.googleGax.buildSrcGrpcMod.GrpcClientOptions
import typings.googleGax.mod.ClientStub
import typings.googleGax.mod.grpc.ChannelCredentials
import typings.grpcGrpcJs.buildSrcCallMod.ServiceError
import typings.node.streamMod.Transform
import typings.std.AsyncIterable
import typings.std.Exclude
import typings.std.Pick
import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPubsubMod {
  
  @JSImport("@google-cloud/pubsub/build/src/pubsub", "PubSub")
  @js.native
  open class PubSub () extends StObject {
    def this(options: ClientConfig) = this()
    
    var Promise: js.UndefOr[PromiseConstructor] = js.native
    
    var api: StringDictionary[ClientStub] = js.native
    
    var auth: GoogleAuth[JSONClient] = js.native
    
    /**
      * Closes out this object, releasing any server connections. Note that once
      * you close a PubSub object, it may not be used again. Any pending operations
      * (e.g. queued publish messages) will fail. If you have topic or subscription
      * objects that may have pending operations, you should call close() on those
      * first if you want any pending messages to be delivered correctly. The
      * PubSub class doesn't track those.
      *
      * @callback EmptyCallback
      * @returns {Promise<void>}
      */
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
    
    /**
      * Create a schema in the project.
      *
      * @see [Schemas: create API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.schemas/create}
      * @see {@link Schema#create}
      *
      * @throws {Error} If a schema ID or name is not provided.
      * @throws {Error} If an invalid SchemaType is provided.
      * @throws {Error} If an invalid schema definition is provided.
      *
      * @param {string} schemaId The name or ID of the subscription.
      * @param {SchemaType} type The type of the schema (Protobuf, Avro, etc).
      * @param {string} definition The text describing the schema in terms of the type.
      * @param {object} [options] Request configuration options, outlined
      *   here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @returns {Promise<Schema>}
      *
      * @example Create a schema.
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * await pubsub.createSchema(
      *   'messageType',
      *   SchemaTypes.Avro,
      *   '{...avro definition...}'
      * );
      * ```
      */
    def createSchema(schemaId: String, `type`: SchemaType, definition: String): js.Promise[Schema] = js.native
    def createSchema(schemaId: String, `type`: SchemaType, definition: String, gaxOpts: CallOptions): js.Promise[Schema] = js.native
    
    def createSubscription(topic: String, name: String): js.Promise[CreateSubscriptionResponse] = js.native
    def createSubscription(topic: String, name: String, callback: CreateSubscriptionCallback): Unit = js.native
    def createSubscription(topic: String, name: String, options: CreateSubscriptionOptions): js.Promise[CreateSubscriptionResponse] = js.native
    def createSubscription(
      topic: String,
      name: String,
      options: CreateSubscriptionOptions,
      callback: CreateSubscriptionCallback
    ): Unit = js.native
    /**
      * @typedef {array} CreateSubscriptionResponse
      * @property {Subscription} 0 The new {@link Subscription}.
      * @property {object} 1 The full API response.
      */
    /**
      * @callback CreateSubscriptionCallback
      * @param {?Error} err Request error, if any.
      * @param {Subscription} Subscription
      * @param {object} apiResponse The full API response.
      */
    /**
      * Options for creating a subscription.
      *
      * See a [Subscription
      * resource](https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.subscriptions).
      *
      * @typedef {object} CreateSubscriptionRequest
      * @property {DeadLetterPolicy} [deadLetterPolicy] A policy that specifies the
      *     conditions for dead lettering messages in this subscription.
      * @property {object} [flowControl] Flow control configurations for
      *     receiving messages. Note that these options do not persist across
      *     subscription instances.
      * @property {number} [flowControl.maxBytes] The maximum number of bytes
      *     in un-acked messages to allow before the subscription pauses incoming
      *     messages. Defaults to 20% of free memory.
      * @property {number} [flowControl.maxMessages=Infinity] The maximum number
      *     of un-acked messages to allow before the subscription pauses incoming
      *     messages.
      * @property {object} [gaxOpts] Request configuration options, outlined
      *     here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @property {number|google.protobuf.Duration} [messageRetentionDuration] Set
      *     this to override the default duration of 7 days. This value is expected
      *     in seconds. Acceptable values are in the range of 10 minutes and 7
      *     days.
      * @property {string} [pushEndpoint] A URL to a custom endpoint that
      *     messages should be pushed to.
      * @property {object} [oidcToken] If specified, Pub/Sub will generate and
      *     attach an OIDC JWT token as an `Authorization` header in the HTTP
      *     request for every pushed message. This object should have the same
      *     structure as [OidcToken]{@link google.pubsub.v1.OidcToken}
      * @property {boolean} [retainAckedMessages=false] If set, acked messages
      *     are retained in the subscription's backlog for the length of time
      *     specified by `options.messageRetentionDuration`.
      * @property {ExpirationPolicy} [expirationPolicy] A policy that specifies
      *     the conditions for this subscription's expiration.
      */
    /**
      * Create a subscription to a topic.
      *
      * @see [Subscriptions: create API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.subscriptions/create}
      * @see {@link Topic#createSubscription}
      *
      * @throws {Error} If a Topic instance or topic name is not provided.
      * @throws {Error} If a subscription name is not provided.
      *
      * @param {Topic|string} topic The Topic to create a subscription to.
      * @param {string} name The name of the subscription.
      * @param {CreateSubscriptionRequest} [options] See a [Subscription resource](https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.subscriptions).
      * @param {CreateSubscriptionCallback} [callback] Callback function.
      * @returns {Promise<CreateSubscriptionResponse>}
      *
      * @example Subscribe to a topic.
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = 'messageCenter';
      * const name = 'newMessages';
      *
      * const callback = function(err, subscription, apiResponse) {};
      *
      * pubsub.createSubscription(topic, name, callback);
      *
      * ```
      * @example If the callback is omitted, we'll return a Promise.
      * ```
      * pubsub.createSubscription(topic, name)
      *   .then(function(data) {
      *     const subscription = data[0];
      *     const apiResponse = data[1];
      *   });
      * ```
      */
    def createSubscription(topic: Topic, name: String): js.Promise[CreateSubscriptionResponse] = js.native
    def createSubscription(topic: Topic, name: String, callback: CreateSubscriptionCallback): Unit = js.native
    def createSubscription(topic: Topic, name: String, options: CreateSubscriptionOptions): js.Promise[CreateSubscriptionResponse] = js.native
    def createSubscription(
      topic: Topic,
      name: String,
      options: CreateSubscriptionOptions,
      callback: CreateSubscriptionCallback
    ): Unit = js.native
    
    /**
      * @typedef {array} CreateTopicResponse
      * @property {Topic} 0 The new {@link Topic}.
      * @property {object} 1 The full API response.
      */
    /**
      * @callback CreateTopicCallback
      * @param {?Error} err Request error, if any.
      * @param {Topic} topic The new {@link Topic}.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Create a topic with the given name.
      *
      * @see [Topics: create API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.topics/create}
      *
      * @param {string} name Name of the topic.
      * @param {object} [gaxOpts] Request configuration options, outlined
      *     here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @param {CreateTopicCallback} [callback] Callback function.
      * @returns {Promise<CreateTopicResponse>}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * pubsub.createTopic('my-new-topic', function(err, topic, apiResponse) {
      *   if (!err) {
      *     // The topic was created successfully.
      *   }
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * pubsub.createTopic('my-new-topic').then(function(data) {
      *   const topic = data[0];
      *   const apiResponse = data[1];
      * });
      * ```
      */
    def createTopic(name: String): js.Promise[CreateTopicResponse] = js.native
    def createTopic(name: String, callback: CreateTopicCallback): Unit = js.native
    def createTopic(name: String, gaxOpts: CallOptions): js.Promise[CreateTopicResponse] = js.native
    def createTopic(name: String, gaxOpts: CallOptions, callback: CreateTopicCallback): Unit = js.native
    def createTopic(name: TopicMetadata): js.Promise[CreateTopicResponse] = js.native
    def createTopic(name: TopicMetadata, callback: CreateTopicCallback): Unit = js.native
    def createTopic(name: TopicMetadata, gaxOpts: CallOptions): js.Promise[CreateTopicResponse] = js.native
    def createTopic(name: TopicMetadata, gaxOpts: CallOptions, callback: CreateTopicCallback): Unit = js.native
    
    /**
      * Detach a subscription with the given name.
      *
      * @see [Admin: Pub/Sub administration API Documentation]{@link https://cloud.google.com/pubsub/docs/admin}
      *
      * @param {string} name Name of the subscription.
      * @param {object} [gaxOpts] Request configuration options, outlined
      *     here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @param {DetachSubscriptionCallback} [callback] Callback function.
      * @returns {Promise<DetachSubscriptionResponse>}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * pubsub.detachSubscription('my-sub', (err, topic, apiResponse) => {
      *   if (!err) {
      *     // The topic was created successfully.
      *   }
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * pubsub.detachSubscription('my-sub').then(data => {
      *   const apiResponse = data[0];
      * });
      * ```
      */
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
      * Retrieve a client configuration, suitable for passing into a GAPIC
      * 'v1' class constructor. This will fill out projectId, emulator URLs,
      * and so forth.
      *
      * @returns {Promise<ClientConfig>} the filled client configuration.
      */
    def getClientConfig(): js.Promise[ClientConfig] = js.native
    
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
    
    /**
      * Gets a schema client, creating one if needed.
      * @private
      */
    def getSchemaClient_(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchemaServiceClient */ Any
      ] = js.native
    
    /**
      * Query object for listing snapshots.
      *
      * @typedef {object} GetSnapshotsRequest
      * @property {boolean} [autoPaginate=true] Have pagination handled
      *     automatically.
      * @property {object} [options.gaxOpts] Request configuration options, outlined
      *     here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @property {number} [options.pageSize] Maximum number of results to return.
      * @property {string} [options.pageToken] Page token.
      */
    /**
      * @typedef {array} GetSnapshotsResponse
      * @property {Snapshot[]} 0 Array of {@link Snapshot} instances.
      * @property {object} 1 The full API response.
      */
    /**
      * @callback GetSnapshotsCallback
      * @param {?Error} err Request error, if any.
      * @param {Snapshot[]} snapshots Array of {@link Snapshot} instances.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Get a list of snapshots.
      *
      * @param {GetSnapshotsRequest} [query] Query object for listing snapshots.
      * @param {GetSnapshotsCallback} [callback] Callback function.
      * @returns {Promise<GetSnapshotsResponse>}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * pubsub.getSnapshots(function(err, snapshots) {
      *   if (!err) {
      *     // snapshots is an array of Snapshot objects.
      *   }
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * pubsub.getSnapshots().then(function(data) {
      *   const snapshots = data[0];
      * });
      * ```
      */
    def getSnapshots(): js.Promise[GetSnapshotsResponse] = js.native
    def getSnapshots(callback: GetSnapshotsCallback): Unit = js.native
    def getSnapshots(options: PageOptions): js.Promise[GetSnapshotsResponse] = js.native
    def getSnapshots(options: PageOptions, callback: GetSnapshotsCallback): Unit = js.native
    
    def getSnapshotsStream(): ObjectStream[Snapshot] = js.native
    
    /**
      * Query object for listing subscriptions.
      *
      * @typedef {object} GetSubscriptionsRequest
      * @property {boolean} [autoPaginate=true] Have pagination handled
      *     automatically.
      * @property {object} [options.gaxOpts] Request configuration options, outlined
      *     here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @property {number} [options.pageSize] Maximum number of results to return.
      * @property {string} [options.pageToken] Page token.
      * @param {string|Topic} options.topic - The name of the topic to
      *     list subscriptions from.
      */
    /**
      * @typedef {array} GetSubscriptionsResponse
      * @property {Subscription[]} 0 Array of {@link Subscription} instances.
      * @property {object} 1 The full API response.
      */
    /**
      * @callback GetSubscriptionsCallback
      * @param {?Error} err Request error, if any.
      * @param {Subscription[]} subscriptions Array of {@link Subscription} instances.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Get a list of the subscriptions registered to all of your project's topics.
      * You may optionally provide a query object as the first argument to
      * customize the response.
      *
      * Your provided callback will be invoked with an error object if an API error
      * occurred or an array of {@link Subscription} objects.
      *
      * To get subscriptions for a topic, see {@link Topic}.
      *
      * @see [Subscriptions: list API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.subscriptions/list}
      *
      * @param {GetSubscriptionsRequest} [query] Query object for listing subscriptions.
      * @param {GetSubscriptionsCallback} [callback] Callback function.
      * @returns {Promise<GetSubscriptionsResponse>}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * pubsub.getSubscriptions(function(err, subscriptions) {
      *   if (!err) {
      *     // subscriptions is an array of Subscription objects.
      *   }
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * pubsub.getSubscriptions().then(function(data) {
      *   const subscriptions = data[0];
      * });
      * ```
      */
    def getSubscriptions(): js.Promise[GetSubscriptionsResponse] = js.native
    def getSubscriptions(callback: GetSubscriptionsCallback): Unit = js.native
    def getSubscriptions(options: GetSubscriptionsOptions): js.Promise[GetSubscriptionsResponse] = js.native
    def getSubscriptions(options: GetSubscriptionsOptions, callback: GetSubscriptionsCallback): Unit = js.native
    
    def getSubscriptionsStream(): ObjectStream[Subscription] = js.native
    
    /**
      * Query object for listing topics.
      *
      * @typedef {object} GetTopicsRequest
      * @property {boolean} [autoPaginate=true] Have pagination handled
      *     automatically.
      * @property {object} [options.gaxOpts] Request configuration options, outlined
      *     here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @property {number} [options.pageSize] Maximum number of results to return.
      * @property {string} [options.pageToken] Page token.
      */
    /**
      * @typedef {array} GetTopicsResponse
      * @property {Topic[]} 0 Array of {@link Topic} instances.
      * @property {object} 1 The full API response.
      */
    /**
      * @callback GetTopicsCallback
      * @param {?Error} err Request error, if any.
      * @param {Topic[]} topics Array of {@link Topic} instances.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Get a list of the topics registered to your project. You may optionally
      * provide a query object as the first argument to customize the response.
      *
      * @see [Topics: list API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.topics/list}
      *
      * @param {GetTopicsRequest} [query] Query object for listing topics.
      * @param {GetTopicsCallback} [callback] Callback function.
      * @returns {Promise<GetTopicsResponse>}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * pubsub.getTopics(function(err, topics) {
      *   if (!err) {
      *     // topics is an array of Topic objects.
      *   }
      * });
      *
      * //-
      * // Customize the query.
      * //-
      * pubsub.getTopics({
      *   pageSize: 3
      * }, function(err, topics) {});
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * pubsub.getTopics().then(function(data) {
      *   const topics = data[0];
      * });
      * ```
      */
    def getTopics(): js.Promise[GetTopicsResponse] = js.native
    def getTopics(callback: GetTopicsCallback): Unit = js.native
    def getTopics(options: PageOptions): js.Promise[GetTopicsResponse] = js.native
    def getTopics(options: PageOptions, callback: GetTopicsCallback): Unit = js.native
    
    def getTopicsStream(): ObjectStream[Topic] = js.native
    
    var isEmulator: Boolean = js.native
    
    /**
      * Returns true if we have actually resolved the full project name.
      *
      * @returns {boolean} true if the name is resolved.
      */
    def isIdResolved: Boolean = js.native
    
    var isOpen: Boolean = js.native
    
    /**
      * Get a list of schemas associated with your project.
      *
      * The returned AsyncIterable will resolve to {@link google.pubsub.v1.ISchema} objects.
      *
      * This method returns an async iterable. These objects can be adapted
      * to work in a Promise/then framework, as well as with callbacks, but
      * this discussion is considered out of scope for these docs.
      *
      * @see [Schemas: list API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.schemas/list}
      * @see [More about async iterators]{@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/for-await...of}
      *
      * @param {google.pubsub.v1.SchemaView} [view] The type of schema objects
      *   requested, which should be an enum value from {@link SchemaViews}. Defaults
      *   to Full.
      * @param {object} [options] Request configuration options, outlined
      *   here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @returns {AsyncIterable<ISchema>}
      *
      * @example
      * ```
      * for await (const s of pubsub.listSchemas()) {
      *   const moreInfo = await s.get();
      * }
      * ```
      */
    def listSchemas(): AsyncIterable[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.ISchema */ Any
      ] = js.native
    def listSchemas(view: Unit, options: CallOptions): AsyncIterable[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.ISchema */ Any
      ] = js.native
    def listSchemas(view: SchemaView): AsyncIterable[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.ISchema */ Any
      ] = js.native
    def listSchemas(view: SchemaView, options: CallOptions): AsyncIterable[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.ISchema */ Any
      ] = js.native
    
    var name: js.UndefOr[String] = js.native
    
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
      * Create a Schema object, representing a schema within the project.
      * See {@link PubSub#createSchema} or {@link Schema#create} to create a schema.
      *
      * @throws {Error} If a name is not provided.
      *
      * @param {string} name The ID or name of the schema.
      * @returns {Schema} A {@link Schema} instance.
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const schema = pubsub.schema('my-schema');
      * ```
      */
    def schema(idOrName: String): Schema = js.native
    
    /* private */ var schemaClient: Any = js.native
    
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
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const snapshot = pubsub.snapshot('my-snapshot');
      * ```
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
      * ```
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
      * ```
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
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      * ```
      */
    def topic(name: String): Topic = js.native
    def topic(name: String, options: PublishOptions): Topic = js.native
    
    /**
      * Validate a schema definition.
      *
      * @see [Schemas: validateSchema API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.schemas/validate}
      *
      * @throws {Error} if the validation fails.
      *
      * @param {ISchema} schema The schema definition you wish to validate.
      * @param {object} [options] Request configuration options, outlined
      *   here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @returns {Promise<void>}
      */
    def validateSchema(schema: ISchema): js.Promise[Unit] = js.native
    def validateSchema(schema: ISchema, gaxOpts: CallOptions): js.Promise[Unit] = js.native
  }
  /* static members */
  object PubSub {
    
    @JSImport("@google-cloud/pubsub/build/src/pubsub", "PubSub")
    @js.native
    val ^ : js.Any = js.native
    
    /*!
      * Format the name of a project. A project's full name is in the
      * format of projects/{projectId}.
      *
      * The GAPIC client should do this for us, but since we maintain
      * names rather than IDs, this is simpler.
      *
      * @private
      */
    inline def formatName_(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(name.asInstanceOf[js.Any]).asInstanceOf[String]
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
    
    inline def apply(): ClientConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientConfig]
    }
    
    extension [Self <: ClientConfig](x: Self) {
      
      inline def setApiEndpoint(value: String): Self = StObject.set(x, "apiEndpoint", value.asInstanceOf[js.Any])
      
      inline def setApiEndpointUndefined: Self = StObject.set(x, "apiEndpoint", js.undefined)
      
      inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setServicePath(value: String): Self = StObject.set(x, "servicePath", value.asInstanceOf[js.Any])
      
      inline def setServicePathUndefined: Self = StObject.set(x, "servicePath", js.undefined)
      
      inline def setSslCreds(value: ChannelCredentials): Self = StObject.set(x, "sslCreds", value.asInstanceOf[js.Any])
      
      inline def setSslCredsUndefined: Self = StObject.set(x, "sslCreds", js.undefined)
    }
  }
  
  type DetachedCallback = RequestCallback[Boolean, Unit]
  
  type DetachedResponse = js.Array[Boolean]
  
  type EmptyCallback = RequestCallback[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.protobuf.IEmpty */ Any, 
    Unit
  ]
  
  type EmptyResponse = js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.protobuf.IEmpty */ Any
  ]
  
  type ExistsCallback = RequestCallback[Boolean, Unit]
  
  type ExistsResponse = js.Array[Boolean]
  
  type GetAllSubscriptionsCallback = RequestCallback[
    Subscription, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.IListSubscriptionsResponse */ Any
  ]
  
  type GetAllSubscriptionsResponse = PagedResponse[
    Subscription, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.IListSubscriptionsResponse */ Any
  ]
  
  type GetClientCallback = js.Function2[/* err */ js.Error | Null, /* gaxClient */ js.UndefOr[ClientStub], Unit]
  
  trait GetClientConfig extends StObject {
    
    var client: PublisherClient | SubscriberClient
  }
  object GetClientConfig {
    
    inline def apply(client: PublisherClient | SubscriberClient): GetClientConfig = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClientConfig]
    }
    
    extension [Self <: GetClientConfig](x: Self) {
      
      inline def setClient(value: PublisherClient | SubscriberClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
  
  type GetSnapshotsCallback = RequestCallback[
    Snapshot, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.IListSnapshotsResponse */ Any
  ]
  
  type GetSnapshotsResponse = PagedResponse[
    Snapshot, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.IListSnapshotsResponse */ Any
  ]
  
  type GetSubscriptionsCallback = GetAllSubscriptionsCallback | GetTopicSubscriptionsCallback
  
  trait GetSubscriptionsOptions
    extends StObject
       with PageOptions {
    
    var topic: js.UndefOr[String | Topic] = js.undefined
  }
  object GetSubscriptionsOptions {
    
    inline def apply(): GetSubscriptionsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSubscriptionsOptions]
    }
    
    extension [Self <: GetSubscriptionsOptions](x: Self) {
      
      inline def setTopic(value: String | Topic): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
  
  type GetSubscriptionsResponse = GetAllSubscriptionsResponse | GetTopicSubscriptionsResponse
  
  type GetTopicsCallback = RequestCallback[
    Topic, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.IListTopicsResponse */ Any
  ]
  
  type GetTopicsResponse = PagedResponse[
    Topic, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.IListTopicsResponse */ Any
  ]
  
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
    
    inline def apply(): PageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageOptions]
    }
    
    extension [Self <: PageOptions](x: Self) {
      
      inline def setAutoPaginate(value: Boolean): Self = StObject.set(x, "autoPaginate", value.asInstanceOf[js.Any])
      
      inline def setAutoPaginateUndefined: Self = StObject.set(x, "autoPaginate", js.undefined)
      
      inline def setGaxOpts(value: CallOptions): Self = StObject.set(x, "gaxOpts", value.asInstanceOf[js.Any])
      
      inline def setGaxOptsUndefined: Self = StObject.set(x, "gaxOpts", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    R extends void ? @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.NormalCallback<T> : @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.PagedCallback<T, R>
    }}}
    */
  @js.native
  trait RequestCallback[T, R] extends StObject
  
  trait RequestConfig
    extends StObject
       with GetClientConfig {
    
    var gaxOpts: js.UndefOr[CallOptions] = js.undefined
    
    var method: String
    
    var reqOpts: js.UndefOr[js.Object] = js.undefined
  }
  object RequestConfig {
    
    inline def apply(client: PublisherClient | SubscriberClient, method: String): RequestConfig = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestConfig]
    }
    
    extension [Self <: RequestConfig](x: Self) {
      
      inline def setGaxOpts(value: CallOptions): Self = StObject.set(x, "gaxOpts", value.asInstanceOf[js.Any])
      
      inline def setGaxOptsUndefined: Self = StObject.set(x, "gaxOpts", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setReqOpts(value: js.Object): Self = StObject.set(x, "reqOpts", value.asInstanceOf[js.Any])
      
      inline def setReqOptsUndefined: Self = StObject.set(x, "reqOpts", js.undefined)
    }
  }
  
  type ResourceCallback[Resource, Response] = js.Function3[
    /* err */ ServiceError | Null, 
    /* resource */ js.UndefOr[Resource | Null], 
    /* response */ js.UndefOr[Response | Null], 
    Unit
  ]
}
