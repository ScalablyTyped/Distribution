package typings.fastMemoize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGet[K, V] extends js.Object {
  def get(key: K): V
  def has(key: K): Boolean
  def set(key: K, value: V): Unit
}

object AnonGet {
  @scala.inline
  def apply[K, V](get: K => V, has: K => Boolean, set: (K, V) => Unit): AnonGet[K, V] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[AnonGet[K, V]]
  }
}

