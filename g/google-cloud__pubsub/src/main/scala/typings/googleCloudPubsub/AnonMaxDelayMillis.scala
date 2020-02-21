package typings.googleCloudPubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxDelayMillis extends js.Object {
  var maxDelayMillis: Double
  var maxOutstandingBytes: Double
  var maxOutstandingMessages: Double
}

object AnonMaxDelayMillis {
  @scala.inline
  def apply(maxDelayMillis: Double, maxOutstandingBytes: Double, maxOutstandingMessages: Double): AnonMaxDelayMillis = {
    val __obj = js.Dynamic.literal(maxDelayMillis = maxDelayMillis.asInstanceOf[js.Any], maxOutstandingBytes = maxOutstandingBytes.asInstanceOf[js.Any], maxOutstandingMessages = maxOutstandingMessages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMaxDelayMillis]
  }
}

