package typings.flexmonster

import typings.flexmonster.flexmonsterMod.MeasureObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MeasureTuple extends js.Object {
  var measure: MeasureObject
  var tuple: js.Array[String]
  var `type`: String
}

object Anon_MeasureTuple {
  @scala.inline
  def apply(measure: MeasureObject, tuple: js.Array[String], `type`: String): Anon_MeasureTuple = {
    val __obj = js.Dynamic.literal(measure = measure, tuple = tuple)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_MeasureTuple]
  }
}

