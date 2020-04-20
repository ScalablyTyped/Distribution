package typings.firebaseAdmin.admin.auth

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
  var expiresIn: Double
}

object SessionCookieOptions {
  @scala.inline
  def apply(expiresIn: Double): SessionCookieOptions = {
    val __obj = js.Dynamic.literal(expiresIn = expiresIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionCookieOptions]
  }
}

