package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Details extends js.Object {
  /**
    * The domain of the cookie. Empty by default if omitted.
    */
  var domain: js.UndefOr[String] = js.undefined
  /**
    * The expiration date of the cookie as the number of seconds since the UNIX epoch.
    * If omitted then the cookie becomes a session cookie and will not be retained
    * between sessions.
    */
  var expirationDate: js.UndefOr[Double] = js.undefined
  /**
    * Whether the cookie should be marked as HTTP only. Defaults to false.
    */
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the cookie. Empty by default if omitted.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The path of the cookie. Empty by default if omitted.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * Whether the cookie should be marked as Secure. Defaults to false.
    */
  var secure: js.UndefOr[Boolean] = js.undefined
  /**
    * The url to associate the cookie with.
    */
  var url: String
  /**
    * The value of the cookie. Empty by default if omitted.
    */
  var value: js.UndefOr[String] = js.undefined
}

object Details {
  @scala.inline
  def apply(
    url: String,
    domain: String = null,
    expirationDate: Int | Double = null,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    path: String = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): Details = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
}

