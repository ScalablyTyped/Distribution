package typings.expoConstants.constantsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Manifest extends StObject {
  
  var assets: js.Array[ManifestAsset]
  
  var createdAt: String
  
  var extra: js.UndefOr[ManifestExtra] = js.undefined
  
  var id: String
  
  var launchAsset: ManifestAsset
  
  var metadata: js.Object
  
  var runtimeVersion: String
}
object Manifest {
  
  inline def apply(
    assets: js.Array[ManifestAsset],
    createdAt: String,
    id: String,
    launchAsset: ManifestAsset,
    metadata: js.Object,
    runtimeVersion: String
  ): Manifest = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], launchAsset = launchAsset.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], runtimeVersion = runtimeVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
  
  extension [Self <: Manifest](x: Self) {
    
    inline def setAssets(value: js.Array[ManifestAsset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsVarargs(value: ManifestAsset*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setExtra(value: ManifestExtra): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLaunchAsset(value: ManifestAsset): Self = StObject.set(x, "launchAsset", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersion(value: String): Self = StObject.set(x, "runtimeVersion", value.asInstanceOf[js.Any])
  }
}
