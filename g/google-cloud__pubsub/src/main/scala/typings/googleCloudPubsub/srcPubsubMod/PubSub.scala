package typings.googleCloudPubsub.srcPubsubMod

import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.mod.GoogleAuth
import typings.googleCloudPubsub.publisherMod.PublishOptions
import typings.googleCloudPubsub.snapshotMod.Snapshot
import typings.googleCloudPubsub.subscriptionMod.CreateSubscriptionCallback
import typings.googleCloudPubsub.subscriptionMod.CreateSubscriptionOptions
import typings.googleCloudPubsub.subscriptionMod.CreateSubscriptionResponse
import typings.googleCloudPubsub.subscriptionMod.Subscription
import typings.googleCloudPubsub.subscriptionMod.SubscriptionOptions
import typings.googleCloudPubsub.topicMod.CreateTopicCallback
import typings.googleCloudPubsub.topicMod.CreateTopicResponse
import typings.googleCloudPubsub.topicMod.Topic
import typings.googleGax.gaxMod.CallOptions
import typings.googleGax.mod.ClientStub
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/pubsub", "PubSub")
@js.native
class PubSub () extends js.Object {
  def this(options: ClientConfig) = this()
  var Promise: js.UndefOr[PromiseConstructor] = js.native
  var api: StringDictionary[ClientStub] = js.native
  var auth: GoogleAuth = js.native
  var isEmulator: Boolean = js.native
  var isOpen: Boolean = js.native
  var options: ClientConfig = js.native
  var projectId: String = js.native
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
  /**
    * Determine the appropriate endpoint to use for API requests, first trying
    * the local `apiEndpoint` parameter. If the `apiEndpoint` parameter is null
    * we try Pub/Sub emulator environment variable (PUBSUB_EMULATOR_HOST),
    * otherwise the default JSON API.
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

