package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapAccordionGroup extends js.Object {
  
  def getEnabled(): Boolean = js.native
  
  def getExpanded(): Boolean = js.native
  
  def getHeaderBadgeIconCssClass(): String = js.native
  
  def getHeaderBadgeText(): String = js.native
  
  def getItem(index: Double): BootstrapAccordionItem | Null = js.native
  
  def getItemByName(name: String): BootstrapAccordionItem | Null = js.native
  
  def getItemCount(): Double = js.native
  
  def getText(): String = js.native
  
  def getVisible(): Boolean = js.native
  
  val index: Double = js.native
  
  val instance: js.Any = js.native
  
  val name: String = js.native
  
  val navBar: BootstrapAccordion | Null = js.native
  
  def setExpanded(value: Boolean): Unit = js.native
  
  def setHeaderBadgeIconCssClass(cssClass: String): Unit = js.native
  
  def setHeaderBadgeText(text: String): Unit = js.native
  
  def setText(text: String): Unit = js.native
  
  def setVisible(value: Boolean): Unit = js.native
}
object BootstrapAccordionGroup {
  
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(getEnabled = js.Any.fromFunction0(getEnabled), getExpanded = js.Any.fromFunction0(getExpanded), getHeaderBadgeIconCssClass = js.Any.fromFunction0(getHeaderBadgeIconCssClass), getHeaderBadgeText = js.Any.fromFunction0(getHeaderBadgeText), getItem = js.Any.fromFunction1(getItem), getItemByName = js.Any.fromFunction1(getItemByName), getItemCount = js.Any.fromFunction0(getItemCount), getText = js.Any.fromFunction0(getText), getVisible = js.Any.fromFunction0(getVisible), index = index.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setExpanded = js.Any.fromFunction1(setExpanded), setHeaderBadgeIconCssClass = js.Any.fromFunction1(setHeaderBadgeIconCssClass), setHeaderBadgeText = js.Any.fromFunction1(setHeaderBadgeText), setText = js.Any.fromFunction1(setText), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[BootstrapAccordionGroup]
  }
  
  @scala.inline
  implicit class BootstrapAccordionGroupOps[Self <: BootstrapAccordionGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetEnabled(value: () => Boolean): Self = this.set("getEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExpanded(value: () => Boolean): Self = this.set("getExpanded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeaderBadgeIconCssClass(value: () => String): Self = this.set("getHeaderBadgeIconCssClass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeaderBadgeText(value: () => String): Self = this.set("getHeaderBadgeText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: Double => BootstrapAccordionItem | Null): Self = this.set("getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemByName(value: String => BootstrapAccordionItem | Null): Self = this.set("getItemByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemCount(value: () => Double): Self = this.set("getItemCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = this.set("getText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisible(value: () => Boolean): Self = this.set("getVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance(value: js.Any): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetExpanded(value: Boolean => Unit): Self = this.set("setExpanded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeaderBadgeIconCssClass(value: String => Unit): Self = this.set("setHeaderBadgeIconCssClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeaderBadgeText(value: String => Unit): Self = this.set("setHeaderBadgeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetText(value: String => Unit): Self = this.set("setText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVisible(value: Boolean => Unit): Self = this.set("setVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNavBar(value: BootstrapAccordion): Self = this.set("navBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavBarNull: Self = this.set("navBar", null)
  }
}
