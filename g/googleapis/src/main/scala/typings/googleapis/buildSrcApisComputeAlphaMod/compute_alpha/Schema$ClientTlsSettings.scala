package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client side authentication settings for connection originating from the
  * backend service.
  */
@js.native
trait Schema$ClientTlsSettings extends js.Object {
  /**
    * Configures the mechanism to obtain client-side security certificates and
    * identity information. This field is only applicable when mode is set to
    * MUTUAL.
    */
  var clientTlsContext: js.UndefOr[Schema$TlsContext] = js.native
  /**
    * Indicates whether connections to this port should be secured using TLS.
    * The value of this field determines how TLS is enforced. This can be set
    * to one of the following values: DISABLE: Do not setup a TLS connection to
    * the backends. SIMPLE: Originate a TLS connection to the backends. MUTUAL:
    * Secure connections to the backends using mutual TLS by presenting client
    * certificates for authentication.
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * SNI string to present to the server during TLS handshake. This field is
    * applicable only when mode is SIMPLE or MUTUAL.
    */
  var sni: js.UndefOr[String] = js.native
  /**
    * A list of alternate names to verify the subject identity in the
    * certificate.If specified, the proxy will verify that the server
    * certificate&#39;s subject alt name matches one of the specified values.
    * This field is applicable only when mode is SIMPLE or MUTUAL.
    */
  var subjectAltNames: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ClientTlsSettings {
  @scala.inline
  def apply(
    clientTlsContext: Schema$TlsContext = null,
    mode: String = null,
    sni: String = null,
    subjectAltNames: js.Array[String] = null
  ): Schema$ClientTlsSettings = {
    val __obj = js.Dynamic.literal()
    if (clientTlsContext != null) __obj.updateDynamic("clientTlsContext")(clientTlsContext.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (sni != null) __obj.updateDynamic("sni")(sni.asInstanceOf[js.Any])
    if (subjectAltNames != null) __obj.updateDynamic("subjectAltNames")(subjectAltNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ClientTlsSettings]
  }
}

