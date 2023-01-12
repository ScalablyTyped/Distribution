package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutTrainedModelTrainedModelTreeNode extends StObject {
  
  var decision_type: js.UndefOr[String] = js.undefined
  
  var default_left: js.UndefOr[Boolean] = js.undefined
  
  var leaf_value: js.UndefOr[double] = js.undefined
  
  var left_child: js.UndefOr[integer] = js.undefined
  
  var node_index: integer
  
  var right_child: js.UndefOr[integer] = js.undefined
  
  var split_feature: js.UndefOr[integer] = js.undefined
  
  var split_gain: js.UndefOr[integer] = js.undefined
  
  var threshold: js.UndefOr[double] = js.undefined
}
object MlPutTrainedModelTrainedModelTreeNode {
  
  inline def apply(node_index: integer): MlPutTrainedModelTrainedModelTreeNode = {
    val __obj = js.Dynamic.literal(node_index = node_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutTrainedModelTrainedModelTreeNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlPutTrainedModelTrainedModelTreeNode] (val x: Self) extends AnyVal {
    
    inline def setDecision_type(value: String): Self = StObject.set(x, "decision_type", value.asInstanceOf[js.Any])
    
    inline def setDecision_typeUndefined: Self = StObject.set(x, "decision_type", js.undefined)
    
    inline def setDefault_left(value: Boolean): Self = StObject.set(x, "default_left", value.asInstanceOf[js.Any])
    
    inline def setDefault_leftUndefined: Self = StObject.set(x, "default_left", js.undefined)
    
    inline def setLeaf_value(value: double): Self = StObject.set(x, "leaf_value", value.asInstanceOf[js.Any])
    
    inline def setLeaf_valueUndefined: Self = StObject.set(x, "leaf_value", js.undefined)
    
    inline def setLeft_child(value: integer): Self = StObject.set(x, "left_child", value.asInstanceOf[js.Any])
    
    inline def setLeft_childUndefined: Self = StObject.set(x, "left_child", js.undefined)
    
    inline def setNode_index(value: integer): Self = StObject.set(x, "node_index", value.asInstanceOf[js.Any])
    
    inline def setRight_child(value: integer): Self = StObject.set(x, "right_child", value.asInstanceOf[js.Any])
    
    inline def setRight_childUndefined: Self = StObject.set(x, "right_child", js.undefined)
    
    inline def setSplit_feature(value: integer): Self = StObject.set(x, "split_feature", value.asInstanceOf[js.Any])
    
    inline def setSplit_featureUndefined: Self = StObject.set(x, "split_feature", js.undefined)
    
    inline def setSplit_gain(value: integer): Self = StObject.set(x, "split_gain", value.asInstanceOf[js.Any])
    
    inline def setSplit_gainUndefined: Self = StObject.set(x, "split_gain", js.undefined)
    
    inline def setThreshold(value: double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
