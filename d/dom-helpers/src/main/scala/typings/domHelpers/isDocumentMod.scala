package typings.domHelpers

import typings.std.Document
import typings.std.Element
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/isDocument", JSImport.Namespace)
@js.native
object isDocumentMod extends js.Object {
  def default(element: Document): /* is std.Document */ Boolean = js.native
  def default(element: Element): /* is std.Document */ Boolean = js.native
  def default(element: Window): /* is std.Document */ Boolean = js.native
}

