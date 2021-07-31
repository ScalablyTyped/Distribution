package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalRoles extends StObject {
  
  var additionalRoles: js.UndefOr[js.Array[String]] = js.undefined
  
  var primaryRole: js.UndefOr[String] = js.undefined
}
object AdditionalRoles {
  
  @scala.inline
  def apply(): AdditionalRoles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalRoles]
  }
  
  @scala.inline
  implicit class AdditionalRolesMutableBuilder[Self <: AdditionalRoles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalRoles(value: js.Array[String]): Self = StObject.set(x, "additionalRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalRolesUndefined: Self = StObject.set(x, "additionalRoles", js.undefined)
    
    @scala.inline
    def setAdditionalRolesVarargs(value: String*): Self = StObject.set(x, "additionalRoles", js.Array(value :_*))
    
    @scala.inline
    def setPrimaryRole(value: String): Self = StObject.set(x, "primaryRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryRoleUndefined: Self = StObject.set(x, "primaryRole", js.undefined)
  }
}
