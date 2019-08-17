package typings.emberDashQunit

import typings.qunit.Hooks
import typings.qunit.NestedHooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Hooks extends js.Object {
  def apply(name: String): Unit = js.native
  def apply(name: String, hooks: Hooks): Unit = js.native
  def apply(name: String, hooks: Hooks, nested: js.Function1[/* hooks */ NestedHooks, Unit]): Unit = js.native
  def apply(name: String, nested: js.Function1[/* hooks */ NestedHooks, Unit]): Unit = js.native
}

