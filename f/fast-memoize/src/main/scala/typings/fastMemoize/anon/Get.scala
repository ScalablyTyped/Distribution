package typings.fastMemoize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Get[K, V] extends js.Object {
  def get(key: K): V
  def has(key: K): Boolean
  def set(key: K, value: V): Unit
}

object Get {
  @scala.inline
  def apply[K, V](get: K => V, has: K => Boolean, set: (K, V) => Unit): Get[K, V] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Get[K, V]]
  }
}

