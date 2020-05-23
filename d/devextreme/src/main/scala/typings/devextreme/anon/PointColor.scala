package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointColor extends js.Object {
  var pointColor: js.UndefOr[String] = js.undefined
  var pointIndex: js.UndefOr[Double] = js.undefined
  var pointName: js.UndefOr[js.Any] = js.undefined
}

object PointColor {
  @scala.inline
  def apply(pointColor: String = null, pointIndex: js.UndefOr[Double] = js.undefined, pointName: js.Any = null): PointColor = {
    val __obj = js.Dynamic.literal()
    if (pointColor != null) __obj.updateDynamic("pointColor")(pointColor.asInstanceOf[js.Any])
    if (!js.isUndefined(pointIndex)) __obj.updateDynamic("pointIndex")(pointIndex.get.asInstanceOf[js.Any])
    if (pointName != null) __obj.updateDynamic("pointName")(pointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointColor]
  }
}

