package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyDownEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the boolean value.
    */
  var isCommentEdit: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the boolean value.
    */
  var isEdit: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the boolean value.
    */
  var isSheetRename: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the sheet index.
    */
  var sheetIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the target element.
    */
  var target: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object KeyDownEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    isCommentEdit: js.UndefOr[scala.Boolean] = js.undefined,
    isEdit: js.UndefOr[scala.Boolean] = js.undefined,
    isSheetRename: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    sheetIndex: scala.Int | scala.Double = null,
    target: stdLib.HTMLElement = null,
    `type`: java.lang.String = null
  ): KeyDownEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (!js.isUndefined(isCommentEdit)) __obj.updateDynamic("isCommentEdit")(isCommentEdit)
    if (!js.isUndefined(isEdit)) __obj.updateDynamic("isEdit")(isEdit)
    if (!js.isUndefined(isSheetRename)) __obj.updateDynamic("isSheetRename")(isSheetRename)
    if (model != null) __obj.updateDynamic("model")(model)
    if (sheetIndex != null) __obj.updateDynamic("sheetIndex")(sheetIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[KeyDownEventArgs]
  }
}

