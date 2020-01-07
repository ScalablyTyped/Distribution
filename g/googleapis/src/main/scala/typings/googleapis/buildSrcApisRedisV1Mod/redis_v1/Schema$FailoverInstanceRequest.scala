package typings.googleapis.buildSrcApisRedisV1Mod.redis_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for Failover.
  */
@js.native
trait Schema$FailoverInstanceRequest extends js.Object {
  /**
    * Optional. Available data protection modes that the user can choose. If
    * it&#39;s unspecified, data protection mode will be LIMITED_DATA_LOSS by
    * default.
    */
  var dataProtectionMode: js.UndefOr[String] = js.native
}

object Schema$FailoverInstanceRequest {
  @scala.inline
  def apply(dataProtectionMode: String = null): Schema$FailoverInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (dataProtectionMode != null) __obj.updateDynamic("dataProtectionMode")(dataProtectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FailoverInstanceRequest]
  }
}

