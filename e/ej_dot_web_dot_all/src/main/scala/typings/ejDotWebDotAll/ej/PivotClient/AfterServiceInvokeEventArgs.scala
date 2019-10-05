package typings.ejDotWebDotAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterServiceInvokeEventArgs extends js.Object {
  /** returns the current action of PivotClient control.
    */
  var action: js.UndefOr[String] = js.undefined
  /** returns the custom object bounds with PivotClient control.
    */
  var customObject: js.UndefOr[js.Any] = js.undefined
  /** returns the HTML element of PivotClient control.
    */
  var element: js.UndefOr[js.Any] = js.undefined
}

object AfterServiceInvokeEventArgs {
  @scala.inline
  def apply(action: String = null, customObject: js.Any = null, element: js.Any = null): AfterServiceInvokeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (customObject != null) __obj.updateDynamic("customObject")(customObject)
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[AfterServiceInvokeEventArgs]
  }
}

