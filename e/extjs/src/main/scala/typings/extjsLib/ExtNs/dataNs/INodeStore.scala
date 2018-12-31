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

