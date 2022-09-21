package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.MenuItemClicked event.
  */
@JSGlobal("MenuItemClickedEventArgs")
@js.native
open class MenuItemClickedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.MenuItemClickedEventArgs {
  /**
    * Initializes a new instance of the MenuItemClickedEventArgs class with the specified menu item name.
    * @param itemName A string representing the name of the menu item.
    */
  def this(itemName: String) = this()
  
  /**
    * Gets or sets whether an event is handled, and that default actions are not required.
    */
  /* CompleteClass */
  var handled: Boolean = js.native
  
  /**
    * Gets the name of the menu item which is clicked.
    */
  /* CompleteClass */
  var itemName: String = js.native
}
