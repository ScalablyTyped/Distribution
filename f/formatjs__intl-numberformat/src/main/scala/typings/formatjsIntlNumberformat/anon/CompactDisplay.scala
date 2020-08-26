package typings.formatjsIntlNumberformat.anon

import typings.formatjsIntlNumberformat.typesMod.NumberFormatOptionsCompactDisplay
import typings.formatjsIntlNumberformat.typesMod.NumberFormatOptionsCurrencyDisplay
import typings.formatjsIntlNumberformat.typesMod.NumberFormatOptionsCurrencySign
import typings.formatjsIntlNumberformat.typesMod.NumberFormatOptionsNotation
import typings.formatjsIntlNumberformat.typesMod.NumberFormatOptionsStyle
import typings.formatjsIntlNumberformat.typesMod.NumberFormatOptionsUnitDisplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompactDisplay extends js.Object {
  var compactDisplay: js.UndefOr[NumberFormatOptionsCompactDisplay] = js.native
  var currency: js.UndefOr[String] = js.native
  var currencyDisplay: js.UndefOr[NumberFormatOptionsCurrencyDisplay] = js.native
  var currencySign: js.UndefOr[NumberFormatOptionsCurrencySign] = js.native
  var notation: NumberFormatOptionsNotation = js.native
  var numberingSystem: String = js.native
  var style: NumberFormatOptionsStyle = js.native
  var unit: js.UndefOr[String] = js.native
  var unitDisplay: js.UndefOr[NumberFormatOptionsUnitDisplay] = js.native
  var useGrouping: Boolean = js.native
}

object CompactDisplay {
  @scala.inline
  def apply(
    notation: NumberFormatOptionsNotation,
    numberingSystem: String,
    style: NumberFormatOptionsStyle,
    useGrouping: Boolean
  ): CompactDisplay = {
    val __obj = js.Dynamic.literal(notation = notation.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], useGrouping = useGrouping.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompactDisplay]
  }
  @scala.inline
  implicit class CompactDisplayOps[Self <: CompactDisplay] (val x: Self) extends AnyVal {
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
    def setNotation(value: NumberFormatOptionsNotation): Self = this.set("notation", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberingSystem(value: String): Self = this.set("numberingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: NumberFormatOptionsStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseGrouping(value: Boolean): Self = this.set("useGrouping", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompactDisplay(value: NumberFormatOptionsCompactDisplay): Self = this.set("compactDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompactDisplay: Self = this.set("compactDisplay", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setCurrencyDisplay(value: NumberFormatOptionsCurrencyDisplay): Self = this.set("currencyDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyDisplay: Self = this.set("currencyDisplay", js.undefined)
    @scala.inline
    def setCurrencySign(value: NumberFormatOptionsCurrencySign): Self = this.set("currencySign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencySign: Self = this.set("currencySign", js.undefined)
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    @scala.inline
    def setUnitDisplay(value: NumberFormatOptionsUnitDisplay): Self = this.set("unitDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnitDisplay: Self = this.set("unitDisplay", js.undefined)
  }
  
}

