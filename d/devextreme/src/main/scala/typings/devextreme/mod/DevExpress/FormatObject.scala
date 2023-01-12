package typings.devextreme.mod.DevExpress

import typings.devextreme.mod.DevExpress.common.Format
import typings.devextreme.mod.DevExpress.ui._Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatObject
  extends StObject
     with _Format {
  
  /**
    * Specifies a 3-letter ISO 4217 code for currency. Applies only if the type is &apos;currency&apos;.
    */
  var currency: js.UndefOr[String] = js.undefined
  
  /**
    * A function that converts numeric or date-time values to a string.
    */
  var formatter: js.UndefOr[js.Function1[/* value */ Double | js.Date, String]] = js.undefined
  
  /**
    * Parses string values into numeric or date-time values. Should be used with formatter or one of the predefined formats.
    */
  var parser: js.UndefOr[js.Function1[/* value */ String, Double | js.Date]] = js.undefined
  
  /**
    * Specifies a precision for values of numeric or currency format types.
    */
  var precision: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a predefined format. Does not apply if you have specified the formatter function.
    */
  var `type`: js.UndefOr[Format | String] = js.undefined
  
  /**
    * 
    */
  var useCurrencyAccountingStyle: js.UndefOr[Boolean] = js.undefined
}
object FormatObject {
  
  inline def apply(): FormatObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormatObject] (val x: Self) extends AnyVal {
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setFormatter(value: /* value */ Double | js.Date => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setParser(value: /* value */ String => Double | js.Date): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
    
    inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setType(value: Format | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUseCurrencyAccountingStyle(value: Boolean): Self = StObject.set(x, "useCurrencyAccountingStyle", value.asInstanceOf[js.Any])
    
    inline def setUseCurrencyAccountingStyleUndefined: Self = StObject.set(x, "useCurrencyAccountingStyle", js.undefined)
  }
}
