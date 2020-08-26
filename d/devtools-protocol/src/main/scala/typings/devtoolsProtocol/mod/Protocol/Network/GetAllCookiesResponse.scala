package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAllCookiesResponse extends js.Object {
  /**
    * Array of cookie objects.
    */
  var cookies: js.Array[Cookie] = js.native
}

object GetAllCookiesResponse {
  @scala.inline
  def apply(cookies: js.Array[Cookie]): GetAllCookiesResponse = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAllCookiesResponse]
  }
  @scala.inline
  implicit class GetAllCookiesResponseOps[Self <: GetAllCookiesResponse] (val x: Self) extends AnyVal {
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
    def setCookiesVarargs(value: Cookie*): Self = this.set("cookies", js.Array(value :_*))
    @scala.inline
    def setCookies(value: js.Array[Cookie]): Self = this.set("cookies", value.asInstanceOf[js.Any])
  }
  
}

