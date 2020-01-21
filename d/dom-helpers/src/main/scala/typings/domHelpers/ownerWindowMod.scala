package typings.domHelpers

import typings.std.Element
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/ownerWindow", JSImport.Namespace)
@js.native
object ownerWindowMod extends js.Object {
  def default(): Window_ = js.native
  def default(node: Element): Window_ = js.native
}

