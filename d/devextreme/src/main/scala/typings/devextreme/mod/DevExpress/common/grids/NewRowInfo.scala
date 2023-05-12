package typings.devextreme.mod.DevExpress.common.grids

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewRowInfo[TRowData] extends StObject {
  
  var data: TRowData
  
  var promise: js.UndefOr[PromiseLike[Unit]] = js.undefined
}
object NewRowInfo {
  
  inline def apply[TRowData](data: TRowData): NewRowInfo[TRowData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewRowInfo[TRowData]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NewRowInfo[?], TRowData] (val x: Self & NewRowInfo[TRowData]) extends AnyVal {
    
    inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setPromise(value: PromiseLike[Unit]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
  }
}
