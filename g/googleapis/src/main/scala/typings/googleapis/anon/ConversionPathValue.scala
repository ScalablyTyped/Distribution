package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversionPathValue extends js.Object {
  var conversionPathValue: js.UndefOr[js.Array[InteractionType]] = js.native
  var primitiveValue: js.UndefOr[String] = js.native
}

object ConversionPathValue {
  @scala.inline
  def apply(conversionPathValue: js.Array[InteractionType] = null, primitiveValue: String = null): ConversionPathValue = {
    val __obj = js.Dynamic.literal()
    if (conversionPathValue != null) __obj.updateDynamic("conversionPathValue")(conversionPathValue.asInstanceOf[js.Any])
    if (primitiveValue != null) __obj.updateDynamic("primitiveValue")(primitiveValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversionPathValue]
  }
}

