package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing the session cookie options needed for the
  * {@link auth.Auth.createSessionCookie `createSessionCookie()`} method.
  */
trait SessionCookieOptions extends StObject {
  
  /**
    * The session cookie custom expiration in milliseconds. The minimum allowed is
    * 5 minutes and the maxium allowed is 2 weeks.
    */
  var expiresIn: Double
}
object SessionCookieOptions {
  
  inline def apply(expiresIn: Double): SessionCookieOptions = {
    val __obj = js.Dynamic.literal(expiresIn = expiresIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionCookieOptions]
  }
  
  extension [Self <: SessionCookieOptions](x: Self) {
    
    inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
  }
}
