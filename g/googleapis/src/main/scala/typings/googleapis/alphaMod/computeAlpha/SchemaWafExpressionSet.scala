package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWafExpressionSet extends StObject {
  
  /**
    * A list of alternate IDs. The format should be: - E.g. XSS-stable Generic
    * suffix like &quot;stable&quot; is particularly useful if a policy likes
    * to avail newer set of expressions without having to change the policy. A
    * given alias name can&#39;t be used for more than one entity set.
    */
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List of available expressions.
    */
  var expressions: js.UndefOr[js.Array[SchemaWafExpressionSetExpression]] = js.undefined
  
  /**
    * Google specified expression set ID. The format should be: - E.g.
    * XSS-20170329
    */
  var id: js.UndefOr[String] = js.undefined
}
object SchemaWafExpressionSet {
  
  inline def apply(): SchemaWafExpressionSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWafExpressionSet]
  }
  
  extension [Self <: SchemaWafExpressionSet](x: Self) {
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    inline def setExpressions(value: js.Array[SchemaWafExpressionSetExpression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
    
    inline def setExpressionsVarargs(value: SchemaWafExpressionSetExpression*): Self = StObject.set(x, "expressions", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
