package typings
package findDashMyDashWayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Del[V /* <: findDashMyDashWayLib.findDashMyDashWayMod.HTTPVersion */] extends js.Object {
  def del(version: java.lang.String): scala.Unit
  def empty(): scala.Unit
  def get(version: java.lang.String): findDashMyDashWayLib.findDashMyDashWayMod.Handler[V] | scala.Null
  def set(version: java.lang.String, store: findDashMyDashWayLib.findDashMyDashWayMod.Handler[V]): scala.Unit
}

object Anon_Del {
  @scala.inline
  def apply[V /* <: findDashMyDashWayLib.findDashMyDashWayMod.HTTPVersion */](
    del: java.lang.String => scala.Unit,
    empty: () => scala.Unit,
    get: java.lang.String => findDashMyDashWayLib.findDashMyDashWayMod.Handler[V] | scala.Null,
    set: (java.lang.String, findDashMyDashWayLib.findDashMyDashWayMod.Handler[V]) => scala.Unit
  ): Anon_Del[V] = {
    val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), empty = js.Any.fromFunction0(empty), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[Anon_Del[V]]
  }
}

