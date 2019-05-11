package typings
package googleDashGaxLib.buildSrcBundlingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BundleOptions extends js.Object {
  var delayThreshold: scala.Double
  var elementCountLimit: scala.Double
  var elementCountThreshold: scala.Double
  var requestByteLimit: scala.Double
  var requestByteThreshold: scala.Double
}

object BundleOptions {
  @scala.inline
  def apply(
    delayThreshold: scala.Double,
    elementCountLimit: scala.Double,
    elementCountThreshold: scala.Double,
    requestByteLimit: scala.Double,
    requestByteThreshold: scala.Double
  ): BundleOptions = {
    val __obj = js.Dynamic.literal(delayThreshold = delayThreshold, elementCountLimit = elementCountLimit, elementCountThreshold = elementCountThreshold, requestByteLimit = requestByteLimit, requestByteThreshold = requestByteThreshold)
  
    __obj.asInstanceOf[BundleOptions]
  }
}

