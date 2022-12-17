package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.buildAndroidManifestMod.ManifestApplication
import typings.expoConfigPlugins.buildAndroidManifestMod.ManifestPermission
import typings.expoConfigPlugins.buildAndroidManifestMod.ManifestUsesFeature
import typings.expoConfigPlugins.buildAndroidManifestMod.ManifestUsesPermission
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _empty extends StObject {
  
  @JSName("$")
  var $: Package
  
  var application: js.UndefOr[js.Array[ManifestApplication]] = js.undefined
  
  var permission: js.UndefOr[js.Array[ManifestPermission]] = js.undefined
  
  var `uses-feature`: js.UndefOr[js.Array[ManifestUsesFeature]] = js.undefined
  
  var `uses-permission`: js.UndefOr[js.Array[ManifestUsesPermission]] = js.undefined
  
  var `uses-permission-sdk-23`: js.UndefOr[js.Array[ManifestUsesPermission]] = js.undefined
}
object _empty {
  
  inline def apply($: Package): _empty = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[_empty]
  }
  
  extension [Self <: _empty](x: Self) {
    
    inline def set$(value: Package): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: js.Array[ManifestApplication]): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    inline def setApplicationVarargs(value: ManifestApplication*): Self = StObject.set(x, "application", js.Array(value*))
    
    inline def setPermission(value: js.Array[ManifestPermission]): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setPermissionVarargs(value: ManifestPermission*): Self = StObject.set(x, "permission", js.Array(value*))
    
    inline def `setUses-feature`(value: js.Array[ManifestUsesFeature]): Self = StObject.set(x, "uses-feature", value.asInstanceOf[js.Any])
    
    inline def `setUses-featureUndefined`: Self = StObject.set(x, "uses-feature", js.undefined)
    
    inline def `setUses-featureVarargs`(value: ManifestUsesFeature*): Self = StObject.set(x, "uses-feature", js.Array(value*))
    
    inline def `setUses-permission`(value: js.Array[ManifestUsesPermission]): Self = StObject.set(x, "uses-permission", value.asInstanceOf[js.Any])
    
    inline def `setUses-permission-sdk-23`(value: js.Array[ManifestUsesPermission]): Self = StObject.set(x, "uses-permission-sdk-23", value.asInstanceOf[js.Any])
    
    inline def `setUses-permission-sdk-23Undefined`: Self = StObject.set(x, "uses-permission-sdk-23", js.undefined)
    
    inline def `setUses-permission-sdk-23Varargs`(value: ManifestUsesPermission*): Self = StObject.set(x, "uses-permission-sdk-23", js.Array(value*))
    
    inline def `setUses-permissionUndefined`: Self = StObject.set(x, "uses-permission", js.undefined)
    
    inline def `setUses-permissionVarargs`(value: ManifestUsesPermission*): Self = StObject.set(x, "uses-permission", js.Array(value*))
  }
}
