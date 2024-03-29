package typings.expoLocation.buildLocationDottypesMod

import typings.expoModulesCore.buildPermissionsInterfaceMod.PermissionExpiration
import typings.expoModulesCore.buildPermissionsInterfaceMod.PermissionResponse
import typings.expoModulesCore.buildPermissionsInterfaceMod.PermissionStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationPermissionResponse
  extends StObject
     with PermissionResponse {
  
  var android: js.UndefOr[PermissionDetailsLocationAndroid] = js.undefined
  
  var ios: js.UndefOr[PermissionDetailsLocationIOS] = js.undefined
}
object LocationPermissionResponse {
  
  inline def apply(canAskAgain: Boolean, expires: PermissionExpiration, granted: Boolean, status: PermissionStatus): LocationPermissionResponse = {
    val __obj = js.Dynamic.literal(canAskAgain = canAskAgain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationPermissionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationPermissionResponse] (val x: Self) extends AnyVal {
    
    inline def setAndroid(value: PermissionDetailsLocationAndroid): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setIos(value: PermissionDetailsLocationIOS): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
  }
}
