package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDimensionExpression extends StObject {
  
  /**
    * Used to combine dimension values to a single dimension. For example, dimension "country, city": concatenate(country, ", ", city).
    */
  var concatenate: js.UndefOr[SchemaConcatenateExpression] = js.undefined
  
  /**
    * Used to convert a dimension value to lower case.
    */
  var lowerCase: js.UndefOr[SchemaCaseExpression] = js.undefined
  
  /**
    * Used to convert a dimension value to upper case.
    */
  var upperCase: js.UndefOr[SchemaCaseExpression] = js.undefined
}
object SchemaDimensionExpression {
  
  inline def apply(): SchemaDimensionExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensionExpression]
  }
  
  extension [Self <: SchemaDimensionExpression](x: Self) {
    
    inline def setConcatenate(value: SchemaConcatenateExpression): Self = StObject.set(x, "concatenate", value.asInstanceOf[js.Any])
    
    inline def setConcatenateUndefined: Self = StObject.set(x, "concatenate", js.undefined)
    
    inline def setLowerCase(value: SchemaCaseExpression): Self = StObject.set(x, "lowerCase", value.asInstanceOf[js.Any])
    
    inline def setLowerCaseUndefined: Self = StObject.set(x, "lowerCase", js.undefined)
    
    inline def setUpperCase(value: SchemaCaseExpression): Self = StObject.set(x, "upperCase", value.asInstanceOf[js.Any])
    
    inline def setUpperCaseUndefined: Self = StObject.set(x, "upperCase", js.undefined)
  }
}
