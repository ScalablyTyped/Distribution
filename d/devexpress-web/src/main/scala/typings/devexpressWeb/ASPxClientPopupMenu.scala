package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxPopupMenu object.
  */
@js.native
trait ASPxClientPopupMenu
  extends StObject
     with ASPxClientMenuBase {
  
  /**
    * Returns an object that invoked the popup menu.
    */
  def GetCurrentPopupElement(): js.Any = js.native
  
  /**
    * Returns an index of the object that invoked the popup menu within the ASPxPopupMenu.PopupElementID list.
    */
  def GetCurrentPopupElementIndex(): Double = js.native
  
  /**
    * Hides the popup menu.
    */
  def Hide(): Unit = js.native
  
  /**
    * Refreshes the connection between the ASPxPopupMenu and the popup element.
    */
  def RefreshPopupElementConnection(): Unit = js.native
  
  /**
    * Sets the ID of a web control or HTML element (or a list of IDs) with which the current popup menu is associated.
    * @param popupElementId A string value specifying the ID (or a list of IDs) of the web control or HTML element with which the popup menu is associated.
    */
  def SetPopupElementID(popupElementId: String): Unit = js.native
  
  /**
    * Invokes the popup menu at the popup element with the specified index.
    * @param popupElementIndex An integer value specifying the zero-based index of the popup element.
    */
  def Show(): Unit = js.native
  def Show(popupElementIndex: Double): Unit = js.native
  
  /**
    * Invokes the popup menu and displays it over the specified HTML element.
    * @param htmlElement An object specifying the HTML element relative to which position the popup menu is invoked.
    */
  def ShowAtElement(htmlElement: js.Any): Unit = js.native
  
  /**
    * Invokes the popup menu and displays it over an HTML element specified by its unique identifier.
    * @param id A string value that specifies the hierarchically qualified identifier of an HTML element relative to which position the popup menu is invoked.
    */
  def ShowAtElementByID(id: String): Unit = js.native
  
  /**
    * Invokes the popup menu at the specified position.
    * @param x An integer value specifying the x-coordinate of the popup menu's display position.
    * @param y An integer value specifying the y-coordinate of the popup menu's display position.
    */
  def ShowAtPos(x: Double, y: Double): Unit = js.native
}
