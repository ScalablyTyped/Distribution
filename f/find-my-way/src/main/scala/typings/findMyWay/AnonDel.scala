package typings.findMyWay

import typings.findMyWay.mod.HTTPVersion
import typings.findMyWay.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDel[V /* <: HTTPVersion */] extends js.Object {
  def del(version: String): Unit
  def empty(): Unit
  def get(version: String): Handler[V] | Null
  def set(version: String, store: Handler[V]): Unit
}

object AnonDel {
  @scala.inline
  def apply[V /* <: HTTPVersion */](
    del: String => Unit,
    empty: () => Unit,
    get: String => Handler[V] | Null,
    set: (String, Handler[V]) => Unit
  ): AnonDel[V] = {
    val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), empty = js.Any.fromFunction0(empty), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[AnonDel[V]]
  }
}

