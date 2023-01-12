package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlAnomalyCause extends StObject {
  
  var actual: js.Array[double]
  
  var by_field_name: Name
  
  var by_field_value: String
  
  var correlated_by_field_value: String
  
  var field_name: Field
  
  var function: String
  
  var function_description: String
  
  var influencers: js.Array[MlInfluence]
  
  var over_field_name: Name
  
  var over_field_value: String
  
  var partition_field_name: String
  
  var partition_field_value: String
  
  var probability: double
  
  var typical: js.Array[double]
}
object MlAnomalyCause {
  
  inline def apply(
    actual: js.Array[double],
    by_field_name: Name,
    by_field_value: String,
    correlated_by_field_value: String,
    field_name: Field,
    function: String,
    function_description: String,
    influencers: js.Array[MlInfluence],
    over_field_name: Name,
    over_field_value: String,
    partition_field_name: String,
    partition_field_value: String,
    probability: double,
    typical: js.Array[double]
  ): MlAnomalyCause = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], by_field_name = by_field_name.asInstanceOf[js.Any], by_field_value = by_field_value.asInstanceOf[js.Any], correlated_by_field_value = correlated_by_field_value.asInstanceOf[js.Any], field_name = field_name.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any], function_description = function_description.asInstanceOf[js.Any], influencers = influencers.asInstanceOf[js.Any], over_field_name = over_field_name.asInstanceOf[js.Any], over_field_value = over_field_value.asInstanceOf[js.Any], partition_field_name = partition_field_name.asInstanceOf[js.Any], partition_field_value = partition_field_value.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any], typical = typical.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlAnomalyCause]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlAnomalyCause] (val x: Self) extends AnyVal {
    
    inline def setActual(value: js.Array[double]): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setActualVarargs(value: double*): Self = StObject.set(x, "actual", js.Array(value*))
    
    inline def setBy_field_name(value: Name): Self = StObject.set(x, "by_field_name", value.asInstanceOf[js.Any])
    
    inline def setBy_field_value(value: String): Self = StObject.set(x, "by_field_value", value.asInstanceOf[js.Any])
    
    inline def setCorrelated_by_field_value(value: String): Self = StObject.set(x, "correlated_by_field_value", value.asInstanceOf[js.Any])
    
    inline def setField_name(value: Field): Self = StObject.set(x, "field_name", value.asInstanceOf[js.Any])
    
    inline def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunction_description(value: String): Self = StObject.set(x, "function_description", value.asInstanceOf[js.Any])
    
    inline def setInfluencers(value: js.Array[MlInfluence]): Self = StObject.set(x, "influencers", value.asInstanceOf[js.Any])
    
    inline def setInfluencersVarargs(value: MlInfluence*): Self = StObject.set(x, "influencers", js.Array(value*))
    
    inline def setOver_field_name(value: Name): Self = StObject.set(x, "over_field_name", value.asInstanceOf[js.Any])
    
    inline def setOver_field_value(value: String): Self = StObject.set(x, "over_field_value", value.asInstanceOf[js.Any])
    
    inline def setPartition_field_name(value: String): Self = StObject.set(x, "partition_field_name", value.asInstanceOf[js.Any])
    
    inline def setPartition_field_value(value: String): Self = StObject.set(x, "partition_field_value", value.asInstanceOf[js.Any])
    
    inline def setProbability(value: double): Self = StObject.set(x, "probability", value.asInstanceOf[js.Any])
    
    inline def setTypical(value: js.Array[double]): Self = StObject.set(x, "typical", value.asInstanceOf[js.Any])
    
    inline def setTypicalVarargs(value: double*): Self = StObject.set(x, "typical", js.Array(value*))
  }
}
