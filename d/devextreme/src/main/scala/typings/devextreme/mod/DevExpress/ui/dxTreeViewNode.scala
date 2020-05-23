package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTreeViewNode extends js.Object {
  /** @name dxTreeViewNode.children */
  var children: js.UndefOr[js.Array[dxTreeViewNode]] = js.undefined
  /** @name dxTreeViewNode.disabled */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxTreeViewNode.expanded */
  var expanded: js.UndefOr[Boolean] = js.undefined
  /** @name dxTreeViewNode.itemData */
  var itemData: js.UndefOr[js.Any] = js.undefined
  /** @name dxTreeViewNode.key */
  var key: js.UndefOr[js.Any] = js.undefined
  /** @name dxTreeViewNode.parent */
  var parent: js.UndefOr[dxTreeViewNode] = js.undefined
  /** @name dxTreeViewNode.selected */
  var selected: js.UndefOr[Boolean] = js.undefined
  /** @name dxTreeViewNode.text */
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
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.get.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTreeViewNode]
  }
}

