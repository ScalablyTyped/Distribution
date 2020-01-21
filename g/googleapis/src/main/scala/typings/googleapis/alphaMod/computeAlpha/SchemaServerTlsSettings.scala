package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    proxyTlsContext: SchemaTlsContext = null,
    subjectAltNames: js.Array[String] = null,
    tlsMode: String = null
  ): SchemaServerTlsSettings = {
    val __obj = js.Dynamic.literal()
    if (proxyTlsContext != null) __obj.updateDynamic("proxyTlsContext")(proxyTlsContext.asInstanceOf[js.Any])
    if (subjectAltNames != null) __obj.updateDynamic("subjectAltNames")(subjectAltNames.asInstanceOf[js.Any])
    if (tlsMode != null) __obj.updateDynamic("tlsMode")(tlsMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaServerTlsSettings]
  }
}

