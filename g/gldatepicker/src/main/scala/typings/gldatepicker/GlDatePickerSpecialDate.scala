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
  
  inline def apply(date: Date): GlDatePickerSpecialDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlDatePickerSpecialDate]
  }
  
  extension [Self <: GlDatePickerSpecialDate](x: Self) {
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
