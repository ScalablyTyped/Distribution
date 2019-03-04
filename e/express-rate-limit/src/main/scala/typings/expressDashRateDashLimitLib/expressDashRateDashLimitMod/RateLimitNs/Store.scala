package typings
package expressDashRateDashLimitLib.expressDashRateDashLimitMod.RateLimitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store extends js.Object {
  def decrement(key: java.lang.String): scala.Unit
  def incr(key: java.lang.String, cb: StoreIncrementCallback): scala.Unit
  def resetKey(key: java.lang.String): scala.Unit
}

object Store {
  @scala.inline
  def apply(
    decrement: js.Function1[java.lang.String, scala.Unit],
    incr: js.Function2[java.lang.String, StoreIncrementCallback, scala.Unit],
    resetKey: js.Function1[java.lang.String, scala.Unit]
  ): Store = {
    val __obj = js.Dynamic.literal(decrement = decrement, incr = incr, resetKey = resetKey)
  
    __obj.asInstanceOf[Store]
  }
}

