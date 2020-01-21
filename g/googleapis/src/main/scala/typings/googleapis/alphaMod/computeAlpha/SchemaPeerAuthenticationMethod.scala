package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for the peer authentication method.
  */
@js.native
trait SchemaPeerAuthenticationMethod extends js.Object {
  /**
    * Set if mTLS is used for peer authentication.
    */
  var mtls: js.UndefOr[SchemaMutualTls] = js.native
}

object SchemaPeerAuthenticationMethod {
  @scala.inline
  def apply(mtls: SchemaMutualTls = null): SchemaPeerAuthenticationMethod = {
    val __obj = js.Dynamic.literal()
    if (mtls != null) __obj.updateDynamic("mtls")(mtls.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPeerAuthenticationMethod]
  }
}

