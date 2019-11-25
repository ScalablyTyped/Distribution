package typings.fineDashUploader.libAzureMod.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureFailedUploadTextDisplayOptions extends js.Object {
  /**
    * You will most likely want to keep this at the default value of 'custom'. See the UI options documentation for more info on this option.
    *
    * @default `'custom'`
    */
  var mode: js.UndefOr[String] = js.undefined
}

object AzureFailedUploadTextDisplayOptions {
  @scala.inline
  def apply(mode: String = null): AzureFailedUploadTextDisplayOptions = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureFailedUploadTextDisplayOptions]
  }
}

