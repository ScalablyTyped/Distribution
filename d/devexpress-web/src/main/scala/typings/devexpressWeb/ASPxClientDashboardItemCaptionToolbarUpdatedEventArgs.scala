package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.ItemCaptionToolbarUpdated event.
  */
trait ASPxClientDashboardItemCaptionToolbarUpdatedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets a component name of the dashboard item.
    */
  var ItemName: String
  
  /**
    * Provides access to caption options of the dashboard item.
    */
  var Options: js.Any
}
object ASPxClientDashboardItemCaptionToolbarUpdatedEventArgs {
  
  @scala.inline
  def apply(ItemName: String, Options: js.Any): ASPxClientDashboardItemCaptionToolbarUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(ItemName = ItemName.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemCaptionToolbarUpdatedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardItemCaptionToolbarUpdatedEventArgsMutableBuilder[Self <: ASPxClientDashboardItemCaptionToolbarUpdatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemName(value: String): Self = StObject.set(x, "ItemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
  }
}
