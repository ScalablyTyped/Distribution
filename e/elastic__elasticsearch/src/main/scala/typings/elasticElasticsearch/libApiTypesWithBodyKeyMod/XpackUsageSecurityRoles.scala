package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageSecurityRoles extends StObject {
  
  var dls: XpackUsageSecurityRolesDls
  
  var file: XpackUsageSecurityRolesFile
  
  var native: XpackUsageSecurityRolesNative
}
object XpackUsageSecurityRoles {
  
  inline def apply(
    dls: XpackUsageSecurityRolesDls,
    file: XpackUsageSecurityRolesFile,
    native: XpackUsageSecurityRolesNative
  ): XpackUsageSecurityRoles = {
    val __obj = js.Dynamic.literal(dls = dls.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageSecurityRoles]
  }
  
  extension [Self <: XpackUsageSecurityRoles](x: Self) {
    
    inline def setDls(value: XpackUsageSecurityRolesDls): Self = StObject.set(x, "dls", value.asInstanceOf[js.Any])
    
    inline def setFile(value: XpackUsageSecurityRolesFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setNative(value: XpackUsageSecurityRolesNative): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
  }
}
