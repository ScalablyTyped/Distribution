package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.ActionAvailabilityChanged event.
  */
trait ASPxClientActionAvailabilityChangedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the component name of the dashboard item.
    */
  var ItemName: String
}
object ASPxClientActionAvailabilityChangedEventArgs {
  
  inline def apply(ItemName: String): ASPxClientActionAvailabilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientActionAvailabilityChangedEventArgs]
  }
  
  extension [Self <: ASPxClientActionAvailabilityChangedEventArgs](x: Self) {
    
    inline def setItemName(value: String): Self = StObject.set(x, "ItemName", value.asInstanceOf[js.Any])
  }
}
