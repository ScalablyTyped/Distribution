package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutTrainedModelTrainedModelTree extends StObject {
  
  var classification_labels: js.UndefOr[js.Array[String]] = js.undefined
  
  var feature_names: js.Array[String]
  
  var target_type: js.UndefOr[String] = js.undefined
  
  var tree_structure: js.Array[MlPutTrainedModelTrainedModelTreeNode]
}
object MlPutTrainedModelTrainedModelTree {
  
  inline def apply(feature_names: js.Array[String], tree_structure: js.Array[MlPutTrainedModelTrainedModelTreeNode]): MlPutTrainedModelTrainedModelTree = {
    val __obj = js.Dynamic.literal(feature_names = feature_names.asInstanceOf[js.Any], tree_structure = tree_structure.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutTrainedModelTrainedModelTree]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlPutTrainedModelTrainedModelTree] (val x: Self) extends AnyVal {
    
    inline def setClassification_labels(value: js.Array[String]): Self = StObject.set(x, "classification_labels", value.asInstanceOf[js.Any])
    
    inline def setClassification_labelsUndefined: Self = StObject.set(x, "classification_labels", js.undefined)
    
    inline def setClassification_labelsVarargs(value: String*): Self = StObject.set(x, "classification_labels", js.Array(value*))
    
    inline def setFeature_names(value: js.Array[String]): Self = StObject.set(x, "feature_names", value.asInstanceOf[js.Any])
    
    inline def setFeature_namesVarargs(value: String*): Self = StObject.set(x, "feature_names", js.Array(value*))
    
    inline def setTarget_type(value: String): Self = StObject.set(x, "target_type", value.asInstanceOf[js.Any])
    
    inline def setTarget_typeUndefined: Self = StObject.set(x, "target_type", js.undefined)
    
    inline def setTree_structure(value: js.Array[MlPutTrainedModelTrainedModelTreeNode]): Self = StObject.set(x, "tree_structure", value.asInstanceOf[js.Any])
    
    inline def setTree_structureVarargs(value: MlPutTrainedModelTrainedModelTreeNode*): Self = StObject.set(x, "tree_structure", js.Array(value*))
  }
}
