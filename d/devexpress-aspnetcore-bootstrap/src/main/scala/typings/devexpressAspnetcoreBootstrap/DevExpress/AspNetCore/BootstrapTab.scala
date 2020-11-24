package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapTab extends js.Object {
  
  def getActiveIconCssClass(): String = js.native
  
  def getActiveImageUrl(): String = js.native
  
  def getBadgeIconCssClass(): String = js.native
  
  def getBadgeText(): String = js.native
  
  def getEnabled(): Boolean = js.native
  
  def getIconCssClass(): String = js.native
  
  def getImageUrl(): String = js.native
  
  def getNavigateUrl(): String = js.native
  
  def getText(): String = js.native
  
  def getVisible(): Boolean = js.native
  
  val index: Double = js.native
  
  val instance: js.Any = js.native
  
  val name: String = js.native
  
  def setActiveIconCssClass(cssClass: String): Unit = js.native
  
  def setActiveImageUrl(value: String): Unit = js.native
  
  def setBadgeIconCssClass(cssClass: String): Unit = js.native
  
  def setBadgeText(text: String): Unit = js.native
  
  def setEnabled(value: Boolean): Unit = js.native
  
  def setIconCssClass(cssClass: String): Unit = js.native
  
  def setImageUrl(value: String): Unit = js.native
  
  def setNavigateUrl(value: String): Unit = js.native
  
  def setText(value: String): Unit = js.native
  
  def setVisible(value: Boolean): Unit = js.native
  
  val tabControl: BootstrapTabControl | Null = js.native
}
object BootstrapTab {
  
  @scala.inline
  def apply(
    getActiveIconCssClass: () => String,
    getActiveImageUrl: () => String,
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
    setActiveIconCssClass: String => Unit,
    setActiveImageUrl: String => Unit,
    setBadgeIconCssClass: String => Unit,
    setBadgeText: String => Unit,
    setEnabled: Boolean => Unit,
    setIconCssClass: String => Unit,
    setImageUrl: String => Unit,
    setNavigateUrl: String => Unit,
    setText: String => Unit,
    setVisible: Boolean => Unit
  ): BootstrapTab = {
    val __obj = js.Dynamic.literal(getActiveIconCssClass = js.Any.fromFunction0(getActiveIconCssClass), getActiveImageUrl = js.Any.fromFunction0(getActiveImageUrl), getBadgeIconCssClass = js.Any.fromFunction0(getBadgeIconCssClass), getBadgeText = js.Any.fromFunction0(getBadgeText), getEnabled = js.Any.fromFunction0(getEnabled), getIconCssClass = js.Any.fromFunction0(getIconCssClass), getImageUrl = js.Any.fromFunction0(getImageUrl), getNavigateUrl = js.Any.fromFunction0(getNavigateUrl), getText = js.Any.fromFunction0(getText), getVisible = js.Any.fromFunction0(getVisible), index = index.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setActiveIconCssClass = js.Any.fromFunction1(setActiveIconCssClass), setActiveImageUrl = js.Any.fromFunction1(setActiveImageUrl), setBadgeIconCssClass = js.Any.fromFunction1(setBadgeIconCssClass), setBadgeText = js.Any.fromFunction1(setBadgeText), setEnabled = js.Any.fromFunction1(setEnabled), setIconCssClass = js.Any.fromFunction1(setIconCssClass), setImageUrl = js.Any.fromFunction1(setImageUrl), setNavigateUrl = js.Any.fromFunction1(setNavigateUrl), setText = js.Any.fromFunction1(setText), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[BootstrapTab]
  }
  
  @scala.inline
  implicit class BootstrapTabOps[Self <: BootstrapTab] (val x: Self) extends AnyVal {
    
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
    def setGetActiveIconCssClass(value: () => String): Self = this.set("getActiveIconCssClass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActiveImageUrl(value: () => String): Self = this.set("getActiveImageUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBadgeIconCssClass(value: () => String): Self = this.set("getBadgeIconCssClass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBadgeText(value: () => String): Self = this.set("getBadgeText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnabled(value: () => Boolean): Self = this.set("getEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIconCssClass(value: () => String): Self = this.set("getIconCssClass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetImageUrl(value: () => String): Self = this.set("getImageUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNavigateUrl(value: () => String): Self = this.set("getNavigateUrl", js.Any.fromFunction0(value))
    
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
    def setSetActiveIconCssClass(value: String => Unit): Self = this.set("setActiveIconCssClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetActiveImageUrl(value: String => Unit): Self = this.set("setActiveImageUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBadgeIconCssClass(value: String => Unit): Self = this.set("setBadgeIconCssClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBadgeText(value: String => Unit): Self = this.set("setBadgeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEnabled(value: Boolean => Unit): Self = this.set("setEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIconCssClass(value: String => Unit): Self = this.set("setIconCssClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetImageUrl(value: String => Unit): Self = this.set("setImageUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNavigateUrl(value: String => Unit): Self = this.set("setNavigateUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetText(value: String => Unit): Self = this.set("setText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVisible(value: Boolean => Unit): Self = this.set("setVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTabControl(value: BootstrapTabControl): Self = this.set("tabControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabControlNull: Self = this.set("tabControl", null)
  }
}
