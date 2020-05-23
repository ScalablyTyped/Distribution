package typings.fineUploader.s3Mod.s3

import typings.fineUploader.coreMod.CorsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3CorsOptions extends CorsOptions

object S3CorsOptions {
  @scala.inline
  def apply(
    allowXdr: js.UndefOr[Boolean] = js.undefined,
    expected: js.UndefOr[Boolean] = js.undefined,
    sendCredentials: js.UndefOr[Boolean] = js.undefined
  ): S3CorsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowXdr)) __obj.updateDynamic("allowXdr")(allowXdr.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expected)) __obj.updateDynamic("expected")(expected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sendCredentials)) __obj.updateDynamic("sendCredentials")(sendCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3CorsOptions]
  }
}

