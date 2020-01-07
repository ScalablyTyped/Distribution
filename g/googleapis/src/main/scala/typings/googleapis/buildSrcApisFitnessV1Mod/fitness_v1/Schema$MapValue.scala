package typings.googleapis.buildSrcApisFitnessV1Mod.fitness_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holder object for the value of an entry in a map field of a data point.  A
  * map value supports a subset of the formats that the regular Value supports.
  */
@js.native
trait Schema$MapValue extends js.Object {
  /**
    * Floating point value.
    */
  var fpVal: js.UndefOr[Double] = js.native
}

object Schema$MapValue {
  @scala.inline
  def apply(fpVal: Int | Double = null): Schema$MapValue = {
    val __obj = js.Dynamic.literal()
    if (fpVal != null) __obj.updateDynamic("fpVal")(fpVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MapValue]
  }
}

