package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomItem[T] extends StObject {
  
  var component: js.UndefOr[T] = js.native
  
  var customItem: js.UndefOr[String | js.Any | typings.devextreme.mod.global.Promise[_] | JQueryPromise[_]] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object CustomItem {
  
  @scala.inline
  def apply[T](): CustomItem[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomItem[T]]
  }
  
  @scala.inline
  implicit class CustomItemMutableBuilder[Self <: CustomItem[_], T] (val x: Self with CustomItem[T]) extends AnyVal {
    
    @scala.inline
    def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setCustomItem(value: String | js.Any | typings.devextreme.mod.global.Promise[_] | JQueryPromise[_]): Self = StObject.set(x, "customItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomItemUndefined: Self = StObject.set(x, "customItem", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
