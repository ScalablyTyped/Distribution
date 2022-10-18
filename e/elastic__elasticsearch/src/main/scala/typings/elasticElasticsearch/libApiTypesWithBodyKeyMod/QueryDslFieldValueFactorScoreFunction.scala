package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslFieldValueFactorScoreFunction extends StObject {
  
  var factor: js.UndefOr[double] = js.undefined
  
  var field: Field
  
  var missing: js.UndefOr[double] = js.undefined
  
  var modifier: js.UndefOr[QueryDslFieldValueFactorModifier] = js.undefined
}
object QueryDslFieldValueFactorScoreFunction {
  
  inline def apply(field: Field): QueryDslFieldValueFactorScoreFunction = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslFieldValueFactorScoreFunction]
  }
  
  extension [Self <: QueryDslFieldValueFactorScoreFunction](x: Self) {
    
    inline def setFactor(value: double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setMissing(value: double): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    inline def setModifier(value: QueryDslFieldValueFactorModifier): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
  }
}
