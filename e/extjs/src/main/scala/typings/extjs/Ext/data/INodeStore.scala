package typings.extjs.Ext.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INodeStore
  extends StObject
     with IStore {
  
  /** [Property] (Number) */
  var isExpandingOrCollapsing: js.UndefOr[Double] = js.undefined
  
  /** [Property] (Boolean) */
  var isNodeStore: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Ext.data.Model) */
  var node: js.UndefOr[IModel] = js.undefined
  
  /** [Config Option] (Boolean) */
  var recursive: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var rootVisible: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Ext.data.TreeStore) */
  var treeStore: js.UndefOr[ITreeStore] = js.undefined
}
object INodeStore {
  
  inline def apply(): INodeStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INodeStore]
  }
  
  extension [Self <: INodeStore](x: Self) {
    
    inline def setIsExpandingOrCollapsing(value: Double): Self = StObject.set(x, "isExpandingOrCollapsing", value.asInstanceOf[js.Any])
    
    inline def setIsExpandingOrCollapsingUndefined: Self = StObject.set(x, "isExpandingOrCollapsing", js.undefined)
    
    inline def setIsNodeStore(value: Boolean): Self = StObject.set(x, "isNodeStore", value.asInstanceOf[js.Any])
    
    inline def setIsNodeStoreUndefined: Self = StObject.set(x, "isNodeStore", js.undefined)
    
    inline def setNode(value: IModel): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    inline def setRootVisible(value: Boolean): Self = StObject.set(x, "rootVisible", value.asInstanceOf[js.Any])
    
    inline def setRootVisibleUndefined: Self = StObject.set(x, "rootVisible", js.undefined)
    
    inline def setTreeStore(value: ITreeStore): Self = StObject.set(x, "treeStore", value.asInstanceOf[js.Any])
    
    inline def setTreeStoreUndefined: Self = StObject.set(x, "treeStore", js.undefined)
  }
}
