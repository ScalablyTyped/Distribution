package typings.devextreme.mod.DevExpress.common.grids

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataChangeInfo[TRowData, TKey] extends StObject {
  
  val changes: js.Array[DataChange[TRowData, TKey]]
}
object DataChangeInfo {
  
  inline def apply[TRowData, TKey](changes: js.Array[DataChange[TRowData, TKey]]): DataChangeInfo[TRowData, TKey] = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataChangeInfo[TRowData, TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataChangeInfo[?, ?], TRowData, TKey] (val x: Self & (DataChangeInfo[TRowData, TKey])) extends AnyVal {
    
    inline def setChanges(value: js.Array[DataChange[TRowData, TKey]]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesVarargs(value: (DataChange[TRowData, TKey])*): Self = StObject.set(x, "changes", js.Array(value*))
  }
}
