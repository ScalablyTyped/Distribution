package typings.devexpressWeb

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDateNavigator.VisibleMonthChanged event.
  */
@js.native
trait ASPxClientDateNavigatorVisibleMonthChangedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Returns the end date of the latest visible month.
    */
  var endDate: Date = js.native
  
  /**
    * Returns the start date of the latest visible month.
    */
  var startDate: Date = js.native
}
object ASPxClientDateNavigatorVisibleMonthChangedEventArgs {
  
  @scala.inline
  def apply(endDate: Date, startDate: Date): ASPxClientDateNavigatorVisibleMonthChangedEventArgs = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDateNavigatorVisibleMonthChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDateNavigatorVisibleMonthChangedEventArgsMutableBuilder[Self <: ASPxClientDateNavigatorVisibleMonthChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDate(value: Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
  }
}
