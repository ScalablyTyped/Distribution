package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing the session cookie options needed for the
  * {@link auth.Auth.createSessionCookie `createSessionCookie()`} method.
  */
@js.native
trait SessionCookieOptions extends StObject {
  
  /**
    * The session cookie custom expiration in milliseconds. The minimum allowed is
    * 5 minutes and the maxium allowed is 2 weeks.
    */
  var expiresIn: Double = js.native
}
object SessionCookieOptions {
  
  @scala.inline
  def apply(expiresIn: Double): SessionCookieOptions = {
    val __obj = js.Dynamic.literal(expiresIn = expiresIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionCookieOptions]
  }
  
  @scala.inline
  implicit class SessionCookieOptionsMutableBuilder[Self <: SessionCookieOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
  }
}
