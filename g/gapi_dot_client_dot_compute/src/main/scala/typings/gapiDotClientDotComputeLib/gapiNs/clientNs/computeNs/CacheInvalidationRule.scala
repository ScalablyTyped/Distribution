package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheInvalidationRule extends js.Object {
  /** If set, this invalidation rule will only apply to requests with a Host header matching host. */
  var host: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object CacheInvalidationRule {
  @scala.inline
  def apply(host: java.lang.String = null, path: java.lang.String = null): CacheInvalidationRule = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[CacheInvalidationRule]
  }
}

