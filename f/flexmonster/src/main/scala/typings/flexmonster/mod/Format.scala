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
  
  @scala.inline
  def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeautifyFloatingPoint(value: Boolean): Self = StObject.set(x, "beautifyFloatingPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeautifyFloatingPointUndefined: Self = StObject.set(x, "beautifyFloatingPoint", js.undefined)
    
    @scala.inline
    def setCurrencySymbol(value: String): Self = StObject.set(x, "currencySymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencySymbolAlign(value: String): Self = StObject.set(x, "currencySymbolAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencySymbolAlignUndefined: Self = StObject.set(x, "currencySymbolAlign", js.undefined)
    
    @scala.inline
    def setCurrencySymbolUndefined: Self = StObject.set(x, "currencySymbol", js.undefined)
    
    @scala.inline
    def setDecimalPlaces(value: Double): Self = StObject.set(x, "decimalPlaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalPlacesUndefined: Self = StObject.set(x, "decimalPlaces", js.undefined)
    
    @scala.inline
    def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalSeparatorUndefined: Self = StObject.set(x, "decimalSeparator", js.undefined)
    
    @scala.inline
    def setDivideByZeroValue(value: String): Self = StObject.set(x, "divideByZeroValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivideByZeroValueUndefined: Self = StObject.set(x, "divideByZeroValue", js.undefined)
    
    @scala.inline
    def setInfinityValue(value: String): Self = StObject.set(x, "infinityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfinityValueUndefined: Self = StObject.set(x, "infinityValue", js.undefined)
    
    @scala.inline
    def setIsPercent(value: Boolean): Self = StObject.set(x, "isPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPercentUndefined: Self = StObject.set(x, "isPercent", js.undefined)
    
    @scala.inline
    def setMaxDecimalPlaces(value: Double): Self = StObject.set(x, "maxDecimalPlaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDecimalPlacesUndefined: Self = StObject.set(x, "maxDecimalPlaces", js.undefined)
    
    @scala.inline
    def setMaxSymbols(value: Double): Self = StObject.set(x, "maxSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSymbolsUndefined: Self = StObject.set(x, "maxSymbols", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNegativeCurrencyFormat(value: String): Self = StObject.set(x, "negativeCurrencyFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeCurrencyFormatUndefined: Self = StObject.set(x, "negativeCurrencyFormat", js.undefined)
    
    @scala.inline
    def setNullValue(value: String): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullValueUndefined: Self = StObject.set(x, "nullValue", js.undefined)
    
    @scala.inline
    def setPositiveCurrencyFormat(value: String): Self = StObject.set(x, "positiveCurrencyFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositiveCurrencyFormatUndefined: Self = StObject.set(x, "positiveCurrencyFormat", js.undefined)
    
    @scala.inline
    def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setThousandsSeparator(value: String): Self = StObject.set(x, "thousandsSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThousandsSeparatorUndefined: Self = StObject.set(x, "thousandsSeparator", js.undefined)
  }
}
