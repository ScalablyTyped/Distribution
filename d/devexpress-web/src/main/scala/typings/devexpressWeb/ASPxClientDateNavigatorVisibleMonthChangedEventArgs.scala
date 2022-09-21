package typings.devexpressWeb

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
  var endDate: js.Date
  
  /**
    * Returns the start date of the latest visible month.
    */
  var startDate: js.Date
}
object ASPxClientDateNavigatorVisibleMonthChangedEventArgs {
  
  inline def apply(endDate: js.Date, startDate: js.Date): ASPxClientDateNavigatorVisibleMonthChangedEventArgs = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDateNavigatorVisibleMonthChangedEventArgs]
  }
  
  extension [Self <: ASPxClientDateNavigatorVisibleMonthChangedEventArgs](x: Self) {
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
  }
}
