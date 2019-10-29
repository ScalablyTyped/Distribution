package typings.domDashHelpers

import typings.std.Element
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/ownerWindow", JSImport.Namespace)
@js.native
object cjsOwnerWindowMod extends js.Object {
  def default(): Window = js.native
  def default(node: Element): Window = js.native
}

