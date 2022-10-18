package typings.expoConstants.buildConstantsDottypesMod

import typings.expoConfigTypes.mod.ExpoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpoClientConfig
  extends StObject
     with ExpoConfig {
  
  var bundleUrl: String
  
  var hostUri: js.UndefOr[String] = js.undefined
  
  /**
    * The Expo account name and slug for this project.
    * @deprecated Prefer `projectId` or `originalFullName` instead for identification and
    * `scopeKey` for scoping due to immutability.
    */
  var id: js.UndefOr[String] = js.undefined
  
  var publishedTime: js.UndefOr[String] = js.undefined
  
  var releaseChannel: js.UndefOr[String] = js.undefined
  
  /**
    * Published apps only.
    */
  var releaseId: js.UndefOr[String] = js.undefined
  
  var revisionId: js.UndefOr[String] = js.undefined
}
object ExpoClientConfig {
  
  inline def apply(bundleUrl: String, name: String, slug: String): ExpoClientConfig = {
    val __obj = js.Dynamic.literal(bundleUrl = bundleUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpoClientConfig]
  }
  
  extension [Self <: ExpoClientConfig](x: Self) {
    
    inline def setBundleUrl(value: String): Self = StObject.set(x, "bundleUrl", value.asInstanceOf[js.Any])
    
    inline def setHostUri(value: String): Self = StObject.set(x, "hostUri", value.asInstanceOf[js.Any])
    
    inline def setHostUriUndefined: Self = StObject.set(x, "hostUri", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPublishedTime(value: String): Self = StObject.set(x, "publishedTime", value.asInstanceOf[js.Any])
    
    inline def setPublishedTimeUndefined: Self = StObject.set(x, "publishedTime", js.undefined)
    
    inline def setReleaseChannel(value: String): Self = StObject.set(x, "releaseChannel", value.asInstanceOf[js.Any])
    
    inline def setReleaseChannelUndefined: Self = StObject.set(x, "releaseChannel", js.undefined)
    
    inline def setReleaseId(value: String): Self = StObject.set(x, "releaseId", value.asInstanceOf[js.Any])
    
    inline def setReleaseIdUndefined: Self = StObject.set(x, "releaseId", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}
