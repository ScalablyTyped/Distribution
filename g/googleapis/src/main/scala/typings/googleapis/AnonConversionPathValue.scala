package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConversionPathValue extends js.Object {
  var conversionPathValue: js.UndefOr[js.Array[AnonInteractionType]] = js.native
  var primitiveValue: js.UndefOr[String] = js.native
}

object AnonConversionPathValue {
  @scala.inline
  def apply(conversionPathValue: js.Array[AnonInteractionType] = null, primitiveValue: String = null): AnonConversionPathValue = {
    val __obj = js.Dynamic.literal()
    if (conversionPathValue != null) __obj.updateDynamic("conversionPathValue")(conversionPathValue.asInstanceOf[js.Any])
    if (primitiveValue != null) __obj.updateDynamic("primitiveValue")(primitiveValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConversionPathValue]
  }
}

