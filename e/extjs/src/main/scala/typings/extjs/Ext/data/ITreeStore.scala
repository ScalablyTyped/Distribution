package typings.extjs.Ext.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITreeStore
  extends StObject
     with IAbstractStore {
  
  /** [Config Option] (Boolean) */
  var clearOnLoad: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var clearRemovedOnLoad: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var defaultRootId: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var defaultRootProperty: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var defaultRootText: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var folderSort: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns the record node by id
    * @param id Object
    * @returns Ext.data.NodeInterface
    */
  var getNodeById: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], INodeInterface]] = js.undefined
  
  /** [Method] Returns the root node for this tree
    * @returns Ext.data.NodeInterface
    */
  var getRootNode: js.UndefOr[js.Function0[INodeInterface]] = js.undefined
  
  /** [Config Option] (String) */
  var nodeParam: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Ext.data.Model/Ext.data.NodeInterface/Object) */
  var root: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Sets the root node for this store
    * @param root Ext.data.Model/Ext.data.NodeInterface/Object
    * @returns Ext.data.NodeInterface The new root
    */
  var setRootNode: js.UndefOr[js.Function1[/* root */ js.UndefOr[js.Any], INodeInterface]] = js.undefined
}
object ITreeStore {
  
  @scala.inline
  def apply(): ITreeStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITreeStore]
  }
  
  @scala.inline
  implicit class ITreeStoreMutableBuilder[Self <: ITreeStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearOnLoad(value: Boolean): Self = StObject.set(x, "clearOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearOnLoadUndefined: Self = StObject.set(x, "clearOnLoad", js.undefined)
    
    @scala.inline
    def setClearRemovedOnLoad(value: Boolean): Self = StObject.set(x, "clearRemovedOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearRemovedOnLoadUndefined: Self = StObject.set(x, "clearRemovedOnLoad", js.undefined)
    
    @scala.inline
    def setDefaultRootId(value: String): Self = StObject.set(x, "defaultRootId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRootIdUndefined: Self = StObject.set(x, "defaultRootId", js.undefined)
    
    @scala.inline
    def setDefaultRootProperty(value: String): Self = StObject.set(x, "defaultRootProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRootPropertyUndefined: Self = StObject.set(x, "defaultRootProperty", js.undefined)
    
    @scala.inline
    def setDefaultRootText(value: String): Self = StObject.set(x, "defaultRootText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRootTextUndefined: Self = StObject.set(x, "defaultRootText", js.undefined)
    
    @scala.inline
    def setFolderSort(value: Boolean): Self = StObject.set(x, "folderSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderSortUndefined: Self = StObject.set(x, "folderSort", js.undefined)
    
    @scala.inline
    def setGetNodeById(value: /* id */ js.UndefOr[js.Any] => INodeInterface): Self = StObject.set(x, "getNodeById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNodeByIdUndefined: Self = StObject.set(x, "getNodeById", js.undefined)
    
    @scala.inline
    def setGetRootNode(value: () => INodeInterface): Self = StObject.set(x, "getRootNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRootNodeUndefined: Self = StObject.set(x, "getRootNode", js.undefined)
    
    @scala.inline
    def setNodeParam(value: String): Self = StObject.set(x, "nodeParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeParamUndefined: Self = StObject.set(x, "nodeParam", js.undefined)
    
    @scala.inline
    def setRoot(value: js.Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setSetRootNode(value: /* root */ js.UndefOr[js.Any] => INodeInterface): Self = StObject.set(x, "setRootNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRootNodeUndefined: Self = StObject.set(x, "setRootNode", js.undefined)
  }
}
