package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapAccordionGroup extends StObject {
  
  def getEnabled(): Boolean
  
  def getExpanded(): Boolean
  
  def getHeaderBadgeIconCssClass(): String
  
  def getHeaderBadgeText(): String
  
  def getItem(index: Double): BootstrapAccordionItem | Null
  
  def getItemByName(name: String): BootstrapAccordionItem | Null
  
  def getItemCount(): Double
  
  def getText(): String
  
  def getVisible(): Boolean
  
  val index: Double
  
  /* protected */ val instance: js.Any
  
  val name: String
  
  val navBar: BootstrapAccordion | Null
  
  def setExpanded(value: Boolean): Unit
  
  def setHeaderBadgeIconCssClass(cssClass: String): Unit
  
  def setHeaderBadgeText(text: String): Unit
  
  def setText(text: String): Unit
  
  def setVisible(value: Boolean): Unit
}
object BootstrapAccordionGroup {
  
  inline def apply(
    getEnabled: () => Boolean,
    getExpanded: () => Boolean,
    getHeaderBadgeIconCssClass: () => String,
    getHeaderBadgeText: () => String,
    getItem: Double => BootstrapAccordionItem | Null,
    getItemByName: String => BootstrapAccordionItem | Null,
    getItemCount: () => Double,
    getText: () => String,
    getVisible: () => Boolean,
    index: Double,
    instance: js.Any,
    name: String,
    setExpanded: Boolean => Unit,
    setHeaderBadgeIconCssClass: String => Unit,
    setHeaderBadgeText: String => Unit,
    setText: String => Unit,
    setVisible: Boolean => Unit
  ): BootstrapAccordionGroup = {
    val __obj = js.Dynamic.literal(getEnabled = js.Any.fromFunction0(getEnabled), getExpanded = js.Any.fromFunction0(getExpanded), getHeaderBadgeIconCssClass = js.Any.fromFunction0(getHeaderBadgeIconCssClass), getHeaderBadgeText = js.Any.fromFunction0(getHeaderBadgeText), getItem = js.Any.fromFunction1(getItem), getItemByName = js.Any.fromFunction1(getItemByName), getItemCount = js.Any.fromFunction0(getItemCount), getText = js.Any.fromFunction0(getText), getVisible = js.Any.fromFunction0(getVisible), index = index.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setExpanded = js.Any.fromFunction1(setExpanded), setHeaderBadgeIconCssClass = js.Any.fromFunction1(setHeaderBadgeIconCssClass), setHeaderBadgeText = js.Any.fromFunction1(setHeaderBadgeText), setText = js.Any.fromFunction1(setText), setVisible = js.Any.fromFunction1(setVisible), navBar = null)
    __obj.asInstanceOf[BootstrapAccordionGroup]
  }
  
  extension [Self <: BootstrapAccordionGroup](x: Self) {
    
    inline def setGetEnabled(value: () => Boolean): Self = StObject.set(x, "getEnabled", js.Any.fromFunction0(value))
    
    inline def setGetExpanded(value: () => Boolean): Self = StObject.set(x, "getExpanded", js.Any.fromFunction0(value))
    
    inline def setGetHeaderBadgeIconCssClass(value: () => String): Self = StObject.set(x, "getHeaderBadgeIconCssClass", js.Any.fromFunction0(value))
    
    inline def setGetHeaderBadgeText(value: () => String): Self = StObject.set(x, "getHeaderBadgeText", js.Any.fromFunction0(value))
    
    inline def setGetItem(value: Double => BootstrapAccordionItem | Null): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setGetItemByName(value: String => BootstrapAccordionItem | Null): Self = StObject.set(x, "getItemByName", js.Any.fromFunction1(value))
    
    inline def setGetItemCount(value: () => Double): Self = StObject.set(x, "getItemCount", js.Any.fromFunction0(value))
    
    inline def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    inline def setGetVisible(value: () => Boolean): Self = StObject.set(x, "getVisible", js.Any.fromFunction0(value))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setInstance(value: js.Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNavBar(value: BootstrapAccordion): Self = StObject.set(x, "navBar", value.asInstanceOf[js.Any])
    
    inline def setNavBarNull: Self = StObject.set(x, "navBar", null)
    
    inline def setSetExpanded(value: Boolean => Unit): Self = StObject.set(x, "setExpanded", js.Any.fromFunction1(value))
    
    inline def setSetHeaderBadgeIconCssClass(value: String => Unit): Self = StObject.set(x, "setHeaderBadgeIconCssClass", js.Any.fromFunction1(value))
    
    inline def setSetHeaderBadgeText(value: String => Unit): Self = StObject.set(x, "setHeaderBadgeText", js.Any.fromFunction1(value))
    
    inline def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    inline def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
  }
}
