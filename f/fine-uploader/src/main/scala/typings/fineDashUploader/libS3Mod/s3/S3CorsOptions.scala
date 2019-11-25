package typings.fineDashUploader.libS3Mod.s3

import typings.fineDashUploader.libCoreMod.CorsOptions
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
    if (!js.isUndefined(allowXdr)) __obj.updateDynamic("allowXdr")(allowXdr.asInstanceOf[js.Any])
    if (!js.isUndefined(expected)) __obj.updateDynamic("expected")(expected.asInstanceOf[js.Any])
    if (!js.isUndefined(sendCredentials)) __obj.updateDynamic("sendCredentials")(sendCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3CorsOptions]
  }
}

