package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Experimental service configuration. These configuration options can only be
  * used by whitelisted users.
  */
@js.native
trait Schema$Experimental extends js.Object {
  /**
    * Authorization configuration.
    */
  var authorization: js.UndefOr[Schema$AuthorizationConfig] = js.native
}

object Schema$Experimental {
  @scala.inline
  def apply(authorization: Schema$AuthorizationConfig = null): Schema$Experimental = {
    val __obj = js.Dynamic.literal()
    if (authorization != null) __obj.updateDynamic("authorization")(authorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Experimental]
  }
}

