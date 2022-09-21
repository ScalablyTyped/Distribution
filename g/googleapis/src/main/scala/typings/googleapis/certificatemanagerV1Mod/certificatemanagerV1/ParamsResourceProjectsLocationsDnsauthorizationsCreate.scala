package typings.googleapis.certificatemanagerV1Mod.certificatemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDnsauthorizationsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A user-provided name of the dns authorization.
    */
  var dnsAuthorizationId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent resource of the dns authorization. Must be in the format `projects/x/locations/x`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDnsAuthorization] = js.undefined
}
object ParamsResourceProjectsLocationsDnsauthorizationsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsDnsauthorizationsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDnsauthorizationsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDnsauthorizationsCreate](x: Self) {
    
    inline def setDnsAuthorizationId(value: String): Self = StObject.set(x, "dnsAuthorizationId", value.asInstanceOf[js.Any])
    
    inline def setDnsAuthorizationIdUndefined: Self = StObject.set(x, "dnsAuthorizationId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaDnsAuthorization): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
