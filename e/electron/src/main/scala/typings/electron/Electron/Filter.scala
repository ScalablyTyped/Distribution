package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /**
    * Retrieves cookies whose domains match or are subdomains of domains.
    */
  var domain: js.UndefOr[String] = js.undefined
  /**
    * Filters cookies by name.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Retrieves cookies whose path matches path.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * Filters cookies by their Secure property.
    */
  var secure: js.UndefOr[Boolean] = js.undefined
  /**
    * Filters out session or persistent cookies.
    */
  var session: js.UndefOr[Boolean] = js.undefined
  /**
    * Retrieves cookies which are associated with url. Empty implies retrieving
    * cookies of all urls.
    */
  var url: js.UndefOr[String] = js.undefined
}

object Filter {
  @scala.inline
  def apply(
    domain: String = null,
    name: String = null,
    path: String = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    session: js.UndefOr[Boolean] = js.undefined,
    url: String = null
  ): Filter = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Filter]
  }
}

