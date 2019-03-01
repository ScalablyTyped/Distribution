package typings
package expressDashRedisDashCacheLib.expressDashRedisDashCacheMod.expressDashServeDashStaticDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var express_redis_cache_name: js.UndefOr[java.lang.String] = js.undefined
  var use_express_redis_cache: js.UndefOr[scala.Boolean] = js.undefined
}

object Response {
  @scala.inline
  def apply(
    express_redis_cache_name: java.lang.String = null,
    use_express_redis_cache: js.UndefOr[scala.Boolean] = js.undefined
  ): Response = {
    val __obj = js.Dynamic.literal()
    if (express_redis_cache_name != null) __obj.updateDynamic("express_redis_cache_name")(express_redis_cache_name)
    if (!js.isUndefined(use_express_redis_cache)) __obj.updateDynamic("use_express_redis_cache")(use_express_redis_cache)
    __obj.asInstanceOf[Response]
  }
}

