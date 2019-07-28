package typings.expressDashValidator.srcBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldInstance extends js.Object {
  var location: Location
  var originalPath: String
  var originalValue: js.Any
  var path: String
  var value: js.Any
}

object FieldInstance {
  @scala.inline
  def apply(location: Location, originalPath: String, originalValue: js.Any, path: String, value: js.Any): FieldInstance = {
    val __obj = js.Dynamic.literal(location = location, originalPath = originalPath, originalValue = originalValue, path = path, value = value)
  
    __obj.asInstanceOf[FieldInstance]
  }
}

