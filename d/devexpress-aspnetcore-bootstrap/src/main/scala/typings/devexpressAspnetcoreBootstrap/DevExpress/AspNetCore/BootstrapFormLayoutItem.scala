package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapFormLayoutItem extends StObject {
  
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
  implicit class BootstrapFormLayoutItemMutableBuilder[Self <: BootstrapFormLayoutItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormLayout(value: BootstrapFormLayout): Self = StObject.set(x, "formLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormLayoutNull: Self = StObject.set(x, "formLayout", null)
    
    @scala.inline
    def setGetCaption(value: () => String): Self = StObject.set(x, "getCaption", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItemByName(value: String => BootstrapFormLayoutItem | Null): Self = StObject.set(x, "getItemByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVisible(value: () => Boolean): Self = StObject.set(x, "getVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInstance(value: js.Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: BootstrapFormLayoutItem): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setSetCaption(value: String => Unit): Self = StObject.set(x, "setCaption", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
  }
}
