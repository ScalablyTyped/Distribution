package typings.emberDashData.typesRegistriesTransformMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformRegistry extends js.Object {
  var boolean: Boolean
  var date: Date
  var number: Double
  var string: String
}

object TransformRegistry {
  @scala.inline
  def apply(boolean: Boolean, date: Date, number: Double, string: String): TransformRegistry = {
    val __obj = js.Dynamic.literal(boolean = boolean, date = date, number = number, string = string)
  
    __obj.asInstanceOf[TransformRegistry]
  }
}

