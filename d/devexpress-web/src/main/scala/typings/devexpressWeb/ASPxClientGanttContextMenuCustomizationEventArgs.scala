package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the ContextMenuCustomization event.
  */
trait ASPxClientGanttContextMenuCustomizationEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the collection of context menu items.
    */
  var menuItems: ASPxClientGanttContextMenuItemCollection
}
object ASPxClientGanttContextMenuCustomizationEventArgs {
  
  inline def apply(cancel: Boolean, menuItems: ASPxClientGanttContextMenuItemCollection): ASPxClientGanttContextMenuCustomizationEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], menuItems = menuItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttContextMenuCustomizationEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientGanttContextMenuCustomizationEventArgs] (val x: Self) extends AnyVal {
    
    inline def setMenuItems(value: ASPxClientGanttContextMenuItemCollection): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
  }
}
