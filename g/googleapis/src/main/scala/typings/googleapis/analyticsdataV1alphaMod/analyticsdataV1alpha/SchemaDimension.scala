package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDimension extends StObject {
  
  /**
    * One dimension can be the result of an expression of multiple dimensions. For example, dimension "country, city": concatenate(country, ", ", city).
    */
  var dimensionExpression: js.UndefOr[SchemaDimensionExpression] = js.undefined
  
  /**
    * The name of the dimension. See the [API Dimensions](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#dimensions) for the list of dimension names. If `dimensionExpression` is specified, `name` can be any string that you would like. For example if a `dimensionExpression` concatenates `country` and `city`, you could call that dimension `countryAndCity`. Dimensions are referenced by `name` in `dimensionFilter`, `orderBys`, `dimensionExpression`, and `pivots`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaDimension {
  
  inline def apply(): SchemaDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimension]
  }
  
  extension [Self <: SchemaDimension](x: Self) {
    
    inline def setDimensionExpression(value: SchemaDimensionExpression): Self = StObject.set(x, "dimensionExpression", value.asInstanceOf[js.Any])
    
    inline def setDimensionExpressionUndefined: Self = StObject.set(x, "dimensionExpression", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
