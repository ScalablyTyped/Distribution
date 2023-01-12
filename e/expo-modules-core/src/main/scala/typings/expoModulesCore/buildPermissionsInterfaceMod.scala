package typings.expoModulesCore

import typings.expoModulesCore.expoModulesCoreStrings.never
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPermissionsInterfaceMod {
  
  @js.native
  sealed trait PermissionStatus extends StObject
  @JSImport("expo-modules-core/build/PermissionsInterface", "PermissionStatus")
  @js.native
  object PermissionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PermissionStatus & String] = js.native
    
    /**
      * User has denied the permission.
      */
    @js.native
    sealed trait DENIED
      extends StObject
         with PermissionStatus
    /* "denied" */ val DENIED: typings.expoModulesCore.buildPermissionsInterfaceMod.PermissionStatus.DENIED & String = js.native
    
    /**
      * User has granted the permission.
      */
    @js.native
    sealed trait GRANTED
      extends StObject
         with PermissionStatus
    /* "granted" */ val GRANTED: typings.expoModulesCore.buildPermissionsInterfaceMod.PermissionStatus.GRANTED & String = js.native
    
    /**
      * User hasn't granted or denied the permission yet.
      */
    @js.native
    sealed trait UNDETERMINED
      extends StObject
         with PermissionStatus
    /* "undetermined" */ val UNDETERMINED: typings.expoModulesCore.buildPermissionsInterfaceMod.PermissionStatus.UNDETERMINED & String = js.native
  }
  
  type PermissionExpiration = never | Double
  
  trait PermissionResponse extends StObject {
    
    /**
      * Indicates if user can be asked again for specific permission.
      * If not, one should be directed to the Settings app
      * in order to enable/disable the permission.
      */
    var canAskAgain: Boolean
    
    /**
      * Determines time when the permission expires.
      */
    var expires: PermissionExpiration
    
    /**
      * A convenience boolean that indicates if the permission is granted.
      */
    var granted: Boolean
    
    /**
      * Determines the status of the permission.
      */
    var status: PermissionStatus
  }
  object PermissionResponse {
    
    inline def apply(canAskAgain: Boolean, expires: PermissionExpiration, granted: Boolean, status: PermissionStatus): PermissionResponse = {
      val __obj = js.Dynamic.literal(canAskAgain = canAskAgain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PermissionResponse] (val x: Self) extends AnyVal {
      
      inline def setCanAskAgain(value: Boolean): Self = StObject.set(x, "canAskAgain", value.asInstanceOf[js.Any])
      
      inline def setExpires(value: PermissionExpiration): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setGranted(value: Boolean): Self = StObject.set(x, "granted", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: PermissionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
