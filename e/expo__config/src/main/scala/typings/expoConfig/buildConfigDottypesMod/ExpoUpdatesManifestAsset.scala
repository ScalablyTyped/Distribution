package typings.expoConfig.buildConfigDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpoUpdatesManifestAsset extends StObject {
  
  var contentType: String
  
  var hash: js.UndefOr[String] = js.undefined
  
  var key: String
  
  var url: String
}
object ExpoUpdatesManifestAsset {
  
  inline def apply(contentType: String, key: String, url: String): ExpoUpdatesManifestAsset = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpoUpdatesManifestAsset]
  }
  
  extension [Self <: ExpoUpdatesManifestAsset](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
