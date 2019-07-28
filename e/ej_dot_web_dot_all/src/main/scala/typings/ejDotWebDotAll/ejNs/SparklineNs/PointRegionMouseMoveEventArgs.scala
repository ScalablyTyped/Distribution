package typings.ejDotWebDotAll.ejNs.SparklineNs

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
    locationX: Int | Double = null,
    locationY: Int | Double = null,
    model: js.Any = null,
    pointIndex: Int | Double = null,
    seriesType: String = null,
    `type`: String = null
  ): PointRegionMouseMoveEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (locationX != null) __obj.updateDynamic("locationX")(locationX.asInstanceOf[js.Any])
    if (locationY != null) __obj.updateDynamic("locationY")(locationY.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model)
    if (pointIndex != null) __obj.updateDynamic("pointIndex")(pointIndex.asInstanceOf[js.Any])
    if (seriesType != null) __obj.updateDynamic("seriesType")(seriesType)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PointRegionMouseMoveEventArgs]
  }
}

