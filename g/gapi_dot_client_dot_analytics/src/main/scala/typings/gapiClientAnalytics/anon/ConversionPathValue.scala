package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionPathValue extends js.Object {
  /** A conversion path dimension value, containing a list of interactions with their attributes. */
  var conversionPathValue: js.UndefOr[js.Array[InteractionType]] = js.undefined
  /** A primitive dimension value. A primitive metric value. */
  var primitiveValue: js.UndefOr[String] = js.undefined
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

