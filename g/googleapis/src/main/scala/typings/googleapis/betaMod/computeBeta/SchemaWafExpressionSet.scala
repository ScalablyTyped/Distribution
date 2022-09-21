package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWafExpressionSet extends StObject {
  
  /**
    * A list of alternate IDs. The format should be: - E.g. XSS-stable Generic suffix like "stable" is particularly useful if a policy likes to avail newer set of expressions without having to change the policy. A given alias name can't be used for more than one entity set.
    */
  var aliases: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * List of available expressions.
    */
  var expressions: js.UndefOr[js.Array[SchemaWafExpressionSetExpression]] = js.undefined
  
  /**
    * Google specified expression set ID. The format should be: - E.g. XSS-20170329 required
    */
  var id: js.UndefOr[String | Null] = js.undefined
}
object SchemaWafExpressionSet {
  
  inline def apply(): SchemaWafExpressionSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWafExpressionSet]
  }
  
  extension [Self <: SchemaWafExpressionSet](x: Self) {
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesNull: Self = StObject.set(x, "aliases", null)
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setExpressions(value: js.Array[SchemaWafExpressionSetExpression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
    
    inline def setExpressionsVarargs(value: SchemaWafExpressionSetExpression*): Self = StObject.set(x, "expressions", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
