package typings.findMyWay.anon

import typings.findMyWay.mod.HTTPVersion
import typings.findMyWay.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Del[V /* <: HTTPVersion */] extends js.Object {
  def del(version: String): Unit
  def empty(): Unit
  def get(version: String): Handler[V] | Null
  def set(version: String, store: Handler[V]): Unit
}

object Del {
  @scala.inline
  def apply[/* <: typings.findMyWay.mod.HTTPVersion */ V](
    del: String => Unit,
    empty: () => Unit,
    get: String => Handler[V] | Null,
    set: (String, Handler[V]) => Unit
  ): Del[V] = {
    val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), empty = js.Any.fromFunction0(empty), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Del[V]]
  }
}

