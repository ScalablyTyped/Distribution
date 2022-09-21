package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFilterExpression extends StObject {
  
  /**
    * The FilterExpressions in and_group have an AND relationship.
    */
  var andGroup: js.UndefOr[SchemaFilterExpressionList] = js.undefined
  
  /**
    * A primitive filter. All fields in filter in same FilterExpression needs to be either all dimensions or metrics.
    */
  var filter: js.UndefOr[SchemaFilter] = js.undefined
  
  /**
    * The FilterExpression is NOT of not_expression.
    */
  var notExpression: js.UndefOr[SchemaFilterExpression] = js.undefined
  
  /**
    * The FilterExpressions in or_group have an OR relationship.
    */
  var orGroup: js.UndefOr[SchemaFilterExpressionList] = js.undefined
}
object SchemaFilterExpression {
  
  inline def apply(): SchemaFilterExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilterExpression]
  }
  
  extension [Self <: SchemaFilterExpression](x: Self) {
    
    inline def setAndGroup(value: SchemaFilterExpressionList): Self = StObject.set(x, "andGroup", value.asInstanceOf[js.Any])
    
    inline def setAndGroupUndefined: Self = StObject.set(x, "andGroup", js.undefined)
    
    inline def setFilter(value: SchemaFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setNotExpression(value: SchemaFilterExpression): Self = StObject.set(x, "notExpression", value.asInstanceOf[js.Any])
    
    inline def setNotExpressionUndefined: Self = StObject.set(x, "notExpression", js.undefined)
    
    inline def setOrGroup(value: SchemaFilterExpressionList): Self = StObject.set(x, "orGroup", value.asInstanceOf[js.Any])
    
    inline def setOrGroupUndefined: Self = StObject.set(x, "orGroup", js.undefined)
  }
}
