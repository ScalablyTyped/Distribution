package typings.ejWebAll.ej.Spreadsheet

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyUpEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the boolean value.
    */
  var isCommentEdit: js.UndefOr[Boolean] = js.undefined
  /** Returns the boolean value.
    */
  var isEdit: js.UndefOr[Boolean] = js.undefined
  /** Returns the boolean value.
    */
  var isSheetRename: js.UndefOr[Boolean] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the sheet index.
    */
  var sheetIndex: js.UndefOr[Double] = js.undefined
  /** Returns the target element.
    */
  var target: js.UndefOr[HTMLElement] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object KeyUpEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    isCommentEdit: js.UndefOr[Boolean] = js.undefined,
    isEdit: js.UndefOr[Boolean] = js.undefined,
    isSheetRename: js.UndefOr[Boolean] = js.undefined,
    model: Model = null,
    sheetIndex: js.UndefOr[Double] = js.undefined,
    target: HTMLElement = null,
    `type`: String = null
  ): KeyUpEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isCommentEdit)) __obj.updateDynamic("isCommentEdit")(isCommentEdit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isEdit)) __obj.updateDynamic("isEdit")(isEdit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSheetRename)) __obj.updateDynamic("isSheetRename")(isSheetRename.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetIndex)) __obj.updateDynamic("sheetIndex")(sheetIndex.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyUpEventArgs]
  }
}

