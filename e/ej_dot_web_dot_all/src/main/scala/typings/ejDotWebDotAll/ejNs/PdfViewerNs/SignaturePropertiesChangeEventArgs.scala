package typings.ejDotWebDotAll.ejNs.PdfViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignaturePropertiesChangeEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the current color of the signature.
    */
  var currentColor: js.UndefOr[String] = js.undefined
  /** Returns the current opacity of the signature.
    */
  var currentOpacity: js.UndefOr[Double] = js.undefined
  /** Specifies that the color of the signature is changed.
    */
  var isColorChange: js.UndefOr[Boolean] = js.undefined
  /** Specifies that the opacity of the signature is changed.
    */
  var isOpacityChange: js.UndefOr[Boolean] = js.undefined
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the page number in which the signature properties is changed.
    */
  var pageID: js.UndefOr[Double] = js.undefined
  /** Returns the previous color of the signature.
    */
  var previousColor: js.UndefOr[String] = js.undefined
  /** Returns the previous opacity of the signature.
    */
  var previousOpacity: js.UndefOr[Double] = js.undefined
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object SignaturePropertiesChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    currentColor: String = null,
    currentOpacity: Int | Double = null,
    isColorChange: js.UndefOr[Boolean] = js.undefined,
    isOpacityChange: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    pageID: Int | Double = null,
    previousColor: String = null,
    previousOpacity: Int | Double = null,
    `type`: String = null
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

