package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFeatureValue extends StObject {
  
  /**
    * The categorical feature value.
    */
  var categoricalValue: js.UndefOr[SchemaCategoricalValue] = js.undefined
  
  /**
    * The feature column name.
    */
  var featureColumn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The numerical feature value. This is the centroid value for this feature.
    */
  var numericalValue: js.UndefOr[Double | Null] = js.undefined
}
object SchemaFeatureValue {
  
  inline def apply(): SchemaFeatureValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeatureValue]
  }
  
  extension [Self <: SchemaFeatureValue](x: Self) {
    
    inline def setCategoricalValue(value: SchemaCategoricalValue): Self = StObject.set(x, "categoricalValue", value.asInstanceOf[js.Any])
    
    inline def setCategoricalValueUndefined: Self = StObject.set(x, "categoricalValue", js.undefined)
    
    inline def setFeatureColumn(value: String): Self = StObject.set(x, "featureColumn", value.asInstanceOf[js.Any])
    
    inline def setFeatureColumnNull: Self = StObject.set(x, "featureColumn", null)
    
    inline def setFeatureColumnUndefined: Self = StObject.set(x, "featureColumn", js.undefined)
    
    inline def setNumericalValue(value: Double): Self = StObject.set(x, "numericalValue", value.asInstanceOf[js.Any])
    
    inline def setNumericalValueNull: Self = StObject.set(x, "numericalValue", null)
    
    inline def setNumericalValueUndefined: Self = StObject.set(x, "numericalValue", js.undefined)
  }
}
