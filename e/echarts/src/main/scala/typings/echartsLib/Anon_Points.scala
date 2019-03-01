package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Points extends js.Object {
  /**
    * A list of points, which defines the shape, like `[[22,
    * 44], [44, 55], [11, 44], ...]`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polyline.shape.points
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polyline.shape.smooth
    */
  var smooth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Whether prevent the smooth process cause the line
    * out of the bounding box.
    *
    * Only works when `smooth` is `number` (bezier smooth).
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polyline.shape.smoothConstraint
    */
  var smoothConstraint: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Points {
  @scala.inline
  def apply(
    points: js.Array[_] = null,
    smooth: scala.Double | java.lang.String = null,
    smoothConstraint: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Points = {
    val __obj = js.Dynamic.literal()
    if (points != null) __obj.updateDynamic("points")(points)
    if (smooth != null) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothConstraint)) __obj.updateDynamic("smoothConstraint")(smoothConstraint)
    __obj.asInstanceOf[Anon_Points]
  }
}

