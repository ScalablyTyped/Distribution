package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.chartPointObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var point: js.UndefOr[chartPointObject] = js.undefined
  var value: js.UndefOr[typings.std.Date | Double | String] = js.undefined
  var valueText: js.UndefOr[String] = js.undefined
}

object Point {
  @scala.inline
  def apply(
    point: chartPointObject = null,
    value: typings.std.Date | Double | String = null,
    valueText: String = null
  ): Point = {
    val __obj = js.Dynamic.literal()
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueText != null) __obj.updateDynamic("valueText")(valueText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

