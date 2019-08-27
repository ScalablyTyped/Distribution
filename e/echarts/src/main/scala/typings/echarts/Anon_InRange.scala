package typings.echarts

import typings.echarts.echartsNs.VisualMapNs.RangeObject
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
    if (inRange != null) __obj.updateDynamic("inRange")(inRange)
    if (outOfRange != null) __obj.updateDynamic("outOfRange")(outOfRange)
    __obj.asInstanceOf[Anon_InRange]
  }
}

