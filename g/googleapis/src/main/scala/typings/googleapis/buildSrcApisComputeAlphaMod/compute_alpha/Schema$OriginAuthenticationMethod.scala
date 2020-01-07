package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for the origin authentication method.
  */
@js.native
trait Schema$OriginAuthenticationMethod extends js.Object {
  var jwt: js.UndefOr[Schema$Jwt] = js.native
}

object Schema$OriginAuthenticationMethod {
  @scala.inline
  def apply(jwt: Schema$Jwt = null): Schema$OriginAuthenticationMethod = {
    val __obj = js.Dynamic.literal()
    if (jwt != null) __obj.updateDynamic("jwt")(jwt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OriginAuthenticationMethod]
  }
}

