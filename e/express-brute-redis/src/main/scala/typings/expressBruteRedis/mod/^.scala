package typings.expressBruteRedis.mod

import typings.expressBruteRedis.anon.ClientOptsclientRedisClie
import typings.expressBruteRedis.anon.Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary Redis store for Express Brute
  */
@JSImport("express-brute-redis", JSImport.Namespace)
@js.native
class ^ protected () extends RedisStore {
  def this(options: js.UndefOr[scala.Nothing], args: js.Any*) = this()
  /**
    * @summary constructor
    * @param options Options to configure the Redis client.
    */
  def this(options: ClientOptsclientRedisClie, args: js.Any*) = this()
}
@JSImport("express-brute-redis", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var Redis: js.Any = js.native
  
  var defaults: Host = js.native
}
