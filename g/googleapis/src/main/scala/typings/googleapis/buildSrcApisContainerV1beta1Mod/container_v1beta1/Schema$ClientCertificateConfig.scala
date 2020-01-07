package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for client certificates on the cluster.
  */
@js.native
trait Schema$ClientCertificateConfig extends js.Object {
  /**
    * Issue a client certificate.
    */
  var issueClientCertificate: js.UndefOr[Boolean] = js.native
}

object Schema$ClientCertificateConfig {
  @scala.inline
  def apply(issueClientCertificate: js.UndefOr[Boolean] = js.undefined): Schema$ClientCertificateConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(issueClientCertificate)) __obj.updateDynamic("issueClientCertificate")(issueClientCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ClientCertificateConfig]
  }
}

