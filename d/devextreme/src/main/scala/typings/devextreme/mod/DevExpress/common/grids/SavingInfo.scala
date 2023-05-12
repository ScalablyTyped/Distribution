package typings.devextreme.mod.DevExpress.common.grids

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingInfo[TRowData, TKey] extends StObject {
  
  var cancel: Boolean
  
  var changes: js.Array[DataChange[TRowData, TKey]]
  
  var promise: js.UndefOr[PromiseLike[Unit]] = js.undefined
}
object SavingInfo {
  
  inline def apply[TRowData, TKey](cancel: Boolean, changes: js.Array[DataChange[TRowData, TKey]]): SavingInfo[TRowData, TKey] = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingInfo[TRowData, TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavingInfo[?, ?], TRowData, TKey] (val x: Self & (SavingInfo[TRowData, TKey])) extends AnyVal {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setChanges(value: js.Array[DataChange[TRowData, TKey]]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesVarargs(value: (DataChange[TRowData, TKey])*): Self = StObject.set(x, "changes", js.Array(value*))
    
    inline def setPromise(value: PromiseLike[Unit]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
  }
}
