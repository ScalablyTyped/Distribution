package typings
package flexmonsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MeasureTuple extends js.Object {
  var measure: flexmonsterLib.flexmonsterMod.FlexmonsterNs.MeasureObject
  var tuple: js.Array[java.lang.String]
  var `type`: java.lang.String
}

object Anon_MeasureTuple {
  @scala.inline
  def apply(
    measure: flexmonsterLib.flexmonsterMod.FlexmonsterNs.MeasureObject,
    tuple: js.Array[java.lang.String],
    `type`: java.lang.String
  ): Anon_MeasureTuple = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("measure")(measure)
    __obj.updateDynamic("tuple")(tuple)
    __obj.asInstanceOf[Anon_MeasureTuple]
  }
}

