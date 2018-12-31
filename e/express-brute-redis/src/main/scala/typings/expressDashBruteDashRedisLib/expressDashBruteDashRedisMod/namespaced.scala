package typings
package expressDashBruteDashRedisLib.expressDashBruteDashRedisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary Redis store for Express Brute
  */
@JSImport("express-brute-redis", JSImport.Namespace)
@js.native
/**
  * @summary constructor
  * @param options Options to configure the Redis client.
  */
class namespaced () extends express_brute_redis {
  def this(options: redisLib.redisMod.ClientOpts, args: js.Any*) = this()
}

/**
  * @summary Redis store for Express Brute
  */
@JSImport("express-brute-redis", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  /**
    * Default options for the Redis client
    */
  var defaults: redisLib.redisMod.ClientOpts = js.native
}

