package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request sent to the ClearOrgPolicy method.
  */
@js.native
trait SchemaClearOrgPolicyRequest extends StObject {
  
  /**
    * Name of the `Constraint` of the `Policy` to clear.
    */
  var constraint: js.UndefOr[String] = js.native
  
  /**
    * The current version, for concurrency control. Not sending an `etag` will
    * cause the `Policy` to be cleared blindly.
    */
  var etag: js.UndefOr[String] = js.native
}
object SchemaClearOrgPolicyRequest {
  
  @scala.inline
  def apply(): SchemaClearOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClearOrgPolicyRequest]
  }
  
  @scala.inline
  implicit class SchemaClearOrgPolicyRequestMutableBuilder[Self <: SchemaClearOrgPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstraint(value: String): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
  }
}
