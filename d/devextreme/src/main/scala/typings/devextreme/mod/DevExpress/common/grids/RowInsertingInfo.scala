package typings.devextreme.mod.DevExpress.common.grids

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowInsertingInfo[TRowData] extends StObject {
  
  var cancel: Boolean | PromiseLike[Unit]
  
  var data: TRowData
}
object RowInsertingInfo {
  
  inline def apply[TRowData](cancel: Boolean | PromiseLike[Unit], data: TRowData): RowInsertingInfo[TRowData] = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowInsertingInfo[TRowData]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowInsertingInfo[?], TRowData] (val x: Self & RowInsertingInfo[TRowData]) extends AnyVal {
    
    inline def setCancel(value: Boolean | PromiseLike[Unit]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
