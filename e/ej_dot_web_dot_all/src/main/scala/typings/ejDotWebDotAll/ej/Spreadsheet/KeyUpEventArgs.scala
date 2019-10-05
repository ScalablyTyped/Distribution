package typings.ejDotWebDotAll.ej.Spreadsheet

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
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Spreadsheet.Model] = js.undefined
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
    model: typings.ejDotWebDotAll.ej.Spreadsheet.Model = null,
    sheetIndex: Int | Double = null,
    target: HTMLElement = null,
    `type`: String = null
  ): KeyUpEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (!js.isUndefined(isCommentEdit)) __obj.updateDynamic("isCommentEdit")(isCommentEdit)
    if (!js.isUndefined(isEdit)) __obj.updateDynamic("isEdit")(isEdit)
    if (!js.isUndefined(isSheetRename)) __obj.updateDynamic("isSheetRename")(isSheetRename)
    if (model != null) __obj.updateDynamic("model")(model)
    if (sheetIndex != null) __obj.updateDynamic("sheetIndex")(sheetIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[KeyUpEventArgs]
  }
}

