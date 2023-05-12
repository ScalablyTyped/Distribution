package typings.devextreme.mod.DevExpress.common.grids

import typings.devextreme.mod.DevExpress.common.Draggable
import typings.devextreme.mod.DevExpress.common.Sortable
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowDraggingEventInfo[TRowData] extends StObject {
  
  val fromComponent: Sortable | Draggable
  
  val fromData: js.UndefOr[Any] = js.undefined
  
  val fromIndex: Double
  
  val itemData: js.UndefOr[TRowData] = js.undefined
  
  val itemElement: DxElement_[HTMLElement]
  
  val toComponent: Sortable | Draggable
  
  val toData: js.UndefOr[Any] = js.undefined
  
  val toIndex: Double
}
object RowDraggingEventInfo {
  
  inline def apply[TRowData](
    fromComponent: Sortable | Draggable,
    fromIndex: Double,
    itemElement: DxElement_[HTMLElement],
    toComponent: Sortable | Draggable,
    toIndex: Double
  ): RowDraggingEventInfo[TRowData] = {
    val __obj = js.Dynamic.literal(fromComponent = fromComponent.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowDraggingEventInfo[TRowData]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowDraggingEventInfo[?], TRowData] (val x: Self & RowDraggingEventInfo[TRowData]) extends AnyVal {
    
    inline def setFromComponent(value: Sortable | Draggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
    
    inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
    
    inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
    
    inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
    
    inline def setItemData(value: TRowData): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
    
    inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
    
    inline def setToComponent(value: Sortable | Draggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
    
    inline def setToData(value: Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
    
    inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
    
    inline def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
  }
}
