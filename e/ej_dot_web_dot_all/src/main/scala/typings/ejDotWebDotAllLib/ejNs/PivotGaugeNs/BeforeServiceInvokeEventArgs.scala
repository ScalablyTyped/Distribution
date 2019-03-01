package typings
package ejDotWebDotAllLib.ejNs.PivotGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeServiceInvokeEventArgs extends js.Object {
  /** returns the custom object bound with PivotGauge control.
    */
  var customObject: js.UndefOr[js.Any] = js.undefined
  /** returns the HTML element of PivotGauge control.
    */
  var element: js.UndefOr[js.Any] = js.undefined
}

object BeforeServiceInvokeEventArgs {
  @scala.inline
  def apply(customObject: js.Any = null, element: js.Any = null): BeforeServiceInvokeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (customObject != null) __obj.updateDynamic("customObject")(customObject)
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[BeforeServiceInvokeEventArgs]
  }
}

