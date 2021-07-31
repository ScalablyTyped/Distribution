package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request sent to the GetEffectiveOrgPolicy method.
  */
trait SchemaGetEffectiveOrgPolicyRequest extends StObject {
  
  /**
    * The name of the `Constraint` to compute the effective `Policy`.
    */
  var constraint: js.UndefOr[String] = js.undefined
}
object SchemaGetEffectiveOrgPolicyRequest {
  
  @scala.inline
  def apply(): SchemaGetEffectiveOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetEffectiveOrgPolicyRequest]
  }
  
  @scala.inline
  implicit class SchemaGetEffectiveOrgPolicyRequestMutableBuilder[Self <: SchemaGetEffectiveOrgPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstraint(value: String): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
  }
}
