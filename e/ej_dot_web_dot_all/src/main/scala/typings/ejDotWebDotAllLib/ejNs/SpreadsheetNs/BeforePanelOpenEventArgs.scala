package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforePanelOpenEventArgs extends js.Object {
  /** Returns the activation panel element.
    */
  var activationPanel: js.UndefOr[js.Any] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the range option value.
    */
  var range: js.UndefOr[js.Any] = js.undefined
  /** Returns the sheet index.
    */
  var sheetIdx: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object BeforePanelOpenEventArgs {
  @scala.inline
  def apply(
    activationPanel: js.Any = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    range: js.Any = null,
    sheetIdx: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
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

