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
    decrement: java.lang.String => scala.Unit,
    incr: (java.lang.String, StoreIncrementCallback) => scala.Unit,
    resetKey: java.lang.String => scala.Unit
  ): Store = {
    val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction1(decrement), incr = js.Any.fromFunction2(incr), resetKey = js.Any.fromFunction1(resetKey))
  
    __obj.asInstanceOf[Store]
  }
}

