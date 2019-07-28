package typings.ejDotWebDotAll.ejNs.PivotTreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderFailureEventArgs extends js.Object {
  /** returns the current action of PivotTreeMap control.
    */
  var action: js.UndefOr[String] = js.undefined
  /** returns the custom object bound with PivotTreeMap control.
    */
  var customObject: js.UndefOr[js.Any] = js.undefined
  /** returns the HTML element of PivotTreeMap control.
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the error stack trace of the original exception.
    */
  var message: js.UndefOr[String] = js.undefined
}

object RenderFailureEventArgs {
  @scala.inline
  def apply(action: String = null, customObject: js.Any = null, element: js.Any = null, message: String = null): RenderFailureEventArgs = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (customObject != null) __obj.updateDynamic("customObject")(customObject)
    if (element != null) __obj.updateDynamic("element")(element)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[RenderFailureEventArgs]
  }
}

