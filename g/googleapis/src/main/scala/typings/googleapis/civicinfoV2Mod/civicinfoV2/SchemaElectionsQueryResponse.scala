package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The list of elections available for this version of the API.
  */
trait SchemaElectionsQueryResponse extends StObject {
  
  /**
    * A list of available elections
    */
  var elections: js.UndefOr[js.Array[SchemaElection]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;civicinfo#electionsQueryResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaElectionsQueryResponse {
  
  inline def apply(): SchemaElectionsQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaElectionsQueryResponse]
  }
  
  extension [Self <: SchemaElectionsQueryResponse](x: Self) {
    
    inline def setElections(value: js.Array[SchemaElection]): Self = StObject.set(x, "elections", value.asInstanceOf[js.Any])
    
    inline def setElectionsUndefined: Self = StObject.set(x, "elections", js.undefined)
    
    inline def setElectionsVarargs(value: SchemaElection*): Self = StObject.set(x, "elections", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
