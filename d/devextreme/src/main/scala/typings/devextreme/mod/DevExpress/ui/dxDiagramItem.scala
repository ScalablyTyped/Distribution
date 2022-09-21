package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxDiagram.DiagramItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDiagramItem extends StObject {
  
  /**
    * Returns the data item that is bound to the diagram item.
    */
  var dataItem: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies the item&apos;s internal identifier.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Returns the type of the item.
    */
  var itemType: js.UndefOr[DiagramItemType] = js.undefined
  
  /**
    * Gets the item&apos;s key from a data source.
    */
  var key: js.UndefOr[js.Object] = js.undefined
}
object dxDiagramItem {
  
  inline def apply(): dxDiagramItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramItem]
  }
  
  extension [Self <: dxDiagramItem](x: Self) {
    
    inline def setDataItem(value: Any): Self = StObject.set(x, "dataItem", value.asInstanceOf[js.Any])
    
    inline def setDataItemUndefined: Self = StObject.set(x, "dataItem", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItemType(value: DiagramItemType): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
    
    inline def setKey(value: js.Object): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
