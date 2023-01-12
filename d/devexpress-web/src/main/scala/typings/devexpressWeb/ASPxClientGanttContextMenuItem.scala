package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A context menu item.
  */
trait ASPxClientGanttContextMenuItem extends StObject {
  
  /**
    * Returns the context menu item's subitem with the specified index. The subitem.
    * @param index The subitem's index.
    */
  def GetItem(index: Double): ASPxClientGanttContextMenuItem
  
  /**
    * Returns the context menu item's subitem with the specified name. The context menu item.
    * @param name The context menu item's name.
    */
  def GetItemByName(name: String): ASPxClientGanttContextMenuItem
  
  /**
    * Returns the number of the context menu item's subitems.
    */
  def GetItemCount(): Double
  
  /**
    * Returns the context menu item's subitems.
    */
  def GetSubItems(): ASPxClientGanttContextMenuItemCollection
  
  /**
    * Specifies whether an item separator is displayed before the context menu item.
    */
  var beginGroup: Boolean
  
  /**
    * Specifies whether the item is enabled.
    */
  var enabled: Boolean
  
  /**
    * Specifies the name of the CSS class that defines the context menu item's image.
    */
  var imageClassName: String
  
  /**
    * Specifies the Url of the menu item's image.
    */
  var imageUrl: String
  
  /**
    * Specifies the context menu item's name.
    */
  var name: String
  
  /**
    * Specifies the context menu item's navigation Url.
    */
  var navigateUrl: String
  
  /**
    * Gets the parent context menu item to which the current item belongs.
    */
  var parent: ASPxClientGanttContextMenuItem
  
  /**
    * Gets or sets the window or frame where to locate the content of the Url associated with the current menu item.
    */
  var target: String
  
  /**
    * Specifies the context menu item's text.
    */
  var text: String
  
  /**
    * Specifies the context menu item's tooltip.
    */
  var tooltip: String
}
object ASPxClientGanttContextMenuItem {
  
  inline def apply(
    GetItem: Double => ASPxClientGanttContextMenuItem,
    GetItemByName: String => ASPxClientGanttContextMenuItem,
    GetItemCount: () => Double,
    GetSubItems: () => ASPxClientGanttContextMenuItemCollection,
    beginGroup: Boolean,
    enabled: Boolean,
    imageClassName: String,
    imageUrl: String,
    name: String,
    navigateUrl: String,
    parent: ASPxClientGanttContextMenuItem,
    target: String,
    text: String,
    tooltip: String
  ): ASPxClientGanttContextMenuItem = {
    val __obj = js.Dynamic.literal(GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = js.Any.fromFunction0(GetItemCount), GetSubItems = js.Any.fromFunction0(GetSubItems), beginGroup = beginGroup.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], imageClassName = imageClassName.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], navigateUrl = navigateUrl.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttContextMenuItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientGanttContextMenuItem] (val x: Self) extends AnyVal {
    
    inline def setBeginGroup(value: Boolean): Self = StObject.set(x, "beginGroup", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setGetItem(value: Double => ASPxClientGanttContextMenuItem): Self = StObject.set(x, "GetItem", js.Any.fromFunction1(value))
    
    inline def setGetItemByName(value: String => ASPxClientGanttContextMenuItem): Self = StObject.set(x, "GetItemByName", js.Any.fromFunction1(value))
    
    inline def setGetItemCount(value: () => Double): Self = StObject.set(x, "GetItemCount", js.Any.fromFunction0(value))
    
    inline def setGetSubItems(value: () => ASPxClientGanttContextMenuItemCollection): Self = StObject.set(x, "GetSubItems", js.Any.fromFunction0(value))
    
    inline def setImageClassName(value: String): Self = StObject.set(x, "imageClassName", value.asInstanceOf[js.Any])
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNavigateUrl(value: String): Self = StObject.set(x, "navigateUrl", value.asInstanceOf[js.Any])
    
    inline def setParent(value: ASPxClientGanttContextMenuItem): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
