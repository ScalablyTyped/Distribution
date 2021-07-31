package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxDraggable
import typings.devextreme.mod.DevExpress.ui.dxSortable
import typings.devextreme.mod.global.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelPromise extends StObject {
  
  var component: js.UndefOr[dxSortable] = js.undefined
  
  var dropInsideItem: js.UndefOr[Boolean] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.undefined
  
  var fromComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
  
  var fromData: js.UndefOr[js.Any] = js.undefined
  
  var fromIndex: js.UndefOr[Double] = js.undefined
  
  var itemData: js.UndefOr[js.Any] = js.undefined
  
  var itemElement: js.UndefOr[dxElement] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var promise: js.UndefOr[typings.devextreme.mod.global.Promise[Unit] | JQueryPromise[Unit]] = js.undefined
  
  var toComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
  
  var toData: js.UndefOr[js.Any] = js.undefined
  
  var toIndex: js.UndefOr[Double] = js.undefined
}
object ModelPromise {
  
  @scala.inline
  def apply(): ModelPromise = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelPromise]
  }
  
  @scala.inline
  implicit class ModelPromiseMutableBuilder[Self <: ModelPromise] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxSortable): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setDropInsideItem(value: Boolean): Self = StObject.set(x, "dropInsideItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropInsideItemUndefined: Self = StObject.set(x, "dropInsideItem", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setFromComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromComponentUndefined: Self = StObject.set(x, "fromComponent", js.undefined)
    
    @scala.inline
    def setFromData(value: js.Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
    
    @scala.inline
    def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromIndexUndefined: Self = StObject.set(x, "fromIndex", js.undefined)
    
    @scala.inline
    def setItemData(value: js.Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
    
    @scala.inline
    def setItemElement(value: dxElement): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setPromise(value: typings.devextreme.mod.global.Promise[Unit] | JQueryPromise[Unit]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
    
    @scala.inline
    def setToComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToComponentUndefined: Self = StObject.set(x, "toComponent", js.undefined)
    
    @scala.inline
    def setToData(value: js.Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
    
    @scala.inline
    def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToIndexUndefined: Self = StObject.set(x, "toIndex", js.undefined)
  }
}
