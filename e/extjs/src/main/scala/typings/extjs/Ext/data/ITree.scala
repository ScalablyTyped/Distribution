package typings.extjs.Ext.data

import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITree
  extends StObject
     with IObservable {
  
  /** [Method] Gets a node in this tree by its id
    * @param id String
    * @returns Ext.data.NodeInterface The match node.
    */
  var getNodeById: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], INodeInterface]] = js.undefined
  
  /** [Method] Returns the root node for this tree
    * @returns Ext.data.NodeInterface
    */
  var getRootNode: js.UndefOr[js.Function0[INodeInterface]] = js.undefined
  
  /** [Method] Removes the root node from this tree
    * @returns Ext.data.NodeInterface The root node
    */
  var removeRootNode: js.UndefOr[js.Function0[INodeInterface]] = js.undefined
  
  /** [Property] (Ext.data.NodeInterface) */
  var root: js.UndefOr[INodeInterface] = js.undefined
  
  /** [Method] Sets the root node for this tree
    * @param node Ext.data.NodeInterface
    * @returns Ext.data.NodeInterface The root node
    */
  var setRootNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[INodeInterface], INodeInterface]] = js.undefined
}
object ITree {
  
  inline def apply(): ITree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITree]
  }
  
  extension [Self <: ITree](x: Self) {
    
    inline def setGetNodeById(value: /* id */ js.UndefOr[String] => INodeInterface): Self = StObject.set(x, "getNodeById", js.Any.fromFunction1(value))
    
    inline def setGetNodeByIdUndefined: Self = StObject.set(x, "getNodeById", js.undefined)
    
    inline def setGetRootNode(value: () => INodeInterface): Self = StObject.set(x, "getRootNode", js.Any.fromFunction0(value))
    
    inline def setGetRootNodeUndefined: Self = StObject.set(x, "getRootNode", js.undefined)
    
    inline def setRemoveRootNode(value: () => INodeInterface): Self = StObject.set(x, "removeRootNode", js.Any.fromFunction0(value))
    
    inline def setRemoveRootNodeUndefined: Self = StObject.set(x, "removeRootNode", js.undefined)
    
    inline def setRoot(value: INodeInterface): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSetRootNode(value: /* node */ js.UndefOr[INodeInterface] => INodeInterface): Self = StObject.set(x, "setRootNode", js.Any.fromFunction1(value))
    
    inline def setSetRootNodeUndefined: Self = StObject.set(x, "setRootNode", js.undefined)
  }
}
