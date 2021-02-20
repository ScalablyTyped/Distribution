package typings.foundation.Foundation

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/abide.html#optional-javascript-configuration
@js.native
trait AbidePatterns extends StObject {
  
  var alpha: js.UndefOr[RegExp] = js.native
  
  var alpha_numeric: js.UndefOr[RegExp] = js.native
  
  var card: js.UndefOr[RegExp] = js.native
  
  var color: js.UndefOr[RegExp] = js.native
  
  var cvv: js.UndefOr[RegExp] = js.native
  
  var date: js.UndefOr[RegExp] = js.native
  
  var dateISO: js.UndefOr[RegExp] = js.native
  
  var datetime: js.UndefOr[RegExp] = js.native
  
  var domain: js.UndefOr[RegExp] = js.native
  
  var email: js.UndefOr[RegExp] = js.native
  
  var integer: js.UndefOr[RegExp] = js.native
  
  var month_day_year: js.UndefOr[RegExp] = js.native
  
  var number: js.UndefOr[RegExp] = js.native
  
  var time: js.UndefOr[RegExp] = js.native
  
  var url: js.UndefOr[RegExp] = js.native
}
object AbidePatterns {
  
  @scala.inline
  def apply(): AbidePatterns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbidePatterns]
  }
  
  @scala.inline
  implicit class AbidePatternsMutableBuilder[Self <: AbidePatterns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: RegExp): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setAlpha_numeric(value: RegExp): Self = StObject.set(x, "alpha_numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlpha_numericUndefined: Self = StObject.set(x, "alpha_numeric", js.undefined)
    
    @scala.inline
    def setCard(value: RegExp): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    @scala.inline
    def setColor(value: RegExp): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCvv(value: RegExp): Self = StObject.set(x, "cvv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCvvUndefined: Self = StObject.set(x, "cvv", js.undefined)
    
    @scala.inline
    def setDate(value: RegExp): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateISO(value: RegExp): Self = StObject.set(x, "dateISO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateISOUndefined: Self = StObject.set(x, "dateISO", js.undefined)
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDatetime(value: RegExp): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
    
    @scala.inline
    def setDomain(value: RegExp): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setEmail(value: RegExp): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setInteger(value: RegExp): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerUndefined: Self = StObject.set(x, "integer", js.undefined)
    
    @scala.inline
    def setMonth_day_year(value: RegExp): Self = StObject.set(x, "month_day_year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth_day_yearUndefined: Self = StObject.set(x, "month_day_year", js.undefined)
    
    @scala.inline
    def setNumber(value: RegExp): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setTime(value: RegExp): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def setUrl(value: RegExp): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
