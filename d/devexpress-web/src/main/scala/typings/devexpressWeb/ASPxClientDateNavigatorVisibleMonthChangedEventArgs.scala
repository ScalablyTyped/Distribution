package typings.devexpressWeb

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDateNavigator.VisibleMonthChanged event.
  */
trait ASPxClientDateNavigatorVisibleMonthChangedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Returns the end date of the latest visible month.
    */
  var endDate: Date
  
  /**
    * Returns the start date of the latest visible month.
    */
  var startDate: Date
}
object ASPxClientDateNavigatorVisibleMonthChangedEventArgs {
  
  inline def apply(endDate: Date, startDate: Date): ASPxClientDateNavigatorVisibleMonthChangedEventArgs = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDateNavigatorVisibleMonthChangedEventArgs]
  }
  
  extension [Self <: ASPxClientDateNavigatorVisibleMonthChangedEventArgs](x: Self) {
    
    inline def setEndDate(value: Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
  }
}
