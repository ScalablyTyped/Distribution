package typings.domHelpers

import typings.domHelpers.domHelpersBooleans.`false`
import typings.std.Document_
import typings.std.Element
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/isWindow", JSImport.Namespace)
@js.native
object isWindowMod extends js.Object {
  def default(node: Document_): Window_ | `false` = js.native
  def default(node: Element): Window_ | `false` = js.native
  def default(node: Window_): Window_ | `false` = js.native
}

