package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.libTypesNumberMod.NumberFormatInternal
import typings.formatjsEcma402Abstract.libTypesNumberMod.NumberFormatLocaleInternalData
import typings.std.Intl.NumberFormat
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDefaultLocale extends StObject {
  
  var availableLocales: Set[String]
  
  var currencyDigitsData: Record[String, Double]
  
  def getDefaultLocale(): String
  
  def getInternalSlots(nf: NumberFormat): NumberFormatInternal
  
  var localeData: Record[String, js.UndefOr[NumberFormatLocaleInternalData]]
  
  var numberingSystemNames: js.Array[String]
}
object GetDefaultLocale {
  
  inline def apply(
    availableLocales: Set[String],
    currencyDigitsData: Record[String, Double],
    getDefaultLocale: () => String,
    getInternalSlots: NumberFormat => NumberFormatInternal,
    localeData: Record[String, js.UndefOr[NumberFormatLocaleInternalData]],
    numberingSystemNames: js.Array[String]
  ): GetDefaultLocale = {
    val __obj = js.Dynamic.literal(availableLocales = availableLocales.asInstanceOf[js.Any], currencyDigitsData = currencyDigitsData.asInstanceOf[js.Any], getDefaultLocale = js.Any.fromFunction0(getDefaultLocale), getInternalSlots = js.Any.fromFunction1(getInternalSlots), localeData = localeData.asInstanceOf[js.Any], numberingSystemNames = numberingSystemNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDefaultLocale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDefaultLocale] (val x: Self) extends AnyVal {
    
    inline def setAvailableLocales(value: Set[String]): Self = StObject.set(x, "availableLocales", value.asInstanceOf[js.Any])
    
    inline def setCurrencyDigitsData(value: Record[String, Double]): Self = StObject.set(x, "currencyDigitsData", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultLocale(value: () => String): Self = StObject.set(x, "getDefaultLocale", js.Any.fromFunction0(value))
    
    inline def setGetInternalSlots(value: NumberFormat => NumberFormatInternal): Self = StObject.set(x, "getInternalSlots", js.Any.fromFunction1(value))
    
    inline def setLocaleData(value: Record[String, js.UndefOr[NumberFormatLocaleInternalData]]): Self = StObject.set(x, "localeData", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystemNames(value: js.Array[String]): Self = StObject.set(x, "numberingSystemNames", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystemNamesVarargs(value: String*): Self = StObject.set(x, "numberingSystemNames", js.Array(value*))
  }
}
