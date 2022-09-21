package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRow extends StObject {
  
  /**
    * The original label of this row.
    */
  var actualLabel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Info describing predicted label distribution.
    */
  var entries: js.UndefOr[js.Array[SchemaEntry]] = js.undefined
}
object SchemaRow {
  
  inline def apply(): SchemaRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRow]
  }
  
  extension [Self <: SchemaRow](x: Self) {
    
    inline def setActualLabel(value: String): Self = StObject.set(x, "actualLabel", value.asInstanceOf[js.Any])
    
    inline def setActualLabelNull: Self = StObject.set(x, "actualLabel", null)
    
    inline def setActualLabelUndefined: Self = StObject.set(x, "actualLabel", js.undefined)
    
    inline def setEntries(value: js.Array[SchemaEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: SchemaEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
