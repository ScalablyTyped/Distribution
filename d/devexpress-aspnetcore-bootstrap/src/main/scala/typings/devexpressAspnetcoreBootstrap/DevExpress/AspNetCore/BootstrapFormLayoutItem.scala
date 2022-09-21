package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapFormLayoutItem extends StObject {
  
  val formLayout: BootstrapFormLayout | Null
  
  def getCaption(): String
  
  def getItemByName(name: String): BootstrapFormLayoutItem | Null
  
  def getVisible(): Boolean
  
  /* protected */ val instance: Any
  
  val name: String
  
  val parent: BootstrapFormLayoutItem | Null
  
  def setCaption(caption: String): Unit
  
  def setVisible(value: Boolean): Unit
}
object BootstrapFormLayoutItem {
  
  inline def apply(
    getCaption: () => String,
    getItemByName: String => BootstrapFormLayoutItem | Null,
    getVisible: () => Boolean,
    instance: Any,
    name: String,
    setCaption: String => Unit,
    setVisible: Boolean => Unit
  ): BootstrapFormLayoutItem = {
    val __obj = js.Dynamic.literal(getCaption = js.Any.fromFunction0(getCaption), getItemByName = js.Any.fromFunction1(getItemByName), getVisible = js.Any.fromFunction0(getVisible), instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setCaption = js.Any.fromFunction1(setCaption), setVisible = js.Any.fromFunction1(setVisible), formLayout = null, parent = null)
    __obj.asInstanceOf[BootstrapFormLayoutItem]
  }
  
  extension [Self <: BootstrapFormLayoutItem](x: Self) {
    
    inline def setFormLayout(value: BootstrapFormLayout): Self = StObject.set(x, "formLayout", value.asInstanceOf[js.Any])
    
    inline def setFormLayoutNull: Self = StObject.set(x, "formLayout", null)
    
    inline def setGetCaption(value: () => String): Self = StObject.set(x, "getCaption", js.Any.fromFunction0(value))
    
    inline def setGetItemByName(value: String => BootstrapFormLayoutItem | Null): Self = StObject.set(x, "getItemByName", js.Any.fromFunction1(value))
    
    inline def setGetVisible(value: () => Boolean): Self = StObject.set(x, "getVisible", js.Any.fromFunction0(value))
    
    inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: BootstrapFormLayoutItem): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setSetCaption(value: String => Unit): Self = StObject.set(x, "setCaption", js.Any.fromFunction1(value))
    
    inline def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
  }
}
