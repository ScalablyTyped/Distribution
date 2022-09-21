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
  var getNodeById: js.UndefOr[js.Function1[/* id */ js.UndefOr[Any], INodeInterface]] = js.undefined
  
  /** [Method] Returns the root node for this tree
    * @returns Ext.data.NodeInterface
    */
  var getRootNode: js.UndefOr[js.Function0[INodeInterface]] = js.undefined
  
  /** [Config Option] (String) */
  var nodeParam: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Ext.data.Model/Ext.data.NodeInterface/Object) */
  var root: js.UndefOr[Any] = js.undefined
  
  /** [Method] Sets the root node for this store
    * @param root Ext.data.Model/Ext.data.NodeInterface/Object
    * @returns Ext.data.NodeInterface The new root
    */
  var setRootNode: js.UndefOr[js.Function1[/* root */ js.UndefOr[Any], INodeInterface]] = js.undefined
}
object ITreeStore {
  
  inline def apply(): ITreeStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITreeStore]
  }
  
  extension [Self <: ITreeStore](x: Self) {
    
    inline def setClearOnLoad(value: Boolean): Self = StObject.set(x, "clearOnLoad", value.asInstanceOf[js.Any])
    
    inline def setClearOnLoadUndefined: Self = StObject.set(x, "clearOnLoad", js.undefined)
    
    inline def setClearRemovedOnLoad(value: Boolean): Self = StObject.set(x, "clearRemovedOnLoad", value.asInstanceOf[js.Any])
    
    inline def setClearRemovedOnLoadUndefined: Self = StObject.set(x, "clearRemovedOnLoad", js.undefined)
    
    inline def setDefaultRootId(value: String): Self = StObject.set(x, "defaultRootId", value.asInstanceOf[js.Any])
    
    inline def setDefaultRootIdUndefined: Self = StObject.set(x, "defaultRootId", js.undefined)
    
    inline def setDefaultRootProperty(value: String): Self = StObject.set(x, "defaultRootProperty", value.asInstanceOf[js.Any])
    
    inline def setDefaultRootPropertyUndefined: Self = StObject.set(x, "defaultRootProperty", js.undefined)
    
    inline def setDefaultRootText(value: String): Self = StObject.set(x, "defaultRootText", value.asInstanceOf[js.Any])
    
    inline def setDefaultRootTextUndefined: Self = StObject.set(x, "defaultRootText", js.undefined)
    
    inline def setFolderSort(value: Boolean): Self = StObject.set(x, "folderSort", value.asInstanceOf[js.Any])
    
    inline def setFolderSortUndefined: Self = StObject.set(x, "folderSort", js.undefined)
    
    inline def setGetNodeById(value: /* id */ js.UndefOr[Any] => INodeInterface): Self = StObject.set(x, "getNodeById", js.Any.fromFunction1(value))
    
    inline def setGetNodeByIdUndefined: Self = StObject.set(x, "getNodeById", js.undefined)
    
    inline def setGetRootNode(value: () => INodeInterface): Self = StObject.set(x, "getRootNode", js.Any.fromFunction0(value))
    
    inline def setGetRootNodeUndefined: Self = StObject.set(x, "getRootNode", js.undefined)
    
    inline def setNodeParam(value: String): Self = StObject.set(x, "nodeParam", value.asInstanceOf[js.Any])
    
    inline def setNodeParamUndefined: Self = StObject.set(x, "nodeParam", js.undefined)
    
    inline def setRoot(value: Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSetRootNode(value: /* root */ js.UndefOr[Any] => INodeInterface): Self = StObject.set(x, "setRootNode", js.Any.fromFunction1(value))
    
    inline def setSetRootNodeUndefined: Self = StObject.set(x, "setRootNode", js.undefined)
  }
}
