package typings.evernote.anon

import typings.evernote.mod.Types.BusinessUserRole
import typings.evernote.mod.Types.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BusinessName extends StObject {
  
  var businessId: js.UndefOr[Double] = js.native
  
  var businessName: js.UndefOr[String] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var role: js.UndefOr[BusinessUserRole] = js.native
  
  var updated: js.UndefOr[Timestamp] = js.native
}
object BusinessName {
  
  @scala.inline
  def apply(): BusinessName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessName]
  }
  
  @scala.inline
  implicit class BusinessNameMutableBuilder[Self <: BusinessName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusinessId(value: Double): Self = StObject.set(x, "businessId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessIdUndefined: Self = StObject.set(x, "businessId", js.undefined)
    
    @scala.inline
    def setBusinessName(value: String): Self = StObject.set(x, "businessName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessNameUndefined: Self = StObject.set(x, "businessName", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setRole(value: BusinessUserRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setUpdated(value: Timestamp): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
