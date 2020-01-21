package typings.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellDoubleClickEventArgs extends js.Object {
  /** returns the custom object bound with PivotGrid control.
    */
  var customObject: js.UndefOr[js.Any] = js.undefined
  /** returns the HTML element of PivotGrid control.
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the JSON details of the double respective on cell.
    */
  var selectedData: js.UndefOr[js.Array[_]] = js.undefined
}

object CellDoubleClickEventArgs {
  @scala.inline
  def apply(customObject: js.Any = null, element: js.Any = null, selectedData: js.Array[_] = null): CellDoubleClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (customObject != null) __obj.updateDynamic("customObject")(customObject.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (selectedData != null) __obj.updateDynamic("selectedData")(selectedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellDoubleClickEventArgs]
  }
}

