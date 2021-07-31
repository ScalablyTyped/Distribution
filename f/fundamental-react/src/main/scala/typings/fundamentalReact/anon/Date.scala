package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date extends StObject {
  
  var date: typings.std.Date
  
  var formattedDate: String
}
object Date {
  
  @scala.inline
  def apply(date: typings.std.Date, formattedDate: String): Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], formattedDate = formattedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  
  @scala.inline
  implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: typings.std.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedDate(value: String): Self = StObject.set(x, "formattedDate", value.asInstanceOf[js.Any])
  }
}
