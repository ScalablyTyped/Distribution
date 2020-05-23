package typings.googleGax.operationsClientMod

import typings.googleGax.gaxMod.ClientConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsClientOptions extends js.Object {
  var clientConfig: js.UndefOr[ClientConfig] = js.undefined
  var fallback: js.UndefOr[Boolean] = js.undefined
  var libName: js.UndefOr[String] = js.undefined
  var libVersion: js.UndefOr[String] = js.undefined
}

object OperationsClientOptions {
  @scala.inline
  def apply(
    clientConfig: ClientConfig = null,
    fallback: js.UndefOr[Boolean] = js.undefined,
    libName: String = null,
    libVersion: String = null
  ): OperationsClientOptions = {
    val __obj = js.Dynamic.literal()
    if (clientConfig != null) __obj.updateDynamic("clientConfig")(clientConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(fallback)) __obj.updateDynamic("fallback")(fallback.get.asInstanceOf[js.Any])
    if (libName != null) __obj.updateDynamic("libName")(libName.asInstanceOf[js.Any])
    if (libVersion != null) __obj.updateDynamic("libVersion")(libVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationsClientOptions]
  }
}

