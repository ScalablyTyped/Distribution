package typings.expressRedisCache.mod.expressServeStaticCoreAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var express_redis_cache_name: js.UndefOr[String] = js.native
  var use_express_redis_cache: js.UndefOr[Boolean] = js.native
}

object Response {
  @scala.inline
  def apply(): Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpress_redis_cache_name(value: String): Self = this.set("express_redis_cache_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpress_redis_cache_name: Self = this.set("express_redis_cache_name", js.undefined)
    @scala.inline
    def setUse_express_redis_cache(value: Boolean): Self = this.set("use_express_redis_cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse_express_redis_cache: Self = this.set("use_express_redis_cache", js.undefined)
  }
  
}

