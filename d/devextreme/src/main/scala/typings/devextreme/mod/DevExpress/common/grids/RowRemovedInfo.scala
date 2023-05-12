package typings.devextreme.mod.DevExpress.common.grids

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowRemovedInfo[TRowData, TKey] extends StObject {
  
  val data: TRowData
  
  val error: js.Error
  
  val key: TKey
}
object RowRemovedInfo {
  
  inline def apply[TRowData, TKey](data: TRowData, error: js.Error, key: TKey): RowRemovedInfo[TRowData, TKey] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowRemovedInfo[TRowData, TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowRemovedInfo[?, ?], TRowData, TKey] (val x: Self & (RowRemovedInfo[TRowData, TKey])) extends AnyVal {
    
    inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
