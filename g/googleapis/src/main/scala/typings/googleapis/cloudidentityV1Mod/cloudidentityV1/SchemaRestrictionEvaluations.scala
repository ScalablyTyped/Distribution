package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRestrictionEvaluations extends StObject {
  
  /**
    * Evaluation of the member restriction applied to this membership. Empty if the user lacks permission to view the restriction evaluation.
    */
  var memberRestrictionEvaluation: js.UndefOr[SchemaMembershipRoleRestrictionEvaluation] = js.undefined
}
object SchemaRestrictionEvaluations {
  
  inline def apply(): SchemaRestrictionEvaluations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestrictionEvaluations]
  }
  
  extension [Self <: SchemaRestrictionEvaluations](x: Self) {
    
    inline def setMemberRestrictionEvaluation(value: SchemaMembershipRoleRestrictionEvaluation): Self = StObject.set(x, "memberRestrictionEvaluation", value.asInstanceOf[js.Any])
    
    inline def setMemberRestrictionEvaluationUndefined: Self = StObject.set(x, "memberRestrictionEvaluation", js.undefined)
  }
}
