package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The TLS settings for the client or server.
  */
trait SchemaTlsContext extends StObject {
  
  /**
    * Defines the mechanism to obtain the client or server certificate.
    */
  var certificateContext: js.UndefOr[SchemaTlsCertificateContext] = js.undefined
  
  /**
    * Defines the mechanism to obtain the Certificate Authority certificate to
    * validate the client/server certificate. If omitted, the proxy will not
    * validate the server or client certificate.
    */
  var validationContext: js.UndefOr[SchemaTlsValidationContext] = js.undefined
}
object SchemaTlsContext {
  
  inline def apply(): SchemaTlsContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTlsContext]
  }
  
  extension [Self <: SchemaTlsContext](x: Self) {
    
    inline def setCertificateContext(value: SchemaTlsCertificateContext): Self = StObject.set(x, "certificateContext", value.asInstanceOf[js.Any])
    
    inline def setCertificateContextUndefined: Self = StObject.set(x, "certificateContext", js.undefined)
    
    inline def setValidationContext(value: SchemaTlsValidationContext): Self = StObject.set(x, "validationContext", value.asInstanceOf[js.Any])
    
    inline def setValidationContextUndefined: Self = StObject.set(x, "validationContext", js.undefined)
  }
}
