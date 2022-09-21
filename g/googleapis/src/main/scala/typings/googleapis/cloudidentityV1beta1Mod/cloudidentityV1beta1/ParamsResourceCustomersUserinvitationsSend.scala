package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersUserinvitationsSend
  extends StObject
     with StandardParameters {
  
  /**
    * Required. `UserInvitation` name in the format `customers/{customer\}/userinvitations/{user_email_address\}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSendUserInvitationRequest] = js.undefined
}
object ParamsResourceCustomersUserinvitationsSend {
  
  inline def apply(): ParamsResourceCustomersUserinvitationsSend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersUserinvitationsSend]
  }
  
  extension [Self <: ParamsResourceCustomersUserinvitationsSend](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaSendUserInvitationRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
