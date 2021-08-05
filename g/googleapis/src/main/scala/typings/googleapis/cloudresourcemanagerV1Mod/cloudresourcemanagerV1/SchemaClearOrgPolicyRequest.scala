package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request sent to the ClearOrgPolicy method.
  */
trait SchemaClearOrgPolicyRequest extends StObject {
  
  /**
    * Name of the `Constraint` of the `Policy` to clear.
    */
  var constraint: js.UndefOr[String] = js.undefined
  
  /**
    * The current version, for concurrency control. Not sending an `etag` will
    * cause the `Policy` to be cleared blindly.
    */
  var etag: js.UndefOr[String] = js.undefined
}
object SchemaClearOrgPolicyRequest {
  
  inline def apply(): SchemaClearOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClearOrgPolicyRequest]
  }
  
  extension [Self <: SchemaClearOrgPolicyRequest](x: Self) {
    
    inline def setConstraint(value: String): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
  }
}
