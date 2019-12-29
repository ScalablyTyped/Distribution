package typings.ejDotWebDotAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the FileExplorer model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of selected items.
    */
  var name: js.UndefOr[js.Array[String]] = js.undefined
  /** returns the path of selected items.
    */
  var path: js.UndefOr[String] = js.undefined
  /** returns the selected item details
    */
  var selectedItems: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object SelectEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: Model = null,
    name: js.Array[String] = null,
    path: String = null,
    selectedItems: js.Any = null,
    `type`: String = null
  ): SelectEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectEventArgs]
  }
}

