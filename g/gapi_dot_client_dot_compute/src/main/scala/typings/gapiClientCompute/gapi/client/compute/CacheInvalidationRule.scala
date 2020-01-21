package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheInvalidationRule extends js.Object {
  /** If set, this invalidation rule will only apply to requests with a Host header matching host. */
  var host: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object CacheInvalidationRule {
  @scala.inline
  def apply(host: String = null, path: String = null): CacheInvalidationRule = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheInvalidationRule]
  }
}

