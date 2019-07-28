package typings.ejDotWebDotAll.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CutEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the FileExplorer model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.FileExplorerNs.Model] = js.undefined
  /** returns the name of moved file or folder.
    */
  var name: js.UndefOr[js.Array[String]] = js.undefined
  /** returns the selected item details.
    */
  var selectedItems: js.UndefOr[js.Any] = js.undefined
  /** returns the source path.
    */
  var sourcePath: js.UndefOr[String] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object CutEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ejNs.FileExplorerNs.Model = null,
    name: js.Array[String] = null,
    selectedItems: js.Any = null,
    sourcePath: String = null,
    `type`: String = null
  ): CutEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (name != null) __obj.updateDynamic("name")(name)
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems)
    if (sourcePath != null) __obj.updateDynamic("sourcePath")(sourcePath)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CutEventArgs]
  }
}

