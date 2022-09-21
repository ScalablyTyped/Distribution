package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGradeCategory extends StObject {
  
  /**
    * Default value of denominator. Only applicable when grade calculation type is TOTAL_POINTS.
    */
  var defaultGradeDenominator: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * ID of the grade category.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the grade category.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The weight of the category average as part of overall average. A weight of 12.34% is represented as 123400 (100% is 1,000,000). The last two digits should always be zero since we use two decimal precision. Only applicable when grade calculation type is WEIGHTED_CATEGORIES.
    */
  var weight: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGradeCategory {
  
  inline def apply(): SchemaGradeCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGradeCategory]
  }
  
  extension [Self <: SchemaGradeCategory](x: Self) {
    
    inline def setDefaultGradeDenominator(value: Double): Self = StObject.set(x, "defaultGradeDenominator", value.asInstanceOf[js.Any])
    
    inline def setDefaultGradeDenominatorNull: Self = StObject.set(x, "defaultGradeDenominator", null)
    
    inline def setDefaultGradeDenominatorUndefined: Self = StObject.set(x, "defaultGradeDenominator", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightNull: Self = StObject.set(x, "weight", null)
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
