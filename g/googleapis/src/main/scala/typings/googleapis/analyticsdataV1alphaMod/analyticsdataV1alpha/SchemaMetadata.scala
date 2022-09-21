package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetadata extends StObject {
  
  /**
    * The dimension descriptions.
    */
  var dimensions: js.UndefOr[js.Array[SchemaDimensionMetadata]] = js.undefined
  
  /**
    * The metric descriptions.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetricMetadata]] = js.undefined
  
  /**
    * Resource name of this metadata.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaMetadata {
  
  inline def apply(): SchemaMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadata]
  }
  
  extension [Self <: SchemaMetadata](x: Self) {
    
    inline def setDimensions(value: js.Array[SchemaDimensionMetadata]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: SchemaDimensionMetadata*): Self = StObject.set(x, "dimensions", js.Array(value*))
    
    inline def setMetrics(value: js.Array[SchemaMetricMetadata]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: SchemaMetricMetadata*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
