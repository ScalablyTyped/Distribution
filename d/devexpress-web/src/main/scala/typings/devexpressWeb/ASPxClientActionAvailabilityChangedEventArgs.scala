package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.ActionAvailabilityChanged event.
  */
@js.native
trait ASPxClientActionAvailabilityChangedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the component name of the dashboard item.
    */
  var ItemName: String = js.native
}
object ASPxClientActionAvailabilityChangedEventArgs {
  
  @scala.inline
  def apply(ItemName: String): ASPxClientActionAvailabilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientActionAvailabilityChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientActionAvailabilityChangedEventArgsMutableBuilder[Self <: ASPxClientActionAvailabilityChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemName(value: String): Self = StObject.set(x, "ItemName", value.asInstanceOf[js.Any])
  }
}
