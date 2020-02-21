package typings.googleCloudPubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxExtensionMinutes extends js.Object {
  var maxExtensionMinutes: Double
  var maxOutstandingBytes: Double
  var maxOutstandingMessages: Double
  var maxStreams: Double
}

object AnonMaxExtensionMinutes {
  @scala.inline
  def apply(
    maxExtensionMinutes: Double,
    maxOutstandingBytes: Double,
    maxOutstandingMessages: Double,
    maxStreams: Double
  ): AnonMaxExtensionMinutes = {
    val __obj = js.Dynamic.literal(maxExtensionMinutes = maxExtensionMinutes.asInstanceOf[js.Any], maxOutstandingBytes = maxOutstandingBytes.asInstanceOf[js.Any], maxOutstandingMessages = maxOutstandingMessages.asInstanceOf[js.Any], maxStreams = maxStreams.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMaxExtensionMinutes]
  }
}

