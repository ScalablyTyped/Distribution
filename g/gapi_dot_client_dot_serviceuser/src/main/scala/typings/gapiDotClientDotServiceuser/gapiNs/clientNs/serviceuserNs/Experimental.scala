package typings.gapiDotClientDotServiceuser.gapiNs.clientNs.serviceuserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Experimental extends js.Object {
  /** Authorization configuration. */
  var authorization: js.UndefOr[AuthorizationConfig] = js.undefined
}

object Experimental {
  @scala.inline
  def apply(authorization: AuthorizationConfig = null): Experimental = {
    val __obj = js.Dynamic.literal()
    if (authorization != null) __obj.updateDynamic("authorization")(authorization)
    __obj.asInstanceOf[Experimental]
  }
}

