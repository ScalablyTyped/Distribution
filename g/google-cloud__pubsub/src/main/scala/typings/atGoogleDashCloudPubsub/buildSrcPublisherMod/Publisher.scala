package typings.atGoogleDashCloudPubsub.buildSrcPublisherMod

import typings.atGoogleDashCloudPubsub.buildSrcPublisherMessageDashQueuesMod.OrderedQueue
import typings.atGoogleDashCloudPubsub.buildSrcPublisherMessageDashQueuesMod.Queue
import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.Topic
import typings.node.Buffer
import typings.std.Map
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/publisher", "Publisher")
@js.native
class Publisher protected () extends js.Object {
  def this(topic: Topic) = this()
  def this(topic: Topic, options: PublishOptions) = this()
  var Promise: js.UndefOr[PromiseConstructor] = js.native
  var orderedQueues: Map[String, OrderedQueue] = js.native
  var queue: Queue = js.native
  var settings: PublishOptions = js.native
  var topic: Topic = js.native
  def publish(data: Buffer): js.Promise[String] = js.native
  def publish(data: Buffer, attributes: Attributes): js.Promise[String] = js.native
  def publish(data: Buffer, attributes: Attributes, callback: PublishCallback): Unit = js.native
  def publish(data: Buffer, callback: PublishCallback): Unit = js.native
  /**
    * Publish the provided message.
    *
    * @private
    *
    * @throws {TypeError} If data is not a Buffer object.
    * @throws {TypeError} If any value in `attributes` object is not a string.
    *
    * @param {PubsubMessage} [message] Options for this message.
    * @param {PublishCallback} [callback] Callback function.
    */
  def publishMessage(message: PubsubMessage, callback: PublishCallback): Unit = js.native
  /**
    * Indicates to the publisher that it is safe to continue publishing for the
    * supplied ordering key.
    *
    * @private
    *
    * @param {string} key The ordering key to continue publishing for.
    */
  def resumePublishing(key: String): Unit = js.native
  /**
    * Sets the Publisher options.
    *
    * @private
    *
    * @param {PublishOptions} options The publisher options.
    */
  def setOptions(): Unit = js.native
  def setOptions(options: PublishOptions): Unit = js.native
}

