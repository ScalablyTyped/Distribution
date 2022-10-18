package typings.googleCloudPubsub

import typings.googleCloudPubsub.buildSrcPublisherMod.Publisher
import typings.googleCloudPubsub.buildSrcPublisherPubsubMessageMod.PubsubMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPublisherFlowPublisherMod {
  
  @JSImport("@google-cloud/pubsub/build/src/publisher/flow-publisher", "FlowControlledPublisher")
  @js.native
  open class FlowControlledPublisher protected () extends StObject {
    def this(publisher: Publisher) = this()
    
    /**
      * Returns a Promise that will resolve to all of the currently sent
      * message IDs (or reject if there is an error). This also clears
      * out any currently sent messages, so the next call to `all()` will
      * be a clean slate.
      *
      * @returns {Promise<string[]>} A Promise that resolves when all current
      *   messages are sent.
      */
    def all(): js.Promise[js.Array[String]] = js.native
    
    /* private */ var doPublish: Any = js.native
    
    /* private */ var flowControl: Any = js.native
    
    /* private */ var idPromises: Any = js.native
    
    /**
      * Publishes a message, subject to flow control restrictions.
      *
      * If the message can be sent immediately, this will return `null`. Otherwise,
      * it will return a Promise<void> that resolves after it's okay to resume
      * calling the method.
      *
      * @param {Buffer} [data] The message contents to be sent.
      * @param {Attributes} [attributes] Optional attributes.
      * @returns null, or a Promise that resolves when sending may resume.
      *
      * @example
      * ```
      * const wait = flowControlled.publish({data});
      * if (wait) {
      *   await wait;
      * }
      *
      * ```
      * @example
      * ```
      * // It's okay to await unconditionally, it's equivalent to nextTick().
      * await flowControlled.publish(data);
      * ```
      */
    def publish(message: PubsubMessage): js.Promise[Unit] | Null = js.native
    
    /**
      * Publishes a message unconditionally, updating flow control counters.
      *
      * You'll generally only want to use this if you want to deal with timing the
      * flow control yourself, but you'd like the library to do the bean counting.
      *
      * @param {Buffer} [data] The message contents to be sent.
      * @param {Attributes} [attributes] Optional attributes.
      *
      * @example
      * ```
      * if (!flowControlled.wouldExceed(data)) {
      *   flowControlled.publishNow(data);
      * }
      * ```
      */
    def publishNow(message: PubsubMessage): Unit = js.native
    
    /* private */ var publisher: Any = js.native
    
    /**
      * Returns true if sending the specified Buffer would result in exceeding the
      * limits of the flow control settings.
      *
      * @param {PubsubMessage} message The data buffer with the message's contents.
      * @returns {boolean} True if the message would exceed flow control limits.
      */
    def wouldExceed(message: PubsubMessage): Boolean = js.native
  }
}
