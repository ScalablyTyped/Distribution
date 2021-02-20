package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTableRow extends StObject {
  
  /**
    * Represents a single row in the result set, consisting of one or more
    * fields.
    */
  var f: js.UndefOr[js.Array[SchemaTableCell]] = js.native
}
object SchemaTableRow {
  
  @scala.inline
  def apply(): SchemaTableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableRow]
  }
  
  @scala.inline
  implicit class SchemaTableRowMutableBuilder[Self <: SchemaTableRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setF(value: js.Array[SchemaTableCell]): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFUndefined: Self = StObject.set(x, "f", js.undefined)
    
    @scala.inline
    def setFVarargs(value: SchemaTableCell*): Self = StObject.set(x, "f", js.Array(value :_*))
  }
}
