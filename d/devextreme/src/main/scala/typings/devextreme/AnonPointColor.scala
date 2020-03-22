package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPointColor extends js.Object {
  var pointColor: js.UndefOr[String] = js.undefined
  var pointIndex: js.UndefOr[Double] = js.undefined
  var pointName: js.UndefOr[js.Any] = js.undefined
}

object AnonPointColor {
  @scala.inline
  def apply(pointColor: String = null, pointIndex: Int | Double = null, pointName: js.Any = null): AnonPointColor = {
    val __obj = js.Dynamic.literal()
    if (pointColor != null) __obj.updateDynamic("pointColor")(pointColor.asInstanceOf[js.Any])
    if (pointIndex != null) __obj.updateDynamic("pointIndex")(pointIndex.asInstanceOf[js.Any])
    if (pointName != null) __obj.updateDynamic("pointName")(pointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPointColor]
  }
}

