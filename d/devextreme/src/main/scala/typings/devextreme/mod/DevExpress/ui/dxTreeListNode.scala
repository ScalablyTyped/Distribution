package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTreeListNode extends js.Object {
  /** @name dxTreeListNode.children */
  var children: js.UndefOr[js.Array[dxTreeListNode]] = js.undefined
  /** @name dxTreeListNode.data */
  var data: js.UndefOr[js.Any] = js.undefined
  /** @name dxTreeListNode.hasChildren */
  var hasChildren: js.UndefOr[Boolean] = js.undefined
  /** @name dxTreeListNode.key */
  var key: js.UndefOr[js.Any] = js.undefined
  /** @name dxTreeListNode.level */
  var level: js.UndefOr[Double] = js.undefined
  /** @name dxTreeListNode.parent */
  var parent: js.UndefOr[dxTreeListNode] = js.undefined
  /** @name dxTreeListNode.visible */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object dxTreeListNode {
  @scala.inline
  def apply(
    children: js.Array[dxTreeListNode] = null,
    data: js.Any = null,
    hasChildren: js.UndefOr[Boolean] = js.undefined,
    key: js.Any = null,
    level: js.UndefOr[Double] = js.undefined,
    parent: dxTreeListNode = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxTreeListNode = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(hasChildren)) __obj.updateDynamic("hasChildren")(hasChildren.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTreeListNode]
  }
}

