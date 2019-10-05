package typings.ejDotWebDotAll.ej.Spreadsheet

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
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Spreadsheet.Model] = js.undefined
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
    model: typings.ejDotWebDotAll.ej.Spreadsheet.Model = null,
    range: js.Any = null,
    sheetIdx: Int | Double = null,
    `type`: String = null
  ): BeforePanelOpenEventArgs = {
    val __obj = js.Dynamic.literal()
    if (activationPanel != null) __obj.updateDynamic("activationPanel")(activationPanel)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (range != null) __obj.updateDynamic("range")(range)
    if (sheetIdx != null) __obj.updateDynamic("sheetIdx")(sheetIdx.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BeforePanelOpenEventArgs]
  }
}

