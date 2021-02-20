package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxButtonGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemovedItems extends StObject {
  
  var addedItems: js.UndefOr[js.Array[_]] = js.native
  
  var component: js.UndefOr[dxButtonGroup] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var removedItems: js.UndefOr[js.Array[_]] = js.native
}
object RemovedItems {
  
  @scala.inline
  def apply(): RemovedItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemovedItems]
  }
  
  @scala.inline
  implicit class RemovedItemsMutableBuilder[Self <: RemovedItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddedItems(value: js.Array[_]): Self = StObject.set(x, "addedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedItemsUndefined: Self = StObject.set(x, "addedItems", js.undefined)
    
    @scala.inline
    def setAddedItemsVarargs(value: js.Any*): Self = StObject.set(x, "addedItems", js.Array(value :_*))
    
    @scala.inline
    def setComponent(value: dxButtonGroup): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setRemovedItems(value: js.Array[_]): Self = StObject.set(x, "removedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedItemsUndefined: Self = StObject.set(x, "removedItems", js.undefined)
    
    @scala.inline
    def setRemovedItemsVarargs(value: js.Any*): Self = StObject.set(x, "removedItems", js.Array(value :_*))
  }
}
