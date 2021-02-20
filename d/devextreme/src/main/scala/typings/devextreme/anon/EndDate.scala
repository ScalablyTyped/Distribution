package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndDate extends StObject {
  
  var endDate: js.UndefOr[typings.std.Date] = js.native
  
  var startDate: js.UndefOr[typings.std.Date] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object EndDate {
  
  @scala.inline
  def apply(): EndDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndDate]
  }
  
  @scala.inline
  implicit class EndDateMutableBuilder[Self <: EndDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDate(value: typings.std.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setStartDate(value: typings.std.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
