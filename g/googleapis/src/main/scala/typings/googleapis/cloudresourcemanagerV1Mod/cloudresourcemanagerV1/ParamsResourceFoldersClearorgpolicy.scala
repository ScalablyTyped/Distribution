package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersClearorgpolicy
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaClearOrgPolicyRequest] = js.undefined
  
  /**
    * Name of the resource for the `Policy` to clear.
    */
  var resource: js.UndefOr[String] = js.undefined
}
object ParamsResourceFoldersClearorgpolicy {
  
  inline def apply(): ParamsResourceFoldersClearorgpolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersClearorgpolicy]
  }
  
  extension [Self <: ParamsResourceFoldersClearorgpolicy](x: Self) {
    
    inline def setRequestBody(value: SchemaClearOrgPolicyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
