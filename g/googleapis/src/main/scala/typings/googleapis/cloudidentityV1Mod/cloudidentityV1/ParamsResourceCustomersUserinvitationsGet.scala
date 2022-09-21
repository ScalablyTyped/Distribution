package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersUserinvitationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. `UserInvitation` name in the format `customers/{customer\}/userinvitations/{user_email_address\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomersUserinvitationsGet {
  
  inline def apply(): ParamsResourceCustomersUserinvitationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersUserinvitationsGet]
  }
  
  extension [Self <: ParamsResourceCustomersUserinvitationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
