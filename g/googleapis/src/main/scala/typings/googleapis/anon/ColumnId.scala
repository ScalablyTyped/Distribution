package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnId extends StObject {
  
  var columnId: js.UndefOr[Double] = js.undefined
  
  var tableIndex: js.UndefOr[Double] = js.undefined
}
object ColumnId {
  
  @scala.inline
  def apply(): ColumnId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnId]
  }
  
  @scala.inline
  implicit class ColumnIdMutableBuilder[Self <: ColumnId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnId(value: Double): Self = StObject.set(x, "columnId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIdUndefined: Self = StObject.set(x, "columnId", js.undefined)
    
    @scala.inline
    def setTableIndex(value: Double): Self = StObject.set(x, "tableIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIndexUndefined: Self = StObject.set(x, "tableIndex", js.undefined)
  }
}
