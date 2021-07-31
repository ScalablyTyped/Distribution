package typings.googleCloudPubsub.mod

import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IReceivedMessage
import typings.googleCloudPubsub.subscriberMod.Subscriber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/pubsub", "Message")
@js.native
class Message protected ()
  extends typings.googleCloudPubsub.subscriberMod.Message {
  /**
    * @hideconstructor
    *
    * @param {Subscriber} sub The parent subscriber.
    * @param {object} message The raw message response.
    */
  def this(sub: Subscriber, hasAckIdMessageDeliveryAttempt: IReceivedMessage) = this()
}
