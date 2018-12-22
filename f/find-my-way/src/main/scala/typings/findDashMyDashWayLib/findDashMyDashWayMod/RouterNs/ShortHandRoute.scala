package typings
package findDashMyDashWayLib.findDashMyDashWayMod.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShortHandRoute[V /* <: HTTPVersion */] extends js.Object {
  def apply(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def apply(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def apply(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def apply(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
}

