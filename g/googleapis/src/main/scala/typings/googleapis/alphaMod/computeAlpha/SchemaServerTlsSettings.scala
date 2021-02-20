package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The TLS settings for the server.
  */
@js.native
trait SchemaServerTlsSettings extends StObject {
  
  /**
    * Configures the mechanism to obtain security certificates and identity
    * information.
    */
  var proxyTlsContext: js.UndefOr[SchemaTlsContext] = js.native
  
  /**
    * A list of alternate names to verify the subject identity in the
    * certificate presented by the client.
    */
  var subjectAltNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Indicates whether connections should be secured using TLS. The value of
    * this field determines how TLS is enforced. This field can be set to one
    * of the following:   - SIMPLE Secure connections with standard TLS
    * semantics.   - MUTUAL Secure connections to the backends using mutual TLS
    * by presenting client certificates for authentication.
    */
  var tlsMode: js.UndefOr[String] = js.native
}
object SchemaServerTlsSettings {
  
  @scala.inline
  def apply(): SchemaServerTlsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServerTlsSettings]
  }
  
  @scala.inline
  implicit class SchemaServerTlsSettingsMutableBuilder[Self <: SchemaServerTlsSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProxyTlsContext(value: SchemaTlsContext): Self = StObject.set(x, "proxyTlsContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyTlsContextUndefined: Self = StObject.set(x, "proxyTlsContext", js.undefined)
    
    @scala.inline
    def setSubjectAltNames(value: js.Array[String]): Self = StObject.set(x, "subjectAltNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectAltNamesUndefined: Self = StObject.set(x, "subjectAltNames", js.undefined)
    
    @scala.inline
    def setSubjectAltNamesVarargs(value: String*): Self = StObject.set(x, "subjectAltNames", js.Array(value :_*))
    
    @scala.inline
    def setTlsMode(value: String): Self = StObject.set(x, "tlsMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsModeUndefined: Self = StObject.set(x, "tlsMode", js.undefined)
  }
}
