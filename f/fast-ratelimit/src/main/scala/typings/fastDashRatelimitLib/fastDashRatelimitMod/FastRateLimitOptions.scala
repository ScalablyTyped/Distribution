package typings
package fastDashRatelimitLib.fastDashRatelimitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastRateLimitOptions extends js.Object {
  var threshold: scala.Double
    // available tokens over timespan
  var ttl: scala.Double
}

object FastRateLimitOptions {
  @scala.inline
  def apply(threshold: scala.Double, ttl: scala.Double): FastRateLimitOptions = {
    val __obj = js.Dynamic.literal(threshold = threshold, ttl = ttl)
  
    __obj.asInstanceOf[FastRateLimitOptions]
  }
}

