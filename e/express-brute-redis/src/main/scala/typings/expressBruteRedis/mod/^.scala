package typings.expressBruteRedis.mod

import typings.redis.mod.ClientOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary Redis store for Express Brute
  */
@JSImport("express-brute-redis", JSImport.Namespace)
@js.native
class ^ protected () extends expressBruteRedis {
  def this(options: js.UndefOr[scala.Nothing], args: js.Any*) = this()
  /**
    * @summary constructor
    * @param options Options to configure the Redis client.
    */
  def this(options: ClientOpts, args: js.Any*) = this()
}

@JSImport("express-brute-redis", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Default options for the Redis client
    */
  var defaults: ClientOpts = js.native
}

