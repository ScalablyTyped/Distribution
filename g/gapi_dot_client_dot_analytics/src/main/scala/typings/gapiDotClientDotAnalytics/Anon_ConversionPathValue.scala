package typings.gapiDotClientDotAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConversionPathValue extends js.Object {
  /** A conversion path dimension value, containing a list of interactions with their attributes. */
  var conversionPathValue: js.UndefOr[js.Array[Anon_InteractionType]] = js.undefined
  /** A primitive dimension value. A primitive metric value. */
  var primitiveValue: js.UndefOr[String] = js.undefined
}

object Anon_ConversionPathValue {
  @scala.inline
  def apply(conversionPathValue: js.Array[Anon_InteractionType] = null, primitiveValue: String = null): Anon_ConversionPathValue = {
    val __obj = js.Dynamic.literal()
    if (conversionPathValue != null) __obj.updateDynamic("conversionPathValue")(conversionPathValue)
    if (primitiveValue != null) __obj.updateDynamic("primitiveValue")(primitiveValue)
    __obj.asInstanceOf[Anon_ConversionPathValue]
  }
}

