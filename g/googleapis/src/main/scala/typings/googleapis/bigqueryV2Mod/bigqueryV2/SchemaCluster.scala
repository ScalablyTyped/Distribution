package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCluster extends StObject {
  
  /**
    * Centroid id.
    */
  var centroidId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Count of training data rows that were assigned to this cluster.
    */
  var count: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Values of highly variant features for this cluster.
    */
  var featureValues: js.UndefOr[js.Array[SchemaFeatureValue]] = js.undefined
}
object SchemaCluster {
  
  inline def apply(): SchemaCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCluster]
  }
  
  extension [Self <: SchemaCluster](x: Self) {
    
    inline def setCentroidId(value: String): Self = StObject.set(x, "centroidId", value.asInstanceOf[js.Any])
    
    inline def setCentroidIdNull: Self = StObject.set(x, "centroidId", null)
    
    inline def setCentroidIdUndefined: Self = StObject.set(x, "centroidId", js.undefined)
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setFeatureValues(value: js.Array[SchemaFeatureValue]): Self = StObject.set(x, "featureValues", value.asInstanceOf[js.Any])
    
    inline def setFeatureValuesUndefined: Self = StObject.set(x, "featureValues", js.undefined)
    
    inline def setFeatureValuesVarargs(value: SchemaFeatureValue*): Self = StObject.set(x, "featureValues", js.Array(value*))
  }
}
