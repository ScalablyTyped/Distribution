package typings
package expressDashRedisDashCacheLib.expressDashRedisDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptions extends js.Object {
  var binary: js.UndefOr[scala.Boolean] = js.undefined
  var expire: js.UndefOr[ExpireOption | ExpirationPolicy] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object RouteOptions {
  @scala.inline
  def apply(
    binary: js.UndefOr[scala.Boolean] = js.undefined,
    expire: ExpireOption | ExpirationPolicy = null,
    name: java.lang.String = null
  ): RouteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary)
    if (expire != null) __obj.updateDynamic("expire")(expire.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[RouteOptions]
  }
}

