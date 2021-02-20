package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockedCookieWithReason extends StObject {
  
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
  implicit class BlockedCookieWithReasonMutableBuilder[Self <: BlockedCookieWithReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockedReasons(value: js.Array[CookieBlockedReason]): Self = StObject.set(x, "blockedReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockedReasonsVarargs(value: CookieBlockedReason*): Self = StObject.set(x, "blockedReasons", js.Array(value :_*))
    
    @scala.inline
    def setCookie(value: Cookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
  }
}
