package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The list of elections available for this version of the API.
  */
@js.native
trait SchemaElectionsQueryResponse extends StObject {
  
  /**
    * A list of available elections
    */
  var elections: js.UndefOr[js.Array[SchemaElection]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;civicinfo#electionsQueryResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaElectionsQueryResponse {
  
  @scala.inline
  def apply(): SchemaElectionsQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaElectionsQueryResponse]
  }
  
  @scala.inline
  implicit class SchemaElectionsQueryResponseMutableBuilder[Self <: SchemaElectionsQueryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElections(value: js.Array[SchemaElection]): Self = StObject.set(x, "elections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElectionsUndefined: Self = StObject.set(x, "elections", js.undefined)
    
    @scala.inline
    def setElectionsVarargs(value: SchemaElection*): Self = StObject.set(x, "elections", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
