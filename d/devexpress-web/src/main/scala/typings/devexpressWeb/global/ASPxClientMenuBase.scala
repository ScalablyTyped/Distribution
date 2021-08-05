package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientEventHandler
import typings.devexpressWeb.ASPxClientMenuItemClickEventHandler
import typings.devexpressWeb.ASPxClientMenuItemEventHandler
import typings.devexpressWeb.ASPxClientMenuItemMouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as the base type for the ASPxClientMenu and ASPxClientPopupMenu objects.
  */
@JSGlobal("ASPxClientMenuBase")
@js.native
class ASPxClientMenuBase ()
  extends StObject
     with typings.devexpressWeb.ASPxClientMenuBase {
  
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  
  /**
    * Occurs on the client side when a submenu closes.
    */
  /* CompleteClass */
  var CloseUp: typings.devexpressWeb.ASPxClientEvent[ASPxClientMenuItemEventHandler[typings.devexpressWeb.ASPxClientMenuBase]] = js.native
  
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
  
  /**
    * Returns the control's height.
    */
  /* CompleteClass */
  override def GetHeight(): Double = js.native
  
  /**
    * Returns the menu's root menu item specified by its index. An ASPxClientMenuItem object representing the root item located at the specified index within the menu's ASPxMenuBase.Items collection.
    * @param index An integer value specifying the zero-based index of the root menu item to be retrieved.
    */
  /* CompleteClass */
  override def GetItem(index: Double): typings.devexpressWeb.ASPxClientMenuItem = js.native
  
  /**
    * Returns a menu item specified by its name. An ASPxClientMenuItem object that represents the menu item with the specified name.
    * @param name A string value specifying the name of the menu item.
    */
  /* CompleteClass */
  override def GetItemByName(name: String): typings.devexpressWeb.ASPxClientMenuItem = js.native
  
  /**
    * Returns the number of menu items at the root menu level.
    */
  /* CompleteClass */
  override def GetItemCount(): Double = js.native
  
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  /* CompleteClass */
  override def GetMainElement(): js.Any = js.native
  
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): js.Any = js.native
  
  /**
    * Returns a root menu item.
    */
  /* CompleteClass */
  override def GetRootItem(): typings.devexpressWeb.ASPxClientMenuItem = js.native
  
  /**
    * Returns the selected item within the menu control.
    */
  /* CompleteClass */
  override def GetSelectedItem(): typings.devexpressWeb.ASPxClientMenuItem = js.native
  
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  
  /**
    * Returns the control's width.
    */
  /* CompleteClass */
  override def GetWidth(): Double = js.native
  
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  /* CompleteClass */
  override def InCallback(): Boolean = js.native
  
  /**
    * Occurs on the client side after the control has been initialized.
    */
  /* CompleteClass */
  var Init: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientControlBase]] = js.native
  
  /**
    * Fires after a menu item has been clicked.
    */
  /* CompleteClass */
  var ItemClick: typings.devexpressWeb.ASPxClientEvent[ASPxClientMenuItemClickEventHandler[typings.devexpressWeb.ASPxClientMenuBase]] = js.native
  
  /**
    * Occurs on the client side when the mouse cursor moves outside a menu item.
    */
  /* CompleteClass */
  var ItemMouseOut: typings.devexpressWeb.ASPxClientEvent[ASPxClientMenuItemMouseEventHandler[typings.devexpressWeb.ASPxClientMenuBase]] = js.native
  
  /**
    * Occurs on the client side when the mouse cursor is moved into a menu item.
    */
  /* CompleteClass */
  var ItemMouseOver: typings.devexpressWeb.ASPxClientEvent[ASPxClientMenuItemMouseEventHandler[typings.devexpressWeb.ASPxClientMenuBase]] = js.native
  
  /**
    * Occurs on the client side when a submenu pops up.
    */
  /* CompleteClass */
  var PopUp: typings.devexpressWeb.ASPxClientEvent[ASPxClientMenuItemEventHandler[typings.devexpressWeb.ASPxClientMenuBase]] = js.native
  
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  /* CompleteClass */
  override def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  /* CompleteClass */
  override def SetClientVisible(visible: Boolean): Unit = js.native
  
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  /* CompleteClass */
  override def SetHeight(height: Double): Unit = js.native
  
  /**
    * Selects the specified menu item within a menu control on the client side.
    * @param item An ASPxClientMenuItem object specifying the menu item to select.
    */
  /* CompleteClass */
  override def SetSelectedItem(item: typings.devexpressWeb.ASPxClientMenuItem): Unit = js.native
  
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  /* CompleteClass */
  override def SetVisible(visible: Boolean): Unit = js.native
  
  /**
    * Specifies the control's width in pixels.
    * @param width An integer value that specifies the control's width, in pixels.
    */
  /* CompleteClass */
  override def SetWidth(width: Double): Unit = js.native
  
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  /* CompleteClass */
  var name: String = js.native
}
object ASPxClientMenuBase {
  
  @JSGlobal("ASPxClientMenuBase")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a collection of client menu objects.
    */
  /* static member */
  inline def GetMenuCollection(): typings.devexpressWeb.ASPxClientMenuCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("GetMenuCollection")().asInstanceOf[typings.devexpressWeb.ASPxClientMenuCollection]
}
