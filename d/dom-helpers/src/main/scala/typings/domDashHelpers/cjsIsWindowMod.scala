package typings.domDashHelpers

import typings.domDashHelpers.domDashHelpersBooleans.`false`
import typings.std.Document
import typings.std.Element
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/isWindow", JSImport.Namespace)
@js.native
object cjsIsWindowMod extends js.Object {
  def default(node: Document): Window | `false` = js.native
  def default(node: Element): Window | `false` = js.native
  def default(node: Window): Window | `false` = js.native
}

