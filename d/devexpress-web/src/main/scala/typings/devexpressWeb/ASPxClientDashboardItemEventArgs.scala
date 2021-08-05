package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as the base class for classes that provide data for client-side events related to dashboard items.
  */
trait ASPxClientDashboardItemEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Returns whether the specified value is null. true, if the specified value is null; otherwise, false.
    * @param value The specified value.
    */
  def IsNullValue(value: js.Any): Boolean
  
  /**
    * Returns whether the specified value is 'others'. true, if the specified value is 'others'; otherwise, false.
    * @param value The specified value.
    */
  def IsOthersValue(value: js.Any): Boolean
  
  /**
    * Gets the component name of the dashboard item.
    */
  var ItemName: String
}
object ASPxClientDashboardItemEventArgs {
  
  inline def apply(IsNullValue: js.Any => Boolean, IsOthersValue: js.Any => Boolean, ItemName: String): ASPxClientDashboardItemEventArgs = {
    val __obj = js.Dynamic.literal(IsNullValue = js.Any.fromFunction1(IsNullValue), IsOthersValue = js.Any.fromFunction1(IsOthersValue), ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemEventArgs]
  }
  
  extension [Self <: ASPxClientDashboardItemEventArgs](x: Self) {
    
    inline def setIsNullValue(value: js.Any => Boolean): Self = StObject.set(x, "IsNullValue", js.Any.fromFunction1(value))
    
    inline def setIsOthersValue(value: js.Any => Boolean): Self = StObject.set(x, "IsOthersValue", js.Any.fromFunction1(value))
    
    inline def setItemName(value: String): Self = StObject.set(x, "ItemName", value.asInstanceOf[js.Any])
  }
}
