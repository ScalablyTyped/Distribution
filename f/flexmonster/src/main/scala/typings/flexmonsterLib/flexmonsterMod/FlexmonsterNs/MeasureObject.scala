package typings
package flexmonsterLib.flexmonsterMod.FlexmonsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeasureObject extends js.Object {
  var aggregation: js.UndefOr[java.lang.String] = js.undefined
  var uniqueName: java.lang.String
}

object MeasureObject {
  @scala.inline
  def apply(uniqueName: java.lang.String, aggregation: java.lang.String = null): MeasureObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uniqueName")(uniqueName)
    if (aggregation != null) __obj.updateDynamic("aggregation")(aggregation)
    __obj.asInstanceOf[MeasureObject]
  }
}

