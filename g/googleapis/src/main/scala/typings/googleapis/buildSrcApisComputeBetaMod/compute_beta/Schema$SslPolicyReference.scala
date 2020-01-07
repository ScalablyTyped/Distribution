package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SslPolicyReference extends js.Object {
  /**
    * URL of the SSL policy resource. Set this to empty string to clear any
    * existing SSL policy associated with the target proxy resource.
    */
  var sslPolicy: js.UndefOr[String] = js.native
}

object Schema$SslPolicyReference {
  @scala.inline
  def apply(sslPolicy: String = null): Schema$SslPolicyReference = {
    val __obj = js.Dynamic.literal()
    if (sslPolicy != null) __obj.updateDynamic("sslPolicy")(sslPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SslPolicyReference]
  }
}

