package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentDeselectedRowKeys[T] extends StObject {
  
  var component: js.UndefOr[T] = js.native
  
  var currentDeselectedRowKeys: js.UndefOr[js.Array[_]] = js.native
  
  var currentSelectedRowKeys: js.UndefOr[js.Array[_]] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var selectedRowKeys: js.UndefOr[js.Array[_]] = js.native
  
  var selectedRowsData: js.UndefOr[js.Array[_]] = js.native
}
object CurrentDeselectedRowKeys {
  
  @scala.inline
  def apply[T](): CurrentDeselectedRowKeys[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentDeselectedRowKeys[T]]
  }
  
  @scala.inline
  implicit class CurrentDeselectedRowKeysMutableBuilder[Self <: CurrentDeselectedRowKeys[_], T] (val x: Self with CurrentDeselectedRowKeys[T]) extends AnyVal {
    
    @scala.inline
    def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setCurrentDeselectedRowKeys(value: js.Array[_]): Self = StObject.set(x, "currentDeselectedRowKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentDeselectedRowKeysUndefined: Self = StObject.set(x, "currentDeselectedRowKeys", js.undefined)
    
    @scala.inline
    def setCurrentDeselectedRowKeysVarargs(value: js.Any*): Self = StObject.set(x, "currentDeselectedRowKeys", js.Array(value :_*))
    
    @scala.inline
    def setCurrentSelectedRowKeys(value: js.Array[_]): Self = StObject.set(x, "currentSelectedRowKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSelectedRowKeysUndefined: Self = StObject.set(x, "currentSelectedRowKeys", js.undefined)
    
    @scala.inline
    def setCurrentSelectedRowKeysVarargs(value: js.Any*): Self = StObject.set(x, "currentSelectedRowKeys", js.Array(value :_*))
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setSelectedRowKeys(value: js.Array[_]): Self = StObject.set(x, "selectedRowKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedRowKeysUndefined: Self = StObject.set(x, "selectedRowKeys", js.undefined)
    
    @scala.inline
    def setSelectedRowKeysVarargs(value: js.Any*): Self = StObject.set(x, "selectedRowKeys", js.Array(value :_*))
    
    @scala.inline
    def setSelectedRowsData(value: js.Array[_]): Self = StObject.set(x, "selectedRowsData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedRowsDataUndefined: Self = StObject.set(x, "selectedRowsData", js.undefined)
    
    @scala.inline
    def setSelectedRowsDataVarargs(value: js.Any*): Self = StObject.set(x, "selectedRowsData", js.Array(value :_*))
  }
}
