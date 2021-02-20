package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapAccordionItem extends StObject {
  
  def getBadgeIconCssClass(): String = js.native
  
  def getBadgeText(): String = js.native
  
  def getEnabled(): Boolean = js.native
  
  def getIconCssClass(): String = js.native
  
  def getImageUrl(): String = js.native
  
  def getNavigateUrl(): String = js.native
  
  def getText(): String = js.native
  
  def getVisible(): Boolean = js.native
  
  val group: BootstrapAccordionGroup | Null = js.native
  
  val index: Double = js.native
  
  val instance: js.Any = js.native
  
  val name: String = js.native
  
  val navBar: BootstrapAccordion | Null = js.native
  
  def setBadgeIconCssClass(cssClass: String): Unit = js.native
  
  def setBadgeText(text: String): Unit = js.native
  
  def setEnabled(value: Boolean): Unit = js.native
  
  def setIconCssClass(cssClass: String): Unit = js.native
  
  def setImageUrl(value: String): Unit = js.native
  
  def setNavigateUrl(value: String): Unit = js.native
  
  def setText(value: String): Unit = js.native
  
  def setVisible(value: Boolean): Unit = js.native
}
object BootstrapAccordionItem {
  
  @scala.inline
  def apply(
    getBadgeIconCssClass: () => String,
    getBadgeText: () => String,
    getEnabled: () => Boolean,
    getIconCssClass: () => String,
    getImageUrl: () => String,
    getNavigateUrl: () => String,
    getText: () => String,
    getVisible: () => Boolean,
    index: Double,
    instance: js.Any,
    name: String,
    setBadgeIconCssClass: String => Unit,
    setBadgeText: String => Unit,
    setEnabled: Boolean => Unit,
    setIconCssClass: String => Unit,
    setImageUrl: String => Unit,
    setNavigateUrl: String => Unit,
    setText: String => Unit,
    setVisible: Boolean => Unit
  ): BootstrapAccordionItem = {
    val __obj = js.Dynamic.literal(getBadgeIconCssClass = js.Any.fromFunction0(getBadgeIconCssClass), getBadgeText = js.Any.fromFunction0(getBadgeText), getEnabled = js.Any.fromFunction0(getEnabled), getIconCssClass = js.Any.fromFunction0(getIconCssClass), getImageUrl = js.Any.fromFunction0(getImageUrl), getNavigateUrl = js.Any.fromFunction0(getNavigateUrl), getText = js.Any.fromFunction0(getText), getVisible = js.Any.fromFunction0(getVisible), index = index.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setBadgeIconCssClass = js.Any.fromFunction1(setBadgeIconCssClass), setBadgeText = js.Any.fromFunction1(setBadgeText), setEnabled = js.Any.fromFunction1(setEnabled), setIconCssClass = js.Any.fromFunction1(setIconCssClass), setImageUrl = js.Any.fromFunction1(setImageUrl), setNavigateUrl = js.Any.fromFunction1(setNavigateUrl), setText = js.Any.fromFunction1(setText), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[BootstrapAccordionItem]
  }
  
  @scala.inline
  implicit class BootstrapAccordionItemMutableBuilder[Self <: BootstrapAccordionItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetBadgeIconCssClass(value: () => String): Self = StObject.set(x, "getBadgeIconCssClass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBadgeText(value: () => String): Self = StObject.set(x, "getBadgeText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnabled(value: () => Boolean): Self = StObject.set(x, "getEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIconCssClass(value: () => String): Self = StObject.set(x, "getIconCssClass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetImageUrl(value: () => String): Self = StObject.set(x, "getImageUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNavigateUrl(value: () => String): Self = StObject.set(x, "getNavigateUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisible(value: () => Boolean): Self = StObject.set(x, "getVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGroup(value: BootstrapAccordionGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNull: Self = StObject.set(x, "group", null)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance(value: js.Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavBar(value: BootstrapAccordion): Self = StObject.set(x, "navBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavBarNull: Self = StObject.set(x, "navBar", null)
    
    @scala.inline
    def setSetBadgeIconCssClass(value: String => Unit): Self = StObject.set(x, "setBadgeIconCssClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBadgeText(value: String => Unit): Self = StObject.set(x, "setBadgeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEnabled(value: Boolean => Unit): Self = StObject.set(x, "setEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIconCssClass(value: String => Unit): Self = StObject.set(x, "setIconCssClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetImageUrl(value: String => Unit): Self = StObject.set(x, "setImageUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNavigateUrl(value: String => Unit): Self = StObject.set(x, "setNavigateUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
  }
}
