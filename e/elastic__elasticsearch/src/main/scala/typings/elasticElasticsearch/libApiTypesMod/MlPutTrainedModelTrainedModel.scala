package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutTrainedModelTrainedModel extends StObject {
  
  var ensemble: js.UndefOr[MlPutTrainedModelEnsemble] = js.undefined
  
  var tree: js.UndefOr[MlPutTrainedModelTrainedModelTree] = js.undefined
  
  var tree_node: js.UndefOr[MlPutTrainedModelTrainedModelTreeNode] = js.undefined
}
object MlPutTrainedModelTrainedModel {
  
  inline def apply(): MlPutTrainedModelTrainedModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlPutTrainedModelTrainedModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlPutTrainedModelTrainedModel] (val x: Self) extends AnyVal {
    
    inline def setEnsemble(value: MlPutTrainedModelEnsemble): Self = StObject.set(x, "ensemble", value.asInstanceOf[js.Any])
    
    inline def setEnsembleUndefined: Self = StObject.set(x, "ensemble", js.undefined)
    
    inline def setTree(value: MlPutTrainedModelTrainedModelTree): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    inline def setTreeUndefined: Self = StObject.set(x, "tree", js.undefined)
    
    inline def setTree_node(value: MlPutTrainedModelTrainedModelTreeNode): Self = StObject.set(x, "tree_node", value.asInstanceOf[js.Any])
    
    inline def setTree_nodeUndefined: Self = StObject.set(x, "tree_node", js.undefined)
  }
}
