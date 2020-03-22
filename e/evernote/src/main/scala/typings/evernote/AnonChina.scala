package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChina extends js.Object {
  var china: js.UndefOr[Boolean] = js.undefined
  var consumerKey: js.UndefOr[String] = js.undefined
  var consumerSecret: js.UndefOr[String] = js.undefined
  var sandbox: js.UndefOr[Boolean] = js.undefined
  var serviceHost: js.UndefOr[String] = js.undefined
  var token: js.UndefOr[String] = js.undefined
}

object AnonChina {
  @scala.inline
  def apply(
    china: js.UndefOr[Boolean] = js.undefined,
    consumerKey: String = null,
    consumerSecret: String = null,
    sandbox: js.UndefOr[Boolean] = js.undefined,
    serviceHost: String = null,
    token: String = null
  ): AnonChina = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(china)) __obj.updateDynamic("china")(china.asInstanceOf[js.Any])
    if (consumerKey != null) __obj.updateDynamic("consumerKey")(consumerKey.asInstanceOf[js.Any])
    if (consumerSecret != null) __obj.updateDynamic("consumerSecret")(consumerSecret.asInstanceOf[js.Any])
    if (!js.isUndefined(sandbox)) __obj.updateDynamic("sandbox")(sandbox.asInstanceOf[js.Any])
    if (serviceHost != null) __obj.updateDynamic("serviceHost")(serviceHost.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChina]
  }
}

