package typings.fastRatelimit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FastRateLimitOptions extends js.Object {
  var threshold: Double = js.native
    // available tokens over timespan
  var ttl: Double = js.native
}

object FastRateLimitOptions {
  @scala.inline
  def apply(threshold: Double, ttl: Double): FastRateLimitOptions = {
    val __obj = js.Dynamic.literal(threshold = threshold.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastRateLimitOptions]
  }
  @scala.inline
  implicit class FastRateLimitOptionsOps[Self <: FastRateLimitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
  }
  
}

