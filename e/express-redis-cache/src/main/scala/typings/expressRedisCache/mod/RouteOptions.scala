package typings.expressRedisCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptions extends js.Object {
  var binary: js.UndefOr[Boolean] = js.undefined
  var expire: js.UndefOr[ExpireOption | ExpirationPolicy] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object RouteOptions {
  @scala.inline
  def apply(
    binary: js.UndefOr[Boolean] = js.undefined,
    expire: ExpireOption | ExpirationPolicy = null,
    name: String = null
  ): RouteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary.get.asInstanceOf[js.Any])
    if (expire != null) __obj.updateDynamic("expire")(expire.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptions]
  }
}

