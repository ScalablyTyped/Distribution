package typings
package ejDotWebDotAllLib.ejNs.PdfViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignaturePropertiesChangeEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the current color of the signature.
    */
  var currentColor: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the current opacity of the signature.
    */
  var currentOpacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies that the color of the signature is changed.
    */
  var isColorChange: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies that the opacity of the signature is changed.
    */
  var isOpacityChange: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the page number in which the signature properties is changed.
    */
  var pageID: js.UndefOr[scala.Double] = js.undefined
  /** Returns the previous color of the signature.
    */
  var previousColor: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the previous opacity of the signature.
    */
  var previousOpacity: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SignaturePropertiesChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    currentColor: java.lang.String = null,
    currentOpacity: scala.Int | scala.Double = null,
    isColorChange: js.UndefOr[scala.Boolean] = js.undefined,
    isOpacityChange: js.UndefOr[scala.Boolean] = js.undefined,
    model: js.Any = null,
    pageID: scala.Int | scala.Double = null,
    previousColor: java.lang.String = null,
    previousOpacity: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): SignaturePropertiesChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentColor != null) __obj.updateDynamic("currentColor")(currentColor)
    if (currentOpacity != null) __obj.updateDynamic("currentOpacity")(currentOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(isColorChange)) __obj.updateDynamic("isColorChange")(isColorChange)
    if (!js.isUndefined(isOpacityChange)) __obj.updateDynamic("isOpacityChange")(isOpacityChange)
    if (model != null) __obj.updateDynamic("model")(model)
    if (pageID != null) __obj.updateDynamic("pageID")(pageID.asInstanceOf[js.Any])
    if (previousColor != null) __obj.updateDynamic("previousColor")(previousColor)
    if (previousOpacity != null) __obj.updateDynamic("previousOpacity")(previousOpacity.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SignaturePropertiesChangeEventArgs]
  }
}

