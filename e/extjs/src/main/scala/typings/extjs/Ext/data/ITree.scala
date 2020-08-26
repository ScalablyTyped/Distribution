package typings.extjs.Ext.data

import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITree extends IObservable {
  /** [Method] Gets a node in this tree by its id
    * @param id String
    * @returns Ext.data.NodeInterface The match node.
    */
  var getNodeById: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], INodeInterface]] = js.native
  /** [Method] Returns the root node for this tree
    * @returns Ext.data.NodeInterface
    */
  var getRootNode: js.UndefOr[js.Function0[INodeInterface]] = js.native
  /** [Method] Removes the root node from this tree
    * @returns Ext.data.NodeInterface The root node
    */
  var removeRootNode: js.UndefOr[js.Function0[INodeInterface]] = js.native
  /** [Property] (Ext.data.NodeInterface) */
  var root: js.UndefOr[INodeInterface] = js.native
  /** [Method] Sets the root node for this tree
    * @param node Ext.data.NodeInterface
    * @returns Ext.data.NodeInterface The root node
    */
  var setRootNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[INodeInterface], INodeInterface]] = js.native
}

object ITree {
  @scala.inline
  def apply(): ITree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITree]
  }
  @scala.inline
  implicit class ITreeOps[Self <: ITree] (val x: Self) extends AnyVal {
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
    def setGetNodeById(value: /* id */ js.UndefOr[String] => INodeInterface): Self = this.set("getNodeById", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetNodeById: Self = this.set("getNodeById", js.undefined)
    @scala.inline
    def setGetRootNode(value: () => INodeInterface): Self = this.set("getRootNode", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRootNode: Self = this.set("getRootNode", js.undefined)
    @scala.inline
    def setRemoveRootNode(value: () => INodeInterface): Self = this.set("removeRootNode", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRemoveRootNode: Self = this.set("removeRootNode", js.undefined)
    @scala.inline
    def setRoot(value: INodeInterface): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setSetRootNode(value: /* node */ js.UndefOr[INodeInterface] => INodeInterface): Self = this.set("setRootNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRootNode: Self = this.set("setRootNode", js.undefined)
  }
  
}

