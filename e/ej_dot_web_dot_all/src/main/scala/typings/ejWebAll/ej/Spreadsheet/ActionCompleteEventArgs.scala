package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCompleteEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.undefined
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
    model: Model = null,
    reqType: String = null,
    selectedCell: js.Array[_] | js.Any = null,
    sheetIdx: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): ActionCompleteEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (reqType != null) __obj.updateDynamic("reqType")(reqType.asInstanceOf[js.Any])
    if (selectedCell != null) __obj.updateDynamic("selectedCell")(selectedCell.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetIdx)) __obj.updateDynamic("sheetIdx")(sheetIdx.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCompleteEventArgs]
  }
}

