package typings.expressRateLimit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store extends js.Object {
  def decrement(key: String): Unit
  def incr(key: String, cb: StoreIncrementCallback): Unit
  def resetAll(): Unit
  def resetKey(key: String): Unit
}

object Store {
  @scala.inline
  def apply(
    decrement: String => Unit,
    incr: (String, StoreIncrementCallback) => Unit,
    resetAll: () => Unit,
    resetKey: String => Unit
  ): Store = {
    val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction1(decrement), incr = js.Any.fromFunction2(incr), resetAll = js.Any.fromFunction0(resetAll), resetKey = js.Any.fromFunction1(resetKey))
    __obj.asInstanceOf[Store]
  }
}

