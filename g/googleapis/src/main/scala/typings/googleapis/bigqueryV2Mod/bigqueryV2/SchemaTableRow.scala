package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTableRow extends StObject {
  
  /**
    * Represents a single row in the result set, consisting of one or more
    * fields.
    */
  var f: js.UndefOr[js.Array[SchemaTableCell]] = js.undefined
}
object SchemaTableRow {
  
  inline def apply(): SchemaTableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableRow]
  }
  
  extension [Self <: SchemaTableRow](x: Self) {
    
    inline def setF(value: js.Array[SchemaTableCell]): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    inline def setFUndefined: Self = StObject.set(x, "f", js.undefined)
    
    inline def setFVarargs(value: SchemaTableCell*): Self = StObject.set(x, "f", js.Array(value :_*))
  }
}
