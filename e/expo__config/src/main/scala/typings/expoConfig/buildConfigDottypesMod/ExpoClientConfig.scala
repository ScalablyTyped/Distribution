package typings.expoConfig.buildConfigDottypesMod

import typings.expoConfigTypes.mod.ExpoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpoClientConfig
  extends StObject
     with ExpoConfig {
  
  var bundleUrl: js.UndefOr[String] = js.undefined
  
  var hostUri: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var publishedTime: js.UndefOr[String] = js.undefined
  
  var releaseId: js.UndefOr[String] = js.undefined
  
  var revisionId: js.UndefOr[String] = js.undefined
}
object ExpoClientConfig {
  
  inline def apply(name: String, slug: String): ExpoClientConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpoClientConfig]
  }
  
  extension [Self <: ExpoClientConfig](x: Self) {
    
    inline def setBundleUrl(value: String): Self = StObject.set(x, "bundleUrl", value.asInstanceOf[js.Any])
    
    inline def setBundleUrlUndefined: Self = StObject.set(x, "bundleUrl", js.undefined)
    
    inline def setHostUri(value: String): Self = StObject.set(x, "hostUri", value.asInstanceOf[js.Any])
    
    inline def setHostUriUndefined: Self = StObject.set(x, "hostUri", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPublishedTime(value: String): Self = StObject.set(x, "publishedTime", value.asInstanceOf[js.Any])
    
    inline def setPublishedTimeUndefined: Self = StObject.set(x, "publishedTime", js.undefined)
    
    inline def setReleaseId(value: String): Self = StObject.set(x, "releaseId", value.asInstanceOf[js.Any])
    
    inline def setReleaseIdUndefined: Self = StObject.set(x, "releaseId", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}
