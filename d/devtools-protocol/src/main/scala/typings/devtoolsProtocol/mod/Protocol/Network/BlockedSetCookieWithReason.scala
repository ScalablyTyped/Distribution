package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockedSetCookieWithReason extends js.Object {
  /**
    * The reason(s) this cookie was blocked.
    */
  var blockedReasons: js.Array[SetCookieBlockedReason] = js.native
  /**
    * The cookie object which represents the cookie which was not stored. It is optional because
    * sometimes complete cookie information is not available, such as in the case of parsing
    * errors.
    */
  var cookie: js.UndefOr[Cookie] = js.native
  /**
    * The string representing this individual cookie as it would appear in the header.
    * This is not the entire "cookie" or "set-cookie" header which could have multiple cookies.
    */
  var cookieLine: String = js.native
}

object BlockedSetCookieWithReason {
  @scala.inline
  def apply(blockedReasons: js.Array[SetCookieBlockedReason], cookieLine: String): BlockedSetCookieWithReason = {
    val __obj = js.Dynamic.literal(blockedReasons = blockedReasons.asInstanceOf[js.Any], cookieLine = cookieLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockedSetCookieWithReason]
  }
  @scala.inline
  implicit class BlockedSetCookieWithReasonOps[Self <: BlockedSetCookieWithReason] (val x: Self) extends AnyVal {
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
    def setBlockedReasonsVarargs(value: SetCookieBlockedReason*): Self = this.set("blockedReasons", js.Array(value :_*))
    @scala.inline
    def setBlockedReasons(value: js.Array[SetCookieBlockedReason]): Self = this.set("blockedReasons", value.asInstanceOf[js.Any])
    @scala.inline
    def setCookieLine(value: String): Self = this.set("cookieLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setCookie(value: Cookie): Self = this.set("cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
  }
  
}

