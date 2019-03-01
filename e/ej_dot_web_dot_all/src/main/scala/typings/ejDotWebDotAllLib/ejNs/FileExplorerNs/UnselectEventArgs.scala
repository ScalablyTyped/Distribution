package typings
package ejDotWebDotAllLib.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnselectEventArgs extends js.Object {
  /** Returns the FileExplorer model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the name of unselected item.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the name of unselected items.
    */
  var names: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Returns the type of unselected item.
    */
  var nodeType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the path of unselected item.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
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
    model: Model = null,
    name: java.lang.String = null,
    names: js.Array[java.lang.String] = null,
    nodeType: java.lang.String = null,
    path: java.lang.String = null,
    `type`: java.lang.String = null,
    unselectedItem: js.Any = null,
    unselectedItems: js.Array[_] = null
  ): UnselectEventArgs = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model)
    if (name != null) __obj.updateDynamic("name")(name)
    if (names != null) __obj.updateDynamic("names")(names)
    if (nodeType != null) __obj.updateDynamic("nodeType")(nodeType)
    if (path != null) __obj.updateDynamic("path")(path)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (unselectedItem != null) __obj.updateDynamic("unselectedItem")(unselectedItem)
    if (unselectedItems != null) __obj.updateDynamic("unselectedItems")(unselectedItems)
    __obj.asInstanceOf[UnselectEventArgs]
  }
}

