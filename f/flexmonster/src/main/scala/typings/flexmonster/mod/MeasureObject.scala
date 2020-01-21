package typings.flexmonster.mod

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
    val __obj = js.Dynamic.literal(uniqueName = uniqueName.asInstanceOf[js.Any])
    if (aggregation != null) __obj.updateDynamic("aggregation")(aggregation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureObject]
  }
}

