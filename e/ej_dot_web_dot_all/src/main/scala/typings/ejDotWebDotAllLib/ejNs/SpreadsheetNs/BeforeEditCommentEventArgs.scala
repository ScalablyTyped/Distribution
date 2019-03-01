package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeEditCommentEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the comment cell index.
    */
  var cellIndex: js.UndefOr[js.Any] = js.undefined
  /** Returns the disable option value.
    */
  var disable: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the sheet index.
    */
  var sheetIdx: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the value of the comment
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object BeforeEditCommentEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    cellIndex: js.Any = null,
    disable: js.UndefOr[scala.Boolean] = js.undefined,
    model: js.Any = null,
    sheetIdx: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): BeforeEditCommentEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cellIndex != null) __obj.updateDynamic("cellIndex")(cellIndex)
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable)
    if (model != null) __obj.updateDynamic("model")(model)
    if (sheetIdx != null) __obj.updateDynamic("sheetIdx")(sheetIdx.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[BeforeEditCommentEventArgs]
  }
}

