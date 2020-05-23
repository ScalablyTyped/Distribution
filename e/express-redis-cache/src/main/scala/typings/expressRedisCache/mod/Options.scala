package typings.expressRedisCache.mod

import typings.redis.mod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var auth_pass: js.UndefOr[String] = js.undefined
  var client: js.UndefOr[RedisClient] = js.undefined
  var expire: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[String | Double] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    auth_pass: String = null,
    client: RedisClient = null,
    expire: js.UndefOr[Double] = js.undefined,
    host: String = null,
    port: String | Double = null,
    prefix: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (auth_pass != null) __obj.updateDynamic("auth_pass")(auth_pass.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (!js.isUndefined(expire)) __obj.updateDynamic("expire")(expire.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

