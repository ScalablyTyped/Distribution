package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminManagedRestrictions extends StObject {
  
  var adminManagedRestrictions: js.UndefOr[Boolean] = js.undefined
  
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.undefined
  
  var domainUsersOnly: js.UndefOr[Boolean] = js.undefined
  
  var teamMembersOnly: js.UndefOr[Boolean] = js.undefined
}
object AdminManagedRestrictions {
  
  @scala.inline
  def apply(): AdminManagedRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminManagedRestrictions]
  }
  
  @scala.inline
  implicit class AdminManagedRestrictionsMutableBuilder[Self <: AdminManagedRestrictions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminManagedRestrictions(value: Boolean): Self = StObject.set(x, "adminManagedRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminManagedRestrictionsUndefined: Self = StObject.set(x, "adminManagedRestrictions", js.undefined)
    
    @scala.inline
    def setCopyRequiresWriterPermission(value: Boolean): Self = StObject.set(x, "copyRequiresWriterPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyRequiresWriterPermissionUndefined: Self = StObject.set(x, "copyRequiresWriterPermission", js.undefined)
    
    @scala.inline
    def setDomainUsersOnly(value: Boolean): Self = StObject.set(x, "domainUsersOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUsersOnlyUndefined: Self = StObject.set(x, "domainUsersOnly", js.undefined)
    
    @scala.inline
    def setTeamMembersOnly(value: Boolean): Self = StObject.set(x, "teamMembersOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamMembersOnlyUndefined: Self = StObject.set(x, "teamMembersOnly", js.undefined)
  }
}
