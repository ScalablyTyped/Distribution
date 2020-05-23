package typings.ejWebAll.ej.datavisualization.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointRegionMouseMoveEventArgs extends js.Object {
  /** Set this option to true to cancel the event
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** X-coordinate of point in pixel
    */
  var locationX: js.UndefOr[Double] = js.undefined
  /** Y-coordinate of point in pixel
    */
  var locationY: js.UndefOr[Double] = js.undefined
  /** Instance of the sparkline model object
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Index of the point in series
    */
  var pointIndex: js.UndefOr[Double] = js.undefined
  /** Type of the series
    */
  var seriesType: js.UndefOr[String] = js.undefined
  /** Name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object PointRegionMouseMoveEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    locationX: js.UndefOr[Double] = js.undefined,
    locationY: js.UndefOr[Double] = js.undefined,
    model: js.Any = null,
    pointIndex: js.UndefOr[Double] = js.undefined,
    seriesType: String = null,
    `type`: String = null
  ): PointRegionMouseMoveEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(locationX)) __obj.updateDynamic("locationX")(locationX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(locationY)) __obj.updateDynamic("locationY")(locationY.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(pointIndex)) __obj.updateDynamic("pointIndex")(pointIndex.get.asInstanceOf[js.Any])
    if (seriesType != null) __obj.updateDynamic("seriesType")(seriesType.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointRegionMouseMoveEventArgs]
  }
}

