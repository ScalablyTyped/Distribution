package typings.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrillThroughEventArgs extends js.Object {
  /** return the JSON records of the generated cells on drill-through operation.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** returns the HTML element of PivotClient.
    */
  var element: js.UndefOr[js.Any] = js.undefined
}

object DrillThroughEventArgs {
  @scala.inline
  def apply(data: js.Any = null, element: js.Any = null): DrillThroughEventArgs = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrillThroughEventArgs]
  }
}

