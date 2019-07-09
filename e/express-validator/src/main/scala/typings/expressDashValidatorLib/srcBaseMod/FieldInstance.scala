package typings
package expressDashValidatorLib.srcBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldInstance extends js.Object {
  var location: Location
  var originalPath: java.lang.String
  var originalValue: js.Any
  var path: java.lang.String
  var value: js.Any
}

object FieldInstance {
  @scala.inline
  def apply(
    location: Location,
    originalPath: java.lang.String,
    originalValue: js.Any,
    path: java.lang.String,
    value: js.Any
  ): FieldInstance = {
    val __obj = js.Dynamic.literal(location = location, originalPath = originalPath, originalValue = originalValue, path = path, value = value)
  
    __obj.asInstanceOf[FieldInstance]
  }
}

