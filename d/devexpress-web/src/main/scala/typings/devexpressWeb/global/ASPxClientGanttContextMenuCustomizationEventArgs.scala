package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the ContextMenuCustomization event.
  */
@JSGlobal("ASPxClientGanttContextMenuCustomizationEventArgs")
@js.native
open class ASPxClientGanttContextMenuCustomizationEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttContextMenuCustomizationEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGanttContextMenuCustomizationEventArgs class with specified settings.
    * @param menuItems The collection of context menu items.
    */
  def this(menuItems: Any) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the collection of context menu items.
    */
  /* CompleteClass */
  var menuItems: typings.devexpressWeb.ASPxClientGanttContextMenuItemCollection = js.native
}
