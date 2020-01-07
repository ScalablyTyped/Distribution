package typings.googleapis.buildSrcApisPubsubV1Mod.pubsub_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A policy that specifies the conditions for resource expiration (i.e.,
  * automatic resource deletion).
  */
@js.native
trait Schema$ExpirationPolicy extends js.Object {
  /**
    * Specifies the &quot;time-to-live&quot; duration for an associated
    * resource. The resource expires if it is not active for a period of `ttl`.
    * The definition of &quot;activity&quot; depends on the type of the
    * associated resource. The minimum and maximum allowed values for `ttl`
    * depend on the type of the associated resource, as well. If `ttl` is not
    * set, the associated resource never expires.
    */
  var ttl: js.UndefOr[String] = js.native
}

object Schema$ExpirationPolicy {
  @scala.inline
  def apply(ttl: String = null): Schema$ExpirationPolicy = {
    val __obj = js.Dynamic.literal()
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ExpirationPolicy]
  }
}

