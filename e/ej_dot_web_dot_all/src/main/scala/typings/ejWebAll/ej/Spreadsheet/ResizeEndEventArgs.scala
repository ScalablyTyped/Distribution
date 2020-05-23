package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeEndEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the column index which you resized.
    */
  var colIndex: js.UndefOr[Double] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns new height of the row or shape.
    */
  var newHeight: js.UndefOr[Double] = js.undefined
  /** Returns new width of the column or shape.
    */
  var newWidth: js.UndefOr[Double] = js.undefined
  /** Returns old height of the row or shape.
    */
  var oldHeight: js.UndefOr[Double] = js.undefined
  /** Returns old width of the column or shape.
    */
  var oldWidth: js.UndefOr[Double] = js.undefined
  /** Returns type of the request.
    */
  var reqType: js.UndefOr[String] = js.undefined
  /** Returns the row index which you resized.
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ResizeEndEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    colIndex: js.UndefOr[Double] = js.undefined,
    model: js.Any = null,
    newHeight: js.UndefOr[Double] = js.undefined,
    newWidth: js.UndefOr[Double] = js.undefined,
    oldHeight: js.UndefOr[Double] = js.undefined,
    oldWidth: js.UndefOr[Double] = js.undefined,
    reqType: String = null,
    rowIndex: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): ResizeEndEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colIndex)) __obj.updateDynamic("colIndex")(colIndex.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(newHeight)) __obj.updateDynamic("newHeight")(newHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(newWidth)) __obj.updateDynamic("newWidth")(newWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(oldHeight)) __obj.updateDynamic("oldHeight")(oldHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(oldWidth)) __obj.updateDynamic("oldWidth")(oldWidth.get.asInstanceOf[js.Any])
    if (reqType != null) __obj.updateDynamic("reqType")(reqType.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeEndEventArgs]
  }
}

