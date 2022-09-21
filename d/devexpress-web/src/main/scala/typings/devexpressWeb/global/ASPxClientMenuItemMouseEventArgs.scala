package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for client events which relate to mouse hovering (such as entering or leaving) over menu items.
  */
@JSGlobal("ASPxClientMenuItemMouseEventArgs")
@js.native
open class ASPxClientMenuItemMouseEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientMenuItemMouseEventArgs {
  /**
    * Initializes a new ASPxClientMenuItemMouseEventArgs object with the specified settings.
    * @param item An ASPxClientMenuItem object that represents an item related to the event.
    * @param htmlElement An HTML object that contains the processed item.
    */
  def this(item: typings.devexpressWeb.ASPxClientMenuItem, htmlElement: Any) = this()
  
  /**
    * Gets the HTML object that contains the processed item.
    */
  /* CompleteClass */
  var htmlElement: Any = js.native
  
  /**
    * Gets the menu item object related to the event.
    */
  /* CompleteClass */
  var item: typings.devexpressWeb.ASPxClientMenuItem = js.native
}
