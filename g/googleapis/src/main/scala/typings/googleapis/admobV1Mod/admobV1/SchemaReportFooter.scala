package typings.googleapis.admobV1Mod.admobV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportFooter extends StObject {
  
  /**
    * Total number of rows that matched the request. Warning: This count does NOT always match the number of rows in the response. Do not make that assumption when processing the response.
    */
  var matchingRowCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Warnings associated with generation of the report.
    */
  var warnings: js.UndefOr[js.Array[SchemaReportWarning]] = js.undefined
}
object SchemaReportFooter {
  
  inline def apply(): SchemaReportFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportFooter]
  }
  
  extension [Self <: SchemaReportFooter](x: Self) {
    
    inline def setMatchingRowCount(value: String): Self = StObject.set(x, "matchingRowCount", value.asInstanceOf[js.Any])
    
    inline def setMatchingRowCountNull: Self = StObject.set(x, "matchingRowCount", null)
    
    inline def setMatchingRowCountUndefined: Self = StObject.set(x, "matchingRowCount", js.undefined)
    
    inline def setWarnings(value: js.Array[SchemaReportWarning]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: SchemaReportWarning*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
