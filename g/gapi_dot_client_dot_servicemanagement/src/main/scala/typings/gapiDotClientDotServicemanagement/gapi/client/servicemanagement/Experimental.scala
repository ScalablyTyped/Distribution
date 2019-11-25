package typings.gapiDotClientDotServicemanagement.gapi.client.servicemanagement

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
    if (authorization != null) __obj.updateDynamic("authorization")(authorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[Experimental]
  }
}

