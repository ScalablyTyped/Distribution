package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.GAXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** https://googleapis.github.io/gax-nodejs/global.html#BackoffSettings */
trait BackoffSettings extends js.Object {
  var initialRetryDelayMillis: Double
  var initialRpcTimeoutMillis: Double
  var maxRetryDelayMillis: Double
  var maxRpcTimeoutMillis: Double
  var retryDelayMultiplier: Double
  var totalTimeoutMillis: Double
}

object BackoffSettings {
  @scala.inline
  def apply(
    initialRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    maxRetryDelayMillis: Double,
    maxRpcTimeoutMillis: Double,
    retryDelayMultiplier: Double,
    totalTimeoutMillis: Double
  ): BackoffSettings = {
    val __obj = js.Dynamic.literal(initialRetryDelayMillis = initialRetryDelayMillis, initialRpcTimeoutMillis = initialRpcTimeoutMillis, maxRetryDelayMillis = maxRetryDelayMillis, maxRpcTimeoutMillis = maxRpcTimeoutMillis, retryDelayMultiplier = retryDelayMultiplier, totalTimeoutMillis = totalTimeoutMillis)
  
    __obj.asInstanceOf[BackoffSettings]
  }
}

