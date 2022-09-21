package typings.expoConfig.configTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.expoConfig.anon.ClientScopingConfigexpoCl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpoUpdatesManifest extends StObject {
  
  var assets: js.Array[ExpoUpdatesManifestAsset]
  
  var createdAt: String
  
  var extra: ClientScopingConfigexpoCl
  
  var id: String
  
  var launchAsset: ExpoUpdatesManifestAsset
  
  var metadata: StringDictionary[String]
  
  var runtimeVersion: String
}
object ExpoUpdatesManifest {
  
  inline def apply(
    assets: js.Array[ExpoUpdatesManifestAsset],
    createdAt: String,
    extra: ClientScopingConfigexpoCl,
    id: String,
    launchAsset: ExpoUpdatesManifestAsset,
    metadata: StringDictionary[String],
    runtimeVersion: String
  ): ExpoUpdatesManifest = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], launchAsset = launchAsset.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], runtimeVersion = runtimeVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpoUpdatesManifest]
  }
  
  extension [Self <: ExpoUpdatesManifest](x: Self) {
    
    inline def setAssets(value: js.Array[ExpoUpdatesManifestAsset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsVarargs(value: ExpoUpdatesManifestAsset*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setExtra(value: ClientScopingConfigexpoCl): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLaunchAsset(value: ExpoUpdatesManifestAsset): Self = StObject.set(x, "launchAsset", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersion(value: String): Self = StObject.set(x, "runtimeVersion", value.asInstanceOf[js.Any])
  }
}
