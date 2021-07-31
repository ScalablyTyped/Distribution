package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcquirePermission extends StObject {
  
  var acquirePermission: js.UndefOr[String] = js.undefined
  
  var ageGroup: js.UndefOr[String] = js.undefined
  
  var allowedMaturityRating: js.UndefOr[String] = js.undefined
  
  var isInFamily: js.UndefOr[Boolean] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
}
object AcquirePermission {
  
  @scala.inline
  def apply(): AcquirePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcquirePermission]
  }
  
  @scala.inline
  implicit class AcquirePermissionMutableBuilder[Self <: AcquirePermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcquirePermission(value: String): Self = StObject.set(x, "acquirePermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcquirePermissionUndefined: Self = StObject.set(x, "acquirePermission", js.undefined)
    
    @scala.inline
    def setAgeGroup(value: String): Self = StObject.set(x, "ageGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeGroupUndefined: Self = StObject.set(x, "ageGroup", js.undefined)
    
    @scala.inline
    def setAllowedMaturityRating(value: String): Self = StObject.set(x, "allowedMaturityRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedMaturityRatingUndefined: Self = StObject.set(x, "allowedMaturityRating", js.undefined)
    
    @scala.inline
    def setIsInFamily(value: Boolean): Self = StObject.set(x, "isInFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInFamilyUndefined: Self = StObject.set(x, "isInFamily", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
