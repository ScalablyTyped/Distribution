package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTableCell extends StObject {
  
  var v: js.UndefOr[js.Any] = js.undefined
}
object SchemaTableCell {
  
  @scala.inline
  def apply(): SchemaTableCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableCell]
  }
  
  @scala.inline
  implicit class SchemaTableCellMutableBuilder[Self <: SchemaTableCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setV(value: js.Any): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}
