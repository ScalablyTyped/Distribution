package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIntegerPropertyOptions extends StObject {
  
  /**
    * The maximum value of the property. The minimum and maximum values for the property are used to rank results according to the ordered ranking. Indexing requests with values greater than the maximum are accepted and ranked with the same weight as items indexed with the maximum value.
    */
  var maximumValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The minimum value of the property. The minimum and maximum values for the property are used to rank results according to the ordered ranking. Indexing requests with values less than the minimum are accepted and ranked with the same weight as items indexed with the minimum value.
    */
  var minimumValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set, describes how the integer should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaIntegerOperatorOptions] = js.undefined
  
  /**
    * Used to specify the ordered ranking for the integer. Can only be used if isRepeatable is false.
    */
  var orderedRanking: js.UndefOr[String | Null] = js.undefined
}
object SchemaIntegerPropertyOptions {
  
  inline def apply(): SchemaIntegerPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntegerPropertyOptions]
  }
  
  extension [Self <: SchemaIntegerPropertyOptions](x: Self) {
    
    inline def setMaximumValue(value: String): Self = StObject.set(x, "maximumValue", value.asInstanceOf[js.Any])
    
    inline def setMaximumValueNull: Self = StObject.set(x, "maximumValue", null)
    
    inline def setMaximumValueUndefined: Self = StObject.set(x, "maximumValue", js.undefined)
    
    inline def setMinimumValue(value: String): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
    
    inline def setMinimumValueNull: Self = StObject.set(x, "minimumValue", null)
    
    inline def setMinimumValueUndefined: Self = StObject.set(x, "minimumValue", js.undefined)
    
    inline def setOperatorOptions(value: SchemaIntegerOperatorOptions): Self = StObject.set(x, "operatorOptions", value.asInstanceOf[js.Any])
    
    inline def setOperatorOptionsUndefined: Self = StObject.set(x, "operatorOptions", js.undefined)
    
    inline def setOrderedRanking(value: String): Self = StObject.set(x, "orderedRanking", value.asInstanceOf[js.Any])
    
    inline def setOrderedRankingNull: Self = StObject.set(x, "orderedRanking", null)
    
    inline def setOrderedRankingUndefined: Self = StObject.set(x, "orderedRanking", js.undefined)
  }
}
