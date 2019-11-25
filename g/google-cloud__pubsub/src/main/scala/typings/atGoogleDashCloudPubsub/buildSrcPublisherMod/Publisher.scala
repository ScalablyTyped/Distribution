package typings.atGoogleDashCloudPubsub.buildSrcPublisherMod

import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.Topic
import typings.node.Buffer
import typings.node.NodeJS.Timer
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
  var inventory_ : Inventory = js.native
  var settings: PublishOptions = js.native
  var timeoutHandle_ : js.UndefOr[Timer] = js.native
  var topic: Topic = js.native
  /**
    * @typedef {array} PublishResponse
    * @property {string} 0 The id for the message.
    */
  /**
    * @callback PublishCallback
    * @param {?Error} err Request error, if any.
    * @param {string} messageId The id for the message.
    */
  /**
    * Publish the provided message.
    *
    * @private
    *
    * @throws {TypeError} If data is not a Buffer object.
    * @throws {TypeError} If any value in `attributes` object is not a string.
    *
    * @param {buffer} data The message data. This must come in the form of a
    *     Buffer object.
    * @param {object.<string, string>} [attributes] Attributes for this message.
    * @param {PublishCallback} [callback] Callback function.
    * @returns {Promise<PublishResponse>}
    *
    * @example
    * const {PubSub} = require('@google-cloud/pubsub');
    * const pubsub = new PubSub();
    *
    * const topic = pubsub.topic('my-topic');
    * const publisher = topic.publisher();
    *
    * const data = Buffer.from('Hello, world!');
    *
    * const callback = (err, messageId) => {
    *   if (err) {
    *     // Error handling omitted.
    *   }
    * };
    *
    * publisher.publish(data, callback);
    *
    * //-
    * // Optionally you can provide an object containing attributes for the
    * // message. Note that all values in the object must be strings.
    * //-
    * const attributes = {
    *   key: 'value'
    * };
    *
    * publisher.publish(data, attributes, callback);
    *
    * //-
    * // If the callback is omitted, we'll return a Promise.
    * //-
    * publisher.publish(data).then((messageId) => {});
    */
  def publish(data: Buffer): js.Promise[String] = js.native
  def publish(data: Buffer, attributes: Attributes): js.Promise[String] = js.native
  def publish(data: Buffer, attributes: Attributes, callback: PublishCallback): Unit = js.native
  def publish(data: Buffer, callback: PublishCallback): Unit = js.native
  /**
    * This publishes a batch of messages and should never be called directly.
    *
    * @private
    */
  def publish_(): Unit = js.native
  /**
    * Queues message to be sent to the server.
    *
    * @private
    *
    * @param {buffer} data The message data.
    * @param {object} attributes The message attributes.
    * @param {function} callback The callback function.
    */
  def queue_(data: Buffer, attrs: Attributes): js.Promise[String] = js.native
  def queue_(data: Buffer, attrs: Attributes, callback: PublishCallback): Unit = js.native
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

