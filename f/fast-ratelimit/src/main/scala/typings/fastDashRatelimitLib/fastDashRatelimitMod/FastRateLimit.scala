package typings
package fastDashRatelimitLib.fastDashRatelimitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-ratelimit", "FastRateLimit")
@js.native
class FastRateLimit protected () extends js.Object {
  /**
    * FastRateLimit constructor
    * @param options
    */
  def this(options: FastRateLimitOptions) = this()
  /**
    * FastRateLimit.prototype.consume
    */
  def consume(namespace: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * FastRateLimit.prototype.consumeSync
    */
  def consumeSync(namespace: java.lang.String): scala.Boolean = js.native
  /**
    * FastRateLimit.prototype.hasToken
    */
  def hasToken(namespace: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * FastRateLimit.prototype.hasTokenSync
    */
  def hasTokenSync(namespace: java.lang.String): scala.Boolean = js.native
}

