package typings.ejDotWebDotAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFolderEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the AJAX response data
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** returns the FileExplorer model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.FileExplorer.Model] = js.undefined
  /** returns the selected item details
    */
  var selectedItems: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object CreateFolderEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    model: typings.ejDotWebDotAll.ej.FileExplorer.Model = null,
    selectedItems: js.Any = null,
    `type`: String = null
  ): CreateFolderEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (model != null) __obj.updateDynamic("model")(model)
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CreateFolderEventArgs]
  }
}

