package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.cookies.SameSiteStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpirationDate extends js.Object {
  /** The domain of the cookie. If omitted, the cookie becomes a host-only cookie. */
  var domain: js.UndefOr[String] = js.undefined
  /**
    * The expiration date of the cookie as the number of seconds since the UNIX epoch. If omitted, the cookie
    * becomes a session cookie.
    */
  var expirationDate: js.UndefOr[Double] = js.undefined
  /**
    * The first-party domain of the cookie. This attribute is required if First-Party Isolation is enabled.
    */
  var firstPartyDomain: js.UndefOr[String] = js.undefined
  /** Whether the cookie should be marked as HttpOnly. Defaults to false. */
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  /** The name of the cookie. Empty by default if omitted. */
  var name: js.UndefOr[String] = js.undefined
  /** The path of the cookie. Defaults to the path portion of the url parameter. */
  var path: js.UndefOr[String] = js.undefined
  /** The cookie's same-site status. */
  var sameSite: js.UndefOr[SameSiteStatus] = js.undefined
  /** Whether the cookie should be marked as Secure. Defaults to false. */
  var secure: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the cookie store in which to set the cookie. By default, the cookie is set in the current
    * execution context's cookie store.
    */
  var storeId: js.UndefOr[String] = js.undefined
  /**
    * The request-URI to associate with the setting of the cookie. This value can affect the default domain and
    * path values of the created cookie. If host permissions for this URL are not specified in the manifest file,
    * the API call will fail.
    */
  var url: String
  /** The value of the cookie. Empty by default if omitted. */
  var value: js.UndefOr[String] = js.undefined
}

object ExpirationDate {
  @scala.inline
  def apply(
    url: String,
    domain: String = null,
    expirationDate: js.UndefOr[Double] = js.undefined,
    firstPartyDomain: String = null,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    path: String = null,
    sameSite: SameSiteStatus = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    storeId: String = null,
    value: String = null
  ): ExpirationDate = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(expirationDate)) __obj.updateDynamic("expirationDate")(expirationDate.get.asInstanceOf[js.Any])
    if (firstPartyDomain != null) __obj.updateDynamic("firstPartyDomain")(firstPartyDomain.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    if (storeId != null) __obj.updateDynamic("storeId")(storeId.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpirationDate]
  }
}

