package typings.devextreme.mod.DevExpress.common.grids

import typings.devextreme.mod.DevExpress.core.DeepPartial
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowUpdatingInfo[TRowData, TKey] extends StObject {
  
  var cancel: Boolean | PromiseLike[Unit]
  
  val key: TKey
  
  var newData: DeepPartial[TRowData]
  
  val oldData: TRowData
}
object RowUpdatingInfo {
  
  inline def apply[TRowData, TKey](cancel: Boolean | PromiseLike[Unit], key: TKey, newData: DeepPartial[TRowData], oldData: TRowData): RowUpdatingInfo[TRowData, TKey] = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], newData = newData.asInstanceOf[js.Any], oldData = oldData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowUpdatingInfo[TRowData, TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowUpdatingInfo[?, ?], TRowData, TKey] (val x: Self & (RowUpdatingInfo[TRowData, TKey])) extends AnyVal {
    
    inline def setCancel(value: Boolean | PromiseLike[Unit]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNewData(value: DeepPartial[TRowData]): Self = StObject.set(x, "newData", value.asInstanceOf[js.Any])
    
    inline def setOldData(value: TRowData): Self = StObject.set(x, "oldData", value.asInstanceOf[js.Any])
  }
}
