package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryConfig extends js.Object {
  var maxAttempts: scala.Double
  var maxBackoff: java.lang.String
  var maxDoublings: scala.Double
  var maxRetryDuration: java.lang.String
  var minBackoff: java.lang.String
}

object RetryConfig {
  @scala.inline
  def apply(
    maxAttempts: scala.Double,
    maxBackoff: java.lang.String,
    maxDoublings: scala.Double,
    maxRetryDuration: java.lang.String,
    minBackoff: java.lang.String
  ): RetryConfig = {
    val __obj = js.Dynamic.literal(maxAttempts = maxAttempts, maxBackoff = maxBackoff, maxDoublings = maxDoublings, maxRetryDuration = maxRetryDuration, minBackoff = minBackoff)
  
    __obj.asInstanceOf[RetryConfig]
  }
}

