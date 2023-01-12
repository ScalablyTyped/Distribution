package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.ItemDrillDownStateChanged event.
  */
trait ASPxClientDashboardItemDrillDownStateChangedEventArgs
  extends StObject
     with ASPxClientDashboardItemEventArgs {
  
  /**
    * Gets the drill-down action performed in the dashboard item.
    */
  var Action: String
  
  /**
    * Gets values from the current drill-down hierarchy.
    */
  var Values: js.Array[Any]
}
object ASPxClientDashboardItemDrillDownStateChangedEventArgs {
  
  inline def apply(
    Action: String,
    IsNullValue: Any => Boolean,
    IsOthersValue: Any => Boolean,
    ItemName: String,
    Values: js.Array[Any]
  ): ASPxClientDashboardItemDrillDownStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], IsNullValue = js.Any.fromFunction1(IsNullValue), IsOthersValue = js.Any.fromFunction1(IsOthersValue), ItemName = ItemName.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemDrillDownStateChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientDashboardItemDrillDownStateChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
