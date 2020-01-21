package typings.googleCloudPubsub.messageBatchMod

import typings.googleCloudPubsub.publisherMod.PublishCallback
import typings.googleCloudPubsub.publisherMod.PubsubMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/publisher/message-batch", "MessageBatch")
@js.native
class MessageBatch protected () extends js.Object {
  def this(options: BatchPublishOptions) = this()
  var bytes: Double = js.native
  var callbacks: js.Array[PublishCallback] = js.native
  var created: Double = js.native
  var messages: js.Array[PubsubMessage] = js.native
  var options: BatchPublishOptions = js.native
  /**
    * Adds a message to the current batch.
    *
    * @param {object} message The message to publish.
    * @param {PublishCallback} callback The callback function.
    */
  def add(message: PubsubMessage, callback: PublishCallback): Unit = js.native
  /**
    * Indicates if a given message can fit in the batch.
    *
    * @param {object} message The message in question.
    * @returns {boolean}
    */
  def canFit(hasData: PubsubMessage): Boolean = js.native
  /**
    * Checks to see if this batch is at the maximum allowed payload size.
    * When publishing ordered messages, it is ok to exceed the user configured
    * thresholds while a batch is in flight.
    *
    * @returns {boolean}
    */
  def isAtMax(): Boolean = js.native
  /**
    * Indicates if the batch is at capacity.
    *
    * @returns {boolean}
    */
  def isFull(): Boolean = js.native
}

