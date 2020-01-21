package typings.emberData.registriesTransformMod

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
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransformRegistry]
  }
}

