package typings.googleCloudKms.mod.GAX

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
    val __obj = js.Dynamic.literal(initialRetryDelayMillis = initialRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis = initialRpcTimeoutMillis.asInstanceOf[js.Any], maxRetryDelayMillis = maxRetryDelayMillis.asInstanceOf[js.Any], maxRpcTimeoutMillis = maxRpcTimeoutMillis.asInstanceOf[js.Any], retryDelayMultiplier = retryDelayMultiplier.asInstanceOf[js.Any], totalTimeoutMillis = totalTimeoutMillis.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BackoffSettings]
  }
}

