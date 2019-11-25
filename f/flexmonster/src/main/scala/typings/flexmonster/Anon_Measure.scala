package typings.flexmonster

import typings.flexmonster.flexmonsterMod.MeasureObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Measure extends js.Object {
  var measure: js.UndefOr[MeasureObject] = js.undefined
  var tuple: js.Array[String]
}

object Anon_Measure {
  @scala.inline
  def apply(tuple: js.Array[String], measure: MeasureObject = null): Anon_Measure = {
    val __obj = js.Dynamic.literal(tuple = tuple.asInstanceOf[js.Any])
    if (measure != null) __obj.updateDynamic("measure")(measure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Measure]
  }
}

