package typings.flexmonster

import typings.flexmonster.mod.MeasureObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMeasure extends js.Object {
  var measure: js.UndefOr[MeasureObject] = js.undefined
  var tuple: js.Array[String]
}

object AnonMeasure {
  @scala.inline
  def apply(tuple: js.Array[String], measure: MeasureObject = null): AnonMeasure = {
    val __obj = js.Dynamic.literal(tuple = tuple.asInstanceOf[js.Any])
    if (measure != null) __obj.updateDynamic("measure")(measure.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMeasure]
  }
}

