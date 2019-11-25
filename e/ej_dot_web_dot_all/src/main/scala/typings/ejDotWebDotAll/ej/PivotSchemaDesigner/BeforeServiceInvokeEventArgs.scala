package typings.ejDotWebDotAll.ej.PivotSchemaDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeServiceInvokeEventArgs extends js.Object {
  /** returns the current action of PivotSchemaDesigner control.
    */
  var action: js.UndefOr[String] = js.undefined
  /** returns the custom object bound with PivotSchemaDesigner control.
    */
  var customObject: js.UndefOr[js.Any] = js.undefined
  /** returns the HTML element of PivotSchemaDesigner control.
    */
  var element: js.UndefOr[js.Any] = js.undefined
}

object BeforeServiceInvokeEventArgs {
  @scala.inline
  def apply(action: String = null, customObject: js.Any = null, element: js.Any = null): BeforeServiceInvokeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (customObject != null) __obj.updateDynamic("customObject")(customObject.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeServiceInvokeEventArgs]
  }
}

