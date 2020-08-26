package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetCookiesRequest extends js.Object {
  /**
    * Cookies to be set.
    */
  var cookies: js.Array[CookieParam] = js.native
}

object SetCookiesRequest {
  @scala.inline
  def apply(cookies: js.Array[CookieParam]): SetCookiesRequest = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCookiesRequest]
  }
  @scala.inline
  implicit class SetCookiesRequestOps[Self <: SetCookiesRequest] (val x: Self) extends AnyVal {
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
    def setCookiesVarargs(value: CookieParam*): Self = this.set("cookies", js.Array(value :_*))
    @scala.inline
    def setCookies(value: js.Array[CookieParam]): Self = this.set("cookies", value.asInstanceOf[js.Any])
  }
  
}

