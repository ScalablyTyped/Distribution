package typings.expressRateLimit.mod.global.Express

import typings.expressRateLimit.mod.RateLimitInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends js.Object {
  
  /**
    * property is added to all requests with the limit, current,
    * and remaining number of requests and, if the store provides it, a resetTime Date object.
    * These may be used in your application code to take additional actions or inform the user of their status
    */
  var rateLimit: RateLimitInfo = js.native
}
object Request {
  
  @scala.inline
  def apply(rateLimit: RateLimitInfo): Request = {
    val __obj = js.Dynamic.literal(rateLimit = rateLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    
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
    def setRateLimit(value: RateLimitInfo): Self = this.set("rateLimit", value.asInstanceOf[js.Any])
  }
}
