package typings
package expressDashRedisDashCacheLib.expressDashRedisDashCacheMod.expressRedisCacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var auth_pass: js.UndefOr[java.lang.String] = js.undefined
  var client: js.UndefOr[redisLib.redisMod.RedisClient] = js.undefined
  var expire: js.UndefOr[scala.Double] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    auth_pass: java.lang.String = null,
    client: redisLib.redisMod.RedisClient = null,
    expire: scala.Int | scala.Double = null,
    host: java.lang.String = null,
    port: java.lang.String | scala.Double = null,
    prefix: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (auth_pass != null) __obj.updateDynamic("auth_pass")(auth_pass)
    if (client != null) __obj.updateDynamic("client")(client)
    if (expire != null) __obj.updateDynamic("expire")(expire.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Options]
  }
}

