package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the Accordion's BootstrapAccordionItem object.
  */
trait BootstrapClientAccordionItem
  extends StObject
     with ASPxClientNavBarItem {
  
  /**
    * Gets the CSS class of the icon displayed within the accordion item badge.
    */
  def GetBadgeIconCssClass(): String
  
  /**
    * Gets the text displayed within the accordion item badge.
    */
  def GetBadgeText(): String
  
  /**
    * Gets the CSS class of the icon displayed by the Accordion item.
    */
  def GetIconCssClass(): String
  
  /**
    * Sets the CSS class of the icon displayed within the accordion item badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: String): Unit
  
  /**
    * Sets the text displayed within the accordion item badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: String): Unit
  
  /**
    * Sets the CSS class of the icon displayed by the Accordion item.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetIconCssClass(cssClass: String): Unit
  
  /**
    * Gets the group to which the current item belongs.
    */
  @JSName("group")
  var group_BootstrapClientAccordionItem: BootstrapClientAccordionGroup
  
  /**
    * Gets the BootstrapClientAccordion object to which the current item belongs.
    */
  @JSName("navBar")
  var navBar_BootstrapClientAccordionItem: BootstrapClientAccordion
}
object BootstrapClientAccordionItem {
  
  inline def apply(
    GetBadgeIconCssClass: () => String,
    GetBadgeText: () => String,
    GetEnabled: () => Boolean,
    GetIconCssClass: () => String,
    GetImageUrl: () => String,
    GetNavigateUrl: () => String,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetBadgeIconCssClass: String => Unit,
    SetBadgeText: String => Unit,
    SetEnabled: Boolean => Unit,
    SetIconCssClass: String => Unit,
    SetImageUrl: String => Unit,
    SetNavigateUrl: String => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit,
    group: BootstrapClientAccordionGroup,
    index: Double,
    name: String,
    navBar: BootstrapClientAccordion
  ): BootstrapClientAccordionItem = {
    val __obj = js.Dynamic.literal(GetBadgeIconCssClass = js.Any.fromFunction0(GetBadgeIconCssClass), GetBadgeText = js.Any.fromFunction0(GetBadgeText), GetEnabled = js.Any.fromFunction0(GetEnabled), GetIconCssClass = js.Any.fromFunction0(GetIconCssClass), GetImageUrl = js.Any.fromFunction0(GetImageUrl), GetNavigateUrl = js.Any.fromFunction0(GetNavigateUrl), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetBadgeIconCssClass = js.Any.fromFunction1(SetBadgeIconCssClass), SetBadgeText = js.Any.fromFunction1(SetBadgeText), SetEnabled = js.Any.fromFunction1(SetEnabled), SetIconCssClass = js.Any.fromFunction1(SetIconCssClass), SetImageUrl = js.Any.fromFunction1(SetImageUrl), SetNavigateUrl = js.Any.fromFunction1(SetNavigateUrl), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], navBar = navBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientAccordionItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BootstrapClientAccordionItem] (val x: Self) extends AnyVal {
    
    inline def setGetBadgeIconCssClass(value: () => String): Self = StObject.set(x, "GetBadgeIconCssClass", js.Any.fromFunction0(value))
    
    inline def setGetBadgeText(value: () => String): Self = StObject.set(x, "GetBadgeText", js.Any.fromFunction0(value))
    
    inline def setGetIconCssClass(value: () => String): Self = StObject.set(x, "GetIconCssClass", js.Any.fromFunction0(value))
    
    inline def setGroup(value: BootstrapClientAccordionGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setNavBar(value: BootstrapClientAccordion): Self = StObject.set(x, "navBar", value.asInstanceOf[js.Any])
    
    inline def setSetBadgeIconCssClass(value: String => Unit): Self = StObject.set(x, "SetBadgeIconCssClass", js.Any.fromFunction1(value))
    
    inline def setSetBadgeText(value: String => Unit): Self = StObject.set(x, "SetBadgeText", js.Any.fromFunction1(value))
    
    inline def setSetIconCssClass(value: String => Unit): Self = StObject.set(x, "SetIconCssClass", js.Any.fromFunction1(value))
  }
}
