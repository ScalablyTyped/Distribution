package typings.ejDotWebDotAll.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragStartEventArgs extends js.Object {
  /** set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the FileExplorer model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.FileExplorerNs.Model] = js.undefined
  /** returns the dragging file details.
    */
  var selectedItems: js.UndefOr[js.Any] = js.undefined
  /** returns the dragging element.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** returns the path of dragging element.
    */
  var targetPath: js.UndefOr[String] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object DragStartEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ejNs.FileExplorerNs.Model = null,
    selectedItems: js.Any = null,
    target: js.Any = null,
    targetPath: String = null,
    `type`: String = null
  ): DragStartEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems)
    if (target != null) __obj.updateDynamic("target")(target)
    if (targetPath != null) __obj.updateDynamic("targetPath")(targetPath)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DragStartEventArgs]
  }
}

