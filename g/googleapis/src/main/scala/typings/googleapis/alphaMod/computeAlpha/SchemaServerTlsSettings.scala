package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The TLS settings for the server.
  */
trait SchemaServerTlsSettings extends StObject {
  
  /**
    * Configures the mechanism to obtain security certificates and identity
    * information.
    */
  var proxyTlsContext: js.UndefOr[SchemaTlsContext] = js.undefined
  
  /**
    * A list of alternate names to verify the subject identity in the
    * certificate presented by the client.
    */
  var subjectAltNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Indicates whether connections should be secured using TLS. The value of
    * this field determines how TLS is enforced. This field can be set to one
    * of the following:   - SIMPLE Secure connections with standard TLS
    * semantics.   - MUTUAL Secure connections to the backends using mutual TLS
    * by presenting client certificates for authentication.
    */
  var tlsMode: js.UndefOr[String] = js.undefined
}
object SchemaServerTlsSettings {
  
  inline def apply(): SchemaServerTlsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServerTlsSettings]
  }
  
  extension [Self <: SchemaServerTlsSettings](x: Self) {
    
    inline def setProxyTlsContext(value: SchemaTlsContext): Self = StObject.set(x, "proxyTlsContext", value.asInstanceOf[js.Any])
    
    inline def setProxyTlsContextUndefined: Self = StObject.set(x, "proxyTlsContext", js.undefined)
    
    inline def setSubjectAltNames(value: js.Array[String]): Self = StObject.set(x, "subjectAltNames", value.asInstanceOf[js.Any])
    
    inline def setSubjectAltNamesUndefined: Self = StObject.set(x, "subjectAltNames", js.undefined)
    
    inline def setSubjectAltNamesVarargs(value: String*): Self = StObject.set(x, "subjectAltNames", js.Array(value :_*))
    
    inline def setTlsMode(value: String): Self = StObject.set(x, "tlsMode", value.asInstanceOf[js.Any])
    
    inline def setTlsModeUndefined: Self = StObject.set(x, "tlsMode", js.undefined)
  }
}
