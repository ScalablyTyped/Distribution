package typings.googleCloudPubsub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxDelayMillis extends js.Object {
  var maxDelayMillis: Double
  var maxOutstandingBytes: Double
  var maxOutstandingMessages: Double
}

object MaxDelayMillis {
  @scala.inline
  def apply(maxDelayMillis: Double, maxOutstandingBytes: Double, maxOutstandingMessages: Double): MaxDelayMillis = {
    val __obj = js.Dynamic.literal(maxDelayMillis = maxDelayMillis.asInstanceOf[js.Any], maxOutstandingBytes = maxOutstandingBytes.asInstanceOf[js.Any], maxOutstandingMessages = maxOutstandingMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxDelayMillis]
  }
}

