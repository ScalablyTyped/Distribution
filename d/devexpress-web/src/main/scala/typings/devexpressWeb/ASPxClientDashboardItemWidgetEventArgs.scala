package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events related to client widgets used to visualize data in dashboard items.
  */
@js.native
trait ASPxClientDashboardItemWidgetEventArgs extends ASPxClientEventArgs {
  
  /**
    * Returns an underlying widget corresponding to the current dashboard item.
    */
  def GetWidget(): js.Any = js.native
  
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    */
  var ItemName: String = js.native
}
object ASPxClientDashboardItemWidgetEventArgs {
  
  @scala.inline
  def apply(GetWidget: () => js.Any, ItemName: String): ASPxClientDashboardItemWidgetEventArgs = {
    val __obj = js.Dynamic.literal(GetWidget = js.Any.fromFunction0(GetWidget), ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemWidgetEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardItemWidgetEventArgsMutableBuilder[Self <: ASPxClientDashboardItemWidgetEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetWidget(value: () => js.Any): Self = StObject.set(x, "GetWidget", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItemName(value: String): Self = StObject.set(x, "ItemName", value.asInstanceOf[js.Any])
  }
}
