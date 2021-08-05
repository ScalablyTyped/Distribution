package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnId extends StObject {
  
  var columnId: js.UndefOr[Double] = js.undefined
  
  var tableIndex: js.UndefOr[Double] = js.undefined
}
object ColumnId {
  
  inline def apply(): ColumnId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnId]
  }
  
  extension [Self <: ColumnId](x: Self) {
    
    inline def setColumnId(value: Double): Self = StObject.set(x, "columnId", value.asInstanceOf[js.Any])
    
    inline def setColumnIdUndefined: Self = StObject.set(x, "columnId", js.undefined)
    
    inline def setTableIndex(value: Double): Self = StObject.set(x, "tableIndex", value.asInstanceOf[js.Any])
    
    inline def setTableIndexUndefined: Self = StObject.set(x, "tableIndex", js.undefined)
  }
}
