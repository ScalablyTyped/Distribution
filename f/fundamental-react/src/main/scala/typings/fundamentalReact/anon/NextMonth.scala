package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NextMonth extends StObject {
  
  var nextMonth: js.UndefOr[String] = js.native
  
  var previousMonth: js.UndefOr[String] = js.native
  
  var show12NextYears: js.UndefOr[String] = js.native
  
  var show12PreviousYears: js.UndefOr[String] = js.native
}
object NextMonth {
  
  @scala.inline
  def apply(): NextMonth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NextMonth]
  }
  
  @scala.inline
  implicit class NextMonthMutableBuilder[Self <: NextMonth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextMonth(value: String): Self = StObject.set(x, "nextMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMonthUndefined: Self = StObject.set(x, "nextMonth", js.undefined)
    
    @scala.inline
    def setPreviousMonth(value: String): Self = StObject.set(x, "previousMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousMonthUndefined: Self = StObject.set(x, "previousMonth", js.undefined)
    
    @scala.inline
    def setShow12NextYears(value: String): Self = StObject.set(x, "show12NextYears", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow12NextYearsUndefined: Self = StObject.set(x, "show12NextYears", js.undefined)
    
    @scala.inline
    def setShow12PreviousYears(value: String): Self = StObject.set(x, "show12PreviousYears", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow12PreviousYearsUndefined: Self = StObject.set(x, "show12PreviousYears", js.undefined)
  }
}
