package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTlsValidationContext extends StObject {
  
  /**
    * The path to the file holding the CA certificate to validate the client or server certificate.
    */
  var certificatePath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the config to retrieve certificates through SDS. This field is applicable only if tlsCertificateSource is set to USE_SDS.
    */
  var sdsConfig: js.UndefOr[SchemaSdsConfig] = js.undefined
  
  /**
    * Defines how TLS certificates are obtained.
    */
  var validationSource: js.UndefOr[String | Null] = js.undefined
}
object SchemaTlsValidationContext {
  
  inline def apply(): SchemaTlsValidationContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTlsValidationContext]
  }
  
  extension [Self <: SchemaTlsValidationContext](x: Self) {
    
    inline def setCertificatePath(value: String): Self = StObject.set(x, "certificatePath", value.asInstanceOf[js.Any])
    
    inline def setCertificatePathNull: Self = StObject.set(x, "certificatePath", null)
    
    inline def setCertificatePathUndefined: Self = StObject.set(x, "certificatePath", js.undefined)
    
    inline def setSdsConfig(value: SchemaSdsConfig): Self = StObject.set(x, "sdsConfig", value.asInstanceOf[js.Any])
    
    inline def setSdsConfigUndefined: Self = StObject.set(x, "sdsConfig", js.undefined)
    
    inline def setValidationSource(value: String): Self = StObject.set(x, "validationSource", value.asInstanceOf[js.Any])
    
    inline def setValidationSourceNull: Self = StObject.set(x, "validationSource", null)
    
    inline def setValidationSourceUndefined: Self = StObject.set(x, "validationSource", js.undefined)
  }
}
