package typings.googleCloudPubsub

import typings.googleCloudPubsub.anon.FlowControl
import typings.googleCloudPubsub.anon.FnCall
import typings.googleCloudPubsub.anon.MessageRetentionDuration
import typings.googleCloudPubsub.buildSrcIamMod.IAM
import typings.googleCloudPubsub.buildSrcPubsubMod.DetachedCallback
import typings.googleCloudPubsub.buildSrcPubsubMod.DetachedResponse
import typings.googleCloudPubsub.buildSrcPubsubMod.EmptyCallback
import typings.googleCloudPubsub.buildSrcPubsubMod.EmptyResponse
import typings.googleCloudPubsub.buildSrcPubsubMod.ExistsCallback
import typings.googleCloudPubsub.buildSrcPubsubMod.ExistsResponse
import typings.googleCloudPubsub.buildSrcPubsubMod.Omit
import typings.googleCloudPubsub.buildSrcPubsubMod.PubSub
import typings.googleCloudPubsub.buildSrcPubsubMod.RequestCallback
import typings.googleCloudPubsub.buildSrcPubsubMod.RequestConfig
import typings.googleCloudPubsub.buildSrcPubsubMod.ResourceCallback
import typings.googleCloudPubsub.buildSrcSnapshotMod.CreateSnapshotCallback
import typings.googleCloudPubsub.buildSrcSnapshotMod.CreateSnapshotResponse
import typings.googleCloudPubsub.buildSrcSnapshotMod.SeekCallback
import typings.googleCloudPubsub.buildSrcSnapshotMod.SeekResponse
import typings.googleCloudPubsub.buildSrcSnapshotMod.Snapshot
import typings.googleCloudPubsub.buildSrcSubscriberMod.AckResponse
import typings.googleCloudPubsub.buildSrcSubscriberMod.SubscriberOptions
import typings.googleCloudPubsub.buildSrcTopicMod.Topic
import typings.googleCloudPubsub.googleCloudPubsubStrings.FAILED_PRECONDITION
import typings.googleCloudPubsub.googleCloudPubsubStrings.INVALID
import typings.googleCloudPubsub.googleCloudPubsubStrings.OTHER
import typings.googleCloudPubsub.googleCloudPubsubStrings.PERMISSION_DENIED
import typings.googleCloudPubsub.googleCloudPubsubStrings.SUCCESS
import typings.googleCloudPubsub.googleCloudPubsubStrings.messageRetentionDuration
import typings.googleGax.buildSrcGaxMod.CallOptions
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcSubscriptionMod {
  
  @JSImport("@google-cloud/pubsub/build/src/subscription", "AckError")
  @js.native
  open class AckError protected ()
    extends typings.googleCloudPubsub.buildSrcSubscriberMod.AckError {
    def this(errorCode: AckResponse) = this()
    def this(errorCode: AckResponse, message: String) = this()
  }
  
  object AckResponses {
    
    @JSImport("@google-cloud/pubsub/build/src/subscription", "AckResponses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@google-cloud/pubsub/build/src/subscription", "AckResponses.FailedPrecondition")
    @js.native
    def FailedPrecondition: FAILED_PRECONDITION = js.native
    inline def FailedPrecondition_=(x: FAILED_PRECONDITION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FailedPrecondition")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub/build/src/subscription", "AckResponses.Invalid")
    @js.native
    def Invalid: INVALID = js.native
    inline def Invalid_=(x: INVALID): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Invalid")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub/build/src/subscription", "AckResponses.Other")
    @js.native
    def Other: OTHER = js.native
    inline def Other_=(x: OTHER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Other")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub/build/src/subscription", "AckResponses.PermissionDenied")
    @js.native
    def PermissionDenied: PERMISSION_DENIED = js.native
    inline def PermissionDenied_=(x: PERMISSION_DENIED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PermissionDenied")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub/build/src/subscription", "AckResponses.Success")
    @js.native
    def Success: SUCCESS = js.native
    inline def Success_=(x: SUCCESS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Success")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@google-cloud/pubsub/build/src/subscription", "Subscription")
  @js.native
  open class Subscription protected () extends EventEmitter {
    def this(pubsub: PubSub, name: String) = this()
    def this(pubsub: PubSub, name: String, options: SubscriptionOptions) = this()
    
    /**
      * Watches for incoming message event handlers and open/closes the
      * subscriber as needed.
      *
      * @private
      */
    /* private */ var _listen: Any = js.native
    
    /* private */ var _subscriber: Any = js.native
    
    /**
      * Closes the Subscription, once this is called you will no longer receive
      * message events unless you call {Subscription#open} or add new message
      * listeners.
      *
      * @param {function} [callback] The callback function.
      * @param {?error} callback.err An error returned while closing the
      *     Subscription.
      *
      * @example
      * ```
      * subscription.close(err => {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      * });
      *
      * // If the callback is omitted a Promise will be returned.
      * subscription.close().then(() => {});
      * ```
      */
    def close(): js.Promise[Unit] = js.native
    def close(callback: SubscriptionCloseCallback): Unit = js.native
    
    /**
      * Create a subscription.
      *
      * @see [Subscriptions: create API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.subscriptions/create}
      *
      * @throws {Error} If subscription name is omitted.
      *
      * @param {string} name The name of the subscription.
      * @param {CreateSubscriptionRequest} [options] See a
      *     [Subscription
      * resource](https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.subscriptions).
      * @param {CreateSubscriptionCallback} [callback] Callback function.
      * @returns {Promise<CreateSubscriptionResponse>}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      * const subscription = topic.subscription('newMessages');
      * const callback = function(err, subscription, apiResponse) {};
      *
      * subscription.create(callback);
      *
      * ```
      * @example With options
      * ```
      * subscription.create({
      *   ackDeadlineSeconds: 90
      * }, callback);
      *
      * ```
      * @example If the callback is omitted, we'll return a Promise.
      * ```
      * const [sub, apiResponse] = await subscription.create();
      * ```
      */
    def create(): js.Promise[CreateSubscriptionResponse] = js.native
    def create(callback: CreateSubscriptionCallback): Unit = js.native
    def create(options: CreateSubscriptionOptions): js.Promise[CreateSubscriptionResponse] = js.native
    def create(options: CreateSubscriptionOptions, callback: CreateSubscriptionCallback): Unit = js.native
    
    /**
      * @typedef {array} CreateSnapshotResponse
      * @property {Snapshot} 0 The new {@link Snapshot}.
      * @property {object} 1 The full API response.
      */
    /**
      * @callback CreateSnapshotCallback
      * @param {?Error} err Request error, if any.
      * @param {Snapshot} snapshot The new {@link Snapshot}.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Create a snapshot with the given name.
      *
      * @param {string} name Name of the snapshot.
      * @param {object} [gaxOpts] Request configuration options, outlined
      *     here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @param {CreateSnapshotCallback} [callback] Callback function.
      * @returns {Promise<CreateSnapshotResponse>}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      * const subscription = topic.subscription('my-subscription');
      *
      * const callback = (err, snapshot, apiResponse) => {
      *   if (!err) {
      *     // The snapshot was created successfully.
      *   }
      * };
      *
      * subscription.createSnapshot('my-snapshot', callback);
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * subscription.createSnapshot('my-snapshot').then((data) => {
      *   const snapshot = data[0];
      *   const apiResponse = data[1];
      * });
      * ```
      */
    def createSnapshot(name: String): js.Promise[CreateSnapshotResponse] = js.native
    def createSnapshot(name: String, callback: CreateSnapshotCallback): Unit = js.native
    def createSnapshot(name: String, gaxOpts: CallOptions): js.Promise[CreateSnapshotResponse] = js.native
    def createSnapshot(name: String, gaxOpts: CallOptions, callback: CreateSnapshotCallback): Unit = js.native
    
    /**
      * Delete the subscription. Pull requests from the current subscription will
      * be errored once unsubscription is complete.
      *
      * @see [Subscriptions: delete API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.subscriptions/delete}
      *
      * @param {object} [gaxOpts] Request configuration options, outlined
      *     here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @param {function} [callback] The callback function.
      * @param {?error} callback.err An error returned while making this
      *     request.
      * @param {object} callback.apiResponse Raw API response.
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      * const subscription = topic.subscription('my-subscription');
      *
      * subscription.delete((err, apiResponse) => {});
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * subscription.delete().then((data) => {
      *   const apiResponse = data[0];
      * });
      * ```
      */
    def delete(): js.Promise[EmptyResponse] = js.native
    def delete(callback: EmptyCallback): Unit = js.native
    def delete(gaxOpts: CallOptions): js.Promise[EmptyResponse] = js.native
    def delete(gaxOpts: CallOptions, callback: EmptyCallback): Unit = js.native
    
    /**
      * @typedef {array} SubscriptionDetachedResponse
      * @property {boolean} 0 Whether the subscription is detached.
      */
    /**
      * @callback SubscriptionDetachedCallback
      * @param {?Error} err Request error, if any.
      * @param {boolean} exists Whether the subscription is detached.
      */
    /**
      * Check if a subscription is detached.
      *
      * @param {SubscriptionDetachedCallback} [callback] Callback function.
      * @returns {Promise<SubscriptionDetachedResponse>}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      * const subscription = topic.subscription('my-subscription');
      *
      * subscription.detached((err, exists) => {});
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * subscription.detached().then((data) => {
      *   const detached = data[0];
      * });
      * ```
      */
    def detached(): js.Promise[DetachedResponse] = js.native
    def detached(callback: DetachedCallback): Unit = js.native
    
    /**
      * @typedef {array} SubscriptionExistsResponse
      * @property {boolean} 0 Whether the subscription exists
      */
    /**
      * @callback SubscriptionExistsCallback
      * @param {?Error} err Request error, if any.
      * @param {boolean} exists Whether the subscription exists.
      */
    /**
      * Check if a subscription exists.
      *
      * @param {SubscriptionExistsCallback} [callback] Callback function.
      * @returns {Promise<SubscriptionExistsResponse>}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      * const subscription = topic.subscription('my-subscription');
      *
      * subscription.exists((err, exists) => {});
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * subscription.exists().then((data) => {
      *   const exists = data[0];
      * });
      * ```
      */
    def exists(): js.Promise[ExistsResponse] = js.native
    def exists(callback: ExistsCallback): Unit = js.native
    
    /**
      * @typedef {array} GetSubscriptionResponse
      * @property {Subscription} 0 The {@link Subscription}.
      * @property {object} 1 The full API response.
      */
    /**
      * @callback GetSubscriptionCallback
      * @param {?Error} err Request error, if any.
      * @param {Subscription} subscription The {@link Subscription}.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Get a subscription if it exists.
      *
      * @param {object} [gaxOpts] Request configuration options, outlined
      *     here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @param {boolean} [gaxOpts.autoCreate=false] Automatically create the
      *     subscription if it does not already exist.
      * @param {GetSubscriptionCallback} [callback] Callback function.
      * @returns {Promise<GetSubscriptionResponse>}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      * const subscription = topic.subscription('my-subscription');
      *
      * subscription.get((err, subscription, apiResponse) => {
      *   // The `subscription` data has been populated.
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * subscription.get().then((data) => {
      *   const subscription = data[0];
      *   const apiResponse = data[1];
      * });
      * ```
      */
    def get(): js.Promise[GetSubscriptionResponse] = js.native
    def get(callback: GetSubscriptionCallback): Unit = js.native
    def get(gaxOpts: GetSubscriptionOptions): js.Promise[GetSubscriptionResponse] = js.native
    def get(gaxOpts: GetSubscriptionOptions, callback: GetSubscriptionCallback): Unit = js.native
    
    /**
      * @typedef {array} GetSubscriptionMetadataResponse
      * @property {object} 0 The full API response.
      */
    /**
      * @callback GetSubscriptionMetadataCallback
      * @param {?Error} err Request error, if any.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Fetches the subscriptions metadata.
      *
      * @param {object} [gaxOpts] Request configuration options, outlined
      *     here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @param {GetSubscriptionMetadataCallback} [callback] Callback function.
      * @returns {Promise<GetSubscriptionMetadataResponse>}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      * const subscription = topic.subscription('my-subscription');
      *
      * subscription.getMetadata((err, apiResponse) => {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * subscription.getMetadata().then((data) => {
      *   const apiResponse = data[0];
      * });
      * ```
      */
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
    
    var metadata: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.ISubscription */ Any
      ] = js.native
    
    /**
      * @typedef {array} ModifyPushConfigResponse
      * @property {object} 0 The full API response.
      */
    /**
      * @callback ModifyPushConfigCallback
      * @param {?Error} err Request error, if any.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Modify the push config for the subscription.
      *
      * @param {object} config The push config.
      * @param {string} config.pushEndpoint A URL locating the endpoint to which
      *     messages should be published.
      * @param {object} config.attributes [PushConfig attributes](https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#google.pubsub.v1.PushConfig).
      * @param {object} config.oidcToken If specified, Pub/Sub will generate and
      *     attach an OIDC JWT token as an `Authorization` header in the HTTP
      *     request for every pushed message. This object should have the same
      *     structure as [OidcToken]{@link google.pubsub.v1.OidcToken}
      * @param {object} [gaxOpts] Request configuration options, outlined
      *     here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @param {ModifyPushConfigCallback} [callback] Callback function.
      * @returns {Promise<ModifyPushConfigResponse>}
      *
      * @example
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const topic = pubsub.topic('my-topic');
      * const subscription = topic.subscription('my-subscription');
      *
      * const pushConfig = {
      *   pushEndpoint: 'https://mydomain.com/push',
      *   attributes: {
      *     key: 'value'
      *   },
      *   oidcToken: {
      *     serviceAccountEmail: 'myproject@appspot.gserviceaccount.com',
      *     audience: 'myaudience'
      *   }
      * };
      *
      * subscription.modifyPushConfig(pushConfig, (err, apiResponse) => {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * subscription.modifyPushConfig(pushConfig).then((data) => {
      *   const apiResponse = data[0];
      * });
      * ```
      */
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
      * ```
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
      * ```
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
    
    /**
      * @typedef {array} SeekResponse
      * @property {object} 0 The full API response.
      */
    /**
      * @callback SeekCallback
      * @param {?Error} err Request error, if any.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Seeks an existing subscription to a point in time or a given snapshot.
      *
      * @param {string|date} snapshot The point to seek to. This will accept the
      *     name of the snapshot or a Date object.
      * @param {object} [gaxOpts] Request configuration options, outlined
      *     here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @param {SeekCallback} [callback] Callback function.
      * @returns {Promise<SeekResponse>}
      *
      * @example
      * ```
      * const callback = (err, resp) => {
      *   if (!err) {
      *     // Seek was successful.
      *   }
      * };
      *
      * subscription.seek('my-snapshot', callback);
      *
      * //-
      * // Alternatively, to specify a certain point in time, you can provide a
      * Date
      * // object.
      * //-
      * const date = new Date('October 21 2015');
      *
      * subscription.seek(date, callback);
      * ```
      */
    def seek(snapshot: String): js.Promise[SeekResponse] = js.native
    def seek(snapshot: String, callback: SeekCallback): Unit = js.native
    def seek(snapshot: String, gaxOpts: CallOptions): js.Promise[SeekResponse] = js.native
    def seek(snapshot: String, gaxOpts: CallOptions, callback: SeekCallback): Unit = js.native
    def seek(snapshot: js.Date): js.Promise[SeekResponse] = js.native
    def seek(snapshot: js.Date, callback: SeekCallback): Unit = js.native
    def seek(snapshot: js.Date, gaxOpts: CallOptions): js.Promise[SeekResponse] = js.native
    def seek(snapshot: js.Date, gaxOpts: CallOptions, callback: SeekCallback): Unit = js.native
    
    /**
      * @typedef {array} SetSubscriptionMetadataResponse
      * @property {object} 0 The full API response.
      */
    /**
      * @callback SetSubscriptionMetadataCallback
      * @param {?Error} err Request error, if any.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Update the subscription object.
      *
      * @param {object} metadata The subscription metadata.
      * @param {object} [gaxOpts] Request configuration options, outlined
      *     here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @param {SetSubscriptionMetadataCallback} [callback] Callback function.
      * @returns {Promise<SetSubscriptionMetadataResponse>}
      *
      * @example
      * ```
      * const metadata = {
      *   key: 'value'
      * };
      *
      * subscription.setMetadata(metadata, (err, apiResponse) => {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * subscription.setMetadata(metadata).then((data) => {
      *   const apiResponse = data[0];
      * });
      * ```
      */
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
      * ```
      * const snapshot = subscription.snapshot('my-snapshot');
      * ```
      */
    def snapshot(name: String): Snapshot = js.native
    
    var topic: js.UndefOr[Topic | String] = js.native
  }
  /* static members */
  object Subscription {
    
    @JSImport("@google-cloud/pubsub/build/src/subscription", "Subscription")
    @js.native
    val ^ : js.Any = js.native
    
    /*!
      * Formats Subscription metadata.
      *
      * @private
      */
    inline def formatMetadata_(metadata: SubscriptionMetadata): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("formatMetadata_")(metadata.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /*!
      * Format the name of a subscription. A subscription's full name is in the
      * format of projects/{projectId}/subscriptions/{subName}.
      *
      * @private
      */
    inline def formatName_(projectId: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(projectId.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  type CreateSubscriptionCallback = SubscriptionCallback
  
  type CreateSubscriptionOptions = SubscriptionMetadata & FlowControl
  
  type CreateSubscriptionResponse = SubscriptionResponse
  
  type DetachSubscriptionCallback = EmptyCallback
  
  type DetachSubscriptionResponse = EmptyResponse
  
  type GetSubscriptionCallback = SubscriptionCallback
  
  type GetSubscriptionMetadataCallback = MetadataCallback
  
  type GetSubscriptionMetadataResponse = MetadataResponse
  
  trait GetSubscriptionOptions
    extends StObject
       with CallOptions {
    
    var autoCreate: js.UndefOr[Boolean] = js.undefined
  }
  object GetSubscriptionOptions {
    
    inline def apply(): GetSubscriptionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSubscriptionOptions]
    }
    
    extension [Self <: GetSubscriptionOptions](x: Self) {
      
      inline def setAutoCreate(value: Boolean): Self = StObject.set(x, "autoCreate", value.asInstanceOf[js.Any])
      
      inline def setAutoCreateUndefined: Self = StObject.set(x, "autoCreate", js.undefined)
    }
  }
  
  type GetSubscriptionResponse = SubscriptionResponse
  
  type MetadataCallback = RequestCallback[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.ISubscription */ Any, 
    Unit
  ]
  
  type MetadataResponse = js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.ISubscription */ Any
  ]
  
  type OidcToken = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.PushConfig.IOidcToken */ Any
  
  type PushConfig = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.IPushConfig */ Any
  
  type SetSubscriptionMetadataCallback = MetadataCallback
  
  type SetSubscriptionMetadataResponse = MetadataResponse
  
  type SubscriptionCallback = ResourceCallback[
    Subscription, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.ISubscription */ Any
  ]
  
  type SubscriptionCloseCallback = js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  
  type SubscriptionMetadata = MessageRetentionDuration & (Omit[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.ISubscription */ Any, 
    messageRetentionDuration
  ])
  
  trait SubscriptionOptions
    extends StObject
       with SubscriberOptions {
    
    var topic: js.UndefOr[Topic] = js.undefined
  }
  object SubscriptionOptions {
    
    inline def apply(): SubscriptionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscriptionOptions]
    }
    
    extension [Self <: SubscriptionOptions](x: Self) {
      
      inline def setTopic(value: Topic): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
  
  type SubscriptionResponse = js.Tuple2[
    Subscription, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.ISubscription */ Any
  ]
}
