package typings
package ejDotWebDotAllLib.ejNs.PivotTreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrillSuccessEventArgs extends js.Object {
  /** return the HTML element of PivotTreeMap control.
    */
  var element: js.UndefOr[js.Any] = js.undefined
}

object DrillSuccessEventArgs {
  @scala.inline
  def apply(element: js.Any = null): DrillSuccessEventArgs = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[DrillSuccessEventArgs]
  }
}

