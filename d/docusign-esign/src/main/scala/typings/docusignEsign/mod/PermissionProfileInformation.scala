package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionProfileInformation extends StObject {
  
  /**
    * A complex type containing a collection of permission profiles.
    */
  var permissionProfiles: js.UndefOr[
    js.Array[
      /* This object defines the account permissions for a profile that you can apply to a group of users. */ PermissionProfile
    ]
  ] = js.undefined
}
object PermissionProfileInformation {
  
  inline def apply(): PermissionProfileInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionProfileInformation]
  }
  
  extension [Self <: PermissionProfileInformation](x: Self) {
    
    inline def setPermissionProfiles(
      value: js.Array[
          /* This object defines the account permissions for a profile that you can apply to a group of users. */ PermissionProfile
        ]
    ): Self = StObject.set(x, "permissionProfiles", value.asInstanceOf[js.Any])
    
    inline def setPermissionProfilesUndefined: Self = StObject.set(x, "permissionProfiles", js.undefined)
    
    inline def setPermissionProfilesVarargs(
      value: (/* This object defines the account permissions for a profile that you can apply to a group of users. */ PermissionProfile)*
    ): Self = StObject.set(x, "permissionProfiles", js.Array(value*))
  }
}
