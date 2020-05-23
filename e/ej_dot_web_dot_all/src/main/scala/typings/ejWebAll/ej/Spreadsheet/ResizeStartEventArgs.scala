package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeStartEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the column index which column you start to resize.
    */
  var colIndex: js.UndefOr[Double] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns type of the request.
    */
  var reqType: js.UndefOr[String] = js.undefined
  /** Returns the row index which row you start to resize.
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ResizeStartEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    colIndex: js.UndefOr[Double] = js.undefined,
    model: js.Any = null,
    reqType: String = null,
    rowIndex: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): ResizeStartEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colIndex)) __obj.updateDynamic("colIndex")(colIndex.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (reqType != null) __obj.updateDynamic("reqType")(reqType.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeStartEventArgs]
  }
}

