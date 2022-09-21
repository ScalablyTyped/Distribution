package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTlsCertificateContext extends StObject {
  
  /**
    * Specifies the certificate and private key paths. This field is applicable only if tlsCertificateSource is set to USE_PATH.
    */
  var certificatePaths: js.UndefOr[SchemaTlsCertificatePaths] = js.undefined
  
  /**
    * Defines how TLS certificates are obtained.
    */
  var certificateSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the config to retrieve certificates through SDS. This field is applicable only if tlsCertificateSource is set to USE_SDS.
    */
  var sdsConfig: js.UndefOr[SchemaSdsConfig] = js.undefined
}
object SchemaTlsCertificateContext {
  
  inline def apply(): SchemaTlsCertificateContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTlsCertificateContext]
  }
  
  extension [Self <: SchemaTlsCertificateContext](x: Self) {
    
    inline def setCertificatePaths(value: SchemaTlsCertificatePaths): Self = StObject.set(x, "certificatePaths", value.asInstanceOf[js.Any])
    
    inline def setCertificatePathsUndefined: Self = StObject.set(x, "certificatePaths", js.undefined)
    
    inline def setCertificateSource(value: String): Self = StObject.set(x, "certificateSource", value.asInstanceOf[js.Any])
    
    inline def setCertificateSourceNull: Self = StObject.set(x, "certificateSource", null)
    
    inline def setCertificateSourceUndefined: Self = StObject.set(x, "certificateSource", js.undefined)
    
    inline def setSdsConfig(value: SchemaSdsConfig): Self = StObject.set(x, "sdsConfig", value.asInstanceOf[js.Any])
    
    inline def setSdsConfigUndefined: Self = StObject.set(x, "sdsConfig", js.undefined)
  }
}
