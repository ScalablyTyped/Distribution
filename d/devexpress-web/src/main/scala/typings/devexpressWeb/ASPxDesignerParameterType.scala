package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxDesignerParameterType extends js.Object {
  var defaultVal: js.Any
  var displayValue: String
  var specifics: String
  var value: String
  def valueConverter(`val`: js.Any): js.Any
}

object ASPxDesignerParameterType {
  @scala.inline
  def apply(
    defaultVal: js.Any,
    displayValue: String,
    specifics: String,
    value: String,
    valueConverter: js.Any => js.Any
  ): ASPxDesignerParameterType = {
    val __obj = js.Dynamic.literal(defaultVal = defaultVal.asInstanceOf[js.Any], displayValue = displayValue.asInstanceOf[js.Any], specifics = specifics.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueConverter = js.Any.fromFunction1(valueConverter))
    __obj.asInstanceOf[ASPxDesignerParameterType]
  }
}

