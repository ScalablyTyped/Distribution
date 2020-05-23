package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Points extends js.Object {
  /**
    * A list of points, which defines the shape, like `[[22,
    * 44], [44, 55], [11, 44], ...]`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline.shape.points
    */
  var points: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Whether smooth the line.
    *
    * + If the value is number, bezier interpolation is
    * used, and the value specified the level of smooth,
    * which is in the range of `[0, 1]`.
    * + If the value is `'spline'`, Catmull-Rom spline
    * interpolation is used.
    *
    *
    * @default
    * "undefined"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline.shape.smooth
    */
  var smooth: js.UndefOr[Double | String] = js.undefined
  /**
    * Whether prevent the smooth process cause the line
    * out of the bounding box.
    *
    * Only works when `smooth` is `number` (bezier smooth).
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline.shape.smoothConstraint
    */
  var smoothConstraint: js.UndefOr[Boolean] = js.undefined
}

object Points {
  @scala.inline
  def apply(
    points: js.Array[_] = null,
    smooth: Double | String = null,
    smoothConstraint: js.UndefOr[Boolean] = js.undefined
  ): Points = {
    val __obj = js.Dynamic.literal()
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (smooth != null) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothConstraint)) __obj.updateDynamic("smoothConstraint")(smoothConstraint.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Points]
  }
}

