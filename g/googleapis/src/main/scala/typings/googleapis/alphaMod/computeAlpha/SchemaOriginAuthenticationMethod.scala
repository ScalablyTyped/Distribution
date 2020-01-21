package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for the origin authentication method.
  */
@js.native
trait SchemaOriginAuthenticationMethod extends js.Object {
  var jwt: js.UndefOr[SchemaJwt] = js.native
}

object SchemaOriginAuthenticationMethod {
  @scala.inline
  def apply(jwt: SchemaJwt = null): SchemaOriginAuthenticationMethod = {
    val __obj = js.Dynamic.literal()
    if (jwt != null) __obj.updateDynamic("jwt")(jwt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOriginAuthenticationMethod]
  }
}

