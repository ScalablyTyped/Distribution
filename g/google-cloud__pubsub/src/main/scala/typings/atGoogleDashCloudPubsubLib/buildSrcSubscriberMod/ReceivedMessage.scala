package typings
package atGoogleDashCloudPubsubLib.buildSrcSubscriberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.subscriptions/pull#ReceivedMessage
  */
trait ReceivedMessage extends js.Object {
  var ackId: java.lang.String
  var message: atGoogleDashCloudPubsubLib.Anon_Attributes
}

object ReceivedMessage {
  @scala.inline
  def apply(ackId: java.lang.String, message: atGoogleDashCloudPubsubLib.Anon_Attributes): ReceivedMessage = {
    val __obj = js.Dynamic.literal(ackId = ackId, message = message)
  
    __obj.asInstanceOf[ReceivedMessage]
  }
}

