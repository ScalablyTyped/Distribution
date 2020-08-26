package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversionPathValue extends js.Object {
  /** A conversion path dimension value, containing a list of interactions with their attributes. */
  var conversionPathValue: js.UndefOr[js.Array[InteractionType]] = js.native
  /** A primitive dimension value. A primitive metric value. */
  var primitiveValue: js.UndefOr[String] = js.native
}

object ConversionPathValue {
  @scala.inline
  def apply(): ConversionPathValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionPathValue]
  }
  @scala.inline
  implicit class ConversionPathValueOps[Self <: ConversionPathValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConversionPathValueVarargs(value: InteractionType*): Self = this.set("conversionPathValue", js.Array(value :_*))
    @scala.inline
    def setConversionPathValue(value: js.Array[InteractionType]): Self = this.set("conversionPathValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversionPathValue: Self = this.set("conversionPathValue", js.undefined)
    @scala.inline
    def setPrimitiveValue(value: String): Self = this.set("primitiveValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimitiveValue: Self = this.set("primitiveValue", js.undefined)
  }
  
}

