package typings.ejDotWebDotAll.ejNs.SpreadsheetNs

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
    colIndex: Int | Double = null,
    model: js.Any = null,
    newHeight: Int | Double = null,
    newWidth: Int | Double = null,
    oldHeight: Int | Double = null,
    oldWidth: Int | Double = null,
    reqType: String = null,
    rowIndex: Int | Double = null,
    `type`: String = null
  ): ResizeEndEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (colIndex != null) __obj.updateDynamic("colIndex")(colIndex.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model)
    if (newHeight != null) __obj.updateDynamic("newHeight")(newHeight.asInstanceOf[js.Any])
    if (newWidth != null) __obj.updateDynamic("newWidth")(newWidth.asInstanceOf[js.Any])
    if (oldHeight != null) __obj.updateDynamic("oldHeight")(oldHeight.asInstanceOf[js.Any])
    if (oldWidth != null) __obj.updateDynamic("oldWidth")(oldWidth.asInstanceOf[js.Any])
    if (reqType != null) __obj.updateDynamic("reqType")(reqType)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResizeEndEventArgs]
  }
}

