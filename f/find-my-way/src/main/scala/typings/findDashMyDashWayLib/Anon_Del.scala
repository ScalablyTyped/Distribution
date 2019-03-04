package typings
package findDashMyDashWayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Del[V /* <: findDashMyDashWayLib.findDashMyDashWayMod.RouterNs.HTTPVersion */] extends js.Object {
  def del(version: nodeLib.String): scala.Unit
  def empty(): scala.Unit
  def get(version: nodeLib.String): findDashMyDashWayLib.findDashMyDashWayMod.RouterNs.Handler[V] | scala.Null
  def set(version: nodeLib.String, store: findDashMyDashWayLib.findDashMyDashWayMod.RouterNs.Handler[V]): scala.Unit
}

object Anon_Del {
  @scala.inline
  def apply[V /* <: findDashMyDashWayLib.findDashMyDashWayMod.RouterNs.HTTPVersion */](
    del: js.Function1[nodeLib.String, scala.Unit],
    empty: js.Function0[scala.Unit],
    get: js.Function1[
      nodeLib.String, 
      findDashMyDashWayLib.findDashMyDashWayMod.RouterNs.Handler[V] | scala.Null
    ],
    set: js.Function2[
      nodeLib.String, 
      findDashMyDashWayLib.findDashMyDashWayMod.RouterNs.Handler[V], 
      scala.Unit
    ]
  ): Anon_Del[V] = {
    val __obj = js.Dynamic.literal(del = del, empty = empty, get = get, set = set)
  
    __obj.asInstanceOf[Anon_Del[V]]
  }
}

