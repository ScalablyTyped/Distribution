package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An SslCertificate resource. This resource provides a mechanism to upload an
  * SSL key and certificate to the load balancer to serve secure connections
  * from the user. (== resource_for beta.sslCertificates ==) (== resource_for
  * v1.sslCertificates ==)
  */
@js.native
trait Schema$SslCertificate extends js.Object {
  /**
    * A local certificate file. The certificate must be in PEM format. The
    * certificate chain must be no greater than 5 certs long. The chain must
    * include at least one intermediate cert.
    */
  var certificate: js.UndefOr[String] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] Expire time of the certificate. RFC3339
    */
  var expireTime: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#sslCertificate for SSL
    * certificates.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Configuration and status of a managed SSL certificate.
    */
  var managed: js.UndefOr[Schema$SslCertificateManagedSslCertificate] = js.native
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A write-only private key in PEM format. Only insert requests will include
    * this field.
    */
  var privateKey: js.UndefOr[String] = js.native
  /**
    * [Output only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Configuration and status of a self-managed SSL certificate.
    */
  var selfManaged: js.UndefOr[Schema$SslCertificateSelfManagedSslCertificate] = js.native
  /**
    * [Output Only] Domains associated with the certificate via Subject
    * Alternative Name.
    */
  var subjectAlternativeNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * (Optional) Specifies the type of SSL certificate, either
    * &quot;SELF_MANAGED&quot; or &quot;MANAGED&quot;. If not specified, the
    * certificate is self-managed and the fields certificate and private_key
    * are used.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$SslCertificate {
  @scala.inline
  def apply(
    certificate: String = null,
    creationTimestamp: String = null,
    description: String = null,
    expireTime: String = null,
    id: String = null,
    kind: String = null,
    managed: Schema$SslCertificateManagedSslCertificate = null,
    name: String = null,
    privateKey: String = null,
    selfLink: String = null,
    selfManaged: Schema$SslCertificateSelfManagedSslCertificate = null,
    subjectAlternativeNames: js.Array[String] = null,
    `type`: String = null
  ): Schema$SslCertificate = {
    val __obj = js.Dynamic.literal()
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expireTime != null) __obj.updateDynamic("expireTime")(expireTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (managed != null) __obj.updateDynamic("managed")(managed.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (selfManaged != null) __obj.updateDynamic("selfManaged")(selfManaged.asInstanceOf[js.Any])
    if (subjectAlternativeNames != null) __obj.updateDynamic("subjectAlternativeNames")(subjectAlternativeNames.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SslCertificate]
  }
}

