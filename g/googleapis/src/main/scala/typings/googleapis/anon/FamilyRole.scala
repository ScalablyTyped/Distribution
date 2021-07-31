package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FamilyRole extends StObject {
  
  var familyRole: js.UndefOr[String] = js.undefined
  
  var isSharingAllowed: js.UndefOr[Boolean] = js.undefined
  
  var isSharingDisabledByFop: js.UndefOr[Boolean] = js.undefined
}
object FamilyRole {
  
  @scala.inline
  def apply(): FamilyRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FamilyRole]
  }
  
  @scala.inline
  implicit class FamilyRoleMutableBuilder[Self <: FamilyRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamilyRole(value: String): Self = StObject.set(x, "familyRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyRoleUndefined: Self = StObject.set(x, "familyRole", js.undefined)
    
    @scala.inline
    def setIsSharingAllowed(value: Boolean): Self = StObject.set(x, "isSharingAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSharingAllowedUndefined: Self = StObject.set(x, "isSharingAllowed", js.undefined)
    
    @scala.inline
    def setIsSharingDisabledByFop(value: Boolean): Self = StObject.set(x, "isSharingDisabledByFop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSharingDisabledByFopUndefined: Self = StObject.set(x, "isSharingDisabledByFop", js.undefined)
  }
}
