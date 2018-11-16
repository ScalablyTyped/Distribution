package typings
package finchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinchStatic extends js.Object {
  def abort(): scala.Unit = js.native
  def call(uri: java.lang.String): scala.Unit = js.native
  def ignore(): scala.Boolean = js.native
  def listen(): scala.Boolean = js.native
  def navigate(queryParams: js.Any): scala.Unit = js.native
  def navigate(queryParams: js.Any, doUpdate: scala.Boolean): scala.Unit = js.native
  def navigate(uri: java.lang.String): scala.Unit = js.native
  def navigate(uri: java.lang.String, doUpdate: scala.Boolean): scala.Unit = js.native
  def navigate(uri: java.lang.String, queryParams: js.Any): scala.Unit = js.native
  def navigate(uri: java.lang.String, queryParams: js.Any, doUpdate: scala.Boolean): scala.Unit = js.native
  def observe(argN: js.Array[java.lang.String], callback: js.Function1[/* params */ ObserveCallback, scala.Unit]): scala.Unit = js.native
  def observe(args: js.Any*): scala.Unit = js.native
  def observe(callback: js.Function1[/* params */ ObserveCallback, scala.Unit]): scala.Unit = js.native
  def options(options: FinchOptions): scala.Unit = js.native
  def route(route: java.lang.String, callback: FinchCallback): scala.Unit = js.native
  def route(route: java.lang.String, callbacks: ExpandedCallback): scala.Unit = js.native
}

