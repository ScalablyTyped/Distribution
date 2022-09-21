package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCsvRow extends StObject {
  
  /**
    * The data entries in a CSV file row, as a string array rather than a single comma-separated string.
    */
  var entries: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCsvRow {
  
  inline def apply(): SchemaCsvRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCsvRow]
  }
  
  extension [Self <: SchemaCsvRow](x: Self) {
    
    inline def setEntries(value: js.Array[String]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesNull: Self = StObject.set(x, "entries", null)
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: String*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
