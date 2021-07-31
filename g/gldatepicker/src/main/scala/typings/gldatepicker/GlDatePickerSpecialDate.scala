package typings.gldatepicker

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlDatePickerSpecialDate
  extends StObject
     with GlDatePickerDate {
  
  var cssClass: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
}
object GlDatePickerSpecialDate {
  
  @scala.inline
  def apply(date: Date): GlDatePickerSpecialDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlDatePickerSpecialDate]
  }
  
  @scala.inline
  implicit class GlDatePickerSpecialDateMutableBuilder[Self <: GlDatePickerSpecialDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
