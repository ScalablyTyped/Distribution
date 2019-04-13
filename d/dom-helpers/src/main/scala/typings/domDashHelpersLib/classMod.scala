package typings
package domDashHelpersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/class", JSImport.Namespace)
@js.native
object classMod extends js.Object {
  @JSName("addClass")
  var addClass_Original: js.Function2[/* element */ stdLib.Element, /* className */ java.lang.String, scala.Unit] = js.native
  var default: domDashHelpersLib.Anon_AddClass = js.native
  @JSName("hasClass")
  var hasClass_Original: js.Function2[/* element */ stdLib.Element, /* className */ java.lang.String, scala.Boolean] = js.native
  @JSName("removeClass")
  var removeClass_Original: js.Function2[/* element */ stdLib.Element, /* className */ java.lang.String, scala.Unit] = js.native
  def addClass(element: stdLib.Element, className: java.lang.String): scala.Unit = js.native
  def hasClass(element: stdLib.Element, className: java.lang.String): scala.Boolean = js.native
  def removeClass(element: stdLib.Element, className: java.lang.String): scala.Unit = js.native
}

