package typings.domDashHelpers

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/class", JSImport.Namespace)
@js.native
object classMod extends js.Object {
  @JSName("addClass")
  var addClass_Original: js.Function2[/* element */ Element, /* className */ String, Unit] = js.native
  var default: Anon_AddClass = js.native
  @JSName("hasClass")
  var hasClass_Original: js.Function2[/* element */ Element, /* className */ String, Boolean] = js.native
  @JSName("removeClass")
  var removeClass_Original: js.Function2[/* element */ Element, /* className */ String, Unit] = js.native
  def addClass(element: Element, className: String): Unit = js.native
  def hasClass(element: Element, className: String): Boolean = js.native
  def removeClass(element: Element, className: String): Unit = js.native
}

