package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapFormLayoutItem extends js.Object {
  
  val formLayout: BootstrapFormLayout | Null = js.native
  
  def getCaption(): String = js.native
  
  def getItemByName(name: String): BootstrapFormLayoutItem | Null = js.native
  
  def getVisible(): Boolean = js.native
  
  val instance: js.Any = js.native
  
  val name: String = js.native
  
  val parent: BootstrapFormLayoutItem | Null = js.native
  
  def setCaption(caption: String): Unit = js.native
  
  def setVisible(value: Boolean): Unit = js.native
}
object BootstrapFormLayoutItem {
  
  @scala.inline
  def apply(
    getCaption: () => String,
    getItemByName: String => BootstrapFormLayoutItem | Null,
    getVisible: () => Boolean,
    instance: js.Any,
    name: String,
    setCaption: String => Unit,
    setVisible: Boolean => Unit
  ): BootstrapFormLayoutItem = {
    val __obj = js.Dynamic.literal(getCaption = js.Any.fromFunction0(getCaption), getItemByName = js.Any.fromFunction1(getItemByName), getVisible = js.Any.fromFunction0(getVisible), instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setCaption = js.Any.fromFunction1(setCaption), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[BootstrapFormLayoutItem]
  }
  
  @scala.inline
  implicit class BootstrapFormLayoutItemOps[Self <: BootstrapFormLayoutItem] (val x: Self) extends AnyVal {
    
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
    def setGetCaption(value: () => String): Self = this.set("getCaption", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItemByName(value: String => BootstrapFormLayoutItem | Null): Self = this.set("getItemByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVisible(value: () => Boolean): Self = this.set("getVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInstance(value: js.Any): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetCaption(value: String => Unit): Self = this.set("setCaption", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVisible(value: Boolean => Unit): Self = this.set("setVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormLayout(value: BootstrapFormLayout): Self = this.set("formLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormLayoutNull: Self = this.set("formLayout", null)
    
    @scala.inline
    def setParent(value: BootstrapFormLayoutItem): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
  }
}
