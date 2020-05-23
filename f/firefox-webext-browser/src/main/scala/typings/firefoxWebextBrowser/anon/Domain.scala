package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Domain extends js.Object {
  /** Restricts the retrieved cookies to those whose domains match or are subdomains of this one. */
  var domain: js.UndefOr[String] = js.undefined
  /**
    * Restricts the retrieved cookies to those whose first-party domains match this one. This attribute is
    * required if First-Party Isolation is enabled. To not filter by a specific first-party domain, use `null` or
    * `undefined`.
    */
  var firstPartyDomain: js.UndefOr[String] = js.undefined
  /** Filters the cookies by name. */
  var name: js.UndefOr[String] = js.undefined
  /** Restricts the retrieved cookies to those whose path exactly matches this string. */
  var path: js.UndefOr[String] = js.undefined
  /** Filters the cookies by their Secure property. */
  var secure: js.UndefOr[Boolean] = js.undefined
  /** Filters out session vs. persistent cookies. */
  var session: js.UndefOr[Boolean] = js.undefined
  /**
    * The cookie store to retrieve cookies from. If omitted, the current execution context's cookie store will be
    * used.
    */
  var storeId: js.UndefOr[String] = js.undefined
  /** Restricts the retrieved cookies to those that would match the given URL. */
  var url: js.UndefOr[String] = js.undefined
}

object Domain {
  @scala.inline
  def apply(
    domain: String = null,
    firstPartyDomain: String = null,
    name: String = null,
    path: String = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    session: js.UndefOr[Boolean] = js.undefined,
    storeId: String = null,
    url: String = null
  ): Domain = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (firstPartyDomain != null) __obj.updateDynamic("firstPartyDomain")(firstPartyDomain.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session.get.asInstanceOf[js.Any])
    if (storeId != null) __obj.updateDynamic("storeId")(storeId.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
}

