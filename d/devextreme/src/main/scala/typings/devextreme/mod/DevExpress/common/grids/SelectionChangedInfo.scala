package typings.devextreme.mod.DevExpress.common.grids

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionChangedInfo[TRowData, TKey] extends StObject {
  
  val currentDeselectedRowKeys: js.Array[TKey]
  
  val currentSelectedRowKeys: js.Array[TKey]
  
  val selectedRowKeys: js.Array[TKey]
  
  val selectedRowsData: js.Array[TRowData]
}
object SelectionChangedInfo {
  
  inline def apply[TRowData, TKey](
    currentDeselectedRowKeys: js.Array[TKey],
    currentSelectedRowKeys: js.Array[TKey],
    selectedRowKeys: js.Array[TKey],
    selectedRowsData: js.Array[TRowData]
  ): SelectionChangedInfo[TRowData, TKey] = {
    val __obj = js.Dynamic.literal(currentDeselectedRowKeys = currentDeselectedRowKeys.asInstanceOf[js.Any], currentSelectedRowKeys = currentSelectedRowKeys.asInstanceOf[js.Any], selectedRowKeys = selectedRowKeys.asInstanceOf[js.Any], selectedRowsData = selectedRowsData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionChangedInfo[TRowData, TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectionChangedInfo[?, ?], TRowData, TKey] (val x: Self & (SelectionChangedInfo[TRowData, TKey])) extends AnyVal {
    
    inline def setCurrentDeselectedRowKeys(value: js.Array[TKey]): Self = StObject.set(x, "currentDeselectedRowKeys", value.asInstanceOf[js.Any])
    
    inline def setCurrentDeselectedRowKeysVarargs(value: TKey*): Self = StObject.set(x, "currentDeselectedRowKeys", js.Array(value*))
    
    inline def setCurrentSelectedRowKeys(value: js.Array[TKey]): Self = StObject.set(x, "currentSelectedRowKeys", value.asInstanceOf[js.Any])
    
    inline def setCurrentSelectedRowKeysVarargs(value: TKey*): Self = StObject.set(x, "currentSelectedRowKeys", js.Array(value*))
    
    inline def setSelectedRowKeys(value: js.Array[TKey]): Self = StObject.set(x, "selectedRowKeys", value.asInstanceOf[js.Any])
    
    inline def setSelectedRowKeysVarargs(value: TKey*): Self = StObject.set(x, "selectedRowKeys", js.Array(value*))
    
    inline def setSelectedRowsData(value: js.Array[TRowData]): Self = StObject.set(x, "selectedRowsData", value.asInstanceOf[js.Any])
    
    inline def setSelectedRowsDataVarargs(value: TRowData*): Self = StObject.set(x, "selectedRowsData", js.Array(value*))
  }
}
