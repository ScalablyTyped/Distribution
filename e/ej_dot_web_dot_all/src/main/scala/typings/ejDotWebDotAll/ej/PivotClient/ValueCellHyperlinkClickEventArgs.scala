package typings.ejDotWebDotAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueCellHyperlinkClickEventArgs extends js.Object {
  /** returns the clicked cell information.
    */
  var args: js.UndefOr[js.Any] = js.undefined
  /** returns the custom object bounds with PivotClient control.
    */
  var customerObject: js.UndefOr[js.Any] = js.undefined
  /** returns the HTML element of PivotGrid control.
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the model object bound with PivotClient control.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the current action of PivotClient control.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ValueCellHyperlinkClickEventArgs {
  @scala.inline
  def apply(
    args: js.Any = null,
    customerObject: js.Any = null,
    element: js.Any = null,
    model: js.Any = null,
    `type`: String = null
  ): ValueCellHyperlinkClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (customerObject != null) __obj.updateDynamic("customerObject")(customerObject)
    if (element != null) __obj.updateDynamic("element")(element)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ValueCellHyperlinkClickEventArgs]
  }
}

