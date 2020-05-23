package typings.googleCloudPubsub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxExtensionMinutes extends js.Object {
  var maxExtensionMinutes: Double
  var maxOutstandingBytes: Double
  var maxOutstandingMessages: Double
  var maxStreams: Double
}

object MaxExtensionMinutes {
  @scala.inline
  def apply(
    maxExtensionMinutes: Double,
    maxOutstandingBytes: Double,
    maxOutstandingMessages: Double,
    maxStreams: Double
  ): MaxExtensionMinutes = {
    val __obj = js.Dynamic.literal(maxExtensionMinutes = maxExtensionMinutes.asInstanceOf[js.Any], maxOutstandingBytes = maxOutstandingBytes.asInstanceOf[js.Any], maxOutstandingMessages = maxOutstandingMessages.asInstanceOf[js.Any], maxStreams = maxStreams.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxExtensionMinutes]
  }
}

