package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  var beautifyFloatingPoint: js.UndefOr[Boolean] = js.undefined
  
  var currencySymbol: js.UndefOr[String] = js.undefined
  
  var currencySymbolAlign: js.UndefOr[String] = js.undefined
  
  var decimalPlaces: js.UndefOr[Double] = js.undefined
  
  var decimalSeparator: js.UndefOr[String] = js.undefined
  
  var divideByZeroValue: js.UndefOr[String] = js.undefined
  
  var infinityValue: js.UndefOr[String] = js.undefined
  
  var isPercent: js.UndefOr[Boolean] = js.undefined
  
  var maxDecimalPlaces: js.UndefOr[Double] = js.undefined
  
  var maxSymbols: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var negativeCurrencyFormat: js.UndefOr[String] = js.undefined
  
  var nullValue: js.UndefOr[String] = js.undefined
  
  var positiveCurrencyFormat: js.UndefOr[String] = js.undefined
  
  var textAlign: js.UndefOr[String] = js.undefined
  
  var thousandsSeparator: js.UndefOr[String] = js.undefined
}
object Format {
  
  inline def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
    
    inline def setBeautifyFloatingPoint(value: Boolean): Self = StObject.set(x, "beautifyFloatingPoint", value.asInstanceOf[js.Any])
    
    inline def setBeautifyFloatingPointUndefined: Self = StObject.set(x, "beautifyFloatingPoint", js.undefined)
    
    inline def setCurrencySymbol(value: String): Self = StObject.set(x, "currencySymbol", value.asInstanceOf[js.Any])
    
    inline def setCurrencySymbolAlign(value: String): Self = StObject.set(x, "currencySymbolAlign", value.asInstanceOf[js.Any])
    
    inline def setCurrencySymbolAlignUndefined: Self = StObject.set(x, "currencySymbolAlign", js.undefined)
    
    inline def setCurrencySymbolUndefined: Self = StObject.set(x, "currencySymbol", js.undefined)
    
    inline def setDecimalPlaces(value: Double): Self = StObject.set(x, "decimalPlaces", value.asInstanceOf[js.Any])
    
    inline def setDecimalPlacesUndefined: Self = StObject.set(x, "decimalPlaces", js.undefined)
    
    inline def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
    
    inline def setDecimalSeparatorUndefined: Self = StObject.set(x, "decimalSeparator", js.undefined)
    
    inline def setDivideByZeroValue(value: String): Self = StObject.set(x, "divideByZeroValue", value.asInstanceOf[js.Any])
    
    inline def setDivideByZeroValueUndefined: Self = StObject.set(x, "divideByZeroValue", js.undefined)
    
    inline def setInfinityValue(value: String): Self = StObject.set(x, "infinityValue", value.asInstanceOf[js.Any])
    
    inline def setInfinityValueUndefined: Self = StObject.set(x, "infinityValue", js.undefined)
    
    inline def setIsPercent(value: Boolean): Self = StObject.set(x, "isPercent", value.asInstanceOf[js.Any])
    
    inline def setIsPercentUndefined: Self = StObject.set(x, "isPercent", js.undefined)
    
    inline def setMaxDecimalPlaces(value: Double): Self = StObject.set(x, "maxDecimalPlaces", value.asInstanceOf[js.Any])
    
    inline def setMaxDecimalPlacesUndefined: Self = StObject.set(x, "maxDecimalPlaces", js.undefined)
    
    inline def setMaxSymbols(value: Double): Self = StObject.set(x, "maxSymbols", value.asInstanceOf[js.Any])
    
    inline def setMaxSymbolsUndefined: Self = StObject.set(x, "maxSymbols", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNegativeCurrencyFormat(value: String): Self = StObject.set(x, "negativeCurrencyFormat", value.asInstanceOf[js.Any])
    
    inline def setNegativeCurrencyFormatUndefined: Self = StObject.set(x, "negativeCurrencyFormat", js.undefined)
    
    inline def setNullValue(value: String): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
    
    inline def setNullValueUndefined: Self = StObject.set(x, "nullValue", js.undefined)
    
    inline def setPositiveCurrencyFormat(value: String): Self = StObject.set(x, "positiveCurrencyFormat", value.asInstanceOf[js.Any])
    
    inline def setPositiveCurrencyFormatUndefined: Self = StObject.set(x, "positiveCurrencyFormat", js.undefined)
    
    inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setThousandsSeparator(value: String): Self = StObject.set(x, "thousandsSeparator", value.asInstanceOf[js.Any])
    
    inline def setThousandsSeparatorUndefined: Self = StObject.set(x, "thousandsSeparator", js.undefined)
  }
}
