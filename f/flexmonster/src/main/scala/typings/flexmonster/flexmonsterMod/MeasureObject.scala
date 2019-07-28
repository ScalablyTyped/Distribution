package typings.flexmonster.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeasureObject extends js.Object {
  var aggregation: js.UndefOr[String] = js.undefined
  var uniqueName: String
}

object MeasureObject {
  @scala.inline
  def apply(uniqueName: String, aggregation: String = null): MeasureObject = {
    val __obj = js.Dynamic.literal(uniqueName = uniqueName)
    if (aggregation != null) __obj.updateDynamic("aggregation")(aggregation)
    __obj.asInstanceOf[MeasureObject]
  }
}

