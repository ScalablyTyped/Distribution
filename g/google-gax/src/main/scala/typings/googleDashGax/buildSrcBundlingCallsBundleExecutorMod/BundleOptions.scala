package typings.googleDashGax.buildSrcBundlingCallsBundleExecutorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BundleOptions extends js.Object {
  var delayThreshold: Double
  var elementCountLimit: Double
  var elementCountThreshold: Double
  var requestByteLimit: Double
  var requestByteThreshold: Double
}

object BundleOptions {
  @scala.inline
  def apply(
    delayThreshold: Double,
    elementCountLimit: Double,
    elementCountThreshold: Double,
    requestByteLimit: Double,
    requestByteThreshold: Double
  ): BundleOptions = {
    val __obj = js.Dynamic.literal(delayThreshold = delayThreshold.asInstanceOf[js.Any], elementCountLimit = elementCountLimit.asInstanceOf[js.Any], elementCountThreshold = elementCountThreshold.asInstanceOf[js.Any], requestByteLimit = requestByteLimit.asInstanceOf[js.Any], requestByteThreshold = requestByteThreshold.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BundleOptions]
  }
}

