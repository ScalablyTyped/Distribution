package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the mechanism to obtain the Certificate Authority certificate to
  * validate the client/server certificate.
  */
@js.native
trait SchemaTlsValidationContext extends StObject {
  
  /**
    * The path to the file holding the CA certificate to validate the client or
    * server certificate.
    */
  var certificatePath: js.UndefOr[String] = js.native
  
  /**
    * Specifies the config to retrieve certificates through SDS. This field is
    * applicable only if tlsCertificateSource is set to USE_SDS.
    */
  var sdsConfig: js.UndefOr[SchemaSdsConfig] = js.native
  
  /**
    * Defines how TLS certificates are obtained.
    */
  var validationSource: js.UndefOr[String] = js.native
}
object SchemaTlsValidationContext {
  
  @scala.inline
  def apply(): SchemaTlsValidationContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTlsValidationContext]
  }
  
  @scala.inline
  implicit class SchemaTlsValidationContextMutableBuilder[Self <: SchemaTlsValidationContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificatePath(value: String): Self = StObject.set(x, "certificatePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatePathUndefined: Self = StObject.set(x, "certificatePath", js.undefined)
    
    @scala.inline
    def setSdsConfig(value: SchemaSdsConfig): Self = StObject.set(x, "sdsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdsConfigUndefined: Self = StObject.set(x, "sdsConfig", js.undefined)
    
    @scala.inline
    def setValidationSource(value: String): Self = StObject.set(x, "validationSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationSourceUndefined: Self = StObject.set(x, "validationSource", js.undefined)
  }
}
