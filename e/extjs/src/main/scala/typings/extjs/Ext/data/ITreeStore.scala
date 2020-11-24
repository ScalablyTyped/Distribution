package typings.extjs.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITreeStore extends IAbstractStore {
  
  /** [Config Option] (Boolean) */
  var clearOnLoad: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var clearRemovedOnLoad: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var defaultRootId: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var defaultRootProperty: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var defaultRootText: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var folderSort: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns the record node by id
    * @param id Object
    * @returns Ext.data.NodeInterface
    */
  var getNodeById: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], INodeInterface]] = js.native
  
  /** [Method] Returns the root node for this tree
    * @returns Ext.data.NodeInterface
    */
  var getRootNode: js.UndefOr[js.Function0[INodeInterface]] = js.native
  
  /** [Config Option] (String) */
  var nodeParam: js.UndefOr[String] = js.native
  
  /** [Config Option] (Ext.data.Model/Ext.data.NodeInterface/Object) */
  var root: js.UndefOr[js.Any] = js.native
  
  /** [Method] Sets the root node for this store
    * @param root Ext.data.Model/Ext.data.NodeInterface/Object
    * @returns Ext.data.NodeInterface The new root
    */
  var setRootNode: js.UndefOr[js.Function1[/* root */ js.UndefOr[js.Any], INodeInterface]] = js.native
}
object ITreeStore {
  
  @scala.inline
  def apply(): ITreeStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITreeStore]
  }
  
  @scala.inline
  implicit class ITreeStoreOps[Self <: ITreeStore] (val x: Self) extends AnyVal {
    
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
    def setClearOnLoad(value: Boolean): Self = this.set("clearOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearOnLoad: Self = this.set("clearOnLoad", js.undefined)
    
    @scala.inline
    def setClearRemovedOnLoad(value: Boolean): Self = this.set("clearRemovedOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearRemovedOnLoad: Self = this.set("clearRemovedOnLoad", js.undefined)
    
    @scala.inline
    def setDefaultRootId(value: String): Self = this.set("defaultRootId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRootId: Self = this.set("defaultRootId", js.undefined)
    
    @scala.inline
    def setDefaultRootProperty(value: String): Self = this.set("defaultRootProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRootProperty: Self = this.set("defaultRootProperty", js.undefined)
    
    @scala.inline
    def setDefaultRootText(value: String): Self = this.set("defaultRootText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRootText: Self = this.set("defaultRootText", js.undefined)
    
    @scala.inline
    def setFolderSort(value: Boolean): Self = this.set("folderSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolderSort: Self = this.set("folderSort", js.undefined)
    
    @scala.inline
    def setGetNodeById(value: /* id */ js.UndefOr[js.Any] => INodeInterface): Self = this.set("getNodeById", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetNodeById: Self = this.set("getNodeById", js.undefined)
    
    @scala.inline
    def setGetRootNode(value: () => INodeInterface): Self = this.set("getRootNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRootNode: Self = this.set("getRootNode", js.undefined)
    
    @scala.inline
    def setNodeParam(value: String): Self = this.set("nodeParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeParam: Self = this.set("nodeParam", js.undefined)
    
    @scala.inline
    def setRoot(value: js.Any): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setSetRootNode(value: /* root */ js.UndefOr[js.Any] => INodeInterface): Self = this.set("setRootNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRootNode: Self = this.set("setRootNode", js.undefined)
  }
}
