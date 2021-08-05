package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPreconfiguredWafSet extends StObject {
  
  /**
    * List of entities that are currently supported for WAF rules.
    */
  var expressionSets: js.UndefOr[js.Array[SchemaWafExpressionSet]] = js.undefined
}
object SchemaPreconfiguredWafSet {
  
  inline def apply(): SchemaPreconfiguredWafSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPreconfiguredWafSet]
  }
  
  extension [Self <: SchemaPreconfiguredWafSet](x: Self) {
    
    inline def setExpressionSets(value: js.Array[SchemaWafExpressionSet]): Self = StObject.set(x, "expressionSets", value.asInstanceOf[js.Any])
    
    inline def setExpressionSetsUndefined: Self = StObject.set(x, "expressionSets", js.undefined)
    
    inline def setExpressionSetsVarargs(value: SchemaWafExpressionSet*): Self = StObject.set(x, "expressionSets", js.Array(value :_*))
  }
}
