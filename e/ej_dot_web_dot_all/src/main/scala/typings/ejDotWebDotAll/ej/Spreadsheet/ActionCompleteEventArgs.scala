package typings.ejDotWebDotAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCompleteEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns Spreadsheet model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Spreadsheet.Model] = js.undefined
  /** Returns the request type.
    */
  var reqType: js.UndefOr[String] = js.undefined
  /** Returns the applied cell format object.
    */
  var selectedCell: js.UndefOr[js.Array[_] | js.Any] = js.undefined
  /** Returns the sheet index.
    */
  var sheetIdx: js.UndefOr[Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ActionCompleteEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ej.Spreadsheet.Model = null,
    reqType: String = null,
    selectedCell: js.Array[_] | js.Any = null,
    sheetIdx: Int | Double = null,
    `type`: String = null
  ): ActionCompleteEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (reqType != null) __obj.updateDynamic("reqType")(reqType)
    if (selectedCell != null) __obj.updateDynamic("selectedCell")(selectedCell.asInstanceOf[js.Any])
    if (sheetIdx != null) __obj.updateDynamic("sheetIdx")(sheetIdx.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActionCompleteEventArgs]
  }
}

