package typings.flexmonster.anon

import typings.flexmonster.mod.MeasureObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Measure extends js.Object {
  var measure: js.UndefOr[MeasureObject] = js.undefined
  var tuple: js.Array[String]
}

object Measure {
  @scala.inline
  def apply(tuple: js.Array[String], measure: MeasureObject = null): Measure = {
    val __obj = js.Dynamic.literal(tuple = tuple.asInstanceOf[js.Any])
    if (measure != null) __obj.updateDynamic("measure")(measure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Measure]
  }
}

