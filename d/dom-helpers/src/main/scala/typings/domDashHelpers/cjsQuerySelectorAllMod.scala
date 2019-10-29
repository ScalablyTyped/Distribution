package typings.domDashHelpers

import typings.std.Document
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/querySelectorAll", JSImport.Namespace)
@js.native
object cjsQuerySelectorAllMod extends js.Object {
  def default(element: Document, selector: String): js.Array[HTMLElement] = js.native
  def default(element: HTMLElement, selector: String): js.Array[HTMLElement] = js.native
}

