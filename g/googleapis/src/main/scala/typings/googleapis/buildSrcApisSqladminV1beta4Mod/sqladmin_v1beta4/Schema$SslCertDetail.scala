package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SslCertDetail.
  */
@js.native
trait Schema$SslCertDetail extends js.Object {
  /**
    * The public information about the cert.
    */
  var certInfo: js.UndefOr[Schema$SslCert] = js.native
  /**
    * The private key for the client cert, in pem format. Keep private in order
    * to protect your security.
    */
  var certPrivateKey: js.UndefOr[String] = js.native
}

object Schema$SslCertDetail {
  @scala.inline
  def apply(certInfo: Schema$SslCert = null, certPrivateKey: String = null): Schema$SslCertDetail = {
    val __obj = js.Dynamic.literal()
    if (certInfo != null) __obj.updateDynamic("certInfo")(certInfo.asInstanceOf[js.Any])
    if (certPrivateKey != null) __obj.updateDynamic("certPrivateKey")(certPrivateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SslCertDetail]
  }
}

