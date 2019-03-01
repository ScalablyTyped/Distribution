package typings
package ejDotWebDotAllLib.ejNs.PivotGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnHeaderHyperlinkClickEventArgs extends js.Object {
  /** returns the information about the clicked cell
    */
  var args: js.UndefOr[js.Any] = js.undefined
  /** returns the custom object bound to the control.
    */
  var customObject: js.UndefOr[js.Any] = js.undefined
  /** returns the HTML element of the control.
    */
  var element: js.UndefOr[js.Any] = js.undefined
}

object ColumnHeaderHyperlinkClickEventArgs {
  @scala.inline
  def apply(args: js.Any = null, customObject: js.Any = null, element: js.Any = null): ColumnHeaderHyperlinkClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (customObject != null) __obj.updateDynamic("customObject")(customObject)
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[ColumnHeaderHyperlinkClickEventArgs]
  }
}

