package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INodeStore extends IStore {
  /** [Property] (Number) */
  var isExpandingOrCollapsing: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Boolean) */
  var isNodeStore: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.data.Model) */
  var node: js.UndefOr[IModel] = js.undefined
  /** [Config Option] (Boolean) */
  var recursive: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var rootVisible: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.data.TreeStore) */
  var treeStore: js.UndefOr[ITreeStore] = js.undefined
}

object INodeStore {
  @scala.inline
  def apply(
    IStore: IStore = null,
    getTotalCount: js.Function0[scala.Double] = null,
    isExpandingOrCollapsing: scala.Int | scala.Double = null,
    isNodeStore: js.UndefOr[scala.Boolean] = js.undefined,
    node: IModel = null,
    recursive: js.UndefOr[scala.Boolean] = js.undefined,
    rootVisible: js.UndefOr[scala.Boolean] = js.undefined,
    treeStore: ITreeStore = null
  ): INodeStore = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IStore)
    if (getTotalCount != null) __obj.updateDynamic("getTotalCount")(getTotalCount)
    if (isExpandingOrCollapsing != null) __obj.updateDynamic("isExpandingOrCollapsing")(isExpandingOrCollapsing.asInstanceOf[js.Any])
    if (!js.isUndefined(isNodeStore)) __obj.updateDynamic("isNodeStore")(isNodeStore)
    if (node != null) __obj.updateDynamic("node")(node)
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    if (!js.isUndefined(rootVisible)) __obj.updateDynamic("rootVisible")(rootVisible)
    if (treeStore != null) __obj.updateDynamic("treeStore")(treeStore)
    __obj.asInstanceOf[INodeStore]
  }
}

