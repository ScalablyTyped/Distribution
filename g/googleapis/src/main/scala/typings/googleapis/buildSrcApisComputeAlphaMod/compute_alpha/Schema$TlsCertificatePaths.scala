package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The paths to the mounted TLS Certificates and private key.
  */
@js.native
trait Schema$TlsCertificatePaths extends js.Object {
  /**
    * The path to the file holding the client or server TLS certificate to use.
    */
  var certificatePath: js.UndefOr[String] = js.native
  /**
    * The path to the file holding the client or server private key.
    */
  var privateKeyPath: js.UndefOr[String] = js.native
}

object Schema$TlsCertificatePaths {
  @scala.inline
  def apply(certificatePath: String = null, privateKeyPath: String = null): Schema$TlsCertificatePaths = {
    val __obj = js.Dynamic.literal()
    if (certificatePath != null) __obj.updateDynamic("certificatePath")(certificatePath.asInstanceOf[js.Any])
    if (privateKeyPath != null) __obj.updateDynamic("privateKeyPath")(privateKeyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TlsCertificatePaths]
  }
}

