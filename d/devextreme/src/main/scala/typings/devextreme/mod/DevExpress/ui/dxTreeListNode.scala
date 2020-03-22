package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTreeListNode extends js.Object {
  /** Contains all child nodes. */
  var children: js.UndefOr[js.Array[dxTreeListNode]] = js.undefined
  /** The node's data object. */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Indicates whether the node has child nodes. */
  var hasChildren: js.UndefOr[Boolean] = js.undefined
  /** The node's key. */
  var key: js.UndefOr[js.Any] = js.undefined
  /** The node's hierarchical level. */
  var level: js.UndefOr[Double] = js.undefined
  /** The parent node. */
  var parent: js.UndefOr[dxTreeListNode] = js.undefined
  /** Indicates whether the node is visualized as a row. */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object dxTreeListNode {
  @scala.inline
  def apply(
    children: js.Array[dxTreeListNode] = null,
    data: js.Any = null,
    hasChildren: js.UndefOr[Boolean] = js.undefined,
    key: js.Any = null,
    level: Int | Double = null,
    parent: dxTreeListNode = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxTreeListNode = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(hasChildren)) __obj.updateDynamic("hasChildren")(hasChildren.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTreeListNode]
  }
}

