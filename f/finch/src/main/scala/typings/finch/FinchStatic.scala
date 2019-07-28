package typings.finch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinchStatic extends js.Object {
  def abort(): Unit = js.native
  def call(uri: String): Unit = js.native
  def ignore(): Boolean = js.native
  def listen(): Boolean = js.native
  def navigate(queryParams: js.Any): Unit = js.native
  def navigate(queryParams: js.Any, doUpdate: Boolean): Unit = js.native
  def navigate(uri: String): Unit = js.native
  def navigate(uri: String, doUpdate: Boolean): Unit = js.native
  def navigate(uri: String, queryParams: js.Any): Unit = js.native
  def navigate(uri: String, queryParams: js.Any, doUpdate: Boolean): Unit = js.native
  def observe(argN: js.Array[String], callback: js.Function1[/* params */ ObserveCallback, Unit]): Unit = js.native
  def observe(args: js.Any*): Unit = js.native
  def observe(callback: js.Function1[/* params */ ObserveCallback, Unit]): Unit = js.native
  def options(options: FinchOptions): Unit = js.native
  def route(route: String, callbacks: ExpandedCallback): Unit = js.native
  def route(route: String, callback: FinchCallback): Unit = js.native
}

