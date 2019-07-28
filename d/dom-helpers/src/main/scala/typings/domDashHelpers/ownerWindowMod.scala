package typings.domDashHelpers

import typings.std.Node
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/ownerWindow", JSImport.Namespace)
@js.native
object ownerWindowMod extends js.Object {
  def apply(): Window = js.native
  def apply(node: Node): Window = js.native
}

