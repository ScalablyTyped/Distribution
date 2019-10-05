package typings.ejDotWebDotAll.ej.PivotGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderCompleteEventArgs extends js.Object {
  /** returns the custom object bound with PivotGauge control.
    */
  var customObject: js.UndefOr[js.Any] = js.undefined
  /** returns the HTML element of PivotGauge control.
    */
  var element: js.UndefOr[js.Any] = js.undefined
}

object RenderCompleteEventArgs {
  @scala.inline
  def apply(customObject: js.Any = null, element: js.Any = null): RenderCompleteEventArgs = {
    val __obj = js.Dynamic.literal()
    if (customObject != null) __obj.updateDynamic("customObject")(customObject)
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[RenderCompleteEventArgs]
  }
}

