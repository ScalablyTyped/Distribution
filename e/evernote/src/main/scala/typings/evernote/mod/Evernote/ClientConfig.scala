package typings.evernote.mod.Evernote

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConfig extends js.Object {
  var additionalHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var consumerKey: js.UndefOr[String] = js.undefined
  var consumerSecret: js.UndefOr[String] = js.undefined
  var sandbox: js.UndefOr[Boolean] = js.undefined
  var secret: js.UndefOr[String] = js.undefined
  var serviceHost: js.UndefOr[String] = js.undefined
  var token: js.UndefOr[String] = js.undefined
}

object ClientConfig {
  @scala.inline
  def apply(
    additionalHeaders: StringDictionary[String] = null,
    consumerKey: String = null,
    consumerSecret: String = null,
    sandbox: js.UndefOr[Boolean] = js.undefined,
    secret: String = null,
    serviceHost: String = null,
    token: String = null
  ): ClientConfig = {
    val __obj = js.Dynamic.literal()
    if (additionalHeaders != null) __obj.updateDynamic("additionalHeaders")(additionalHeaders.asInstanceOf[js.Any])
    if (consumerKey != null) __obj.updateDynamic("consumerKey")(consumerKey.asInstanceOf[js.Any])
    if (consumerSecret != null) __obj.updateDynamic("consumerSecret")(consumerSecret.asInstanceOf[js.Any])
    if (!js.isUndefined(sandbox)) __obj.updateDynamic("sandbox")(sandbox.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (serviceHost != null) __obj.updateDynamic("serviceHost")(serviceHost.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig]
  }
}

