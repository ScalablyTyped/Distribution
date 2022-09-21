package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminManagedRestrictions extends StObject {
  
  var adminManagedRestrictions: js.UndefOr[Boolean] = js.undefined
  
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.undefined
  
  var domainUsersOnly: js.UndefOr[Boolean] = js.undefined
  
  var driveMembersOnly: js.UndefOr[Boolean] = js.undefined
}
object AdminManagedRestrictions {
  
  inline def apply(): AdminManagedRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminManagedRestrictions]
  }
  
  extension [Self <: AdminManagedRestrictions](x: Self) {
    
    inline def setAdminManagedRestrictions(value: Boolean): Self = StObject.set(x, "adminManagedRestrictions", value.asInstanceOf[js.Any])
    
    inline def setAdminManagedRestrictionsUndefined: Self = StObject.set(x, "adminManagedRestrictions", js.undefined)
    
    inline def setCopyRequiresWriterPermission(value: Boolean): Self = StObject.set(x, "copyRequiresWriterPermission", value.asInstanceOf[js.Any])
    
    inline def setCopyRequiresWriterPermissionUndefined: Self = StObject.set(x, "copyRequiresWriterPermission", js.undefined)
    
    inline def setDomainUsersOnly(value: Boolean): Self = StObject.set(x, "domainUsersOnly", value.asInstanceOf[js.Any])
    
    inline def setDomainUsersOnlyUndefined: Self = StObject.set(x, "domainUsersOnly", js.undefined)
    
    inline def setDriveMembersOnly(value: Boolean): Self = StObject.set(x, "driveMembersOnly", value.asInstanceOf[js.Any])
    
    inline def setDriveMembersOnlyUndefined: Self = StObject.set(x, "driveMembersOnly", js.undefined)
  }
}
