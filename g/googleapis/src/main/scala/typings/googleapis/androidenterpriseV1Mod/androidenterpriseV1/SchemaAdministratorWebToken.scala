package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A token authorizing an admin to access an iframe.
  */
@js.native
trait SchemaAdministratorWebToken extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#administratorWebToken&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * An opaque token to be passed to the Play front-end to generate an iframe.
    */
  var token: js.UndefOr[String] = js.native
}

object SchemaAdministratorWebToken {
  @scala.inline
  def apply(kind: String = null, token: String = null): SchemaAdministratorWebToken = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAdministratorWebToken]
  }
}

