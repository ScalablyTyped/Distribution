package typings.devextreme.mod.DevExpress.common.grids

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragStartEventInfo[TRowData] extends StObject {
  
  val fromData: js.UndefOr[Any] = js.undefined
  
  val fromIndex: Double
  
  var itemData: js.UndefOr[TRowData] = js.undefined
  
  val itemElement: DxElement_[HTMLElement]
}
object DragStartEventInfo {
  
  inline def apply[TRowData](fromIndex: Double, itemElement: DxElement_[HTMLElement]): DragStartEventInfo[TRowData] = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragStartEventInfo[TRowData]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragStartEventInfo[?], TRowData] (val x: Self & DragStartEventInfo[TRowData]) extends AnyVal {
    
    inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
    
    inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
    
    inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
    
    inline def setItemData(value: TRowData): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
    
    inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
  }
}
