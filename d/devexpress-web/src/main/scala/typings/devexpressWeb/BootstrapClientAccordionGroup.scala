package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the Accordion's BootstrapAccordionGroup object.
  */
trait BootstrapClientAccordionGroup
  extends StObject
     with ASPxClientNavBarGroup {
  
  /**
    * Gets the CSS class of the icon displayed within an accordion group header badge.
    */
  def GetHeaderBadgeIconCssClass(): String
  
  /**
    * Gets the text displayed within an accordion group header badge.
    */
  def GetHeaderBadgeText(): String
  
  /**
    * Sets the CSS class of the icon displayed within an accordion group header badge.
    * @param cssClass A String containing the name of a CSS class.
    */
  def SetHeaderBadgeIconCssClass(cssClass: String): Unit
  
  /**
    * Sets the text displayed within an accordion group header badge.
    * @param text A String specifying the badge text.
    */
  def SetHeaderBadgeText(text: String): Unit
  
  /**
    * Gets the BootstrapClientAccordion object to which the current group belongs.
    */
  @JSName("navBar")
  var navBar_BootstrapClientAccordionGroup: BootstrapClientAccordion
}
object BootstrapClientAccordionGroup {
  
  inline def apply(
    GetEnabled: () => Boolean,
    GetExpanded: () => Boolean,
    GetHeaderBadgeIconCssClass: () => String,
    GetHeaderBadgeText: () => String,
    GetItem: Double => ASPxClientNavBarItem,
    GetItemByName: String => ASPxClientNavBarItem,
    GetItemCount: () => Double,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetExpanded: Boolean => Unit,
    SetHeaderBadgeIconCssClass: String => Unit,
    SetHeaderBadgeText: String => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit,
    index: Double,
    name: String,
    navBar: BootstrapClientAccordion
  ): BootstrapClientAccordionGroup = {
    val __obj = js.Dynamic.literal(GetEnabled = js.Any.fromFunction0(GetEnabled), GetExpanded = js.Any.fromFunction0(GetExpanded), GetHeaderBadgeIconCssClass = js.Any.fromFunction0(GetHeaderBadgeIconCssClass), GetHeaderBadgeText = js.Any.fromFunction0(GetHeaderBadgeText), GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = js.Any.fromFunction0(GetItemCount), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetExpanded = js.Any.fromFunction1(SetExpanded), SetHeaderBadgeIconCssClass = js.Any.fromFunction1(SetHeaderBadgeIconCssClass), SetHeaderBadgeText = js.Any.fromFunction1(SetHeaderBadgeText), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], navBar = navBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientAccordionGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BootstrapClientAccordionGroup] (val x: Self) extends AnyVal {
    
    inline def setGetHeaderBadgeIconCssClass(value: () => String): Self = StObject.set(x, "GetHeaderBadgeIconCssClass", js.Any.fromFunction0(value))
    
    inline def setGetHeaderBadgeText(value: () => String): Self = StObject.set(x, "GetHeaderBadgeText", js.Any.fromFunction0(value))
    
    inline def setNavBar(value: BootstrapClientAccordion): Self = StObject.set(x, "navBar", value.asInstanceOf[js.Any])
    
    inline def setSetHeaderBadgeIconCssClass(value: String => Unit): Self = StObject.set(x, "SetHeaderBadgeIconCssClass", js.Any.fromFunction1(value))
    
    inline def setSetHeaderBadgeText(value: String => Unit): Self = StObject.set(x, "SetHeaderBadgeText", js.Any.fromFunction1(value))
  }
}
