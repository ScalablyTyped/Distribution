package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.numberMod.NumberFormatInternal
import typings.formatjsEcma402Abstract.numberMod.NumberFormatLocaleInternalData
import typings.std.Intl.NumberFormat
import typings.std.Record
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberingSystemNames extends js.Object {
  
  var availableLocales: Set[String] = js.native
  
  var currencyDigitsData: Record[String, Double] = js.native
  
  def getDefaultLocale(): String = js.native
  
  def getInternalSlots(nf: NumberFormat): NumberFormatInternal = js.native
  
  var localeData: Record[String, js.UndefOr[NumberFormatLocaleInternalData]] = js.native
  
  var numberingSystemNames: js.Array[String] = js.native
}
object NumberingSystemNames {
  
  @scala.inline
  def apply(
    availableLocales: Set[String],
    currencyDigitsData: Record[String, Double],
    getDefaultLocale: () => String,
    getInternalSlots: NumberFormat => NumberFormatInternal,
    localeData: Record[String, js.UndefOr[NumberFormatLocaleInternalData]],
    numberingSystemNames: js.Array[String]
  ): NumberingSystemNames = {
    val __obj = js.Dynamic.literal(availableLocales = availableLocales.asInstanceOf[js.Any], currencyDigitsData = currencyDigitsData.asInstanceOf[js.Any], getDefaultLocale = js.Any.fromFunction0(getDefaultLocale), getInternalSlots = js.Any.fromFunction1(getInternalSlots), localeData = localeData.asInstanceOf[js.Any], numberingSystemNames = numberingSystemNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberingSystemNames]
  }
  
  @scala.inline
  implicit class NumberingSystemNamesOps[Self <: NumberingSystemNames] (val x: Self) extends AnyVal {
    
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
    def setAvailableLocales(value: Set[String]): Self = this.set("availableLocales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyDigitsData(value: Record[String, Double]): Self = this.set("currencyDigitsData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDefaultLocale(value: () => String): Self = this.set("getDefaultLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInternalSlots(value: NumberFormat => NumberFormatInternal): Self = this.set("getInternalSlots", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocaleData(value: Record[String, js.UndefOr[NumberFormatLocaleInternalData]]): Self = this.set("localeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingSystemNamesVarargs(value: String*): Self = this.set("numberingSystemNames", js.Array(value :_*))
    
    @scala.inline
    def setNumberingSystemNames(value: js.Array[String]): Self = this.set("numberingSystemNames", value.asInstanceOf[js.Any])
  }
}
