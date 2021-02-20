package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request sent to the SetOrgPolicyRequest method.
  */
@js.native
trait SchemaSetOrgPolicyRequest extends StObject {
  
  /**
    * `Policy` to set on the resource.
    */
  var policy: js.UndefOr[SchemaOrgPolicy] = js.native
}
object SchemaSetOrgPolicyRequest {
  
  @scala.inline
  def apply(): SchemaSetOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetOrgPolicyRequest]
  }
  
  @scala.inline
  implicit class SchemaSetOrgPolicyRequestMutableBuilder[Self <: SchemaSetOrgPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: SchemaOrgPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
