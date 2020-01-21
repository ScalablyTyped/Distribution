package typings.fineUploader.azureMod.azure

import typings.fineUploader.coreMod.CorsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureCorsOptions extends CorsOptions

object AzureCorsOptions {
  @scala.inline
  def apply(
    allowXdr: js.UndefOr[Boolean] = js.undefined,
    expected: js.UndefOr[Boolean] = js.undefined,
    sendCredentials: js.UndefOr[Boolean] = js.undefined
  ): AzureCorsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowXdr)) __obj.updateDynamic("allowXdr")(allowXdr.asInstanceOf[js.Any])
    if (!js.isUndefined(expected)) __obj.updateDynamic("expected")(expected.asInstanceOf[js.Any])
    if (!js.isUndefined(sendCredentials)) __obj.updateDynamic("sendCredentials")(sendCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureCorsOptions]
  }
}

