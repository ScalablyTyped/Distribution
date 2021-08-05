package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the menu's BootstrapMenuItem object.
  */
trait BootstrapClientMenuItem
  extends StObject
     with ASPxClientMenuItem {
  
  /**
    * Gets the CSS class of the icon displayed within the menu item badge.
    */
  def GetBadgeIconCssClass(): String
  
  /**
    * Gets the text displayed within the menu item badge.
    */
  def GetBadgeText(): String
  
  /**
    * Gets the CSS class of the icon displayed by the menu item.
    */
  def GetIconCssClass(): String
  
  /**
    * Sets the CSS class of the icon displayed within the menu item badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: String): Unit
  
  /**
    * Sets the text displayed within the menu item badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: String): Unit
  
  /**
    * Sets the CSS class of the icon displayed by the menu item.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetIconCssClass(cssClass: String): Unit
  
  /**
    * Gets the immediate parent item to which the current item belongs.
    */
  @JSName("parent")
  var parent_BootstrapClientMenuItem: BootstrapClientMenuItem
}
object BootstrapClientMenuItem {
  
  inline def apply(
    GetBadgeIconCssClass: () => String,
    GetBadgeText: () => String,
    GetChecked: () => Boolean,
    GetEnabled: () => Boolean,
    GetIconCssClass: () => String,
    GetImageUrl: () => String,
    GetItem: Double => ASPxClientMenuItem,
    GetItemByName: String => ASPxClientMenuItem,
    GetItemCount: () => Double,
    GetNavigateUrl: () => String,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetBadgeIconCssClass: String => Unit,
    SetBadgeText: String => Unit,
    SetChecked: Boolean => Unit,
    SetEnabled: Boolean => Unit,
    SetIconCssClass: String => Unit,
    SetImageUrl: String => Unit,
    SetNavigateUrl: String => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit,
    index: Double,
    indexPath: String,
    menu: ASPxClientMenuBase,
    name: String,
    parent: BootstrapClientMenuItem
  ): BootstrapClientMenuItem = {
    val __obj = js.Dynamic.literal(GetBadgeIconCssClass = js.Any.fromFunction0(GetBadgeIconCssClass), GetBadgeText = js.Any.fromFunction0(GetBadgeText), GetChecked = js.Any.fromFunction0(GetChecked), GetEnabled = js.Any.fromFunction0(GetEnabled), GetIconCssClass = js.Any.fromFunction0(GetIconCssClass), GetImageUrl = js.Any.fromFunction0(GetImageUrl), GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = js.Any.fromFunction0(GetItemCount), GetNavigateUrl = js.Any.fromFunction0(GetNavigateUrl), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetBadgeIconCssClass = js.Any.fromFunction1(SetBadgeIconCssClass), SetBadgeText = js.Any.fromFunction1(SetBadgeText), SetChecked = js.Any.fromFunction1(SetChecked), SetEnabled = js.Any.fromFunction1(SetEnabled), SetIconCssClass = js.Any.fromFunction1(SetIconCssClass), SetImageUrl = js.Any.fromFunction1(SetImageUrl), SetNavigateUrl = js.Any.fromFunction1(SetNavigateUrl), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), index = index.asInstanceOf[js.Any], indexPath = indexPath.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientMenuItem]
  }
  
  extension [Self <: BootstrapClientMenuItem](x: Self) {
    
    inline def setGetBadgeIconCssClass(value: () => String): Self = StObject.set(x, "GetBadgeIconCssClass", js.Any.fromFunction0(value))
    
    inline def setGetBadgeText(value: () => String): Self = StObject.set(x, "GetBadgeText", js.Any.fromFunction0(value))
    
    inline def setGetIconCssClass(value: () => String): Self = StObject.set(x, "GetIconCssClass", js.Any.fromFunction0(value))
    
    inline def setParent(value: BootstrapClientMenuItem): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setSetBadgeIconCssClass(value: String => Unit): Self = StObject.set(x, "SetBadgeIconCssClass", js.Any.fromFunction1(value))
    
    inline def setSetBadgeText(value: String => Unit): Self = StObject.set(x, "SetBadgeText", js.Any.fromFunction1(value))
    
    inline def setSetIconCssClass(value: String => Unit): Self = StObject.set(x, "SetIconCssClass", js.Any.fromFunction1(value))
  }
}
