package typings
package atGoogleDashCloudPubsubLib.buildSrcPublisherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/publisher", "Publisher")
@js.native
class Publisher protected () extends js.Object {
  def this(topic: atGoogleDashCloudPubsubLib.buildSrcTopicMod.Topic) = this()
  def this(topic: atGoogleDashCloudPubsubLib.buildSrcTopicMod.Topic, options: PublishOptions) = this()
  var Promise: js.UndefOr[stdLib.PromiseConstructor] = js.native
  var inventory_ : Inventory = js.native
  var settings: PublishOptions = js.native
  var timeoutHandle_ : js.UndefOr[nodeLib.NodeJSNs.Timer] = js.native
  var topic: atGoogleDashCloudPubsubLib.buildSrcTopicMod.Topic = js.native
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
  def publish(data: nodeLib.Buffer): js.Promise[java.lang.String] = js.native
  def publish(data: nodeLib.Buffer, attributes: Attributes): js.Promise[java.lang.String] = js.native
  def publish(data: nodeLib.Buffer, attributes: Attributes, callback: PublishCallback): scala.Unit = js.native
  def publish(data: nodeLib.Buffer, callback: PublishCallback): scala.Unit = js.native
  /**
    * This publishes a batch of messages and should never be called directly.
    *
    * @private
    */
  def publish_(): scala.Unit = js.native
  /**
    * Queues message to be sent to the server.
    *
    * @private
    *
    * @param {buffer} data The message data.
    * @param {object} attributes The message attributes.
    * @param {function} callback The callback function.
    */
  def queue_(data: nodeLib.Buffer, attrs: Attributes): js.Promise[java.lang.String] = js.native
  def queue_(data: nodeLib.Buffer, attrs: Attributes, callback: PublishCallback): scala.Unit = js.native
  /**
    * Sets the Publisher options.
    *
    * @private
    *
    * @param {PublishOptions} options The publisher options.
    */
  def setOptions(): scala.Unit = js.native
  def setOptions(options: PublishOptions): scala.Unit = js.native
}

