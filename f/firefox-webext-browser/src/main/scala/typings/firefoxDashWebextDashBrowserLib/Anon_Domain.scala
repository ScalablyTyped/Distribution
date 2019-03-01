package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Domain extends js.Object {
  /** Restricts the retrieved cookies to those whose domains match or are subdomains of this one. */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Restricts the retrieved cookies to those whose first-party domains match this one. This attribute is
    * required if First-Party Isolation is enabled. To not filter by a specific first-party domain, use `null` or
    * `undefined`.
    */
  var firstPartyDomain: js.UndefOr[java.lang.String] = js.undefined
  /** Filters the cookies by name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Restricts the retrieved cookies to those whose path exactly matches this string. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Filters the cookies by their Secure property. */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /** Filters out session vs. persistent cookies. */
  var session: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The cookie store to retrieve cookies from. If omitted, the current execution context's cookie store will be
    * used.
    */
  var storeId: js.UndefOr[java.lang.String] = js.undefined
  /** Restricts the retrieved cookies to those that would match the given URL. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Domain {
  @scala.inline
  def apply(
    domain: java.lang.String = null,
    firstPartyDomain: java.lang.String = null,
    name: java.lang.String = null,
    path: java.lang.String = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    session: js.UndefOr[scala.Boolean] = js.undefined,
    storeId: java.lang.String = null,
    url: java.lang.String = null
  ): Anon_Domain = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (firstPartyDomain != null) __obj.updateDynamic("firstPartyDomain")(firstPartyDomain)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session)
    if (storeId != null) __obj.updateDynamic("storeId")(storeId)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Domain]
  }
}

