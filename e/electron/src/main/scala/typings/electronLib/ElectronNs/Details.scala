package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Details extends js.Object {
  /**
    * The domain of the cookie. Empty by default if omitted.
    */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The expiration date of the cookie as the number of seconds since the UNIX epoch.
    * If omitted then the cookie becomes a session cookie and will not be retained
    * between sessions.
    */
  var expirationDate: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether the cookie should be marked as HTTP only. Defaults to false.
    */
  var httpOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the cookie. Empty by default if omitted.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The path of the cookie. Empty by default if omitted.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the cookie should be marked as Secure. Defaults to false.
    */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The url to associate the cookie with.
    */
  var url: java.lang.String
  /**
    * The value of the cookie. Empty by default if omitted.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

