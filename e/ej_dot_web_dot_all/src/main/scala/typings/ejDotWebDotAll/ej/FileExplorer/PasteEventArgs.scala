package typings.ejDotWebDotAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasteEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the FileExplorer model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of moved/copied file or folder.
    */
  var name: js.UndefOr[js.Array[String]] = js.undefined
  /** returns the selected item details.
    */
  var selectedItems: js.UndefOr[js.Any] = js.undefined
  /** returns the target folder item details.
    */
  var targetFolder: js.UndefOr[js.Any] = js.undefined
  /** returns the target path.
    */
  var targetPath: js.UndefOr[String] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object PasteEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: Model = null,
    name: js.Array[String] = null,
    selectedItems: js.Any = null,
    targetFolder: js.Any = null,
    targetPath: String = null,
    `type`: String = null
  ): PasteEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (targetFolder != null) __obj.updateDynamic("targetFolder")(targetFolder.asInstanceOf[js.Any])
    if (targetPath != null) __obj.updateDynamic("targetPath")(targetPath.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasteEventArgs]
  }
}

