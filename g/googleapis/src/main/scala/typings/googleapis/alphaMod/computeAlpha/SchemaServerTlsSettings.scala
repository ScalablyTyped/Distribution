package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The TLS settings for the server.
  */
@js.native
trait SchemaServerTlsSettings extends js.Object {
  
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
  implicit class SchemaServerTlsSettingsOps[Self <: SchemaServerTlsSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProxyTlsContext(value: SchemaTlsContext): Self = this.set("proxyTlsContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyTlsContext: Self = this.set("proxyTlsContext", js.undefined)
    
    @scala.inline
    def setSubjectAltNamesVarargs(value: String*): Self = this.set("subjectAltNames", js.Array(value :_*))
    
    @scala.inline
    def setSubjectAltNames(value: js.Array[String]): Self = this.set("subjectAltNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubjectAltNames: Self = this.set("subjectAltNames", js.undefined)
    
    @scala.inline
    def setTlsMode(value: String): Self = this.set("tlsMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTlsMode: Self = this.set("tlsMode", js.undefined)
  }
}
