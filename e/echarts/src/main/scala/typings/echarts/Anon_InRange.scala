package typings.echarts

import typings.echarts.echarts.VisualMap.RangeObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InRange extends js.Object {
  var inRange: js.UndefOr[RangeObject] = js.undefined
  var outOfRange: js.UndefOr[RangeObject] = js.undefined
}

object Anon_InRange {
  @scala.inline
  def apply(inRange: RangeObject = null, outOfRange: RangeObject = null): Anon_InRange = {
    val __obj = js.Dynamic.literal()
    if (inRange != null) __obj.updateDynamic("inRange")(inRange.asInstanceOf[js.Any])
    if (outOfRange != null) __obj.updateDynamic("outOfRange")(outOfRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InRange]
  }
}

