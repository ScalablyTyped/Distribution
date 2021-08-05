package typings.evernote.anon

import typings.evernote.mod.Types.BusinessUserRole
import typings.evernote.mod.Types.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusinessName extends StObject {
  
  var businessId: js.UndefOr[Double] = js.undefined
  
  var businessName: js.UndefOr[String] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var role: js.UndefOr[BusinessUserRole] = js.undefined
  
  var updated: js.UndefOr[Timestamp] = js.undefined
}
object BusinessName {
  
  inline def apply(): BusinessName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessName]
  }
  
  extension [Self <: BusinessName](x: Self) {
    
    inline def setBusinessId(value: Double): Self = StObject.set(x, "businessId", value.asInstanceOf[js.Any])
    
    inline def setBusinessIdUndefined: Self = StObject.set(x, "businessId", js.undefined)
    
    inline def setBusinessName(value: String): Self = StObject.set(x, "businessName", value.asInstanceOf[js.Any])
    
    inline def setBusinessNameUndefined: Self = StObject.set(x, "businessName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setRole(value: BusinessUserRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setUpdated(value: Timestamp): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
