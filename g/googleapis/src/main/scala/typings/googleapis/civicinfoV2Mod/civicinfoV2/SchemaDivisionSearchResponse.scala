package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDivisionSearchResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "civicinfo#divisionSearchResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  var results: js.UndefOr[js.Array[SchemaDivisionSearchResult]] = js.undefined
}
object SchemaDivisionSearchResponse {
  
  inline def apply(): SchemaDivisionSearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDivisionSearchResponse]
  }
  
  extension [Self <: SchemaDivisionSearchResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setResults(value: js.Array[SchemaDivisionSearchResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SchemaDivisionSearchResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
