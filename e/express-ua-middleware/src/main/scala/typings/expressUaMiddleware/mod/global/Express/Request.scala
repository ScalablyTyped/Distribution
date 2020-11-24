package typings.expressUaMiddleware.mod.global.Express

import typings.expressUaMiddleware.mod.UserAgent
import typings.expressUaMiddleware.mod.UserAgentRaw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends js.Object {
  
  var userAgent: UserAgent with UserAgentRaw = js.native
  
  def userAgentFromString(raw: String): UserAgent = js.native
}
object Request {
  
  @scala.inline
  def apply(userAgent: UserAgent with UserAgentRaw, userAgentFromString: String => UserAgent): Request = {
    val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any], userAgentFromString = js.Any.fromFunction1(userAgentFromString))
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
    def setUserAgent(value: UserAgent with UserAgentRaw): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgentFromString(value: String => UserAgent): Self = this.set("userAgentFromString", js.Any.fromFunction1(value))
  }
}
