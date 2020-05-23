package typings.googleCloudPubsub.subscriptionMod

import typings.googleCloudPubsub.anon.FnCall
import typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.ISubscription
import typings.googleCloudPubsub.snapshotMod.CreateSnapshotCallback
import typings.googleCloudPubsub.snapshotMod.CreateSnapshotResponse
import typings.googleCloudPubsub.snapshotMod.SeekCallback
import typings.googleCloudPubsub.snapshotMod.SeekResponse
import typings.googleCloudPubsub.snapshotMod.Snapshot
import typings.googleCloudPubsub.srcIamMod.IAM
import typings.googleCloudPubsub.srcPubsubMod.EmptyCallback
import typings.googleCloudPubsub.srcPubsubMod.EmptyResponse
import typings.googleCloudPubsub.srcPubsubMod.ExistsCallback
import typings.googleCloudPubsub.srcPubsubMod.ExistsResponse
import typings.googleCloudPubsub.srcPubsubMod.PubSub
import typings.googleCloudPubsub.srcPubsubMod.RequestCallback
import typings.googleCloudPubsub.srcPubsubMod.RequestConfig
import typings.googleCloudPubsub.subscriberMod.SubscriberOptions
import typings.googleCloudPubsub.topicMod.Topic
import typings.googleGax.gaxMod.CallOptions
import typings.node.eventsMod.EventEmitter
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var iam: IAM = js.native
  /**
    * Indicates if the Subscription is open and receiving messages.
    *
    * @type {boolean}
    */
  val isOpen: Boolean = js.native
  var metadata: js.UndefOr[ISubscription] = js.native
  var name: String = js.native
  /**
    * @type {string}
    */
  val projectId: String = js.native
  var pubsub: PubSub = js.native
  @JSName("request")
  var request_Original: FnCall = js.native
  var topic: js.UndefOr[Topic | String] = js.native
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
  def modifyPushConfig(config: PushConfig): js.Promise[EmptyResponse] = js.native
  def modifyPushConfig(config: PushConfig, callback: EmptyCallback): Unit = js.native
  def modifyPushConfig(config: PushConfig, gaxOpts: CallOptions): js.Promise[EmptyResponse] = js.native
  def modifyPushConfig(config: PushConfig, gaxOpts: CallOptions, callback: EmptyCallback): Unit = js.native
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
  def request[T, R](config: RequestConfig, callback: RequestCallback[T, R]): Unit = js.native
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
}

/* static members */
@JSImport("@google-cloud/pubsub/build/src/subscription", "Subscription")
@js.native
object Subscription extends js.Object {
  /*!
    * Formats Subscription metadata.
    *
    * @private
    */
  def formatMetadata_(metadata: SubscriptionMetadata): ISubscription = js.native
  /*!
    * Format the name of a subscription. A subscription's full name is in the
    * format of projects/{projectId}/subscriptions/{subName}.
    *
    * @private
    */
  def formatName_(projectId: String, name: String): String = js.native
}

