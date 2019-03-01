package typings
package ejDotWebDotAllLib.ejNs.PivotGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadEventArgs extends js.Object {
  /** returns the current action of PivotGauge control.
    */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /** returns the custom object bound to the control.
    */
  var customObject: js.UndefOr[js.Any] = js.undefined
  /** returns the HTML element of the widget.
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the model of PivotGauge control.
    */
  var model: js.UndefOr[js.Any] = js.undefined
}

object LoadEventArgs {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    customObject: js.Any = null,
    element: js.Any = null,
    model: js.Any = null
  ): LoadEventArgs = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (customObject != null) __obj.updateDynamic("customObject")(customObject)
    if (element != null) __obj.updateDynamic("element")(element)
    if (model != null) __obj.updateDynamic("model")(model)
    __obj.asInstanceOf[LoadEventArgs]
  }
}

