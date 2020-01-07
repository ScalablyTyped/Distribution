package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for the peer authentication method.
  */
@js.native
trait Schema$PeerAuthenticationMethod extends js.Object {
  /**
    * Set if mTLS is used for peer authentication.
    */
  var mtls: js.UndefOr[Schema$MutualTls] = js.native
}

object Schema$PeerAuthenticationMethod {
  @scala.inline
  def apply(mtls: Schema$MutualTls = null): Schema$PeerAuthenticationMethod = {
    val __obj = js.Dynamic.literal()
    if (mtls != null) __obj.updateDynamic("mtls")(mtls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PeerAuthenticationMethod]
  }
}

