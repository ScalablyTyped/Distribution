package typings.devextreme.mod.DevExpress.common.grids

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowDraggingTemplateData[TRowData] extends StObject {
  
  val itemData: TRowData
  
  val itemElement: DxElement_[HTMLElement]
}
object RowDraggingTemplateData {
  
  inline def apply[TRowData](itemData: TRowData, itemElement: DxElement_[HTMLElement]): RowDraggingTemplateData[TRowData] = {
    val __obj = js.Dynamic.literal(itemData = itemData.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowDraggingTemplateData[TRowData]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowDraggingTemplateData[?], TRowData] (val x: Self & RowDraggingTemplateData[TRowData]) extends AnyVal {
    
    inline def setItemData(value: TRowData): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
  }
}
