package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMemberRestriction extends StObject {
  
  /**
    * The evaluated state of this restriction on a group.
    */
  var evaluation: js.UndefOr[SchemaRestrictionEvaluation] = js.undefined
  
  /**
    * Member Restriction as defined by CEL expression. Supported restrictions are: `member.customer_id` and `member.type`. Valid values for `member.type` are `1`, `2` and `3`. They correspond to USER, SERVICE_ACCOUNT, and GROUP respectively. The value for `member.customer_id` only supports `groupCustomerId()` currently which means the customer id of the group will be used for restriction. Supported operators are `&&`, `||` and `==`, corresponding to AND, OR, and EQUAL. Examples: Allow only service accounts of given customer to be members. `member.type == 2 && member.customer_id == groupCustomerId()` Allow only users or groups to be members. `member.type == 1 || member.type == 3`
    */
  var query: js.UndefOr[String | Null] = js.undefined
}
object SchemaMemberRestriction {
  
  inline def apply(): SchemaMemberRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMemberRestriction]
  }
  
  extension [Self <: SchemaMemberRestriction](x: Self) {
    
    inline def setEvaluation(value: SchemaRestrictionEvaluation): Self = StObject.set(x, "evaluation", value.asInstanceOf[js.Any])
    
    inline def setEvaluationUndefined: Self = StObject.set(x, "evaluation", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryNull: Self = StObject.set(x, "query", null)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
