package typings.ejDotWebDotAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnImportEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the imported data.
    */
  var importData: js.UndefOr[js.Any] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Spreadsheet.Model] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object OnImportEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    importData: js.Any = null,
    model: typings.ejDotWebDotAll.ej.Spreadsheet.Model = null,
    `type`: String = null
  ): OnImportEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (importData != null) __obj.updateDynamic("importData")(importData)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OnImportEventArgs]
  }
}

