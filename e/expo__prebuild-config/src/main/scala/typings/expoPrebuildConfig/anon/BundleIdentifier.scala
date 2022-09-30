package typings.expoPrebuildConfig.anon

import typings.expoConfigTypes.mod.ExpoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleIdentifier extends StObject {
  
  var bundleIdentifier: js.UndefOr[String] = js.undefined
  
  var expoUsername: js.UndefOr[String | (js.Function1[/* config */ ExpoConfig, String | Null])] = js.undefined
  
  var packageName: js.UndefOr[String] = js.undefined
  
  var platforms: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ModPlatform */ Any
  ]
}
object BundleIdentifier {
  
  inline def apply(
    platforms: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ModPlatform */ Any
    ]
  ): BundleIdentifier = {
    val __obj = js.Dynamic.literal(platforms = platforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleIdentifier]
  }
  
  extension [Self <: BundleIdentifier](x: Self) {
    
    inline def setBundleIdentifier(value: String): Self = StObject.set(x, "bundleIdentifier", value.asInstanceOf[js.Any])
    
    inline def setBundleIdentifierUndefined: Self = StObject.set(x, "bundleIdentifier", js.undefined)
    
    inline def setExpoUsername(value: String | (js.Function1[/* config */ ExpoConfig, String | Null])): Self = StObject.set(x, "expoUsername", value.asInstanceOf[js.Any])
    
    inline def setExpoUsernameFunction1(value: /* config */ ExpoConfig => String | Null): Self = StObject.set(x, "expoUsername", js.Any.fromFunction1(value))
    
    inline def setExpoUsernameUndefined: Self = StObject.set(x, "expoUsername", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setPlatforms(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ModPlatform */ Any
        ]
    ): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ModPlatform */ Any)*
    ): Self = StObject.set(x, "platforms", js.Array(value*))
  }
}
