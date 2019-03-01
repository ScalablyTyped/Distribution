package typings
package ejDotWebDotAllLib.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasteEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the FileExplorer model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of moved/copied file or folder.
    */
  var name: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** returns the selected item details.
    */
  var selectedItems: js.UndefOr[js.Any] = js.undefined
  /** returns the target folder item details.
    */
  var targetFolder: js.UndefOr[js.Any] = js.undefined
  /** returns the target path.
    */
  var targetPath: js.UndefOr[java.lang.String] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object PasteEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    name: js.Array[java.lang.String] = null,
    selectedItems: js.Any = null,
    targetFolder: js.Any = null,
    targetPath: java.lang.String = null,
    `type`: java.lang.String = null
  ): PasteEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (name != null) __obj.updateDynamic("name")(name)
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems)
    if (targetFolder != null) __obj.updateDynamic("targetFolder")(targetFolder)
    if (targetPath != null) __obj.updateDynamic("targetPath")(targetPath)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PasteEventArgs]
  }
}

