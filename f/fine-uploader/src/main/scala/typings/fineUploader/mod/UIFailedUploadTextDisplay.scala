package typings.fineUploader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIFailedUploadTextDisplay extends js.Object {
  /**
    * Enable or disable a tooltip that will display the full contents of the error message when the mouse pointer hovers over the failed item.
    *
    * @default `true`
    */
  var enableTooltip: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the message to display next to each failed file.
    *
    * One of: 'default' which displays the failedUploadText, 'custom' which displays the error response from the server, or 'none' which displays no text
    *
    * @default `'default'`
    */
  var mode: js.UndefOr[String] = js.undefined
  /**
    * The property from the server response that contains the error text to display next to a failed item. Ignored unless `mode` is `'custom'`
    *
    * @default `'error'`
    */
  var responseProperty: js.UndefOr[String] = js.undefined
}

object UIFailedUploadTextDisplay {
  @scala.inline
  def apply(
    enableTooltip: js.UndefOr[Boolean] = js.undefined,
    mode: String = null,
    responseProperty: String = null
  ): UIFailedUploadTextDisplay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableTooltip)) __obj.updateDynamic("enableTooltip")(enableTooltip.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (responseProperty != null) __obj.updateDynamic("responseProperty")(responseProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIFailedUploadTextDisplay]
  }
}

