package typings.gapiDotClientDotContainer.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientCertificateConfig extends js.Object {
  /** Issue a client certificate. */
  var issueClientCertificate: js.UndefOr[Boolean] = js.undefined
}

object ClientCertificateConfig {
  @scala.inline
  def apply(issueClientCertificate: js.UndefOr[Boolean] = js.undefined): ClientCertificateConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(issueClientCertificate)) __obj.updateDynamic("issueClientCertificate")(issueClientCertificate)
    __obj.asInstanceOf[ClientCertificateConfig]
  }
}

