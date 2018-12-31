package typings
package firefoxDashWebextDashBrowserLib.browserNs.cookiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents information about an HTTP cookie. */
trait Cookie extends js.Object {
  /** The domain of the cookie (e.g. "www.google.com", "example.com"). */
  var domain: java.lang.String
  /**
    * The expiration date of the cookie as the number of seconds since the UNIX epoch. Not provided for session
    * cookies.
    */
  var expirationDate: js.UndefOr[scala.Double] = js.undefined
  /** The first-party domain of the cookie. */
  var firstPartyDomain: java.lang.String
  /**
    * True if the cookie is a host-only cookie (i.e. a request's host must exactly match the domain of the cookie).
    */
  var hostOnly: scala.Boolean
  /** True if the cookie is marked as HttpOnly (i.e. the cookie is inaccessible to client-side scripts). */
  var httpOnly: scala.Boolean
  /** The name of the cookie. */
  var name: java.lang.String
  /** The path of the cookie. */
  var path: java.lang.String
  /** The cookie's same-site status (i.e. whether the cookie is sent with cross-site requests). */
  var sameSite: SameSiteStatus
  /**
    * True if the cookie is marked as Secure (i.e. its scope is limited to secure channels, typically HTTPS).
    */
  var secure: scala.Boolean
  /** True if the cookie is a session cookie, as opposed to a persistent cookie with an expiration date. */
  var session: scala.Boolean
  /** The ID of the cookie store containing this cookie, as provided in getAllCookieStores(). */
  var storeId: java.lang.String
  /** The value of the cookie. */
  var value: java.lang.String
}

