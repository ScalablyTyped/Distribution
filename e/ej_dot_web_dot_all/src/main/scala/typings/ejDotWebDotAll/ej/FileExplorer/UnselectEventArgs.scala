package typings.ejDotWebDotAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnselectEventArgs extends js.Object {
  /** Returns the FileExplorer model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.FileExplorer.Model] = js.undefined
  /** Returns the name of unselected item.
    */
  var name: js.UndefOr[String] = js.undefined
  /** Returns the name of unselected items.
    */
  var names: js.UndefOr[js.Array[String]] = js.undefined
  /** Returns the type of unselected item.
    */
  var nodeType: js.UndefOr[String] = js.undefined
  /** Returns the path of unselected item.
    */
  var path: js.UndefOr[String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** Returns the unselected item details.
    */
  var unselectedItem: js.UndefOr[js.Any] = js.undefined
  /** Returns the unselected items details.
    */
  var unselectedItems: js.UndefOr[js.Array[_]] = js.undefined
}

object UnselectEventArgs {
  @scala.inline
  def apply(
    model: typings.ejDotWebDotAll.ej.FileExplorer.Model = null,
    name: String = null,
    names: js.Array[String] = null,
    nodeType: String = null,
    path: String = null,
    `type`: String = null,
    unselectedItem: js.Any = null,
    unselectedItems: js.Array[_] = null
  ): UnselectEventArgs = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (names != null) __obj.updateDynamic("names")(names.asInstanceOf[js.Any])
    if (nodeType != null) __obj.updateDynamic("nodeType")(nodeType.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unselectedItem != null) __obj.updateDynamic("unselectedItem")(unselectedItem.asInstanceOf[js.Any])
    if (unselectedItems != null) __obj.updateDynamic("unselectedItems")(unselectedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnselectEventArgs]
  }
}

