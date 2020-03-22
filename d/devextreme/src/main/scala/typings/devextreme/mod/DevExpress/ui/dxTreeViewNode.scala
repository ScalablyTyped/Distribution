package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTreeViewNode extends js.Object {
  /** Contains all the child nodes of the current node. */
  var children: js.UndefOr[js.Array[dxTreeViewNode]] = js.undefined
  /** Equals to true if the node is disabled; otherwise false. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Equals true if the node is expanded; false if collapsed. */
  var expanded: js.UndefOr[Boolean] = js.undefined
  /** Contains the data source object corresponding to the node. */
  var itemData: js.UndefOr[js.Any] = js.undefined
  /** Contains the key value of the node. */
  var key: js.UndefOr[js.Any] = js.undefined
  /** Refers to the parent node of the current node. */
  var parent: js.UndefOr[dxTreeViewNode] = js.undefined
  /** Equals to true if the node is selected; false if not. */
  var selected: js.UndefOr[Boolean] = js.undefined
  /** Contains the text displayed by the node. */
  var text: js.UndefOr[String] = js.undefined
}

object dxTreeViewNode {
  @scala.inline
  def apply(
    children: js.Array[dxTreeViewNode] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    expanded: js.UndefOr[Boolean] = js.undefined,
    itemData: js.Any = null,
    key: js.Any = null,
    parent: dxTreeViewNode = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    text: String = null
  ): dxTreeViewNode = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTreeViewNode]
  }
}

