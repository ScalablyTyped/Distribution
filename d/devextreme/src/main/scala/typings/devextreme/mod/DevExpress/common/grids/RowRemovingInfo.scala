package typings.devextreme.mod.DevExpress.common.grids

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowRemovingInfo[TRowData, TKey] extends StObject {
  
  var cancel: Boolean | PromiseLike[Unit]
  
  val data: TRowData
  
  val key: TKey
}
object RowRemovingInfo {
  
  inline def apply[TRowData, TKey](cancel: Boolean | PromiseLike[Unit], data: TRowData, key: TKey): RowRemovingInfo[TRowData, TKey] = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowRemovingInfo[TRowData, TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowRemovingInfo[?, ?], TRowData, TKey] (val x: Self & (RowRemovingInfo[TRowData, TKey])) extends AnyVal {
    
    inline def setCancel(value: Boolean | PromiseLike[Unit]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
