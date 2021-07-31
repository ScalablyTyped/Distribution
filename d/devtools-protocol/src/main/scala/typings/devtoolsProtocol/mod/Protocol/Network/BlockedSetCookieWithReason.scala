package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockedSetCookieWithReason extends StObject {
  
  /**
    * The reason(s) this cookie was blocked.
    */
  var blockedReasons: js.Array[SetCookieBlockedReason]
  
  /**
    * The cookie object which represents the cookie which was not stored. It is optional because
    * sometimes complete cookie information is not available, such as in the case of parsing
    * errors.
    */
  var cookie: js.UndefOr[Cookie] = js.undefined
  
  /**
    * The string representing this individual cookie as it would appear in the header.
    * This is not the entire "cookie" or "set-cookie" header which could have multiple cookies.
    */
  var cookieLine: String
}
object BlockedSetCookieWithReason {
  
  @scala.inline
  def apply(blockedReasons: js.Array[SetCookieBlockedReason], cookieLine: String): BlockedSetCookieWithReason = {
    val __obj = js.Dynamic.literal(blockedReasons = blockedReasons.asInstanceOf[js.Any], cookieLine = cookieLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockedSetCookieWithReason]
  }
  
  @scala.inline
  implicit class BlockedSetCookieWithReasonMutableBuilder[Self <: BlockedSetCookieWithReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockedReasons(value: js.Array[SetCookieBlockedReason]): Self = StObject.set(x, "blockedReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockedReasonsVarargs(value: SetCookieBlockedReason*): Self = StObject.set(x, "blockedReasons", js.Array(value :_*))
    
    @scala.inline
    def setCookie(value: Cookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieLine(value: String): Self = StObject.set(x, "cookieLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
  }
}
