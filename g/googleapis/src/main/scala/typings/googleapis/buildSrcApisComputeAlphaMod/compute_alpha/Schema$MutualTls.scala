package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for the mutual Tls mode for peer authentication.
  */
@js.native
trait Schema$MutualTls extends js.Object {
  /**
    * Specifies if the server TLS is configured to be strict or permissive.
    * This field can be set to one of the following: STRICT: Client certificate
    * must be presented, connection is in TLS. PERMISSIVE: Client certificate
    * can be omitted, connection can be either plaintext or TLS.
    */
  var mode: js.UndefOr[String] = js.native
}

object Schema$MutualTls {
  @scala.inline
  def apply(mode: String = null): Schema$MutualTls = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MutualTls]
  }
}

