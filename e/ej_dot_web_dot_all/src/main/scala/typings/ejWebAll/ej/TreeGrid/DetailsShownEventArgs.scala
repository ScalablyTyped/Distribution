package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailsShownEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the data collection of selected row.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the details element of selected row.
    */
  var detailsElement: js.UndefOr[js.Any] = js.undefined
  /** Returns the TreeGrid model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the rowIndex of selected row.
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object DetailsShownEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    detailsElement: js.Any = null,
    model: js.Any = null,
    rowIndex: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): DetailsShownEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (detailsElement != null) __obj.updateDynamic("detailsElement")(detailsElement.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailsShownEventArgs]
  }
}

