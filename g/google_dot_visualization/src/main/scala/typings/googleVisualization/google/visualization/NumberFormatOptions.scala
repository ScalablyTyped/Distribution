package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberFormatOptions extends StObject {
  
  /**
    * A character to use as the decimal marker. The default is a dot (.).
    */
  var decimalSymbol: js.UndefOr[String] = js.undefined
  
  /**
    * A number specifying how many digits to display after the decimal. The default is 2. If you specify more digits than the number contains, it will display zeros for the smaller values. Truncated values will be rounded (5 rounded up).
    */
  var fractionDigits: js.UndefOr[Double] = js.undefined
  
  /**
    * A character to be used to group digits to the left of the decimal into sets of three. Default is a comma (,).
    */
  var groupingSymbol: js.UndefOr[String] = js.undefined
  
  /**
    * The text color for negative values. No default value. Values can be any acceptable HTML color value, such as "red" or "#FF0000".
    */
  var negativeColor: js.UndefOr[String] = js.undefined
  
  /**
    * A boolean, where true indicates that negative values should be surrounded by parentheses. Default is true.
    */
  var negativeParens: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A format string. When provided, all other options are ignored, except negativeColor.
    * The format string is a subset of the ICU pattern set. For instance, {pattern:'#,###%'} will result in output values "1,000%", "750%", and "50%" for values 10, 7.5, and 0.5.
    */
  var pattern: js.UndefOr[String] = js.undefined
  
  /**
    * A string prefix for the value, for example "$".
    */
  var prefix: js.UndefOr[String] = js.undefined
  
  /**
    * A string suffix for the value, for example "%".
    */
  var suffix: js.UndefOr[String] = js.undefined
}
object NumberFormatOptions {
  
  inline def apply(): NumberFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberFormatOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberFormatOptions] (val x: Self) extends AnyVal {
    
    inline def setDecimalSymbol(value: String): Self = StObject.set(x, "decimalSymbol", value.asInstanceOf[js.Any])
    
    inline def setDecimalSymbolUndefined: Self = StObject.set(x, "decimalSymbol", js.undefined)
    
    inline def setFractionDigits(value: Double): Self = StObject.set(x, "fractionDigits", value.asInstanceOf[js.Any])
    
    inline def setFractionDigitsUndefined: Self = StObject.set(x, "fractionDigits", js.undefined)
    
    inline def setGroupingSymbol(value: String): Self = StObject.set(x, "groupingSymbol", value.asInstanceOf[js.Any])
    
    inline def setGroupingSymbolUndefined: Self = StObject.set(x, "groupingSymbol", js.undefined)
    
    inline def setNegativeColor(value: String): Self = StObject.set(x, "negativeColor", value.asInstanceOf[js.Any])
    
    inline def setNegativeColorUndefined: Self = StObject.set(x, "negativeColor", js.undefined)
    
    inline def setNegativeParens(value: Boolean): Self = StObject.set(x, "negativeParens", value.asInstanceOf[js.Any])
    
    inline def setNegativeParensUndefined: Self = StObject.set(x, "negativeParens", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
