package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyRequiresWriterPermission extends StObject {
  
  var adminManagedRestrictions: js.UndefOr[Boolean] = js.undefined
  
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.undefined
  
  var domainUsersOnly: js.UndefOr[Boolean] = js.undefined
  
  var teamMembersOnly: js.UndefOr[Boolean] = js.undefined
}
object CopyRequiresWriterPermission {
  
  inline def apply(): CopyRequiresWriterPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyRequiresWriterPermission]
  }
  
  extension [Self <: CopyRequiresWriterPermission](x: Self) {
    
    inline def setAdminManagedRestrictions(value: Boolean): Self = StObject.set(x, "adminManagedRestrictions", value.asInstanceOf[js.Any])
    
    inline def setAdminManagedRestrictionsUndefined: Self = StObject.set(x, "adminManagedRestrictions", js.undefined)
    
    inline def setCopyRequiresWriterPermission(value: Boolean): Self = StObject.set(x, "copyRequiresWriterPermission", value.asInstanceOf[js.Any])
    
    inline def setCopyRequiresWriterPermissionUndefined: Self = StObject.set(x, "copyRequiresWriterPermission", js.undefined)
    
    inline def setDomainUsersOnly(value: Boolean): Self = StObject.set(x, "domainUsersOnly", value.asInstanceOf[js.Any])
    
    inline def setDomainUsersOnlyUndefined: Self = StObject.set(x, "domainUsersOnly", js.undefined)
    
    inline def setTeamMembersOnly(value: Boolean): Self = StObject.set(x, "teamMembersOnly", value.asInstanceOf[js.Any])
    
    inline def setTeamMembersOnlyUndefined: Self = StObject.set(x, "teamMembersOnly", js.undefined)
  }
}
