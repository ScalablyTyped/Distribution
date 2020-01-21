package typings.ejWebAll.ej.PivotGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadEventArgs extends js.Object {
  /** returns the current action of PivotGauge control.
    */
  var action: js.UndefOr[String] = js.undefined
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
  def apply(action: String = null, customObject: js.Any = null, element: js.Any = null, model: js.Any = null): LoadEventArgs = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (customObject != null) __obj.updateDynamic("customObject")(customObject.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadEventArgs]
  }
}

