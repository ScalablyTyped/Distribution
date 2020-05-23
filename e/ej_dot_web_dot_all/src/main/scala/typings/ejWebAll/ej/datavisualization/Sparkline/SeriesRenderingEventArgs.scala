package typings.ejWebAll.ej.datavisualization.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesRenderingEventArgs extends js.Object {
  /** Set this option to true to cancel the event
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Maximum x value of the data point
    */
  var maxX: js.UndefOr[js.Any] = js.undefined
  /** Maximum y value of the data point
    */
  var maxY: js.UndefOr[js.Any] = js.undefined
  /** Minimum x value of the data point
    */
  var minX: js.UndefOr[js.Any] = js.undefined
  /** Minimum y value of the data point
    */
  var minY: js.UndefOr[js.Any] = js.undefined
  /** Instance of the sparkline model object
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object SeriesRenderingEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    maxX: js.Any = null,
    maxY: js.Any = null,
    minX: js.Any = null,
    minY: js.Any = null,
    model: js.Any = null,
    `type`: String = null
  ): SeriesRenderingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (maxX != null) __obj.updateDynamic("maxX")(maxX.asInstanceOf[js.Any])
    if (maxY != null) __obj.updateDynamic("maxY")(maxY.asInstanceOf[js.Any])
    if (minX != null) __obj.updateDynamic("minX")(minX.asInstanceOf[js.Any])
    if (minY != null) __obj.updateDynamic("minY")(minY.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesRenderingEventArgs]
  }
}

