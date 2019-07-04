package typings
package firebaseDashAdminLib.adminNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the session cookie options needed for the
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#createSessionCookie `createSessionCookie()`} method.
  */
trait SessionCookieOptions extends js.Object {
  /**
    * The session cookie custom expiration in milliseconds. The minimum allowed is
    * 5 minutes and the maxium allowed is 2 weeks.
    */
  var expiresIn: scala.Double
}

object SessionCookieOptions {
  @scala.inline
  def apply(expiresIn: scala.Double): SessionCookieOptions = {
    val __obj = js.Dynamic.literal(expiresIn = expiresIn)
  
    __obj.asInstanceOf[SessionCookieOptions]
  }
}

