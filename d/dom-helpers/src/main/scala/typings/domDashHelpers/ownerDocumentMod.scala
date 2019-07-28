package typings.domDashHelpers

import typings.std.Document
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/ownerDocument", JSImport.Namespace)
@js.native
object ownerDocumentMod extends js.Object {
  def apply(): Document = js.native
  def apply(node: Node): Document = js.native
}

