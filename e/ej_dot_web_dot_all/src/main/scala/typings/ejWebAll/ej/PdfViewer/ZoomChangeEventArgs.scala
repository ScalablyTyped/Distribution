package typings.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomChangeEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the current zoom percentage of the PDF viewer control
    */
  var currentZoomPercentage: js.UndefOr[Double] = js.undefined
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous zoom percentage of the PDF viewer control
    */
  var previousZoomPercentage: js.UndefOr[Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ZoomChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    currentZoomPercentage: js.UndefOr[Double] = js.undefined,
    model: js.Any = null,
    previousZoomPercentage: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): ZoomChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(currentZoomPercentage)) __obj.updateDynamic("currentZoomPercentage")(currentZoomPercentage.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(previousZoomPercentage)) __obj.updateDynamic("previousZoomPercentage")(previousZoomPercentage.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomChangeEventArgs]
  }
}

