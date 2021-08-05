package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client side authentication settings for connection originating from the
  * backend service.
  */
trait SchemaClientTlsSettings extends StObject {
  
  /**
    * Configures the mechanism to obtain client-side security certificates and
    * identity information. This field is only applicable when mode is set to
    * MUTUAL.
    */
  var clientTlsContext: js.UndefOr[SchemaTlsContext] = js.undefined
  
  /**
    * Indicates whether connections to this port should be secured using TLS.
    * The value of this field determines how TLS is enforced. This can be set
    * to one of the following values: DISABLE: Do not setup a TLS connection to
    * the backends. SIMPLE: Originate a TLS connection to the backends. MUTUAL:
    * Secure connections to the backends using mutual TLS by presenting client
    * certificates for authentication.
    */
  var mode: js.UndefOr[String] = js.undefined
  
  /**
    * SNI string to present to the server during TLS handshake. This field is
    * applicable only when mode is SIMPLE or MUTUAL.
    */
  var sni: js.UndefOr[String] = js.undefined
  
  /**
    * A list of alternate names to verify the subject identity in the
    * certificate.If specified, the proxy will verify that the server
    * certificate&#39;s subject alt name matches one of the specified values.
    * This field is applicable only when mode is SIMPLE or MUTUAL.
    */
  var subjectAltNames: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaClientTlsSettings {
  
  inline def apply(): SchemaClientTlsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientTlsSettings]
  }
  
  extension [Self <: SchemaClientTlsSettings](x: Self) {
    
    inline def setClientTlsContext(value: SchemaTlsContext): Self = StObject.set(x, "clientTlsContext", value.asInstanceOf[js.Any])
    
    inline def setClientTlsContextUndefined: Self = StObject.set(x, "clientTlsContext", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSni(value: String): Self = StObject.set(x, "sni", value.asInstanceOf[js.Any])
    
    inline def setSniUndefined: Self = StObject.set(x, "sni", js.undefined)
    
    inline def setSubjectAltNames(value: js.Array[String]): Self = StObject.set(x, "subjectAltNames", value.asInstanceOf[js.Any])
    
    inline def setSubjectAltNamesUndefined: Self = StObject.set(x, "subjectAltNames", js.undefined)
    
    inline def setSubjectAltNamesVarargs(value: String*): Self = StObject.set(x, "subjectAltNames", js.Array(value :_*))
  }
}
