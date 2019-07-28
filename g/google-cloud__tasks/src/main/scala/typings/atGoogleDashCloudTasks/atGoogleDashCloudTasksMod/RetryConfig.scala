package typings.atGoogleDashCloudTasks.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryConfig extends js.Object {
  var maxAttempts: Double
  var maxBackoff: String
  var maxDoublings: Double
  var maxRetryDuration: String
  var minBackoff: String
}

object RetryConfig {
  @scala.inline
  def apply(
    maxAttempts: Double,
    maxBackoff: String,
    maxDoublings: Double,
    maxRetryDuration: String,
    minBackoff: String
  ): RetryConfig = {
    val __obj = js.Dynamic.literal(maxAttempts = maxAttempts, maxBackoff = maxBackoff, maxDoublings = maxDoublings, maxRetryDuration = maxRetryDuration, minBackoff = minBackoff)
  
    __obj.asInstanceOf[RetryConfig]
  }
}

