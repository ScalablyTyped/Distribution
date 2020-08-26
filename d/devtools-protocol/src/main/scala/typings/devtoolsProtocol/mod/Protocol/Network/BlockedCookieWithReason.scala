package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockedCookieWithReason extends js.Object {
  /**
    * The reason(s) the cookie was blocked.
    */
  var blockedReasons: js.Array[CookieBlockedReason] = js.native
  /**
    * The cookie object representing the cookie which was not sent.
    */
  var cookie: Cookie = js.native
}

object BlockedCookieWithReason {
  @scala.inline
  def apply(blockedReasons: js.Array[CookieBlockedReason], cookie: Cookie): BlockedCookieWithReason = {
    val __obj = js.Dynamic.literal(blockedReasons = blockedReasons.asInstanceOf[js.Any], cookie = cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockedCookieWithReason]
  }
  @scala.inline
  implicit class BlockedCookieWithReasonOps[Self <: BlockedCookieWithReason] (val x: Self) extends AnyVal {
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
    def setBlockedReasonsVarargs(value: CookieBlockedReason*): Self = this.set("blockedReasons", js.Array(value :_*))
    @scala.inline
    def setBlockedReasons(value: js.Array[CookieBlockedReason]): Self = this.set("blockedReasons", value.asInstanceOf[js.Any])
    @scala.inline
    def setCookie(value: Cookie): Self = this.set("cookie", value.asInstanceOf[js.Any])
  }
  
}

