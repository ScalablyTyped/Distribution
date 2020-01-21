package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration and status of a managed SSL certificate.
  */
@js.native
trait SchemaSslCertificateManagedSslCertificate extends js.Object {
  /**
    * [Output only] Detailed statuses of the domains specified for managed
    * certificate resource.
    */
  var domainStatus: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The domains for which a managed SSL certificate will be generated.
    * Currently only single-domain certs are supported.
    */
  var domains: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Output only] Status of the managed certificate resource.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaSslCertificateManagedSslCertificate {
  @scala.inline
  def apply(
    domainStatus: StringDictionary[String] = null,
    domains: js.Array[String] = null,
    status: String = null
  ): SchemaSslCertificateManagedSslCertificate = {
    val __obj = js.Dynamic.literal()
    if (domainStatus != null) __obj.updateDynamic("domainStatus")(domainStatus.asInstanceOf[js.Any])
    if (domains != null) __obj.updateDynamic("domains")(domains.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSslCertificateManagedSslCertificate]
  }
}

