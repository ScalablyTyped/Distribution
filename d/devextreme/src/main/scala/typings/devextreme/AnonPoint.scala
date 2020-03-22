package typings.devextreme

import typings.devextreme.mod.DevExpress.viz.chartPointObject
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPoint extends js.Object {
  var point: js.UndefOr[chartPointObject] = js.undefined
  var value: js.UndefOr[Date | Double | String] = js.undefined
  var valueText: js.UndefOr[String] = js.undefined
}

object AnonPoint {
  @scala.inline
  def apply(point: chartPointObject = null, value: Date | Double | String = null, valueText: String = null): AnonPoint = {
    val __obj = js.Dynamic.literal()
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueText != null) __obj.updateDynamic("valueText")(valueText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPoint]
  }
}

