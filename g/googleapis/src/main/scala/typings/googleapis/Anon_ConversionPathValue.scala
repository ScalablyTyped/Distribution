package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ConversionPathValue extends js.Object {
  var conversionPathValue: js.UndefOr[js.Array[Anon_InteractionType]] = js.native
  var primitiveValue: js.UndefOr[String] = js.native
}

object Anon_ConversionPathValue {
  @scala.inline
  def apply(conversionPathValue: js.Array[Anon_InteractionType] = null, primitiveValue: String = null): Anon_ConversionPathValue = {
    val __obj = js.Dynamic.literal()
    if (conversionPathValue != null) __obj.updateDynamic("conversionPathValue")(conversionPathValue.asInstanceOf[js.Any])
    if (primitiveValue != null) __obj.updateDynamic("primitiveValue")(primitiveValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ConversionPathValue]
  }
}

