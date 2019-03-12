package typings
package fastifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Del extends js.Object {
  def del(version: java.lang.String): scala.Unit
  def empty(): scala.Unit
  def get(version: java.lang.String): js.Function | scala.Null
  def set(version: java.lang.String, store: js.Function): scala.Unit
}

object Anon_Del {
  @scala.inline
  def apply(
    del: java.lang.String => scala.Unit,
    empty: () => scala.Unit,
    get: java.lang.String => js.Function | scala.Null,
    set: (java.lang.String, js.Function) => scala.Unit
  ): Anon_Del = {
    val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), empty = js.Any.fromFunction0(empty), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[Anon_Del]
  }
}

