package typings.expoConfigTypes.anon

import typings.expoConfigTypes.expoConfigTypesStrings.ON_ERROR_RECOVERY
import typings.expoConfigTypes.expoConfigTypesStrings.ON_LOAD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckAutomatically extends StObject {
  
  /**
    * By default, Expo will check for updates every time the app is loaded. Set this to `ON_ERROR_RECOVERY` to disable automatic checking unless recovering from an error. Must be one of `ON_LOAD` or `ON_ERROR_RECOVERY`
    */
  var checkAutomatically: js.UndefOr[ON_ERROR_RECOVERY | ON_LOAD] = js.undefined
  
  /**
    * Local path of a PEM-formatted X.509 certificate used for requiring and verifying signed Expo updates
    */
  var codeSigningCertificate: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata for `codeSigningCertificate`
    */
  var codeSigningMetadata: js.UndefOr[Alg] = js.undefined
  
  /**
    * If set to false, your standalone app will never download any code, and will only use code bundled locally on the device. In that case, all updates to your app must be submitted through app store review. Defaults to true. (Note: This will not work out of the box with ExpoKit projects)
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * How long (in ms) to allow for fetching OTA updates before falling back to a cached version of the app. Defaults to 0. Must be between 0 and 300000 (5 minutes).
    */
  var fallbackToCacheTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * URL from which expo-updates will fetch update manifests
    */
  var url: js.UndefOr[String] = js.undefined
}
object CheckAutomatically {
  
  inline def apply(): CheckAutomatically = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckAutomatically]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckAutomatically] (val x: Self) extends AnyVal {
    
    inline def setCheckAutomatically(value: ON_ERROR_RECOVERY | ON_LOAD): Self = StObject.set(x, "checkAutomatically", value.asInstanceOf[js.Any])
    
    inline def setCheckAutomaticallyUndefined: Self = StObject.set(x, "checkAutomatically", js.undefined)
    
    inline def setCodeSigningCertificate(value: String): Self = StObject.set(x, "codeSigningCertificate", value.asInstanceOf[js.Any])
    
    inline def setCodeSigningCertificateUndefined: Self = StObject.set(x, "codeSigningCertificate", js.undefined)
    
    inline def setCodeSigningMetadata(value: Alg): Self = StObject.set(x, "codeSigningMetadata", value.asInstanceOf[js.Any])
    
    inline def setCodeSigningMetadataUndefined: Self = StObject.set(x, "codeSigningMetadata", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFallbackToCacheTimeout(value: Double): Self = StObject.set(x, "fallbackToCacheTimeout", value.asInstanceOf[js.Any])
    
    inline def setFallbackToCacheTimeoutUndefined: Self = StObject.set(x, "fallbackToCacheTimeout", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
