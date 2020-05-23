package typings.expressRateLimit.mod.global.Express

import typings.expressRateLimit.mod.RateLimitInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  /**
    * property is added to all requests with the limit, current,
    * and remaining number of requests and, if the store provides it, a resetTime Date object.
    * These may be used in your application code to take additional actions or inform the user of their status
    */
  var rateLimit: RateLimitInfo
}

object Request {
  @scala.inline
  def apply(rateLimit: RateLimitInfo): Request = {
    val __obj = js.Dynamic.literal(rateLimit = rateLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

