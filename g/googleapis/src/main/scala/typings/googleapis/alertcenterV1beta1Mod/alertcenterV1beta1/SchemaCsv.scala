package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCsv extends StObject {
  
  /**
    * The list of data rows in a CSV file, as string arrays rather than as a single comma-separated string.
    */
  var dataRows: js.UndefOr[js.Array[SchemaCsvRow]] = js.undefined
  
  /**
    * The list of headers for data columns in a CSV file.
    */
  var headers: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCsv {
  
  inline def apply(): SchemaCsv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCsv]
  }
  
  extension [Self <: SchemaCsv](x: Self) {
    
    inline def setDataRows(value: js.Array[SchemaCsvRow]): Self = StObject.set(x, "dataRows", value.asInstanceOf[js.Any])
    
    inline def setDataRowsUndefined: Self = StObject.set(x, "dataRows", js.undefined)
    
    inline def setDataRowsVarargs(value: SchemaCsvRow*): Self = StObject.set(x, "dataRows", js.Array(value*))
    
    inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersNull: Self = StObject.set(x, "headers", null)
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
  }
}
