package typings.foundation.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/abide.html#optional-javascript-configuration
trait AbidePatterns extends StObject {
  
  var alpha: js.UndefOr[js.RegExp] = js.undefined
  
  var alpha_numeric: js.UndefOr[js.RegExp] = js.undefined
  
  var card: js.UndefOr[js.RegExp] = js.undefined
  
  var color: js.UndefOr[js.RegExp] = js.undefined
  
  var cvv: js.UndefOr[js.RegExp] = js.undefined
  
  var date: js.UndefOr[js.RegExp] = js.undefined
  
  var dateISO: js.UndefOr[js.RegExp] = js.undefined
  
  var datetime: js.UndefOr[js.RegExp] = js.undefined
  
  var domain: js.UndefOr[js.RegExp] = js.undefined
  
  var email: js.UndefOr[js.RegExp] = js.undefined
  
  var integer: js.UndefOr[js.RegExp] = js.undefined
  
  var month_day_year: js.UndefOr[js.RegExp] = js.undefined
  
  var number: js.UndefOr[js.RegExp] = js.undefined
  
  var time: js.UndefOr[js.RegExp] = js.undefined
  
  var url: js.UndefOr[js.RegExp] = js.undefined
}
object AbidePatterns {
  
  inline def apply(): AbidePatterns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbidePatterns]
  }
  
  extension [Self <: AbidePatterns](x: Self) {
    
    inline def setAlpha(value: js.RegExp): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setAlpha_numeric(value: js.RegExp): Self = StObject.set(x, "alpha_numeric", value.asInstanceOf[js.Any])
    
    inline def setAlpha_numericUndefined: Self = StObject.set(x, "alpha_numeric", js.undefined)
    
    inline def setCard(value: js.RegExp): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setColor(value: js.RegExp): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCvv(value: js.RegExp): Self = StObject.set(x, "cvv", value.asInstanceOf[js.Any])
    
    inline def setCvvUndefined: Self = StObject.set(x, "cvv", js.undefined)
    
    inline def setDate(value: js.RegExp): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateISO(value: js.RegExp): Self = StObject.set(x, "dateISO", value.asInstanceOf[js.Any])
    
    inline def setDateISOUndefined: Self = StObject.set(x, "dateISO", js.undefined)
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDatetime(value: js.RegExp): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
    
    inline def setDomain(value: js.RegExp): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setEmail(value: js.RegExp): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setInteger(value: js.RegExp): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
    
    inline def setIntegerUndefined: Self = StObject.set(x, "integer", js.undefined)
    
    inline def setMonth_day_year(value: js.RegExp): Self = StObject.set(x, "month_day_year", value.asInstanceOf[js.Any])
    
    inline def setMonth_day_yearUndefined: Self = StObject.set(x, "month_day_year", js.undefined)
    
    inline def setNumber(value: js.RegExp): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setTime(value: js.RegExp): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setUrl(value: js.RegExp): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
