package typings.atGoogleDashCloudPubsub.buildSrcMessageDashQueuesMod

import typings.atGoogleDashCloudPubsub.buildSrcSubscriberMod.Message
import typings.atGoogleDashCloudPubsub.buildSrcSubscriberMod.Subscriber
import typings.node.NodeJS.Timer
import typings.pDashDefer.pDashDeferMod.DeferredPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/message-queues", "MessageQueue")
@js.native
abstract class MessageQueue protected () extends js.Object {
  def this(sub: Subscriber) = this()
  def this(sub: Subscriber, options: BatchOptions) = this()
  var _onFlush: js.UndefOr[DeferredPromise[Unit]] = js.native
  var _options: BatchOptions = js.native
  var _requests: QueuedMessages = js.native
  var _subscriber: Subscriber = js.native
  var _timer: js.UndefOr[Timer] = js.native
  /**
    * Gets the default buffer time in ms.
    *
    * @returns {number}
    * @private
    */
  val maxMilliseconds: Double = js.native
  var numPendingRequests: Double = js.native
  /* protected */ def _sendBatch(batch: QueuedMessages): js.Promise[Unit] = js.native
  /**
    * Adds a message to the queue.
    *
    * @param {Message} message The message to add.
    * @param {number} [deadline] The deadline.
    * @private
    */
  def add(hasAckId: Message): Unit = js.native
  def add(hasAckId: Message, deadline: Double): Unit = js.native
  /**
    * Sends a batch of messages.
    * @private
    */
  def flush(): js.Promise[Unit] = js.native
  /**
    * Returns a promise that resolves after the next flush occurs.
    *
    * @returns {Promise}
    * @private
    */
  def onFlush(): js.Promise[Unit] = js.native
  /**
    * Set the batching options.
    *
    * @param {BatchOptions} options Batching options.
    * @private
    */
  def setOptions(options: BatchOptions): Unit = js.native
}

