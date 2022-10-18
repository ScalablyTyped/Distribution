package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslDecayFunctionBase extends StObject {
  
  var multi_value_mode: js.UndefOr[QueryDslMultiValueMode] = js.undefined
}
object QueryDslDecayFunctionBase {
  
  inline def apply(): QueryDslDecayFunctionBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslDecayFunctionBase]
  }
  
  extension [Self <: QueryDslDecayFunctionBase](x: Self) {
    
    inline def setMulti_value_mode(value: QueryDslMultiValueMode): Self = StObject.set(x, "multi_value_mode", value.asInstanceOf[js.Any])
    
    inline def setMulti_value_modeUndefined: Self = StObject.set(x, "multi_value_mode", js.undefined)
  }
}
