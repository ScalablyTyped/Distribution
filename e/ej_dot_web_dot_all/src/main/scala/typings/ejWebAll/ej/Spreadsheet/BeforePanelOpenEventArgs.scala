package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforePanelOpenEventArgs extends js.Object {
  /** Returns the activation panel element.
    */
  var activationPanel: js.UndefOr[js.Any] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the range option value.
    */
  var range: js.UndefOr[js.Any] = js.undefined
  /** Returns the sheet index.
    */
  var sheetIdx: js.UndefOr[Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BeforePanelOpenEventArgs {
  @scala.inline
  def apply(
    activationPanel: js.Any = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: Model = null,
    range: js.Any = null,
    sheetIdx: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): BeforePanelOpenEventArgs = {
    val __obj = js.Dynamic.literal()
    if (activationPanel != null) __obj.updateDynamic("activationPanel")(activationPanel.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetIdx)) __obj.updateDynamic("sheetIdx")(sheetIdx.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforePanelOpenEventArgs]
  }
}

