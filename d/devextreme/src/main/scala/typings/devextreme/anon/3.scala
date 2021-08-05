package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxFileManagerDetailsColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var columns: js.UndefOr[js.Array[dxFileManagerDetailsColumn | String]] = js.undefined
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setColumns(value: js.Array[dxFileManagerDetailsColumn | String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: (dxFileManagerDetailsColumn | String)*): Self = StObject.set(x, "columns", js.Array(value :_*))
  }
}
