package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientPivotGrid.PopupMenuItemClick event.
  */
@JSGlobal("ASPxClientPivotMenuItemClickEventArgs")
@js.native
open class ASPxClientPivotMenuItemClickEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientPivotMenuItemClickEventArgs {
  
  /**
    * Gets the field's area.
    */
  /* CompleteClass */
  var Area: String = js.native
  
  /**
    * Gets the field's unique identifier.
    */
  /* CompleteClass */
  var FieldID: String = js.native
  
  /**
    * Gets the index of the field value for which the popup menu has been invoked.
    */
  /* CompleteClass */
  var FieldValueIndex: Double = js.native
  
  /**
    * Gets the name of the menu item currently being clicked.
    */
  /* CompleteClass */
  var MenuItemName: String = js.native
  
  /**
    * Gets the context menu's type.
    */
  /* CompleteClass */
  var MenuType: String = js.native
}
