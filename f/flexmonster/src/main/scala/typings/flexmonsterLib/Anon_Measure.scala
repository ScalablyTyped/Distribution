package typings
package flexmonsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Measure extends js.Object {
  var measure: js.UndefOr[flexmonsterLib.flexmonsterMod.FlexmonsterNs.MeasureObject] = js.undefined
  var tuple: js.Array[java.lang.String]
}

object Anon_Measure {
  @scala.inline
  def apply(
    tuple: js.Array[java.lang.String],
    measure: flexmonsterLib.flexmonsterMod.FlexmonsterNs.MeasureObject = null
  ): Anon_Measure = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tuple")(tuple)
    if (measure != null) __obj.updateDynamic("measure")(measure)
    __obj.asInstanceOf[Anon_Measure]
  }
}

