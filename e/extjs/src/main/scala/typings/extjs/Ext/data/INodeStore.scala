package typings.extjs.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INodeStore extends IStore {
  /** [Property] (Number) */
  var isExpandingOrCollapsing: js.UndefOr[Double] = js.native
  /** [Property] (Boolean) */
  var isNodeStore: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.data.Model) */
  var node: js.UndefOr[IModel] = js.native
  /** [Config Option] (Boolean) */
  var recursive: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var rootVisible: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.data.TreeStore) */
  var treeStore: js.UndefOr[ITreeStore] = js.native
}

object INodeStore {
  @scala.inline
  def apply(): INodeStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INodeStore]
  }
  @scala.inline
  implicit class INodeStoreOps[Self <: INodeStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsExpandingOrCollapsing(value: Double): Self = this.set("isExpandingOrCollapsing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsExpandingOrCollapsing: Self = this.set("isExpandingOrCollapsing", js.undefined)
    @scala.inline
    def setIsNodeStore(value: Boolean): Self = this.set("isNodeStore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNodeStore: Self = this.set("isNodeStore", js.undefined)
    @scala.inline
    def setNode(value: IModel): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
    @scala.inline
    def setRootVisible(value: Boolean): Self = this.set("rootVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootVisible: Self = this.set("rootVisible", js.undefined)
    @scala.inline
    def setTreeStore(value: ITreeStore): Self = this.set("treeStore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeStore: Self = this.set("treeStore", js.undefined)
  }
  
}

