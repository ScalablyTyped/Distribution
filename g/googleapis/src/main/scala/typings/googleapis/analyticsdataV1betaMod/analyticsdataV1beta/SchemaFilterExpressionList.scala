package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFilterExpressionList extends StObject {
  
  /**
    * A list of filter expressions.
    */
  var expressions: js.UndefOr[js.Array[SchemaFilterExpression]] = js.undefined
}
object SchemaFilterExpressionList {
  
  inline def apply(): SchemaFilterExpressionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilterExpressionList]
  }
  
  extension [Self <: SchemaFilterExpressionList](x: Self) {
    
    inline def setExpressions(value: js.Array[SchemaFilterExpression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
    
    inline def setExpressionsVarargs(value: SchemaFilterExpression*): Self = StObject.set(x, "expressions", js.Array(value*))
  }
}
