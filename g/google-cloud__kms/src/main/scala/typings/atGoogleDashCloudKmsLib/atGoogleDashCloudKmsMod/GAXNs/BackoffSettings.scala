package typings
package atGoogleDashCloudKmsLib.atGoogleDashCloudKmsMod.GAXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** https://googleapis.github.io/gax-nodejs/global.html#BackoffSettings */
trait BackoffSettings extends js.Object {
  var initialRetryDelayMillis: scala.Double
  var initialRpcTimeoutMillis: scala.Double
  var maxRetryDelayMillis: scala.Double
  var maxRpcTimeoutMillis: scala.Double
  var retryDelayMultiplier: scala.Double
  var totalTimeoutMillis: scala.Double
}

object BackoffSettings {
  @scala.inline
  def apply(
    initialRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Double,
    maxRetryDelayMillis: scala.Double,
    maxRpcTimeoutMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    totalTimeoutMillis: scala.Double
  ): BackoffSettings = {
    val __obj = js.Dynamic.literal(initialRetryDelayMillis = initialRetryDelayMillis, initialRpcTimeoutMillis = initialRpcTimeoutMillis, maxRetryDelayMillis = maxRetryDelayMillis, maxRpcTimeoutMillis = maxRpcTimeoutMillis, retryDelayMultiplier = retryDelayMultiplier, totalTimeoutMillis = totalTimeoutMillis)
  
    __obj.asInstanceOf[BackoffSettings]
  }
}

