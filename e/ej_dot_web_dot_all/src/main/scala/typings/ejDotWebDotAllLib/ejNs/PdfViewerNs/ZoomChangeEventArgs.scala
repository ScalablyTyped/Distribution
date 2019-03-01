package typings
package ejDotWebDotAllLib.ejNs.PdfViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomChangeEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the current zoom percentage of the PDF viewer control
    */
  var currentZoomPercentage: js.UndefOr[scala.Double] = js.undefined
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous zoom percentage of the PDF viewer control
    */
  var previousZoomPercentage: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ZoomChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    currentZoomPercentage: scala.Int | scala.Double = null,
    model: js.Any = null,
    previousZoomPercentage: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): ZoomChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentZoomPercentage != null) __obj.updateDynamic("currentZoomPercentage")(currentZoomPercentage.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model)
    if (previousZoomPercentage != null) __obj.updateDynamic("previousZoomPercentage")(previousZoomPercentage.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ZoomChangeEventArgs]
  }
}

