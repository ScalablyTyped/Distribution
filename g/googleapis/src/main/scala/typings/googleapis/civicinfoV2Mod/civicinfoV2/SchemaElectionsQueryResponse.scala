package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaElectionsQueryResponse extends StObject {
  
  /**
    * A list of available elections
    */
  var elections: js.UndefOr[js.Array[SchemaElection]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "civicinfo#electionsQueryResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaElectionsQueryResponse {
  
  inline def apply(): SchemaElectionsQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaElectionsQueryResponse]
  }
  
  extension [Self <: SchemaElectionsQueryResponse](x: Self) {
    
    inline def setElections(value: js.Array[SchemaElection]): Self = StObject.set(x, "elections", value.asInstanceOf[js.Any])
    
    inline def setElectionsUndefined: Self = StObject.set(x, "elections", js.undefined)
    
    inline def setElectionsVarargs(value: SchemaElection*): Self = StObject.set(x, "elections", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
