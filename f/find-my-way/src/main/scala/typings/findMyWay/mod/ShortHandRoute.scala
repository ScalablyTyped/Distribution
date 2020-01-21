package typings.findMyWay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShortHandRoute[V /* <: HTTPVersion */] extends js.Object {
  def apply(path: String, handler: Handler[V]): Unit = js.native
  def apply(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def apply(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def apply(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
}

