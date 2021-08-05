package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentDeselectedRowKeys[T] extends StObject {
  
  var component: js.UndefOr[T] = js.undefined
  
  var currentDeselectedRowKeys: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var currentSelectedRowKeys: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var selectedRowKeys: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var selectedRowsData: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object CurrentDeselectedRowKeys {
  
  inline def apply[T](): CurrentDeselectedRowKeys[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentDeselectedRowKeys[T]]
  }
  
  extension [Self <: CurrentDeselectedRowKeys[?], T](x: Self & CurrentDeselectedRowKeys[T]) {
    
    inline def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setCurrentDeselectedRowKeys(value: js.Array[js.Any]): Self = StObject.set(x, "currentDeselectedRowKeys", value.asInstanceOf[js.Any])
    
    inline def setCurrentDeselectedRowKeysUndefined: Self = StObject.set(x, "currentDeselectedRowKeys", js.undefined)
    
    inline def setCurrentDeselectedRowKeysVarargs(value: js.Any*): Self = StObject.set(x, "currentDeselectedRowKeys", js.Array(value :_*))
    
    inline def setCurrentSelectedRowKeys(value: js.Array[js.Any]): Self = StObject.set(x, "currentSelectedRowKeys", value.asInstanceOf[js.Any])
    
    inline def setCurrentSelectedRowKeysUndefined: Self = StObject.set(x, "currentSelectedRowKeys", js.undefined)
    
    inline def setCurrentSelectedRowKeysVarargs(value: js.Any*): Self = StObject.set(x, "currentSelectedRowKeys", js.Array(value :_*))
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setSelectedRowKeys(value: js.Array[js.Any]): Self = StObject.set(x, "selectedRowKeys", value.asInstanceOf[js.Any])
    
    inline def setSelectedRowKeysUndefined: Self = StObject.set(x, "selectedRowKeys", js.undefined)
    
    inline def setSelectedRowKeysVarargs(value: js.Any*): Self = StObject.set(x, "selectedRowKeys", js.Array(value :_*))
    
    inline def setSelectedRowsData(value: js.Array[js.Any]): Self = StObject.set(x, "selectedRowsData", value.asInstanceOf[js.Any])
    
    inline def setSelectedRowsDataUndefined: Self = StObject.set(x, "selectedRowsData", js.undefined)
    
    inline def setSelectedRowsDataVarargs(value: js.Any*): Self = StObject.set(x, "selectedRowsData", js.Array(value :_*))
  }
}
